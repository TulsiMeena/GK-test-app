package com.example.ui.auth

import android.content.Context
import android.content.SharedPreferences
import com.example.services.FirebaseAuthService
import com.example.services.FirestoreUserService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Authentication Repository Interface
 */
interface AuthRepository {
    val authState: StateFlow<AuthState>
    val isOnboardingCompleted: Boolean
    fun setOnboardingCompleted(completed: Boolean)
    suspend fun signUp(fullName: String, email: String, password: String): AuthResult<GyanixUser>
    suspend fun signIn(email: String, password: String): AuthResult<GyanixUser>
    suspend fun signOut()
    suspend fun sendPasswordReset(email: String): AuthResult<String>
    fun getCurrentUser(): GyanixUser?
    fun resetOnboardingForTesting()
}

/**
 * Production Firebase Authentication Repository implementation.
 * Connects Firebase Auth & Firestore user profile isolation under users/{uid}.
 */
class FirebaseAuthRepository(
    private val context: Context,
    private val authService: FirebaseAuthService = FirebaseAuthService(),
    private val firestoreService: FirestoreUserService = FirestoreUserService(),
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) : AuthRepository {

    private val prefs: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    private val _authState = MutableStateFlow<AuthState>(AuthState.Initializing)
    override val authState: StateFlow<AuthState> = _authState.asStateFlow()

    init {
        // Observe Firebase Auth state continuously
        scope.launch {
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

                    _authState.value = AuthState.Authenticated(profile)
                } else {
                    _authState.value = AuthState.Unauthenticated
                }
            }
        }
    }

    override val isOnboardingCompleted: Boolean
        get() = prefs.getBoolean(KEY_ONBOARDING_COMPLETED, false)

    override fun setOnboardingCompleted(completed: Boolean) {
        prefs.edit().putBoolean(KEY_ONBOARDING_COMPLETED, completed).apply()
    }

    override suspend fun signUp(
        fullName: String,
        email: String,
        password: String
    ): AuthResult<GyanixUser> = withContext(Dispatchers.IO) {
        val trimmedName = fullName.trim()
        val trimmedEmail = email.trim()

        if (trimmedName.isBlank()) {
            return@withContext AuthResult.Error("Please enter your full name.")
        }
        if (trimmedName.length < 2) {
            return@withContext AuthResult.Error("Name must be at least 2 characters.")
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(trimmedEmail).matches()) {
            return@withContext AuthResult.Error("Please enter a valid email address.")
        }
        if (password.length < 6) {
            return@withContext AuthResult.Error("Password must be at least 6 characters long.")
        }

        try {
            // 1. Create Firebase Auth user
            val firebaseUser = authService.createUser(trimmedEmail, password)

            // 2. Update Firebase display name
            authService.updateDisplayName(trimmedName)

            // 3. Store initial profile in Firestore under users/{uid}
            val user = firestoreService.createUserProfileIfNotExists(
                uid = firebaseUser.uid,
                displayName = trimmedName,
                email = trimmedEmail
            )

            // 4. Mark onboarding completed
            setOnboardingCompleted(true)

            // 5. Trigger Instant Notification from Amit Meena (App Owner) on phone and In-App Box
            com.example.services.GyanixNotificationService.switchUser(user.uid, context)
            com.example.services.GyanixNotificationService.triggerWelcomeNotification(
                context = context,
                userName = user.displayName,
                userEmail = user.email
            )

            _authState.value = AuthState.Authenticated(user)
            AuthResult.Success(user)
        } catch (e: Exception) {
            AuthResult.Error(e.message ?: "Sign up failed. Please try again.")
        }
    }

    override suspend fun signIn(
        email: String,
        password: String
    ): AuthResult<GyanixUser> = withContext(Dispatchers.IO) {
        val trimmedEmail = email.trim()
        if (trimmedEmail.isBlank()) {
            return@withContext AuthResult.Error("Email address is required.")
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(trimmedEmail).matches()) {
            return@withContext AuthResult.Error("Please enter a valid email address.")
        }
        if (password.isBlank()) {
            return@withContext AuthResult.Error("Password is required.")
        }

        try {
            // 1. Authenticate with Firebase
            val firebaseUser = authService.signIn(trimmedEmail, password)

            // 2. Retrieve Firestore profile
            val defaultName = firebaseUser.displayName ?: trimmedEmail.substringBefore("@").replaceFirstChar { it.uppercase() }
            val user = firestoreService.getUserProfile(firebaseUser.uid, fallbackEmail = trimmedEmail, fallbackName = defaultName)
                ?: firestoreService.createUserProfileIfNotExists(
                    uid = firebaseUser.uid,
                    displayName = defaultName,
                    email = trimmedEmail
                )

            // 3. Mark onboarding completed
            setOnboardingCompleted(true)

            com.example.services.GyanixNotificationService.switchUser(user.uid, context)

            _authState.value = AuthState.Authenticated(user)
            AuthResult.Success(user)
        } catch (e: Exception) {
            AuthResult.Error(e.message ?: "Sign in failed. Please try again.")
        }
    }

    override suspend fun signOut() = withContext(Dispatchers.IO) {
        authService.signOut()
        com.example.services.GyanixNotificationService.clearUserData()
        _authState.value = AuthState.Unauthenticated
    }

    override suspend fun sendPasswordReset(email: String): AuthResult<String> = withContext(Dispatchers.IO) {
        val trimmedEmail = email.trim()
        if (trimmedEmail.isBlank()) {
            return@withContext AuthResult.Error("Please enter your email address.")
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(trimmedEmail).matches()) {
            return@withContext AuthResult.Error("Please enter a valid email address.")
        }

        try {
            authService.sendPasswordResetEmail(trimmedEmail)
            AuthResult.Success("Password reset email sent to $trimmedEmail. Please check your inbox.")
        } catch (e: Exception) {
            AuthResult.Error(e.message ?: "Failed to send password reset email. Please try again.")
        }
    }

    override fun getCurrentUser(): GyanixUser? {
        val state = _authState.value
        return if (state is AuthState.Authenticated) state.user else null
    }

    override fun resetOnboardingForTesting() {
        prefs.edit().remove(KEY_ONBOARDING_COMPLETED).apply()
        authService.signOut()
        _authState.value = AuthState.Unauthenticated
    }

    companion object {
        private const val PREFS_NAME = "gyanix_firebase_auth_prefs"
        private const val KEY_ONBOARDING_COMPLETED = "onboarding_completed"

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
