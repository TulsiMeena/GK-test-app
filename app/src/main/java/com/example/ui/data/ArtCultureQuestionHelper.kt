package com.example.ui.data

import com.example.ui.model.GkQuestion

object ArtCultureQuestionHelper {
    fun makeArtCultureQ(
        id: String,
        subtopicId: String,
        qHi: String,
        qEn: String,
        optsHi: List<String>,
        optsEn: List<String>,
        correctIdx: Int,
        expHi: String,
        expEn: String,
        diff: String = "Moderate"
    ): GkQuestion {
        return GkQuestion(
            id = id,
            category = "Art & Culture",
            categoryId = "art_culture",
            subtopic = subtopicId,
            questionHindi = qHi,
            questionEnglish = qEn,
            optionsHindi = optsHi,
            optionsEnglish = optsEn,
            correctAnswerIndex = correctIdx,
            explanationHindi = expHi,
            explanationEnglish = expEn,
            difficulty = diff
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
                val newId = "art_${subtopicId.removePrefix("art_")}_m${mock}_q$qNum"
                result.add(
                    GkQuestion(
                        id = newId,
                        category = "Art & Culture",
                        categoryId = "art_culture",
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
