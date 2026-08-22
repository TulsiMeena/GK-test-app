package com.example.ui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * Performance Level Tier based on percentage score
 */
enum class PerformanceLevel(
    val title: String,
    val subtitle: String,
    val color: Color,
    val minPercentage: Int
) {
    OUTSTANDING(
        title = "Outstanding Performance",
        subtitle = "Mastery demonstrated across tested topics with exceptional precision.",
        color = SuccessGreen,
        minPercentage = 90
    ),
    EXCELLENT(
        title = "Excellent Performance",
        subtitle = "Strong command over concepts with high competitive readiness.",
        color = ElectricCyan400,
        minPercentage = 75
    ),
    GOOD(
        title = "Good Performance",
        subtitle = "Solid baseline performance with minor conceptual gaps to bridge.",
        color = RoyalBlue400,
        minPercentage = 60
    ),
    KEEP_PRACTICING(
        title = "Keep Practicing",
        subtitle = "Consistent effort will strengthen accuracy and topic coverage.",
        color = WarningAmber,
        minPercentage = 40
    ),
    MORE_PRACTICE_NEEDED(
        title = "More Practice Needed",
        subtitle = "Revise foundational notes and review question explanations thoroughly.",
        color = ErrorRed,
        minPercentage = 0
    );

    companion object {
        fun fromPercentage(percentage: Int): PerformanceLevel {
            return when {
                percentage >= 90 -> OUTSTANDING
                percentage >= 75 -> EXCELLENT
                percentage >= 60 -> GOOD
                percentage >= 40 -> KEEP_PRACTICING
                else -> MORE_PRACTICE_NEEDED
            }
        }
    }
}

/**
 * Detailed Score Breakdown Model
 */
data class ScoreBreakdownStat(
    val correctCount: Int,
    val incorrectCount: Int,
    val unattemptedCount: Int,
    val marksPerCorrect: Float,
    val negativeMarkingPerIncorrect: Float,
    val grossMarksEarned: Float,
    val negativeMarksDeducted: Float,
    val finalScore: Float,
    val maximumMarks: Float,
    val percentage: Int,
    val accuracy: Int
)

/**
 * Subject / Category Performance Analysis
 */
data class CategoryPerformanceStat(
    val categoryId: String,
    val categoryName: String,
    val totalQuestions: Int,
    val attemptedCount: Int,
    val correctCount: Int,
    val incorrectCount: Int,
    val unattemptedCount: Int,
    val accuracyPercentage: Int,
    val scoreRatio: Float, // 0.0 to 1.0
    val timeSpentSeconds: Int = 0
)

/**
 * Difficulty Level Performance Analysis
 */
data class DifficultyPerformanceStat(
    val difficulty: String, // "Easy", "Moderate", "Hard"
    val totalQuestions: Int,
    val attemptedCount: Int,
    val correctCount: Int,
    val incorrectCount: Int,
    val unattemptedCount: Int,
    val accuracyPercentage: Int
)

/**
 * Time Usage & Response Speed Analytics
 */
data class TimePerformanceStat(
    val totalConfiguredTimeSeconds: Int,
    val timeTakenSeconds: Int,
    val averageTimePerAttemptedSeconds: Int,
    val fastestQuestionTimeSeconds: Int?,
    val slowestQuestionTimeSeconds: Int?,
    val isUntimed: Boolean
) {
    val formattedTimeTaken: String
        get() {
            val mins = timeTakenSeconds / 60
            val secs = timeTakenSeconds % 60
            return if (mins > 0) "${mins}m ${secs}s" else "${secs}s"
        }

    val formattedAvgTimePerQuestion: String
        get() {
            val mins = averageTimePerAttemptedSeconds / 60
            val secs = averageTimePerAttemptedSeconds % 60
            return if (mins > 0) "${mins}m ${secs}s" else "${secs}s"
        }
}

/**
 * Deterministic Rule-Based Performance Insight
 */
data class PerformanceInsightItem(
    val id: String,
    val title: String,
    val description: String,
    val type: InsightType,
    val icon: ImageVector
)

enum class InsightType(val color: Color) {
    STRENGTH(SuccessGreen),
    GROWTH_AREA(WarningAmber),
    SPEED_MANAGEMENT(ElectricCyan400),
    ACCURACY_STRATEGY(RoyalBlue400),
    NEGATIVE_MARKING_TIP(ErrorRed)
}

/**
 * Master Container for Complete Detailed Test Result Analysis
 */
data class DetailedAnalysisResult(
    val sessionResult: QuizSessionResult,
    val performanceLevel: PerformanceLevel,
    val scoreBreakdown: ScoreBreakdownStat,
    val categoryStats: List<CategoryPerformanceStat>,
    val difficultyStats: List<DifficultyPerformanceStat>,
    val timeStats: TimePerformanceStat,
    val insights: List<PerformanceInsightItem>,
    val incorrectQuestions: List<UserQuestionState>,
    val unattemptedQuestions: List<UserQuestionState>,
    val correctQuestions: List<UserQuestionState>
)
