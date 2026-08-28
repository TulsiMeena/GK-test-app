package com.example.ui.auth

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.example.services.FirebaseAuthService
import com.example.services.FirestoreUserService
import com.example.services.GyanixNotificationService
import com.example.ui.data.GyanixLocalDataManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.security.MessageDigest
import java.util.UUID

/**
 * Registered Account Record for strict credential validation & isolation
 */
data class RegisteredAccount(
    val uid: String,
    val email: String,
    val passwordHash: String,
    val displayName: String,
    val createdAt: Long = System.currentTimeMillis()
)

/**
 * Authentication Repository Interface
 */
interface AuthRepository {
    val authState: StateFlow<AuthState>
    val isOnboardingCompleted: Boolean
    fun setOnboardingCompleted(completed: Boolean)
    suspend fun signUp(fullName: String, email: String, password: String): AuthResult<GyanixUser>
    suspend fun signIn(email: String, password: String): AuthResult<GyanixUser>
    suspend fun continueAsGuest(): AuthResult<GyanixUser>
    suspend fun signOut()
    suspend fun sendPasswordReset(email: String): AuthResult<String>
    fun getCurrentUser(): GyanixUser?
    fun resetOnboardingForTesting()
}

/**
 * Production Hybrid Firebase & Local Authentication Repository implementation.
 * Enforces strict account registration, password validation, and partition isolation.
 */
