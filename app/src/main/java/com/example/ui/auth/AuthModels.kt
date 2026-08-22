package com.example.ui.auth

/**
 * User model for GYANIX Authentication and Profile Management.
 * Maps seamlessly to Firebase Authentication and Firestore `users/{uid}`.
 */
data class GyanixUser(
    val uid: String,
    val displayName: String,
    val email: String,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
) {
    // Backwards-compatible aliases for UI components
    val id: String get() = uid
    val name: String get() = displayName
}

/**
 * Authentication State representation.
 * Allows reactive observing of Firebase Auth state changes.
 */
sealed interface AuthState {
    object Initializing : AuthState
    object Unauthenticated : AuthState
    data class Authenticated(val user: GyanixUser) : AuthState
}

/**
 * Generic Result wrapper for Authentication operations with user-friendly errors.
 */
sealed interface AuthResult<out T> {
    data class Success<T>(val data: T) : AuthResult<T>
    data class Error(val message: String) : AuthResult<Nothing>
}
