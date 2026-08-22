package com.example.ui.data

import com.example.ui.model.GkQuestion

fun makePolityQ(
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
    category = "Indian Polity & Constitution",
    categoryId = "polity",
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
