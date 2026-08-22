package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyTopic4ExtData {
    val questions: List<GkQuestion> by lazy {
        EconomyQuestionHelper.generateTopicMocks("eco_4", 6, 10, EconomyTopic4Data.questions)
    }
}
