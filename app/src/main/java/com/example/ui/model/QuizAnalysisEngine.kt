package com.example.ui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Warning
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Pure Calculation Engine for GYANIX Quiz Results & Performance Analytics
 * Fully decoupled from UI components.
 */
object QuizAnalysisEngine {

    fun calculateDetailedAnalysis(sessionResult: QuizSessionResult): DetailedAnalysisResult {
        val scoreBreakdown = calculateScoreBreakdown(sessionResult)
        val categoryStats = calculateCategoryStats(sessionResult)
        val difficultyStats = calculateDifficultyStats(sessionResult)
        val timeStats = calculateTimeStats(sessionResult)
        val performanceLevel = PerformanceLevel.fromPercentage(scoreBreakdown.percentage)

        val incorrectQuestions = sessionResult.questionStates.filter { it.isAnswered && !it.isCorrect }
        val unattemptedQuestions = sessionResult.questionStates.filter { !it.isAnswered }
        val correctQuestions = sessionResult.questionStates.filter { it.isCorrect }

        val insights = generatePerformanceInsights(
            scoreBreakdown = scoreBreakdown,
            categoryStats = categoryStats,
            difficultyStats = difficultyStats,
            timeStats = timeStats,
            sessionResult = sessionResult
        )

        return DetailedAnalysisResult(
            sessionResult = sessionResult,
            performanceLevel = performanceLevel,
            scoreBreakdown = scoreBreakdown,
            categoryStats = categoryStats,
            difficultyStats = difficultyStats,
            timeStats = timeStats,
            insights = insights,
            incorrectQuestions = incorrectQuestions,
            unattemptedQuestions = unattemptedQuestions,
            correctQuestions = correctQuestions
        )
    }

    fun calculateScoreBreakdown(sessionResult: QuizSessionResult): ScoreBreakdownStat {
        val total = sessionResult.totalQuestions
        val correct = sessionResult.correctCount
        val incorrect = sessionResult.incorrectCount
        val unattempted = sessionResult.unansweredCount
        val marksPerCorrect = sessionResult.config.marksPerCorrect
        val negativeRate = sessionResult.config.negativeMarking // e.g. -0.25f, -0.50f, or 0.0f

        val grossMarks = correct * marksPerCorrect
        val negativeDeduction = if (negativeRate < 0f) incorrect * kotlin.math.abs(negativeRate) else 0f
        val netScore = max(0f, grossMarks - negativeDeduction)
        val maxMarks = if (sessionResult.maxScore > 0f) sessionResult.maxScore else total * marksPerCorrect
        val percentage = if (maxMarks > 0f) ((netScore / maxMarks) * 100).roundToInt().coerceIn(0, 100) else 0
        val attempted = correct + incorrect
        val accuracy = if (attempted > 0) ((correct.toFloat() / attempted.toFloat()) * 100).roundToInt().coerceIn(0, 100) else 0

        return ScoreBreakdownStat(
            correctCount = correct,
            incorrectCount = incorrect,
            unattemptedCount = unattempted,
            marksPerCorrect = marksPerCorrect,
            negativeMarkingPerIncorrect = negativeRate,
            grossMarksEarned = grossMarks,
            negativeMarksDeducted = negativeDeduction,
            finalScore = netScore,
            maximumMarks = maxMarks,
            percentage = percentage,
            accuracy = accuracy
        )
    }

    fun calculateCategoryStats(sessionResult: QuizSessionResult): List<CategoryPerformanceStat> {
        val categoryMap = mutableMapOf<String, MutableList<UserQuestionState>>()

        sessionResult.questionStates.forEach { state ->
            val catName = state.question.category
            categoryMap.getOrPut(catName) { mutableListOf() }.add(state)
        }

        return categoryMap.map { (catName, states) ->
            val total = states.size
            val attempted = states.count { it.isAnswered }
            val correct = states.count { it.isCorrect }
            val incorrect = states.count { it.isAnswered && !it.isCorrect }
            val unattempted = states.count { !it.isAnswered }
            val accuracy = if (attempted > 0) ((correct.toFloat() / attempted.toFloat()) * 100).roundToInt() else 0
            val ratio = if (total > 0) correct.toFloat() / total.toFloat() else 0f
            val timeSpent = states.sumOf { it.timeSpentSeconds }
            val firstState = states.firstOrNull()
            val catId = firstState?.question?.categoryId ?: catName.lowercase().replace(" ", "_")

            CategoryPerformanceStat(
                categoryId = catId,
                categoryName = catName,
                totalQuestions = total,
                attemptedCount = attempted,
                correctCount = correct,
                incorrectCount = incorrect,
                unattemptedCount = unattempted,
                accuracyPercentage = accuracy,
                scoreRatio = ratio,
                timeSpentSeconds = timeSpent
            )
        }.sortedByDescending { it.accuracyPercentage }
    }

