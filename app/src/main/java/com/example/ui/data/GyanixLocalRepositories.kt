package com.example.ui.data

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.example.ui.model.GkCategory
import com.example.ui.model.GkQuestion
import com.example.ui.model.GyanixData
import com.example.ui.model.QuizConfig
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.model.QuizSessionResult
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

/**
 * Data structures for Local Persistence and Performance Analytics
 */
data class WrongQuestionRecord(
    val questionId: String,
    val question: GkQuestion,
    val lastWrongTimestamp: Long = System.currentTimeMillis(),
    val wrongCount: Int = 1,
    val userLastSelectedOption: Int = 0,
    val correctOptionIndex: Int = question.correctAnswerIndex
)

data class BookmarkRecord(
    val questionId: String,
    val question: GkQuestion,
    val savedTimestamp: Long = System.currentTimeMillis()
)

data class TestAttemptRecord(
    val id: String,
    val testTitle: String,
    val questionCount: Int,
    val score: Float,
    val maxScore: Float,
    val accuracyPercentage: Int,
    val timeTakenSeconds: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val categoryScoreMap: Map<String, Pair<Int, Int>> = emptyMap()
)

data class StreakData(
    val currentStreak: Int = 3,
    val longestStreak: Int = 7,
    val lastActiveDate: String = ""
)

data class PracticeRecommendation(
    val id: String,
    val title: String,
    val subtitle: String,
    val category: String?,
    val categoryId: String?,
    val badgeText: String,
    val badgeColor: Color,
    val questionCount: Int = 15,
    val difficulty: String = "Mixed"
)

enum class WrongPracticeFilterMode(val label: String, val description: String) {
    ALL("Practice All", "Practice all recorded mistakes"),
    PRACTICE_10("Practice 10", "Quick 10-question revision"),
    PRACTICE_25("Practice 25", "Standard 25-question drill"),
    WEAK_CATEGORY("Weak Category", "Focus on weakest subject mistakes"),
    RECENTLY_INCORRECT("Recently Incorrect", "Latest mistakes first"),
    MOST_INCORRECT("Most Incorrect", "Mistakes made multiple times"),
    RANDOM("Random Mistakes", "Shuffled selection of wrong questions")
}

/**
 * Centralized Gyanix Local Data Manager
 * Coordinates QuestionRepository, BookmarkRepository, WrongQuestionRepository,
 * PracticeRepository, TestHistoryRepository, and PerformanceRepository.
 */
object GyanixLocalDataManager {

    private var sharedPrefs: SharedPreferences? = null
    private var currentUserId: String = "guest"

    // 1. Bookmark Repository State
    val bookmarkedQuestionIds = mutableStateMapOf<String, Long>()

    // 2. Wrong Question Repository State
    val wrongQuestionsMap = mutableStateMapOf<String, WrongQuestionRecord>()

    // 3. Test History Repository State
    val testHistoryList = mutableStateListOf<TestAttemptRecord>()

    // 4. Practice & Daily Goal State
    var dailyQuestionTarget by mutableIntStateOf(50)
    var todayCompletedQuestionsCount by mutableIntStateOf(0)
    var todayCorrectQuestionsCount by mutableIntStateOf(0)
    var todayIncorrectQuestionsCount by mutableIntStateOf(0)
    var currentStreakDays by mutableIntStateOf(0)
    var longestStreakDays by mutableIntStateOf(0)
    var lastActiveDateStr by mutableStateOf("")

    // Category Attempt Tracker: CategoryId -> Pair(CorrectCount, TotalAttemptedCount)
    val categoryStatsMap = mutableStateMapOf<String, Pair<Int, Int>>()

    private var isInitialized = false

    fun initialize(context: Context) {
        if (isInitialized) return
        sharedPrefs = context.getSharedPreferences("gyanix_user_$currentUserId", Context.MODE_PRIVATE)
        loadFromLocalStorage()
        isInitialized = true
    }

    /**
     * Switch storage partition when a different Firebase user logs in.
     * Ensures complete isolation between different accounts.
     */
    fun switchUser(userId: String, context: Context) {
        currentUserId = userId
        sharedPrefs = context.getSharedPreferences("gyanix_user_$userId", Context.MODE_PRIVATE)
        clearInMemoryData()
        loadFromLocalStorage()
        isInitialized = true
    }

