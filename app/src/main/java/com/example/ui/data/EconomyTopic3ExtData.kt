package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyTopic3ExtData {
    val questions: List<GkQuestion> by lazy {
        EconomyQuestionHelper.generateTopicMocks("eco_3", 6, 10, EconomyTopic3Data.questions)
    }
}
