package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyTopic6ExtData {
    val questions: List<GkQuestion> by lazy {
        EconomyQuestionHelper.generateTopicMocks("eco_6", 6, 10, EconomyTopic6Data.questions)
    }
}
