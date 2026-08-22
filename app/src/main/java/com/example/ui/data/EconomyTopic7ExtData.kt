package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyTopic7ExtData {
    val questions: List<GkQuestion> by lazy {
        EconomyQuestionHelper.generateTopicMocks("eco_7", 6, 10, EconomyTopic7Data.questions)
    }
}
