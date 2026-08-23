package com.example

import android.app.Application
import android.util.Log
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.model.QuizQuestionDatabase
import com.google.firebase.FirebaseApp

class GyanixApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // 1. Safe Firebase App Initialization
        try {
            FirebaseApp.initializeApp(this)
        } catch (e: Throwable) {
            Log.e("GyanixApp", "FirebaseApp init handled gracefully: ${e.message}")
        }

        // 2. Initialize Local Storage Safely
        try {
            GyanixLocalDataManager.initialize(this)
        } catch (e: Throwable) {
            Log.e("GyanixApp", "GyanixLocalDataManager init handled: ${e.message}")
        }

        // 3. Initialize Question Database Safely
        try {
            QuizQuestionDatabase.initialize(this)
        } catch (e: Throwable) {
            Log.e("GyanixApp", "QuizQuestionDatabase init handled: ${e.message}")
        }
    }
}