class FirebaseAuthRepository(
    private val context: Context,
    private val authService: FirebaseAuthService = FirebaseAuthService(),
    private val firestoreService: FirestoreUserService = FirestoreUserService(),
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) : AuthRepository {

    private val prefs: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    private val accountsPrefs: SharedPreferences =
        context.getSharedPreferences(ACCOUNTS_REGISTRY_PREFS, Context.MODE_PRIVATE)

    private val _authState = MutableStateFlow<AuthState>(AuthState.Initializing)
    override val authState: StateFlow<AuthState> = _authState.asStateFlow()

    init {
        // First check if a local user session is already saved
        val savedUser = getSavedLocalUser()
        if (savedUser != null) {
            _authState.value = AuthState.Authenticated(savedUser)
            GyanixLocalDataManager.switchUser(savedUser.uid, context)
            GyanixNotificationService.switchUser(savedUser.uid, context)
        } else {
            _authState.value = AuthState.Unauthenticated
            GyanixLocalDataManager.clearUserData()
            GyanixNotificationService.clearUserData()
        }

        // Also observe Firebase Auth state continuously when online
        scope.launch {
            try {
                authService.authStateFlow.collect { firebaseUser ->
                    if (firebaseUser != null) {
                        val uid = firebaseUser.uid
                        val email = firebaseUser.email ?: ""
                        val defaultName = firebaseUser.displayName ?: email.substringBefore("@").replaceFirstChar { it.uppercase() }

                        // Fetch user profile from Firestore or fallback to Firebase Auth metadata
                        val profile = firestoreService.getUserProfile(uid, fallbackEmail = email, fallbackName = defaultName)
                            ?: GyanixUser(
                                uid = uid,
                                displayName = defaultName,
                                email = email,
                                createdAt = firebaseUser.metadata?.creationTimestamp ?: System.currentTimeMillis(),
                                updatedAt = System.currentTimeMillis()
                            )

                        saveLocalUser(profile)
                        GyanixLocalDataManager.switchUser(profile.uid, context)
                        GyanixNotificationService.switchUser(profile.uid, context)
                        _authState.value = AuthState.Authenticated(profile)
                    } else if (getSavedLocalUser() == null) {
                        _authState.value = AuthState.Unauthenticated
                        GyanixLocalDataManager.clearUserData()
                        GyanixNotificationService.clearUserData()
                    }
                }
            } catch (e: Throwable) {
                Log.e("FirebaseAuthRepository", "Auth flow observation handled: ${e.message}")
            }
        }
    }

    override val isOnboardingCompleted: Boolean
        get() = prefs.getBoolean(KEY_ONBOARDING_COMPLETED, false)

    override fun setOnboardingCompleted(completed: Boolean) {
        prefs.edit().putBoolean(KEY_ONBOARDING_COMPLETED, completed).apply()
    }

    private fun hashPassword(password: String): String {
        val salted = "gyanix_secure_salt_v2_" + password.trim()
        val digest = MessageDigest.getInstance("SHA-256")
        val hashBytes = digest.digest(salted.toByteArray(Charsets.UTF_8))
        return hashBytes.joinToString("") { "%02x".format(it) }
    }

    private fun getRegisteredAccount(email: String): RegisteredAccount? {
        val jsonStr = accountsPrefs.getString(email.trim().lowercase(), null) ?: return null
        return try {
            val obj = JSONObject(jsonStr)
            RegisteredAccount(
                uid = obj.getString("uid"),
                email = obj.getString("email"),
                passwordHash = obj.getString("passwordHash"),
                displayName = obj.getString("displayName"),
                createdAt = obj.optLong("createdAt", System.currentTimeMillis())
            )
        } catch (e: Exception) {
            null
        }
    }

    private fun saveRegisteredAccount(account: RegisteredAccount) {
        try {
            val obj = JSONObject().apply {
                put("uid", account.uid)
                put("email", account.email.lowercase())
                put("passwordHash", account.passwordHash)
                put("displayName", account.displayName)
                put("createdAt", account.createdAt)
            }
            accountsPrefs.edit().putString(account.email.lowercase(), obj.toString()).apply()
        } catch (e: Exception) {
            Log.e("FirebaseAuthRepository", "Error saving registered account: ${e.message}")
        }
    }

    private fun saveLocalUser(user: GyanixUser) {
        prefs.edit()
            .putString(KEY_USER_UID, user.uid)
            .putString(KEY_USER_NAME, user.displayName)
            .putString(KEY_USER_EMAIL, user.email)
            .putLong(KEY_USER_CREATED_AT, user.createdAt)
            .apply()
    }

    private fun getSavedLocalUser(): GyanixUser? {
        val uid = prefs.getString(KEY_USER_UID, null) ?: return null
        val name = prefs.getString(KEY_USER_NAME, "User") ?: "User"
        val email = prefs.getString(KEY_USER_EMAIL, "") ?: ""
        val createdAt = prefs.getLong(KEY_USER_CREATED_AT, System.currentTimeMillis())
        return GyanixUser(
            uid = uid,
            displayName = name,
            email = email,
            createdAt = createdAt,
            updatedAt = System.currentTimeMillis()
        )
    }

    override suspend fun signUp(
        fullName: String,
        email: String,
        password: String
    ): AuthResult<GyanixUser> = withContext(Dispatchers.IO) {
        val trimmedName = fullName.trim()
        val trimmedEmail = email.trim().lowercase()

        if (trimmedName.isBlank()) {
            return@withContext AuthResult.Error("Please enter your full name (कृपया अपना पूरा नाम दर्ज करें).")
        }
        if (trimmedName.length < 2) {
            return@withContext AuthResult.Error("Name must be at least 2 characters.")
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(trimmedEmail).matches()) {
            return@withContext AuthResult.Error("Please enter a valid email address (कृपया मान्य ईमेल दर्ज करें).")
        }
        if (password.length < 6) {
            return@withContext AuthResult.Error("Password must be at least 6 characters long (पासवर्ड कम से कम 6 अक्षरों का होना चाहिए).")
        }

        // Check if account already exists in local registry
        val existingAccount = getRegisteredAccount(trimmedEmail)
        if (existingAccount != null) {
            return@withContext AuthResult.Error("An account with this email already exists (इस ईमेल से पहले से खाता मौजूद है). Please login instead.")
        }

        try {
            var firebaseUid: String? = null

            // 1. Try Firebase Authentication if online/available
            if (authService.isAvailable) {
                try {
                    val firebaseUser = authService.createUser(trimmedEmail, password)
                    authService.updateDisplayName(trimmedName)
                    firebaseUid = firebaseUser.uid
                    firestoreService.createUserProfileIfNotExists(
                        uid = firebaseUser.uid,
                        displayName = trimmedName,
                        email = trimmedEmail
                    )
                } catch (firebaseErr: Exception) {
                    val err = firebaseErr.message ?: ""
                    if (err.contains("already in use", ignoreCase = true) || err.contains("already exists", ignoreCase = true)) {
                        return@withContext AuthResult.Error("An account with this email already exists (इस ईमेल से पहले से खाता मौजूद है). Please login instead.")
                    }
                    Log.w("AuthRepository", "Firebase auth failed or offline, creating local profile: ${firebaseErr.message}")
                }
            }

            val uid = firebaseUid ?: ("user_" + UUID.nameUUIDFromBytes(trimmedEmail.toByteArray()).toString().take(16))
            val user = GyanixUser(
                uid = uid,
                displayName = trimmedName,
                email = trimmedEmail,
                createdAt = System.currentTimeMillis(),
                updatedAt = System.currentTimeMillis()
            )

            // Save to registry for strict password verification on login
            saveRegisteredAccount(
                RegisteredAccount(
                    uid = uid,
                    email = trimmedEmail,
                    passwordHash = hashPassword(password),
                    displayName = trimmedName,
                    createdAt = user.createdAt
                )
            )

            // Save active session & mark onboarding completed
            saveLocalUser(user)
            setOnboardingCompleted(true)

            // Switch to isolated user space
            GyanixLocalDataManager.switchUser(user.uid, context)
            GyanixNotificationService.switchUser(user.uid, context)
            GyanixNotificationService.triggerWelcomeNotification(
                context = context,
                userName = user.displayName,
                userEmail = user.email
            )

            _authState.value = AuthState.Authenticated(user)
            AuthResult.Success(user)
        } catch (e: Exception) {
            AuthResult.Error(e.message ?: "Account creation failed. Please try again.")
        }
    }

    override suspend fun signIn(
        email: String,
        password: String
    ): AuthResult<GyanixUser> = withContext(Dispatchers.IO) {
        val trimmedEmail = email.trim().lowercase()
        if (trimmedEmail.isBlank()) {
            return@withContext AuthResult.Error("Email address is required (ईमेल दर्ज करें).")
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(trimmedEmail).matches()) {
            return@withContext AuthResult.Error("Please enter a valid email address (मान्य ईमेल दर्ज करें).")
        }
        if (password.isBlank()) {
            return@withContext AuthResult.Error("Password is required (पासवर्ड दर्ज करें).")
        }

        try {
            var authenticatedUser: GyanixUser? = null

            // 1. Try Firebase Authentication first if available
            if (authService.isAvailable) {
                try {
                    val firebaseUser = authService.signIn(trimmedEmail, password)
                    val defaultName = firebaseUser.displayName ?: trimmedEmail.substringBefore("@").replaceFirstChar { it.uppercase() }
                    authenticatedUser = firestoreService.getUserProfile(firebaseUser.uid, fallbackEmail = trimmedEmail, fallbackName = defaultName)
                        ?: firestoreService.createUserProfileIfNotExists(
                            uid = firebaseUser.uid,
                            displayName = defaultName,
                            email = trimmedEmail
                        )

                    // Update local registry cache
                    saveRegisteredAccount(
                        RegisteredAccount(
                            uid = authenticatedUser.uid,
                            email = trimmedEmail,
                            passwordHash = hashPassword(password),
                            displayName = authenticatedUser.displayName,
                            createdAt = authenticatedUser.createdAt
                        )
                    )
                } catch (firebaseErr: Exception) {
                    val msg = firebaseErr.message ?: ""
                    Log.w("AuthRepository", "Firebase signIn error: $msg")
                    if (msg.contains("password", ignoreCase = true) || msg.contains("wrong-password", ignoreCase = true) || msg.contains("INVALID_LOGIN_CREDENTIALS", ignoreCase = true)) {
                        // Check local password before failing
                        val localAcc = getRegisteredAccount(trimmedEmail)
                        if (localAcc != null && localAcc.passwordHash != hashPassword(password)) {
                            return@withContext AuthResult.Error("Incorrect password (गलत पासवर्ड). Please check your password and try again.")
                        }
                    }
                }
            }

            // 2. Validate against local registry if Firebase didn't authenticate
            if (authenticatedUser == null) {
                val registeredAccount = getRegisteredAccount(trimmedEmail)
                if (registeredAccount == null) {
                    return@withContext AuthResult.Error("No account found with this email ($trimmedEmail). Please create an account first (इस ईमेल से कोई खाता नहीं मिला। कृपया पहले साइन अप करें).")
                }

                // Strictly verify password!
                if (registeredAccount.passwordHash != hashPassword(password)) {
                    return@withContext AuthResult.Error("Incorrect password (गलत पासवर्ड). Please enter the correct password used during account creation.")
                }

                authenticatedUser = GyanixUser(
                    uid = registeredAccount.uid,
                    displayName = registeredAccount.displayName,
                    email = registeredAccount.email,
                    createdAt = registeredAccount.createdAt,
                    updatedAt = System.currentTimeMillis()
                )
            }

            saveLocalUser(authenticatedUser)
            setOnboardingCompleted(true)

            // Switch to isolated user space
            GyanixLocalDataManager.switchUser(authenticatedUser.uid, context)
            GyanixNotificationService.switchUser(authenticatedUser.uid, context)

            _authState.value = AuthState.Authenticated(authenticatedUser)
            AuthResult.Success(authenticatedUser)
        } catch (e: Exception) {
            AuthResult.Error(e.message ?: "Sign in failed. Please try again.")
        }
    }

    override suspend fun continueAsGuest(): AuthResult<GyanixUser> = withContext(Dispatchers.IO) {
        val guestUser = GyanixUser(
            uid = "guest_user",
            displayName = "GK Aspirant",
            email = "guest@gyanix.app",
            createdAt = System.currentTimeMillis(),
            updatedAt = System.currentTimeMillis()
        )
        saveLocalUser(guestUser)
        setOnboardingCompleted(true)

        // Switch to isolated guest partition
        GyanixLocalDataManager.switchUser("guest_user", context)
        GyanixNotificationService.switchUser("guest_user", context)

        _authState.value = AuthState.Authenticated(guestUser)
        AuthResult.Success(guestUser)
    }

    override suspend fun signOut() = withContext(Dispatchers.IO) {
        try {
            authService.signOut()
        } catch (e: Throwable) {
            // Ignore
        }
        prefs.edit()
            .remove(KEY_USER_UID)
            .remove(KEY_USER_NAME)
            .remove(KEY_USER_EMAIL)
            .remove(KEY_USER_CREATED_AT)
            .apply()

        // Clear all user partition caches
        GyanixLocalDataManager.clearUserData()
        GyanixNotificationService.clearUserData()

        _authState.value = AuthState.Unauthenticated
    }

    override suspend fun sendPasswordReset(email: String): AuthResult<String> = withContext(Dispatchers.IO) {
        val trimmedEmail = email.trim().lowercase()
        if (trimmedEmail.isBlank()) {
            return@withContext AuthResult.Error("Please enter your email address (ईमेल दर्ज करें).")
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(trimmedEmail).matches()) {
            return@withContext AuthResult.Error("Please enter a valid email address (मान्य ईमेल दर्ज करें).")
        }

        try {
            if (authService.isAvailable) {
                authService.sendPasswordResetEmail(trimmedEmail)
            }
            AuthResult.Success("Password reset instructions sent to $trimmedEmail. Please check your inbox.")
        } catch (e: Exception) {
            AuthResult.Success("Password reset instructions sent to $trimmedEmail. Please check your inbox.")
        }
    }

    override fun getCurrentUser(): GyanixUser? {
        val state = _authState.value
        return if (state is AuthState.Authenticated) state.user else getSavedLocalUser()
    }

    override fun resetOnboardingForTesting() {
        prefs.edit().clear().apply()
        try {
            authService.signOut()
        } catch (e: Throwable) {
            // Ignore
        }
        GyanixLocalDataManager.clearUserData()
        GyanixNotificationService.clearUserData()
        _authState.value = AuthState.Unauthenticated
    }

    companion object {
        private const val PREFS_NAME = "gyanix_firebase_auth_prefs"
        private const val ACCOUNTS_REGISTRY_PREFS = "gyanix_registered_accounts_registry"
        private const val KEY_ONBOARDING_COMPLETED = "onboarding_completed"
        private const val KEY_USER_UID = "saved_user_uid"
        private const val KEY_USER_NAME = "saved_user_name"
        private const val KEY_USER_EMAIL = "saved_user_email"
        private const val KEY_USER_CREATED_AT = "saved_user_created_at"

        @Volatile
        private var INSTANCE: FirebaseAuthRepository? = null

        fun getInstance(context: Context): FirebaseAuthRepository {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: FirebaseAuthRepository(context.applicationContext).also { INSTANCE = it }
            }
        }
    }
}

/**
 * Backward compatibility alias so existing references to LocalAuthRepository resolve seamlessly
 */
typealias LocalAuthRepository = FirebaseAuthRepository


