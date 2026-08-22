package com.example.ui.model

import androidx.compose.ui.graphics.Color
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * Question Model for GYANIX Quiz Engine
 */
data class GkQuestion(
    val id: String,
    val category: String,
    val categoryId: String,
    val subtopic: String,
    val questionEnglish: String,
    val questionHindi: String,
    val optionsEnglish: List<String>,
    val optionsHindi: List<String>,
    val correctAnswerIndex: Int, // 0 to 3 (A, B, C, D)
    val explanationEnglish: String,
    val explanationHindi: String,
    val difficulty: String // "Easy", "Moderate", "Hard"
)

/**
 * 5 Distinct Statuses for Questions in Exam Palette
 */
enum class QuestionStatus(
    val label: String,
    val labelHindi: String,
    val color: Color
) {
    UNVISITED("Unvisited", "अनदेखे", Color(0xFF64748B)),
    ANSWERED("Answered", "उत्तरित", SuccessGreen),
    UNANSWERED("Unanswered", "अनुत्तरित", WarningAmber),
    MARKED_FOR_REVIEW("Marked for Review", "समीक्षा हेतु", PurpleAccent),
    ANSWERED_AND_MARKED("Answered & Marked", "उत्तरित व समीक्षा", RoyalBlue400)
}

/**
 * Source of Questions in Test Configuration
 */
enum class QuestionSource(val displayName: String, val description: String) {
    TOPIC("Topic Specific", "Strictly isolated questions for selected topic"),
    SINGLE_CATEGORY("Single Category", "Focus on one specific GK subject"),
    MULTIPLE_CATEGORIES("Multiple Categories", "Select custom mix of GK subjects"),
    RANDOM_GK("Random GK (All Subjects)", "Comprehensive mix from all 10 categories")
}

/**
 * Complete Configuration for a Test Session
 */
data class QuizConfig(
    val testTitle: String = "GK Practice Test",
    val questionCount: Int = 25, // 10, 25, 50, 100
    val difficulty: String = "Mixed", // "Easy", "Moderate", "Hard", "Mixed"
    val questionSource: QuestionSource = QuestionSource.RANDOM_GK,
    val selectedCategoryIds: Set<String> = emptySet(),
    val targetTopicId: String? = null,
    val targetTopicTitle: String? = null,
    val targetTopicHindi: String? = null,
    val timeLimitMinutes: Int = 20, // 0 = No Timer, 10, 20, 30, 60
    val negativeMarking: Float = -0.25f, // 0.0f, -0.25f, -0.50f
    val marksPerCorrect: Float = 1.0f,
    val language: String = "English" // "English", "Hindi"
) {
    val totalTimeSeconds: Int
        get() = timeLimitMinutes * 60

    val maxMarks: Float
        get() = questionCount * marksPerCorrect

    val negativeMarkingLabel: String
        get() = when (negativeMarking) {
            0.0f -> "Off (No Negative)"
            -0.25f -> "-0.25 Marks (1/4th)"
            -0.50f -> "-0.50 Marks (1/2nd)"
            else -> "$negativeMarking Marks"
        }
}

/**
 * User's runtime state for each question
 */
data class UserQuestionState(
    val question: GkQuestion,
    val selectedOptionIndex: Int? = null, // null if not selected, 0..3
    val isMarkedForReview: Boolean = false,
    val isVisited: Boolean = false,
    val timeSpentSeconds: Int = 0
) {
    val isAnswered: Boolean
        get() = selectedOptionIndex != null

    val isCorrect: Boolean
        get() = selectedOptionIndex == question.correctAnswerIndex

    val status: QuestionStatus
        get() = when {
            !isVisited -> QuestionStatus.UNVISITED
            isAnswered && isMarkedForReview -> QuestionStatus.ANSWERED_AND_MARKED
            isAnswered -> QuestionStatus.ANSWERED
            isMarkedForReview -> QuestionStatus.MARKED_FOR_REVIEW
            else -> QuestionStatus.UNANSWERED
        }
}

/**
 * Runtime Timer Visual State
 */
enum class TimerAlertState {
    NORMAL,    // > 5 minutes remaining (or no timer)
    WARNING,   // Between 1 and 5 minutes remaining
    CRITICAL,  // < 1 minute remaining
    NO_TIMER   // Untimed mode
}

/**
 * Result Summary after quiz submission
 */
data class QuizSessionResult(
    val config: QuizConfig,
    val questionStates: List<UserQuestionState>,
    val totalQuestions: Int,
    val answeredCount: Int,
    val unansweredCount: Int,
    val markedForReviewCount: Int,
    val answeredAndMarkedCount: Int,
    val correctCount: Int,
    val incorrectCount: Int,
    val score: Float,
    val maxScore: Float,
    val accuracyPercentage: Int,
    val timeTakenSeconds: Int,
    val isAutoSubmitted: Boolean = false,
    val categoryScoreBreakdown: Map<String, Pair<Int, Int>> = emptyMap() // CategoryName to (Correct, Total)
)
