package com.example.services

import android.util.Log
import com.example.ui.auth.GyanixUser
import com.google.firebase.Timestamp
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.tasks.await

/**
 * Dedicated service for managing User Profile and Firestore subcollections.
 * Keeps user data completely isolated under users/{uid}/...
 */
class FirestoreUserService {

    private val firestore: FirebaseFirestore? by lazy {
        try {
            FirebaseFirestore.getInstance()
        } catch (e: Throwable) {
            Log.e("FirestoreUserService", "FirebaseFirestore not available: ${e.message}")
            null
        }
    }

    private val usersCollection: CollectionReference?
        get() = firestore?.collection("users")

    /**
     * Gets user document reference for a given UID.
     */
    fun getUserDocument(uid: String): DocumentReference? {
        return usersCollection?.document(uid)
    }

    /**
     * Subcollections under users/{uid}
     */
    fun getSettingsCollection(uid: String): CollectionReference? {
        return getUserDocument(uid)?.collection("settings")
    }

    fun getProgressCollection(uid: String): CollectionReference? {
        return getUserDocument(uid)?.collection("progress")
    }

    fun getBookmarksCollection(uid: String): CollectionReference? {
        return getUserDocument(uid)?.collection("bookmarks")
    }

    fun getMistakesCollection(uid: String): CollectionReference? {
        return getUserDocument(uid)?.collection("mistakes")
    }

    fun getTestHistoryCollection(uid: String): CollectionReference? {
        return getUserDocument(uid)?.collection("testHistory")
    }

    /**
     * Creates or initializes the user profile in Firestore if it doesn't already exist.
     * Never stores passwords.
     */
    suspend fun createUserProfileIfNotExists(
        uid: String,
        displayName: String,
        email: String
    ): GyanixUser {
        val userDoc = getUserDocument(uid)
        if (userDoc == null) {
            return GyanixUser(
                uid = uid,
                displayName = displayName.trim(),
                email = email.trim(),
                createdAt = System.currentTimeMillis(),
                updatedAt = System.currentTimeMillis()
            )
        }
        try {
            val snapshot = userDoc.get().await()
            if (snapshot.exists()) {
                val name = snapshot.getString("displayName") ?: displayName
                val mail = snapshot.getString("email") ?: email
                val createdAt = snapshot.getTimestamp("createdAt")?.toDate()?.time ?: System.currentTimeMillis()
                val updatedAt = snapshot.getTimestamp("updatedAt")?.toDate()?.time ?: System.currentTimeMillis()
                return GyanixUser(
                    uid = uid,
                    displayName = name,
                    email = mail,
                    createdAt = createdAt,
                    updatedAt = updatedAt
                )
            } else {
                val now = Timestamp.now()
                val profileData = hashMapOf(
                    "uid" to uid,
                    "displayName" to displayName.trim(),
                    "email" to email.trim(),
                    "createdAt" to now,
                    "updatedAt" to now
                )
                userDoc.set(profileData).await()

                return GyanixUser(
                    uid = uid,
                    displayName = displayName.trim(),
                    email = email.trim(),
                    createdAt = now.toDate().time,
                    updatedAt = now.toDate().time
                )
            }
        } catch (e: Exception) {
            // Fallback for offline / network issues: Return profile locally
            return GyanixUser(
                uid = uid,
                displayName = displayName.trim(),
                email = email.trim(),
                createdAt = System.currentTimeMillis(),
                updatedAt = System.currentTimeMillis()
            )
        }
    }

    /**
     * Fetches the user's profile from Firestore.
     */
    suspend fun getUserProfile(uid: String, fallbackEmail: String = "", fallbackName: String = ""): GyanixUser? {
        val userDoc = getUserDocument(uid) ?: return null
        return try {
            val snapshot = userDoc.get().await()
            if (snapshot.exists()) {
                val name = snapshot.getString("displayName") ?: fallbackName
                val mail = snapshot.getString("email") ?: fallbackEmail
                val createdAt = snapshot.getTimestamp("createdAt")?.toDate()?.time ?: System.currentTimeMillis()
                val updatedAt = snapshot.getTimestamp("updatedAt")?.toDate()?.time ?: System.currentTimeMillis()
                GyanixUser(
                    uid = uid,
                    displayName = name,
                    email = mail,
                    createdAt = createdAt,
                    updatedAt = updatedAt
                )
            } else {
                null
            }
        } catch (e: Exception) {
            null
        }
    }

    /**
     * Updates display name in Firestore.
     */
    suspend fun updateDisplayName(uid: String, newName: String) {
        val userDoc = getUserDocument(uid) ?: return
        try {
            val updates = mapOf(
                "displayName" to newName.trim(),
                "updatedAt" to Timestamp.now()
            )
            userDoc.set(updates, SetOptions.merge()).await()
        } catch (e: Exception) {
            // Log or pass
        }
    }
}