    /**
     * Clears all in-memory data when user logs out.
     */
    fun clearUserData() {
        currentUserId = "guest"
        sharedPrefs = null
        clearInMemoryData()
        isInitialized = false
    }

    private fun clearInMemoryData() {
        bookmarkedQuestionIds.clear()
        wrongQuestionsMap.clear()
        testHistoryList.clear()
        categoryStatsMap.clear()
        dailyQuestionTarget = 50
        todayCompletedQuestionsCount = 0
        todayCorrectQuestionsCount = 0
        todayIncorrectQuestionsCount = 0
        currentStreakDays = 0
        longestStreakDays = 0
        lastActiveDateStr = ""
    }

    private fun loadFromLocalStorage() {
        val prefs = sharedPrefs ?: return
        dailyQuestionTarget = prefs.getInt("daily_target", 50)
        currentStreakDays = prefs.getInt("current_streak", 0)
        longestStreakDays = prefs.getInt("longest_streak", 0)
        lastActiveDateStr = prefs.getString("last_active_date", getTodayDateString()) ?: getTodayDateString()

        // Load Bookmark IDs
        val savedBookmarks = prefs.getStringSet("bookmarked_ids", emptySet()) ?: emptySet()
        savedBookmarks.forEach { id ->
            val timestamp = prefs.getLong("bm_time_$id", System.currentTimeMillis())
            bookmarkedQuestionIds[id] = timestamp
        }

        // Check if day changed to reset daily questions count
        val todayStr = getTodayDateString()
        if (lastActiveDateStr == todayStr) {
            todayCompletedQuestionsCount = prefs.getInt("today_completed", 0)
            todayCorrectQuestionsCount = prefs.getInt("today_correct", 0)
            todayIncorrectQuestionsCount = prefs.getInt("today_incorrect", 0)
        } else {
            // New day
            updateStreakOnNewDay(todayStr)
            todayCompletedQuestionsCount = 0
            todayCorrectQuestionsCount = 0
            todayIncorrectQuestionsCount = 0
        }
    }

    val totalQuestionsAttempted: Int
        get() = todayCompletedQuestionsCount + (testHistoryList.sumOf { it.questionCount })

    val totalTestsCompleted: Int
        get() = testHistoryList.size

    val overallAccuracyPercentage: Int
        get() {
            if (testHistoryList.isNotEmpty()) {
                val sum = testHistoryList.sumOf { it.accuracyPercentage }
                return (sum / testHistoryList.size)
            }
            return if (todayCompletedQuestionsCount > 0) {
                ((todayCorrectQuestionsCount.toFloat() / todayCompletedQuestionsCount.toFloat()) * 100).toInt()
            } else 0
        }

    // =========================================================================
    // 1. BOOKMARK REPOSITORY
    // =========================================================================

    fun isBookmarked(questionId: String): Boolean {
        val cleanId = questionId.substringBefore("_V")
        return bookmarkedQuestionIds.containsKey(cleanId)
    }

    fun toggleBookmark(questionId: String) {
        val cleanId = questionId.substringBefore("_V")
        if (bookmarkedQuestionIds.containsKey(cleanId)) {
            bookmarkedQuestionIds.remove(cleanId)
        } else {
            bookmarkedQuestionIds[cleanId] = System.currentTimeMillis()
        }
        saveBookmarks()
    }

    fun bookmarkAll(questionIds: List<String>) {
        val now = System.currentTimeMillis()
        questionIds.forEach { id ->
            val cleanId = id.substringBefore("_V")
            bookmarkedQuestionIds[cleanId] = now
        }
        saveBookmarks()
    }

    fun removeBookmark(questionId: String) {
        val cleanId = questionId.substringBefore("_V")
        bookmarkedQuestionIds.remove(cleanId)
        saveBookmarks()
    }

    fun getBookmarkedQuestions(): List<GkQuestion> {
        val ids = bookmarkedQuestionIds.keys
        return QuizQuestionDatabase.getQuestionsByIds(ids)
    }

    fun getBookmarkedRecords(): List<BookmarkRecord> {
        return bookmarkedQuestionIds.mapNotNull { (qId, time) ->
            val question = QuizQuestionDatabase.getQuestionById(qId)
            if (question != null) {
                BookmarkRecord(questionId = qId, question = question, savedTimestamp = time)
            } else null
        }.sortedByDescending { it.savedTimestamp }
    }

