package com.example.ui.data

import com.example.ui.model.GkQuestion

fun makeHistoryQ(
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
    category = "Indian History",
    categoryId = "indian_history",
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