    fun calculateDifficultyStats(sessionResult: QuizSessionResult): List<DifficultyPerformanceStat> {
        val difficulties = listOf("Easy", "Moderate", "Hard")
        val map = mutableMapOf<String, MutableList<UserQuestionState>>()

        sessionResult.questionStates.forEach { state ->
            val diff = state.question.difficulty
            map.getOrPut(diff) { mutableListOf() }.add(state)
        }

        return difficulties.mapNotNull { diffName ->
            val states = map[diffName] ?: return@mapNotNull null
            val total = states.size
            val attempted = states.count { it.isAnswered }
            val correct = states.count { it.isCorrect }
            val incorrect = states.count { it.isAnswered && !it.isCorrect }
            val unattempted = states.count { !it.isAnswered }
            val accuracy = if (attempted > 0) ((correct.toFloat() / attempted.toFloat()) * 100).roundToInt() else 0

            DifficultyPerformanceStat(
                difficulty = diffName,
                totalQuestions = total,
                attemptedCount = attempted,
                correctCount = correct,
                incorrectCount = incorrect,
                unattemptedCount = unattempted,
                accuracyPercentage = accuracy
            )
        }
    }

    fun calculateTimeStats(sessionResult: QuizSessionResult): TimePerformanceStat {
        val isUntimed = sessionResult.config.timeLimitMinutes <= 0
        val totalConfigured = sessionResult.config.totalTimeSeconds
        val actualTaken = sessionResult.timeTakenSeconds
        val attempted = sessionResult.answeredCount

        val avgTimePerAttempt = if (attempted > 0) {
            actualTaken / attempted
        } else {
            0
        }

        val questionTimes = sessionResult.questionStates
            .map { it.timeSpentSeconds }
            .filter { it > 0 }

        val fastest = questionTimes.minOrNull()
        val slowest = questionTimes.maxOrNull()

        return TimePerformanceStat(
            totalConfiguredTimeSeconds = totalConfigured,
            timeTakenSeconds = actualTaken,
            averageTimePerAttemptedSeconds = avgTimePerAttempt,
            fastestQuestionTimeSeconds = fastest,
            slowestQuestionTimeSeconds = slowest,
            isUntimed = isUntimed
        )
    }

