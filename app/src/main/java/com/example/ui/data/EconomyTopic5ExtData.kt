package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyTopic5ExtData {
    val questions: List<GkQuestion> by lazy {
        EconomyQuestionHelper.generateTopicMocks("eco_5", 6, 10, EconomyTopic5Data.questions)
    }
}