    private fun saveBookmarks() {
        val prefs = sharedPrefs ?: return
        val editor = prefs.edit()
        editor.putStringSet("bookmarked_ids", bookmarkedQuestionIds.keys.toSet())
        bookmarkedQuestionIds.forEach { (id, time) ->
            editor.putLong("bm_time_$id", time)
        }
        editor.apply()
    }

    // =========================================================================
    // 2. WRONG QUESTIONS REPOSITORY
    // =========================================================================

    fun recordWrongAnswer(question: GkQuestion, userOptionIndex: Int) {
        val cleanId = question.id.substringBefore("_V")
        val existing = wrongQuestionsMap[cleanId]
        val newCount = (existing?.wrongCount ?: 0) + 1
        wrongQuestionsMap[cleanId] = WrongQuestionRecord(
            questionId = cleanId,
            question = question,
            lastWrongTimestamp = System.currentTimeMillis(),
            wrongCount = newCount,
            userLastSelectedOption = userOptionIndex,
            correctOptionIndex = question.correctAnswerIndex
        )
    }

    fun removeFromWrongList(questionId: String) {
        val cleanId = questionId.substringBefore("_V")
        wrongQuestionsMap.remove(cleanId)
    }

    fun getWrongQuestionsList(): List<WrongQuestionRecord> {
        return wrongQuestionsMap.values.sortedByDescending { it.lastWrongTimestamp }
    }

    fun getWrongQuestionsForPractice(
        mode: WrongPracticeFilterMode = WrongPracticeFilterMode.ALL,
        categoryFilter: String? = null,
        requestedCount: Int = 20
    ): List<GkQuestion> {
        var pool = wrongQuestionsMap.values.toList()

        if (!categoryFilter.isNullOrBlank() && categoryFilter != "All") {
            pool = pool.filter {
                it.question.category.equals(categoryFilter, ignoreCase = true) ||
                        it.question.categoryId.equals(categoryFilter, ignoreCase = true)
            }
        }

        val sortedList = when (mode) {
            WrongPracticeFilterMode.ALL -> pool.map { it.question }
            WrongPracticeFilterMode.PRACTICE_10 -> pool.take(10).map { it.question }
            WrongPracticeFilterMode.PRACTICE_25 -> pool.take(25).map { it.question }
            WrongPracticeFilterMode.RECENTLY_INCORRECT -> pool.sortedByDescending { it.lastWrongTimestamp }.map { it.question }
            WrongPracticeFilterMode.MOST_INCORRECT -> pool.sortedByDescending { it.wrongCount }.map { it.question }
            WrongPracticeFilterMode.WEAK_CATEGORY -> {
                val weakCats = getWeakCategoryIds()
                val weakPool = pool.filter { it.question.categoryId in weakCats }
                if (weakPool.isNotEmpty()) weakPool.map { it.question } else pool.map { it.question }
            }
            WrongPracticeFilterMode.RANDOM -> pool.shuffled().map { it.question }
        }

        if (sortedList.isEmpty()) {
            // Safe fallback: never crash
            return QuizQuestionDatabase.getSampleQuestions(requestedCount.coerceAtMost(10))
        }

        return sortedList.take(requestedCount)
    }

    // =========================================================================
    // 3. PRACTICE & DAILY GOAL REPOSITORY
    // =========================================================================

    fun setDailyGoal(newTarget: Int) {
        dailyQuestionTarget = newTarget.coerceIn(10, 200)
        sharedPrefs?.edit()?.putInt("daily_target", dailyQuestionTarget)?.apply()
    }

    fun recordQuestionAttempt(isCorrect: Boolean, categoryId: String) {
        todayCompletedQuestionsCount++
        if (isCorrect) {
            todayCorrectQuestionsCount++
        } else {
            todayIncorrectQuestionsCount++
        }

        // Update category stats
        val cleanCatId = categoryId.lowercase()
        val currentStats = categoryStatsMap[cleanCatId] ?: (0 to 0)
        val newCorrect = if (isCorrect) currentStats.first + 1 else currentStats.first
        val newTotal = currentStats.second + 1
        categoryStatsMap[cleanCatId] = newCorrect to newTotal

        // Check active day streak
        markActiveToday()
        saveDailyStats()
    }

    fun recordPracticeSessionSummary(completed: Int, correct: Int, incorrect: Int) {
        todayCompletedQuestionsCount += completed
        todayCorrectQuestionsCount += correct
        todayIncorrectQuestionsCount += incorrect
        markActiveToday()
        saveDailyStats()
    }

