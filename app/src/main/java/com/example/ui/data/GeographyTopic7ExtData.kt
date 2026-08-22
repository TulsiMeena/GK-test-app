package com.example.ui.data

import com.example.ui.model.GkQuestion

object GeographyTopic7ExtData {
    val questions: List<GkQuestion> by lazy {
        GeographyQuestionHelper.generateTopicMocks("geo_7", 6, 10, GeographyTopic7Data.baseQuestions)
    }
}
