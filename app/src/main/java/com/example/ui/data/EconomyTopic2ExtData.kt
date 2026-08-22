package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyTopic2ExtData {
    val questions: List<GkQuestion> by lazy {
        EconomyQuestionHelper.generateTopicMocks("eco_2", 6, 10, EconomyTopic2Data.questions)
    }
}