    val todayAccuracyPercentage: Int
        get() = if (todayCompletedQuestionsCount > 0) {
            ((todayCorrectQuestionsCount.toFloat() / todayCompletedQuestionsCount.toFloat()) * 100).toInt()
        } else 0

    val remainingDailyQuestions: Int
        get() = (dailyQuestionTarget - todayCompletedQuestionsCount).coerceAtLeast(0)

    val dailyProgressFraction: Float
        get() = if (dailyQuestionTarget > 0) {
            (todayCompletedQuestionsCount.toFloat() / dailyQuestionTarget.toFloat()).coerceIn(0f, 1f)
        } else 0f

    private fun markActiveToday() {
        val today = getTodayDateString()
        if (lastActiveDateStr != today) {
            updateStreakOnNewDay(today)
            lastActiveDateStr = today
            sharedPrefs?.edit()?.putString("last_active_date", today)?.apply()
        }
    }

    private fun updateStreakOnNewDay(today: String) {
        val cal = Calendar.getInstance()
        cal.add(Calendar.DAY_OF_YEAR, -1)
        val yesterday = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(cal.time)

        if (lastActiveDateStr == yesterday) {
            currentStreakDays++
            if (currentStreakDays > longestStreakDays) {
                longestStreakDays = currentStreakDays
            }
        } else if (lastActiveDateStr != today && lastActiveDateStr.isNotEmpty()) {
            currentStreakDays = 1
        }

        sharedPrefs?.edit()
            ?.putInt("current_streak", currentStreakDays)
            ?.putInt("longest_streak", longestStreakDays)
            ?.apply()
    }

    private fun saveDailyStats() {
        val prefs = sharedPrefs ?: return
        prefs.edit()
            .putInt("today_completed", todayCompletedQuestionsCount)
            .putInt("today_correct", todayCorrectQuestionsCount)
            .putInt("today_incorrect", todayIncorrectQuestionsCount)
            .apply()
    }

    private fun getTodayDateString(): String {
        return SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
    }

    // =========================================================================
    // 4. TEST HISTORY REPOSITORY
    // =========================================================================

    fun recordQuizResult(result: QuizSessionResult) {
        val record = TestAttemptRecord(
            id = "test_${System.currentTimeMillis()}",
            testTitle = result.config.testTitle,
            questionCount = result.totalQuestions,
            score = result.score,
            maxScore = result.maxScore,
            accuracyPercentage = result.accuracyPercentage,
            timeTakenSeconds = result.timeTakenSeconds,
            categoryScoreMap = result.categoryScoreBreakdown
        )
        testHistoryList.add(0, record)

        // Also record all wrong questions to wrong questions repository
        result.questionStates.forEach { state ->
            if (state.isAnswered && !state.isCorrect) {
                recordWrongAnswer(state.question, state.selectedOptionIndex ?: 0)
            }
        }

        // Update category stats from result breakdown
        result.categoryScoreBreakdown.forEach { (catName, pair) ->
            val catObj = GyanixData.categories.find { it.title.equals(catName, ignoreCase = true) }
            val catId = catObj?.id ?: catName.lowercase().replace(" ", "_")
            val current = categoryStatsMap[catId] ?: (0 to 0)
            categoryStatsMap[catId] = (current.first + pair.first) to (current.second + pair.second)
        }

        recordPracticeSessionSummary(
            completed = result.answeredCount,
            correct = result.correctCount,
            incorrect = result.incorrectCount
        )
    }

    fun getBestScoreForTest(testTitle: String): Float? {
        val matches = testHistoryList.filter { it.testTitle.contains(testTitle, ignoreCase = true) || testTitle.contains(it.testTitle, ignoreCase = true) }
        return matches.maxOfOrNull { it.score }
    }

    fun getBestAccuracyForTest(testTitle: String): Int? {
        val matches = testHistoryList.filter { it.testTitle.contains(testTitle, ignoreCase = true) || testTitle.contains(it.testTitle, ignoreCase = true) }
        return matches.maxOfOrNull { it.accuracyPercentage }
    }

    fun isTestAttempted(testTitle: String): Boolean {
        return testHistoryList.any { it.testTitle.contains(testTitle, ignoreCase = true) || testTitle.contains(it.testTitle, ignoreCase = true) }
    }

