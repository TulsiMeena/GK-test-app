package com.example.services

import android.util.Log
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.userProfileChangeRequest
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await

/**
 * Dedicated service for Firebase Authentication operations.
 * Isolates Firebase SDK logic from UI components and handles error translation gracefully.
 */
class FirebaseAuthService {

    private val auth: FirebaseAuth? by lazy {
        try {
            FirebaseAuth.getInstance()
        } catch (e: Throwable) {
            Log.e("FirebaseAuthService", "FirebaseAuth could not be initialized: ${e.message}")
            null
        }
    }

    val isAvailable: Boolean
        get() = auth != null

    val currentUser: FirebaseUser?
        get() = try {
            auth?.currentUser
        } catch (e: Throwable) {
            null
        }

    /**
     * Emits the current FirebaseUser whenever authentication state changes.
     */
    val authStateFlow: Flow<FirebaseUser?> = callbackFlow {
        val currentAuth = auth
        if (currentAuth == null) {
            trySend(null)
            awaitClose { }
            return@callbackFlow
        }
        try {
            val authStateListener = FirebaseAuth.AuthStateListener { firebaseAuth ->
                trySend(firebaseAuth.currentUser)
            }
            currentAuth.addAuthStateListener(authStateListener)
            awaitClose {
                try {
                    currentAuth.removeAuthStateListener(authStateListener)
                } catch (e: Throwable) {
                    // Safe cleanup
                }
            }
        } catch (e: Throwable) {
            trySend(null)
            awaitClose { }
        }
    }

    /**
     * Creates a new user with Email and Password in Firebase Authentication.
     * Automatically sends an email verification / welcome confirmation to the user's email address.
     */
    suspend fun createUser(email: String, password: String): FirebaseUser {
        val currentAuth = auth ?: throw Exception("Authentication service is currently offline. Please try again.")
        try {
            val result = currentAuth.createUserWithEmailAndPassword(email.trim(), password).await()
            val user = result.user ?: throw Exception("Failed to create user account.")
            
            // Automatically trigger verification / welcome email to the user's registered email
            try {
                user.sendEmailVerification().await()
            } catch (ignored: Exception) {
                // Non-fatal if verification email service encounters temporary rate limits
            }
            
            return user
        } catch (e: Exception) {
            throw translateAuthException(e)
        }
    }

    /**
     * Updates display name of current user in Firebase Authentication.
     */
    suspend fun updateDisplayName(name: String) {
        try {
            val user = auth?.currentUser ?: return
            val profileUpdates = userProfileChangeRequest {
                displayName = name.trim()
            }
            user.updateProfile(profileUpdates).await()
        } catch (e: Exception) {
            // Non-critical, log or pass
        }
    }

    /**
     * Signs in with Email and Password via Firebase Authentication.
     */
    suspend fun signIn(email: String, password: String): FirebaseUser {
        val currentAuth = auth ?: throw Exception("Authentication service is currently offline. Please try again.")
        try {
            val result = currentAuth.signInWithEmailAndPassword(email.trim(), password).await()
            val user = result.user ?: throw Exception("Sign in failed. Please try again.")
            return user
        } catch (e: Exception) {
            throw translateAuthException(e)
        }
    }

    /**
     * Sends password reset email via Firebase Authentication.
     */
    suspend fun sendPasswordResetEmail(email: String) {
        val currentAuth = auth ?: throw Exception("Authentication service is currently offline. Please try again.")
        try {
            currentAuth.sendPasswordResetEmail(email.trim()).await()
        } catch (e: Exception) {
            throw translateAuthException(e)
        }
    }

    /**
     * Signs out the current user from Firebase Authentication.
     */
    fun signOut() {
        try {
            auth?.signOut()
        } catch (e: Throwable) {
            // Safe signout
        }
    }

    /**
     * Translates raw Firebase exceptions into clear, user-friendly messages.
     * Never exposes raw internal errors to the user.
     */
    private fun translateAuthException(e: Exception): Exception {
        val message = when (e) {
            is FirebaseAuthInvalidUserException -> {
                "No account found with this email address. Please sign up."
            }
            is FirebaseAuthInvalidCredentialsException -> {
                "Invalid email or password. Please verify and try again."
            }
            is FirebaseAuthUserCollisionException -> {
                "An account with this email address already exists. Please log in instead."
            }
            is FirebaseAuthWeakPasswordException -> {
                "Password must be at least 6 characters long."
            }
            is FirebaseTooManyRequestsException -> {
                "Too many attempts. Please wait a few moments and try again."
            }
            is FirebaseNetworkException -> {
                "Connection unavailable. Please check your internet connection and try again."
            }
            is FirebaseException -> {
                if (e.message?.contains("network", ignoreCase = true) == true ||
                    e.message?.contains("timeout", ignoreCase = true) == true ||
                    e.message?.contains("connection", ignoreCase = true) == true
                ) {
                    "Connection unavailable. Please check your internet connection and try again."
                } else {
                    e.localizedMessage ?: "Authentication failed. Please try again."
                }
            }
            else -> {
                if (e.message?.contains("network", ignoreCase = true) == true) {
                    "Connection unavailable. Please check your internet connection and try again."
                } else {
                    e.localizedMessage ?: "An unexpected error occurred. Please try again."
                }
            }
        }
        return Exception(message, e)
    }
}
