package com.example.ui.quiz

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.ui.model.GkQuestion
import com.example.ui.model.QuestionSource
import com.example.ui.model.QuestionStatus
import com.example.ui.model.QuizConfig
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.model.QuizSessionResult
import com.example.ui.model.TimerAlertState
import com.example.ui.model.UserQuestionState
import kotlinx.coroutines.delay
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Quiz Engine State Manager
 * Handles timer loop, question responses, review flags, navigation and scoring.
 */
class QuizEngineState(
    initialConfig: QuizConfig = QuizConfig()
) {
    var config by mutableStateOf(initialConfig)
        private set

    var currentLanguage by mutableStateOf(initialConfig.language)
        private set

    val questionStates = mutableStateListOf<UserQuestionState>()

    var currentQuestionIndex by mutableIntStateOf(0)
        private set

    var remainingSeconds by mutableIntStateOf(0)
        private set

    var isQuizActive by mutableStateOf(false)
        private set

    var isQuizSubmitted by mutableStateOf(false)
        private set

    var sessionResult by mutableStateOf<QuizSessionResult?>(null)
        private set

    var showSubmitConfirmation by mutableStateOf(false)
    var showExitWarning by mutableStateOf(false)
    var showQuestionNavigator by mutableStateOf(false)

    val currentQuestionState: UserQuestionState?
        get() = questionStates.getOrNull(currentQuestionIndex)

    val totalQuestions: Int
        get() = questionStates.size

    val answeredCount: Int
        get() = questionStates.count { it.isAnswered }

    val unansweredCount: Int
        get() = questionStates.count { !it.isAnswered }

    val markedForReviewCount: Int
        get() = questionStates.count { it.isMarkedForReview && !it.isAnswered }

    val answeredAndMarkedCount: Int
        get() = questionStates.count { it.isMarkedForReview && it.isAnswered }

    val unvisitedCount: Int
        get() = questionStates.count { !it.isVisited }

    val progressFraction: Float
        get() = if (totalQuestions > 0) (currentQuestionIndex + 1).toFloat() / totalQuestions.toFloat() else 0f

    val answeredProgressFraction: Float
        get() = if (totalQuestions > 0) answeredCount.toFloat() / totalQuestions.toFloat() else 0f

    val timerAlertState: TimerAlertState
        get() = when {
            config.timeLimitMinutes <= 0 -> TimerAlertState.NO_TIMER
            remainingSeconds <= 60 -> TimerAlertState.CRITICAL
            remainingSeconds <= 300 -> TimerAlertState.WARNING
            else -> TimerAlertState.NORMAL
        }

    val formattedRemainingTime: String
        get() {
            if (config.timeLimitMinutes <= 0) return "Untimed"
            val mins = remainingSeconds / 60
            val secs = remainingSeconds % 60
            return String.format("%02d:%02d", mins, secs)
        }

    fun startQuiz(newConfig: QuizConfig) {
        config = newConfig
        currentLanguage = newConfig.language
        val questions = QuizQuestionDatabase.selectQuestionsForQuiz(newConfig)
        questionStates.clear()
        questions.forEachIndexed { index, question ->
            questionStates.add(
                UserQuestionState(
                    question = question,
                    isVisited = (index == 0) // First question is visited immediately
                )
            )
        }
        currentQuestionIndex = 0
        remainingSeconds = if (newConfig.timeLimitMinutes > 0) newConfig.totalTimeSeconds else 0
        isQuizActive = true
        isQuizSubmitted = false
        sessionResult = null
        showSubmitConfirmation = false
        showExitWarning = false
        showQuestionNavigator = false
    }

    fun toggleLanguage() {
        currentLanguage = if (currentLanguage.equals("Hindi", ignoreCase = true)) "English" else "Hindi"
    }

    fun setLanguage(lang: String) {
        currentLanguage = if (lang.equals("Hindi", ignoreCase = true)) "Hindi" else "English"
    }

    fun selectOption(optionIndex: Int) {
        val current = currentQuestionState ?: return
        val updated = current.copy(
            selectedOptionIndex = if (current.selectedOptionIndex == optionIndex) null else optionIndex,
            isVisited = true
        )
        questionStates[currentQuestionIndex] = updated
    }

    fun clearOption() {
        val current = currentQuestionState ?: return
        val updated = current.copy(selectedOptionIndex = null, isVisited = true)
        questionStates[currentQuestionIndex] = updated
    }

    fun toggleMarkForReview() {
        val current = currentQuestionState ?: return
        val updated = current.copy(
            isMarkedForReview = !current.isMarkedForReview,
            isVisited = true
        )
        questionStates[currentQuestionIndex] = updated
    }

    fun jumpToQuestion(index: Int) {
        if (index in 0 until totalQuestions) {
            currentQuestionIndex = index
            markCurrentVisited()
            showQuestionNavigator = false
        }
    }

    fun nextQuestion() {
        if (currentQuestionIndex < totalQuestions - 1) {
            currentQuestionIndex++
            markCurrentVisited()
        } else {
            // At last question, prompt submit confirmation
            showSubmitConfirmation = true
        }
    }

    fun previousQuestion() {
        if (currentQuestionIndex > 0) {
            currentQuestionIndex--
            markCurrentVisited()
        }
    }

    private fun markCurrentVisited() {
        val current = currentQuestionState ?: return
        if (!current.isVisited) {
            questionStates[currentQuestionIndex] = current.copy(isVisited = true)
        }
    }

    fun tickOneSecond() {
        if (!isQuizActive || isQuizSubmitted || config.timeLimitMinutes <= 0) return

        if (remainingSeconds > 0) {
            remainingSeconds--
            // Also increment time spent on current question
            val current = currentQuestionState
            if (current != null) {
                questionStates[currentQuestionIndex] = current.copy(
                    timeSpentSeconds = current.timeSpentSeconds + 1
                )
            }
            if (remainingSeconds <= 0) {
                // Auto submit when timer reaches 0 (bypasses confirmation dialog)
                autoSubmit()
            }
        }
    }

    fun submitQuiz(): QuizSessionResult {
        showSubmitConfirmation = false
        showQuestionNavigator = false
        isQuizActive = false
        isQuizSubmitted = true

        val total = questionStates.size
        var correct = 0
        var incorrect = 0
        var unattempted = 0
        var marked = 0
        var answeredAndMarked = 0

        val categoryScores = mutableMapOf<String, Pair<Int, Int>>() // Category -> Pair(Correct, Total)

        questionStates.forEach { state ->
            val cat = state.question.category
            val (curCorrect, curTotal) = categoryScores.getOrDefault(cat, 0 to 0)

            if (state.isAnswered) {
                if (state.isMarkedForReview) answeredAndMarked++
                if (state.isCorrect) {
                    correct++
                    categoryScores[cat] = (curCorrect + 1) to (curTotal + 1)
                } else {
                    incorrect++
                    categoryScores[cat] = curCorrect to (curTotal + 1)
                }
            } else {
                unattempted++
                categoryScores[cat] = curCorrect to (curTotal + 1)
                if (state.isMarkedForReview) marked++
            }
        }

        val totalMarksEarned = (correct * config.marksPerCorrect) + (incorrect * config.negativeMarking)
        val finalScore = max(0f, totalMarksEarned)
        val totalAnswered = correct + incorrect
        val accuracy = if (totalAnswered > 0) ((correct.toFloat() / totalAnswered.toFloat()) * 100).roundToInt() else 0
        val timeTaken = if (config.timeLimitMinutes > 0) {
            config.totalTimeSeconds - remainingSeconds
        } else {
            questionStates.sumOf { it.timeSpentSeconds }
        }

        val result = QuizSessionResult(
            config = config,
            questionStates = questionStates.toList(),
            totalQuestions = total,
            answeredCount = totalAnswered,
            unansweredCount = unattempted,
            markedForReviewCount = marked,
            answeredAndMarkedCount = answeredAndMarked,
            correctCount = correct,
            incorrectCount = incorrect,
            score = finalScore,
            maxScore = config.maxMarks,
            accuracyPercentage = accuracy,
            timeTakenSeconds = max(1, timeTaken),
            isAutoSubmitted = false,
            categoryScoreBreakdown = categoryScores
        )
        sessionResult = result
        return result
    }

    private fun autoSubmit() {
        val result = submitQuiz().copy(isAutoSubmitted = true)
        sessionResult = result
    }
}

@Composable
fun rememberQuizEngineState(initialConfig: QuizConfig = QuizConfig()): QuizEngineState {
    val state = remember { QuizEngineState(initialConfig) }

    // Active Timer Loop
    LaunchedEffect(state.isQuizActive, state.isQuizSubmitted, state.config.timeLimitMinutes) {
        if (state.isQuizActive && !state.isQuizSubmitted && state.config.timeLimitMinutes > 0) {
            while (state.remainingSeconds > 0 && state.isQuizActive && !state.isQuizSubmitted) {
                delay(1000L)
                state.tickOneSecond()
            }
        }
    }

    return state
}