    // =========================================================================
    // 5. PERFORMANCE & WEAK-AREA DETECTION REPOSITORY (Pure Rule-Based)
    // =========================================================================

    /**
     * Category Weakness Rule:
     * Weak: Accuracy < 60% with at least 5 attempted questions
     * Strong: Accuracy >= 80% with at least 5 attempted questions
     */
    fun getCategoryAccuracy(categoryId: String): Int {
        val stats = categoryStatsMap[categoryId.lowercase()] ?: return 75 // Default reasonable baseline
        return if (stats.second > 0) {
            ((stats.first.toFloat() / stats.second.toFloat()) * 100).toInt()
        } else 75
    }

    fun getWeakCategoryIds(): List<String> {
        return categoryStatsMap.filter { (_, stats) ->
            stats.second >= 5 && ((stats.first.toFloat() / stats.second.toFloat()) * 100) < 60
        }.keys.toList()
    }

    fun getStrongCategoryIds(): List<String> {
        return categoryStatsMap.filter { (_, stats) ->
            stats.second >= 5 && ((stats.first.toFloat() / stats.second.toFloat()) * 100) >= 80
        }.keys.toList()
    }

    fun getWeakCategories(): List<GkCategory> {
        val weakIds = getWeakCategoryIds()
        return GyanixData.categories.filter { it.id in weakIds }
    }

    fun getStrongCategories(): List<GkCategory> {
        val strongIds = getStrongCategoryIds()
        return GyanixData.categories.filter { it.id in strongIds }
    }

    /**
     * Generates rule-based recommendations strictly from actual local attempt data.
     */
    fun getPerformanceRecommendations(): List<PracticeRecommendation> {
        val recommendations = mutableListOf<PracticeRecommendation>()

        // 1. Weak Areas recommendation
        val weakCategories = getWeakCategories()
        if (weakCategories.isNotEmpty()) {
            val primeWeak = weakCategories.first()
            val acc = getCategoryAccuracy(primeWeak.id)
            recommendations.add(
                PracticeRecommendation(
                    id = "rec_weak_${primeWeak.id}",
                    title = "Targeted Weak Area Practice",
                    subtitle = "Practice ${primeWeak.title} — your current accuracy is $acc%.",
                    category = primeWeak.title,
                    categoryId = primeWeak.id,
                    badgeText = "Needs Focus ($acc%)",
                    badgeColor = ErrorRed,
                    questionCount = 20,
                    difficulty = "Moderate"
                )
            )
        } else if (wrongQuestionsMap.isNotEmpty()) {
            val wrongCount = wrongQuestionsMap.size
            recommendations.add(
                PracticeRecommendation(
                    id = "rec_wrong_practice",
                    title = "Review Incorrect Questions",
                    subtitle = "Review your $wrongCount incorrect questions to avoid negative marking penalties.",
                    category = "Wrong Questions",
                    categoryId = null,
                    badgeText = "$wrongCount Mistakes",
                    badgeColor = WarningAmber,
                    questionCount = wrongCount.coerceAtMost(25),
                    difficulty = "Mixed"
                )
            )
        }

        // 2. Strong Areas recommendation
        val strongCategories = getStrongCategories()
        if (strongCategories.isNotEmpty()) {
            val primeStrong = strongCategories.first()
            val acc = getCategoryAccuracy(primeStrong.id)
            recommendations.add(
                PracticeRecommendation(
                    id = "rec_strong_${primeStrong.id}",
                    title = "High-Yield Mastery Drill",
                    subtitle = "Try a Hard ${primeStrong.title} test — your accuracy is strong at $acc%.",
                    category = primeStrong.title,
                    categoryId = primeStrong.id,
                    badgeText = "Strong Area ($acc%)",
                    badgeColor = SuccessGreen,
                    questionCount = 25,
                    difficulty = "Hard"
                )
            )
        }

        // 3. Fallback / Standard GK Speed Drill
        if (recommendations.size < 3) {
            recommendations.add(
                PracticeRecommendation(
                    id = "rec_speed_drill",
                    title = "Daily Rapid GK Challenge",
                    subtitle = "15 quick questions across all subjects to keep your memory sharp.",
                    category = "All Subjects",
                    categoryId = null,
                    badgeText = "Speed Mode",
                    badgeColor = ElectricCyan400,
                    questionCount = 15,
                    difficulty = "Mixed"
                )
            )
        }

        return recommendations
    }
}
