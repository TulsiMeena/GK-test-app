package com.example

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.example.ui.auth.AuthState
import com.example.ui.auth.GyanixUser
import com.example.ui.model.GyanixData
import com.example.ui.model.QuizConfig
import com.example.ui.quiz.QuizEngineState
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(qualifiers = RobolectricDeviceQualifiers.Pixel8, sdk = [36])
class GreetingScreenshotTest {

  @get:Rule val composeTestRule = createComposeRule()

  @Test
  fun greeting_screenshot() {
    val dummyUser = GyanixUser(
        uid = "test_uid",
        displayName = "Student",
        email = "student@gyanix.in"
    )
    val dummyState = AuthState.Authenticated(dummyUser)

    composeTestRule.setContent {
      GyanixAppContainer(
        authRepository = object : com.example.ui.auth.AuthRepository {
            override val authState = kotlinx.coroutines.flow.MutableStateFlow(dummyState)
            override val isOnboardingCompleted = true
            override fun setOnboardingCompleted(completed: Boolean) {}
            override suspend fun signUp(fullName: String, email: String, password: String) = com.example.ui.auth.AuthResult.Success(dummyUser)
            override suspend fun signIn(email: String, password: String) = com.example.ui.auth.AuthResult.Success(dummyUser)
            override suspend fun continueAsGuest() = com.example.ui.auth.AuthResult.Success(dummyUser)
            override suspend fun sendPasswordReset(email: String) = com.example.ui.auth.AuthResult.Success("Success")
            override suspend fun signOut() {}
            override fun getCurrentUser(): GyanixUser? = dummyUser
            override fun resetOnboardingForTesting() {}
        },
        authState = dummyState,
        isDarkTheme = true,
        onToggleTheme = {},
        currentScreen = GyanixScreen.HOME,
        selectedCategory = GyanixData.categories[0],
        selectedTopic = null,
        activeQuizConfig = QuizConfig(),
        lastSessionResult = null,
        quizEngineState = QuizEngineState(),
        bookmarkedQuestionIds = emptySet(),
        activePracticeQuestions = emptyList(),
        activePracticeTitle = "",
        onStartPracticeSession = { _, _ -> },
        onToggleBookmark = {},
        onBookmarkAll = {},
        onNavigateTo = {},
        onNavigateBack = {},
        onSetScreen = { _, _ -> },
        onSelectCategory = {},
        onSelectTopic = { _, _ -> },
        onStartTopicMockTest = { _, _, _ -> },
        onStartCategoryPractice = {},
        onConfigureAndStartTest = {},
        onLaunchActiveQuiz = {},
        onFinishQuiz = {}
      )
    }

    composeTestRule.onRoot().captureRoboImage(filePath = "src/test/screenshots/greeting.png")
  }
}
