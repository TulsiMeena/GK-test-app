package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyQuestionHelper {
    fun makeEconomyQ(
        id: String,
        subtopic: String,
        qHi: String,
        qEn: String,
        optsHi: List<String>,
        optsEn: List<String>,
        ansIdx: Int,
        expHi: String,
        expEn: String,
        diff: String = "Moderate"
    ): GkQuestion = GkQuestion(
        id = id,
        category = "Indian Economy",
        categoryId = "economy",
        subtopic = subtopic,
        questionHindi = qHi,
        questionEnglish = qEn,
        optionsHindi = optsHi,
        optionsEnglish = optsEn,
        correctAnswerIndex = ansIdx,
        explanationHindi = expHi,
        explanationEnglish = expEn,
        difficulty = diff
    )

    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        if (templateQuestions.isEmpty()) return result
        val cleanTopic = subtopicId.removePrefix("eco_")
        for (mock in startMock..endMock) {
            for (i in 0 until 15) {
                val template = templateQuestions[i % templateQuestions.size]
                val qNum = i + 1
                val newId = "eco_${cleanTopic}_m${mock}_q$qNum"
                result.add(
                    GkQuestion(
                        id = newId,
                        category = "Indian Economy",
                        categoryId = "economy",
                        subtopic = subtopicId,
                        questionHindi = "[Mock $mock] ${template.questionHindi.replace(Regex("^\\[Mock \\d+\\]\\s*"), "")}",
                        questionEnglish = "[Mock $mock] ${template.questionEnglish.replace(Regex("^\\[Mock \\d+\\]\\s*"), "")}",
                        optionsHindi = template.optionsHindi,
                        optionsEnglish = template.optionsEnglish,
                        correctAnswerIndex = template.correctAnswerIndex,
                        explanationHindi = template.explanationHindi,
                        explanationEnglish = template.explanationEnglish,
                        difficulty = template.difficulty
                    )
                )
            }
        }
        return result
    }
}

fun makeEconomyQ(
    id: String,
    subtopic: String,
    qHi: String,
    qEn: String,
    optsHi: List<String>,
    optsEn: List<String>,
    ansIdx: Int,
    expHi: String,
    expEn: String,
    diff: String = "Moderate"
): GkQuestion = EconomyQuestionHelper.makeEconomyQ(id, subtopic, qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff)
