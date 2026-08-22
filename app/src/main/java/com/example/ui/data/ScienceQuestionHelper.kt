package com.example.ui.data

import com.example.ui.model.GkQuestion

object ScienceQuestionHelper {
    fun makeScienceQ(
        id: String,
        topicId: String,
        qHi: String,
        qEn: String,
        optsHi: List<String>,
        optsEn: List<String>,
        ansIdx: Int,
        expHi: String,
        expEn: String,
        diff: String = "Moderate"
    ): GkQuestion {
        return GkQuestion(
            id = id,
            category = "General Science",
            categoryId = "science",
            subtopic = topicId,
            questionHindi = qHi,
            questionEnglish = qEn,
            optionsHindi = optsHi,
            optionsEnglish = optsEn,
            correctAnswerIndex = ansIdx,
            explanationHindi = expHi,
            explanationEnglish = expEn,
            difficulty = diff
        )
    }
}