    fun generatePerformanceInsights(
        scoreBreakdown: ScoreBreakdownStat,
        categoryStats: List<CategoryPerformanceStat>,
        difficultyStats: List<DifficultyPerformanceStat>,
        timeStats: TimePerformanceStat,
        sessionResult: QuizSessionResult
    ): List<PerformanceInsightItem> {
        val insights = mutableListOf<PerformanceInsightItem>()

        // 1. Accuracy / High Purity Insight
        if (scoreBreakdown.accuracy >= 85) {
            insights.add(
                PerformanceInsightItem(
                    id = "ins_high_acc",
                    title = "High Accuracy Strength",
                    description = "Your accuracy is strong at ${scoreBreakdown.accuracy}%. Try attempting a harder difficulty level or speed drill.",
                    type = InsightType.STRENGTH,
                    icon = Icons.Default.CheckCircle
                )
            )
        } else if (scoreBreakdown.accuracy < 60 && sessionResult.answeredCount > 0) {
            insights.add(
                PerformanceInsightItem(
                    id = "ins_low_acc",
                    title = "Focus on Revision",
                    description = "Focus on reviewing incorrect questions before attempting another full-length mock test.",
                    type = InsightType.GROWTH_AREA,
                    icon = Icons.Default.Warning
                )
            )
        }

        // 2. Unattempted / Pacing Insight
        if (scoreBreakdown.unattemptedCount >= (sessionResult.totalQuestions * 0.3f).toInt() && sessionResult.totalQuestions > 5) {
            insights.add(
                PerformanceInsightItem(
                    id = "ins_unattempted",
                    title = "Unattempted Question Backlog",
                    description = "You left ${scoreBreakdown.unattemptedCount} questions unanswered. Practice pacing and time management.",
                    type = InsightType.SPEED_MANAGEMENT,
                    icon = Icons.Default.Timer
                )
            )
        }

        // 3. Negative Marking Impact Insight
        if (scoreBreakdown.negativeMarksDeducted > 0f) {
            val netLost = String.format("%.2f", scoreBreakdown.negativeMarksDeducted)
            if (scoreBreakdown.negativeMarksDeducted >= 1.0f) {
                insights.add(
                    PerformanceInsightItem(
                        id = "ins_neg_loss",
                        title = "Negative Penalty Impact",
                        description = "You lost -$netLost marks due to negative marking on ${scoreBreakdown.incorrectCount} wrong answers. Skip 50-50 guesses when unsure.",
                        type = InsightType.NEGATIVE_MARKING_TIP,
                        icon = Icons.Default.Warning
                    )
                )
            } else {
                insights.add(
                    PerformanceInsightItem(
                        id = "ins_neg_minimal",
                        title = "Controlled Negative Deductions",
                        description = "Minimal loss of -$netLost marks to negative penalties. Keep risk management disciplined.",
                        type = InsightType.ACCURACY_STRATEGY,
                        icon = Icons.Default.TrendingUp
                    )
                )
            }
        } else if (scoreBreakdown.incorrectCount == 0 && sessionResult.answeredCount > 0) {
            insights.add(
                PerformanceInsightItem(
                    id = "ins_zero_wrong",
                    title = "Zero Penalty Perfection",
                    description = "Zero wrong answers! You incurred 0.0 marks in negative deductions.",
                    type = InsightType.STRENGTH,
                    icon = Icons.Default.CheckCircle
                )
            )
        }

        // 4. Strong Category Insight
        val strongCategory = categoryStats.filter { it.totalQuestions >= 2 }.maxByOrNull { it.accuracyPercentage }
        if (strongCategory != null && strongCategory.accuracyPercentage >= 75) {
            insights.add(
                PerformanceInsightItem(
                    id = "ins_strong_cat",
                    title = "Category Strength: ${strongCategory.categoryName}",
                    description = "${strongCategory.categoryName} is currently one of your strongest areas with ${strongCategory.accuracyPercentage}% accuracy (${strongCategory.correctCount}/${strongCategory.totalQuestions} correct).",
                    type = InsightType.STRENGTH,
                    icon = Icons.Default.AutoAwesome
                )
            )
        }

        // 5. Weak Category Insight
        val weakCategory = categoryStats.filter { it.totalQuestions >= 2 }.minByOrNull { it.accuracyPercentage }
        if (weakCategory != null && weakCategory.accuracyPercentage < 65 && weakCategory.categoryId != strongCategory?.categoryId) {
            insights.add(
                PerformanceInsightItem(
                    id = "ins_weak_cat",
                    title = "Focus Area: ${weakCategory.categoryName}",
                    description = "${weakCategory.categoryName} needs more practice (${weakCategory.accuracyPercentage}% accuracy). Review topic notes and solution explanations.",
                    type = InsightType.GROWTH_AREA,
                    icon = Icons.Default.Psychology
                )
            )
        }

        // 6. Speed Insight
        if (timeStats.averageTimePerAttemptedSeconds > 0) {
            val avg = timeStats.averageTimePerAttemptedSeconds
            val speedDesc = if (avg <= 35) {
                "Rapid response pace (~${avg}s per question). Pacing is fast enough for high-speed Tier-1 competitive exams."
            } else if (avg <= 60) {
                "Balanced timing (~${avg}s per question). Good equilibrium between comprehension and speed."
            } else {
                "Deliberate timing (~${avg}s per question). Practice speed drill modes to reduce question reading latency."
            }

            insights.add(
                PerformanceInsightItem(
                    id = "ins_speed_stat",
                    title = "Pacing Analysis",
                    description = speedDesc,
                    type = InsightType.SPEED_MANAGEMENT,
                    icon = Icons.Default.Speed
                )
            )
        }

        return insights
    }
}
