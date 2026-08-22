package com.example.ui.data

import com.example.ui.model.GkQuestion

object StaticGkQuestionHelper {
    fun makeStaticGkQ(
        id: String,
        subtopicId: String,
        questionHindi: String,
        questionEnglish: String,
        optionsHindi: List<String>,
        optionsEnglish: List<String>,
        correctOptionIndex: Int,
        explanationHindi: String,
        explanationEnglish: String,
        difficulty: String = "Easy"
    ): GkQuestion {
        return GkQuestion(
            id = id,
            category = "Static GK",
            categoryId = "static_gk",
            subtopic = subtopicId,
            questionHindi = questionHindi,
            questionEnglish = questionEnglish,
            optionsHindi = optionsHindi,
            optionsEnglish = optionsEnglish,
            correctAnswerIndex = correctOptionIndex,
            explanationHindi = explanationHindi,
            explanationEnglish = explanationEnglish,
            difficulty = difficulty
        )
    }

    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        for (mock in startMock..endMock) {
            for ((idx, q) in templateQuestions.withIndex()) {
                val qNum = idx + 1
                val newId = "stk_${subtopicId.removePrefix("stk_")}_m${mock}_q$qNum"
                result.add(
                    GkQuestion(
                        id = newId,
                        category = "Static GK",
                        categoryId = "static_gk",
                        subtopic = subtopicId,
                        questionHindi = "[Mock $mock] ${q.questionHindi}",
                        questionEnglish = "[Mock $mock] ${q.questionEnglish}",
                        optionsHindi = q.optionsHindi,
                        optionsEnglish = q.optionsEnglish,
                        correctAnswerIndex = q.correctAnswerIndex,
                        explanationHindi = q.explanationHindi,
                        explanationEnglish = q.explanationEnglish,
                        difficulty = q.difficulty
                    )
                )
            }
        }
        return result
    }
}
