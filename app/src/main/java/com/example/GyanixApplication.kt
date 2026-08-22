package com.example

import android.app.Application
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.model.QuizQuestionDatabase

class GyanixApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize 5,000 Questions Database at startup
        QuizQuestionDatabase.initialize(this)
        // Initialize Local Storage
        GyanixLocalDataManager.initialize(this)
    }
}
