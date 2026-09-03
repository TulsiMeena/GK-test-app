package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Assessment
import androidx.compose.material.icons.outlined.Assignment
import androidx.compose.material.icons.outlined.Category
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Psychology
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.coroutines.launch
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.services.GyanixNotificationService
import com.example.ui.auth.AuthRepository
import com.example.ui.auth.AuthState
import com.example.ui.auth.FirebaseAuthRepository
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.model.GkCategory
import com.example.ui.model.GkQuestion
import com.example.ui.model.GkTopicItem
import com.example.ui.model.GyanixData
import com.example.ui.model.QuizConfig
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.model.QuizSessionResult
import com.example.ui.quiz.rememberQuizEngineState
import com.example.ui.screens.BookmarksScreen
import com.example.ui.screens.CategoryDetailScreen
import com.example.ui.screens.DesignSystemGalleryScreen
import com.example.ui.screens.DetailedPerformanceAnalysisScreen
import com.example.ui.screens.GkCategoriesScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.IncorrectQuestionsReviewScreen
import com.example.ui.screens.LiveQuizScreen
import com.example.ui.screens.MockTestCenterScreen
import com.example.ui.screens.NotificationBoxScreen
import com.example.ui.screens.PracticeCenterScreen
import com.example.ui.screens.PracticeSelectionScreen
import com.example.ui.screens.PracticeSessionScreen
import com.example.ui.screens.ProfileProgressScreen
import com.example.ui.screens.QuestionAnswerReviewScreen
import com.example.ui.screens.ResultOverviewScreen
import com.example.ui.screens.ReviewFilter
import com.example.ui.screens.SearchExploreScreen
import com.example.ui.screens.TestConfigurationScreen
import com.example.ui.screens.TestInstructionsScreen
import com.example.ui.screens.TestSummaryRetryScreen
import com.example.ui.screens.TestsScreen
import com.example.ui.screens.TopicDetailScreen
import com.example.ui.screens.WrongQuestionsScreen
import com.example.ui.screens.auth.AuthWelcomeScreen
import com.example.ui.screens.auth.ForgotPasswordScreen
import com.example.ui.screens.auth.LoginScreen
import com.example.ui.screens.auth.OnboardingScreen
import com.example.ui.screens.auth.SignupScreen
import com.example.ui.screens.auth.SplashScreen
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.GyanixTheme
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600

enum class GyanixScreen {
    SPLASH,
    ONBOARDING,
    AUTH_WELCOME,
    LOGIN,
    SIGNUP,
    FORGOT_PASSWORD,
    HOME,
    NOTIFICATIONS,
    CATEGORIES,
    CATEGORY_DETAIL,
    TOPIC_DETAIL,
    PRACTICE,
    TESTS,
    SEARCH,
    PROGRESS,
    PROFILE,
    TEST_CONFIG,
    TEST_INSTRUCTIONS,
    QUIZ_ACTIVE,
    RESULT_OVERVIEW,
    PERFORMANCE_ANALYSIS,
    ANSWER_REVIEW,
    WRONG_QUESTIONS_REVIEW,
    TEST_SUMMARY_RETRY,
    WRONG_QUESTIONS_PRACTICE,
    BOOKMARKS,
    PRACTICE_SESSION,
    DESIGN_SYSTEM_EXPLORER
}

data class NavigationTabItem(
    val screen: GyanixScreen,
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val testTag: String
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        try {
            QuizQuestionDatabase.initialize(this)
            GyanixNotificationService.initializeChannel(this)
        } catch (e: Throwable) {
            // Non-fatal, app continues
        }

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            try {
                if (checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS) != android.content.pm.PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(arrayOf(android.Manifest.permission.POST_NOTIFICATIONS), 101)
                }
            } catch (e: Throwable) {
                // Non-fatal
            }
        }

        setContent {
            val context = LocalContext.current
            val authRepository = remember { FirebaseAuthRepository.getInstance(context) }
            val authState by authRepository.authState.collectAsState()

            LaunchedEffect(authState) {
                when (val state = authState) {
                    is AuthState.Authenticated -> {
                        GyanixLocalDataManager.switchUser(state.user.id, context)
                        GyanixNotificationService.switchUser(state.user.id, context)
                        // Trigger welcome notification if user has no notifications yet
                        GyanixNotificationService.triggerWelcomeNotification(
                            context = context,
                            userName = state.user.name,
                            userEmail = state.user.email
                        )
                    }
                    is AuthState.Unauthenticated -> {
                        GyanixLocalDataManager.clearUserData()
                        GyanixNotificationService.clearUserData()
                    }
                    else -> {}
                }
            }

            var isDarkTheme by remember { mutableStateOf(true) }
            var currentScreen by remember { mutableStateOf(GyanixScreen.SPLASH) }
            var selectedCategory by remember { mutableStateOf<GkCategory>(GyanixData.categories[0]) }
            var selectedTopic by remember { mutableStateOf<GkTopicItem?>(null) }
            var navigationStack by remember { mutableStateOf(listOf(GyanixScreen.SPLASH)) }
            val bookmarkedQuestionIds = GyanixLocalDataManager.bookmarkedQuestionIds.keys

            // Practice Session specific state
            var activePracticeQuestions by remember { mutableStateOf<List<GkQuestion>>(emptyList()) }
            var activePracticeTitle by remember { mutableStateOf("GK Practice Session") }

            var activeQuizConfig by remember {
                mutableStateOf(
                    QuizConfig(
                        testTitle = "Indian Polity & Constitution Drill",
                        selectedCategoryIds = setOf("cat_polity"),
                        difficulty = "Medium",
                        questionCount = 15,
                        timeLimitMinutes = 12,
                        negativeMarking = -0.25f
                    )
                )
            }

            var lastSessionResult by remember { mutableStateOf<QuizSessionResult?>(null) }
            val quizEngineState = rememberQuizEngineState()

            fun navigateTo(screen: GyanixScreen) {
                if (screen != currentScreen) {
                    navigationStack = navigationStack + screen
                    currentScreen = screen
                }
            }

            fun navigateBack() {
                if (navigationStack.size > 1) {
                    val newStack = navigationStack.dropLast(1)
                    navigationStack = newStack
                    currentScreen = newStack.last()
                } else {
                    currentScreen = when {
                        !authRepository.isOnboardingCompleted -> GyanixScreen.ONBOARDING
                        authState !is AuthState.Authenticated -> GyanixScreen.AUTH_WELCOME
                        else -> GyanixScreen.HOME
                    }
                }
            }

            fun startPracticeSession(questions: List<GkQuestion>, title: String) {
                activePracticeQuestions = questions
                activePracticeTitle = title
                navigateTo(GyanixScreen.PRACTICE_SESSION)
            }

            val isRootOrFullScreen = currentScreen in listOf(
                GyanixScreen.SPLASH,
                GyanixScreen.ONBOARDING,
                GyanixScreen.AUTH_WELCOME,
                GyanixScreen.HOME,
                GyanixScreen.QUIZ_ACTIVE,
                GyanixScreen.PRACTICE_SESSION
            )

            var lastBackPressTime by remember { androidx.compose.runtime.mutableLongStateOf(0L) }
            val coroutineScope = rememberCoroutineScope()

            // Android Hardware / Gesture Back Handling with Exit Protection
            BackHandler(enabled = true) {
                if (!isRootOrFullScreen) {
                    navigateBack()
                } else if (currentScreen == GyanixScreen.HOME) {
                    val currentTime = System.currentTimeMillis()
                    if (currentTime - lastBackPressTime < 2000) {
                        (context as? android.app.Activity)?.finish()
                    } else {
                        lastBackPressTime = currentTime
                        android.widget.Toast.makeText(
                            context,
                            "Press back again to exit (ऐप बंद करने के लिए दोबारा दबाएं)",
                            android.widget.Toast.LENGTH_SHORT
                        ).show()
                    }
                } else if (navigationStack.size > 1) {
                    navigateBack()
                }
            }

            GyanixTheme(darkTheme = isDarkTheme) {
                GyanixAppContainer(
                    authRepository = authRepository,
                    authState = authState,
                    isDarkTheme = isDarkTheme,
                    onToggleTheme = { isDarkTheme = !isDarkTheme },
                    currentScreen = currentScreen,
                    selectedCategory = selectedCategory,
                    selectedTopic = selectedTopic,
                    activeQuizConfig = activeQuizConfig,
                    lastSessionResult = lastSessionResult,
                    quizEngineState = quizEngineState,
                    bookmarkedQuestionIds = bookmarkedQuestionIds,
                    activePracticeQuestions = activePracticeQuestions,
                    activePracticeTitle = activePracticeTitle,
                    onStartPracticeSession = { qs, title -> startPracticeSession(qs, title) },
                    onToggleBookmark = { qId ->
                        GyanixLocalDataManager.toggleBookmark(qId)
                    },
                    onBookmarkAll = { qIds ->
                        GyanixLocalDataManager.bookmarkAll(qIds)
                    },
                    onNavigateTo = { navigateTo(it) },
                    onNavigateBack = { navigateBack() },
                    onSetScreen = { screen, newStack ->
                        navigationStack = newStack
                        currentScreen = screen
                    },
                    onSelectCategory = { cat ->
                        selectedCategory = cat
                        navigateTo(GyanixScreen.CATEGORY_DETAIL)
                    },
                    onSelectTopic = { cat, topic ->
                        selectedCategory = cat
                        selectedTopic = topic
                        navigateTo(GyanixScreen.TOPIC_DETAIL)
                    },
                    onStartTopicMockTest = { cat, topic, mockNumber ->
                        selectedCategory = cat
                        selectedTopic = topic
                        if (mockNumber != null) {
                            activeQuizConfig = QuizConfig(
                                testTitle = "${topic.titleHindi} — Mock Test $mockNumber",
                                questionSource = com.example.ui.model.QuestionSource.TOPIC,
                                selectedCategoryIds = setOf(cat.id),
                                targetTopicId = topic.id,
                                targetTopicTitle = topic.title,
                                targetTopicHindi = "${topic.titleHindi} (Mock $mockNumber)",
                                difficulty = if (mockNumber == 1) "Moderate" else "Hard",
                                questionCount = 15,
                                timeLimitMinutes = 15,
                                negativeMarking = -0.25f
                            )
                            navigateTo(GyanixScreen.TEST_INSTRUCTIONS)
                        } else {
                            activeQuizConfig = QuizConfig(
                                testTitle = "${cat.titleHindi} — ${topic.titleHindi}",
                                questionSource = com.example.ui.model.QuestionSource.TOPIC,
                                selectedCategoryIds = setOf(cat.id),
                                targetTopicId = topic.id,
                                targetTopicTitle = topic.title,
                                targetTopicHindi = topic.titleHindi,
                                difficulty = "Mixed",
                                questionCount = 15,
                                timeLimitMinutes = 15,
                                negativeMarking = -0.25f
                            )
                            navigateTo(GyanixScreen.TEST_CONFIG)
                        }
                    },
                    onStartCategoryPractice = { cat ->
                        selectedCategory = cat
                        activeQuizConfig = QuizConfig(
                            testTitle = "${cat.title} Subject Test",
                            selectedCategoryIds = setOf(cat.id),
                            difficulty = "Medium",
                            questionCount = 15,
                            timeLimitMinutes = 15,
                            negativeMarking = -0.25f
                        )
                        navigateTo(GyanixScreen.TEST_CONFIG)
                    },
                    onConfigureAndStartTest = { config ->
                        activeQuizConfig = config
                        navigateTo(GyanixScreen.TEST_INSTRUCTIONS)
                    },
                    onLaunchActiveQuiz = {
                        quizEngineState.startQuiz(activeQuizConfig)
                        navigateTo(GyanixScreen.QUIZ_ACTIVE)
                    },
                    onFinishQuiz = { result ->
                        lastSessionResult = result
                        try {
                            com.example.ui.data.GyanixLocalDataManager.recordQuizResult(result)
                        } catch (e: Throwable) {
                            android.util.Log.e("MainActivity", "Error recording quiz result: ${e.message}", e)
                        }
                        navigateTo(GyanixScreen.RESULT_OVERVIEW)
                    }
                )
            }
        }
    }
}

@Composable
fun GyanixAppContainer(
    authRepository: AuthRepository,
    authState: AuthState,
    isDarkTheme: Boolean,
    onToggleTheme: () -> Unit,
    currentScreen: GyanixScreen,
    selectedCategory: GkCategory,
    selectedTopic: GkTopicItem?,
    activeQuizConfig: QuizConfig,
    lastSessionResult: QuizSessionResult?,
    quizEngineState: com.example.ui.quiz.QuizEngineState,
    bookmarkedQuestionIds: Set<String>,
    activePracticeQuestions: List<GkQuestion>,
    activePracticeTitle: String,
    onStartPracticeSession: (List<GkQuestion>, String) -> Unit,
    onToggleBookmark: (String) -> Unit,
    onBookmarkAll: (List<String>) -> Unit,
    onNavigateTo: (GyanixScreen) -> Unit,
    onNavigateBack: () -> Unit,
    onSetScreen: (GyanixScreen, List<GyanixScreen>) -> Unit,
    onSelectCategory: (GkCategory) -> Unit,
    onSelectTopic: (GkCategory, GkTopicItem) -> Unit,
    onStartTopicMockTest: (GkCategory, GkTopicItem, Int?) -> Unit,
    onStartCategoryPractice: (GkCategory) -> Unit,
    onConfigureAndStartTest: (QuizConfig) -> Unit,
    onLaunchActiveQuiz: () -> Unit,
    onFinishQuiz: (QuizSessionResult) -> Unit
) {
    // 5 Primary Navigation Tabs as specified
    val coroutineScope = rememberCoroutineScope()
    val navItems = remember {
        listOf(
            NavigationTabItem(
                screen = GyanixScreen.HOME,
                label = "Home",
                selectedIcon = Icons.Filled.Home,
                unselectedIcon = Icons.Outlined.Home,
                testTag = "nav_home"
            ),
            NavigationTabItem(
                screen = GyanixScreen.PRACTICE,
                label = "Practice",
                selectedIcon = Icons.Filled.Psychology,
                unselectedIcon = Icons.Outlined.Psychology,
                testTag = "nav_practice"
            ),
            NavigationTabItem(
                screen = GyanixScreen.TESTS,
                label = "Tests",
                selectedIcon = Icons.Filled.Assignment,
                unselectedIcon = Icons.Outlined.Assignment,
                testTag = "nav_tests"
            ),
            NavigationTabItem(
                screen = GyanixScreen.PROGRESS,
                label = "Progress",
                selectedIcon = Icons.Filled.Assessment,
                unselectedIcon = Icons.Outlined.Assessment,
                testTag = "nav_progress"
            ),
            NavigationTabItem(
                screen = GyanixScreen.PROFILE,
                label = "Profile",
                selectedIcon = Icons.Filled.Person,
                unselectedIcon = Icons.Outlined.Person,
                testTag = "nav_profile"
            )
        )
    }

    val isBottomBarVisible = currentScreen !in listOf(
        GyanixScreen.SPLASH,
        GyanixScreen.ONBOARDING,
        GyanixScreen.AUTH_WELCOME,
        GyanixScreen.LOGIN,
        GyanixScreen.SIGNUP,
        GyanixScreen.FORGOT_PASSWORD,
        GyanixScreen.TEST_CONFIG,
        GyanixScreen.TEST_INSTRUCTIONS,
        GyanixScreen.QUIZ_ACTIVE,
        GyanixScreen.RESULT_OVERVIEW,
        GyanixScreen.PERFORMANCE_ANALYSIS,
        GyanixScreen.ANSWER_REVIEW,
        GyanixScreen.WRONG_QUESTIONS_REVIEW,
        GyanixScreen.TEST_SUMMARY_RETRY,
        GyanixScreen.WRONG_QUESTIONS_PRACTICE,
        GyanixScreen.BOOKMARKS,
        GyanixScreen.PRACTICE_SESSION,
        GyanixScreen.DESIGN_SYSTEM_EXPLORER
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .testTag("gyanix_scaffold"),
        containerColor = MaterialTheme.colorScheme.background,
        bottomBar = {
            if (isBottomBarVisible) {
                GyanixBottomNavBar(
                    currentScreen = currentScreen,
                    onTabSelected = { screen -> onNavigateTo(screen) },
                    navItems = navItems
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            AnimatedContent(
                targetState = currentScreen,
                transitionSpec = {
                    fadeIn(initialAlpha = 0.85f) togetherWith fadeOut(targetAlpha = 0.85f)
                },
                label = "ScreenTransition"
            ) { targetScreen ->
                when (targetScreen) {
                    GyanixScreen.SPLASH -> SplashScreen(
                        onSplashFinished = {
                            if (!authRepository.isOnboardingCompleted) {
                                onSetScreen(GyanixScreen.ONBOARDING, listOf(GyanixScreen.ONBOARDING))
                            } else {
                                when (authState) {
                                    is AuthState.Authenticated -> {
                                        onSetScreen(GyanixScreen.HOME, listOf(GyanixScreen.HOME))
                                    }
                                    else -> {
                                        onSetScreen(GyanixScreen.AUTH_WELCOME, listOf(GyanixScreen.AUTH_WELCOME))
                                    }
                                }
                            }
                        }
                    )

                    GyanixScreen.ONBOARDING -> OnboardingScreen(
                        onFinishOnboarding = {
                            authRepository.setOnboardingCompleted(true)
                            onSetScreen(GyanixScreen.AUTH_WELCOME, listOf(GyanixScreen.AUTH_WELCOME))
                        }
                    )

                    GyanixScreen.AUTH_WELCOME -> AuthWelcomeScreen(
                        onNavigateToLogin = {
                            onNavigateTo(GyanixScreen.LOGIN)
                        },
                        onNavigateToSignup = {
                            onNavigateTo(GyanixScreen.SIGNUP)
                        },
                        onContinueAsGuest = {
                            coroutineScope.launch {
                                authRepository.continueAsGuest()
                                onSetScreen(GyanixScreen.HOME, listOf(GyanixScreen.HOME))
                            }
                        }
                    )

                    GyanixScreen.SIGNUP -> SignupScreen(
                        authRepository = authRepository,
                        onSignupSuccess = {
                            onSetScreen(GyanixScreen.HOME, listOf(GyanixScreen.HOME))
                        },
                        onNavigateToLogin = {
                            onSetScreen(GyanixScreen.LOGIN, listOf(GyanixScreen.AUTH_WELCOME, GyanixScreen.LOGIN))
                        },
                        onNavigateBack = onNavigateBack
                    )

                    GyanixScreen.LOGIN -> LoginScreen(
                        authRepository = authRepository,
                        onLoginSuccess = {
                            onSetScreen(GyanixScreen.HOME, listOf(GyanixScreen.HOME))
                        },
                        onNavigateToSignup = {
                            onSetScreen(GyanixScreen.SIGNUP, listOf(GyanixScreen.AUTH_WELCOME, GyanixScreen.SIGNUP))
                        },
                        onNavigateToForgotPassword = {
                            onNavigateTo(GyanixScreen.FORGOT_PASSWORD)
                        },
                        onNavigateBack = onNavigateBack
                    )

                    GyanixScreen.FORGOT_PASSWORD -> ForgotPasswordScreen(
                        authRepository = authRepository,
                        onNavigateBack = onNavigateBack
                    )

                    GyanixScreen.HOME -> {
                        val currentUserName = (authState as? AuthState.Authenticated)?.user?.name?.ifBlank { "Aspirant" } ?: "Aspirant"
                        HomeScreen(
                            userName = currentUserName,
                            isDarkTheme = isDarkTheme,
                            onToggleTheme = onToggleTheme,
                            onNavigateToQuiz = {
                                onConfigureAndStartTest(
                                    QuizConfig(
                                        testTitle = "Daily GK Championship Quiz",
                                        selectedCategoryIds = setOf("cat_polity", "cat_history", "cat_geography"),
                                        difficulty = "Mixed",
                                        questionCount = 15,
                                        timeLimitMinutes = 15,
                                        negativeMarking = -0.25f
                                    )
                                )
                            },
                            onNavigateToCategory = onSelectCategory,
                            onNavigateToCategoriesList = { onNavigateTo(GyanixScreen.CATEGORIES) },
                            onNavigateToPracticeSelection = { onNavigateTo(GyanixScreen.PRACTICE) },
                            onNavigateToTests = { onNavigateTo(GyanixScreen.TESTS) },
                            onNavigateToSearch = { onNavigateTo(GyanixScreen.SEARCH) },
                            onNavigateToProfile = { onNavigateTo(GyanixScreen.PROFILE) },
                            onNavigateToNotifications = { onNavigateTo(GyanixScreen.NOTIFICATIONS) },
                            onNavigateToWrongQuestions = { onNavigateTo(GyanixScreen.WRONG_QUESTIONS_PRACTICE) },
                            onNavigateToBookmarks = { onNavigateTo(GyanixScreen.BOOKMARKS) },
                            onOpenDesignSystem = { onNavigateTo(GyanixScreen.DESIGN_SYSTEM_EXPLORER) }
                        )
                    }

                    GyanixScreen.NOTIFICATIONS -> NotificationBoxScreen(
                        onNavigateBack = onNavigateBack,
                        onStartMockTest = { onNavigateTo(GyanixScreen.PRACTICE) }
                    )

                    GyanixScreen.CATEGORIES -> GkCategoriesScreen(
                        onCategoryClick = onSelectCategory,
                        onStartPractice = onStartCategoryPractice,
                        onBack = onNavigateBack
                    )

                    GyanixScreen.CATEGORY_DETAIL -> CategoryDetailScreen(
                        category = selectedCategory,
                        onBack = onNavigateBack,
                        onSelectTopic = { topic ->
                            onSelectTopic(selectedCategory, topic)
                        }
                    )

                    GyanixScreen.TOPIC_DETAIL -> {
                        val currentTopic = selectedTopic ?: selectedCategory.subtopics.firstOrNull()
                        if (currentTopic != null) {
                            TopicDetailScreen(
                                category = selectedCategory,
                                topic = currentTopic,
                                onBack = onNavigateBack,
                                onStartMockTest = { mockNumber ->
                                    onStartTopicMockTest(selectedCategory, currentTopic, mockNumber)
                                },
                                onStartPractice = {
                                    val topicQs = QuizQuestionDatabase.getQuestionsForTopic(
                                        selectedCategory.id,
                                        currentTopic.id,
                                        currentTopic.title
                                    )
                                    onStartPracticeSession(topicQs, "${currentTopic.titleHindi} Practice")
                                }
                            )
                        } else {
                            onNavigateBack()
                        }
                    }

                    // PROMPT 5 SCREEN 1: Practice Center
                    GyanixScreen.PRACTICE -> PracticeCenterScreen(
                        onStartPracticeSession = { questions, title ->
                            onStartPracticeSession(questions, title)
                        },
                        onNavigateToTopicPractice = {
                            onNavigateTo(GyanixScreen.CATEGORIES)
                        },
                        onNavigateToWrongQuestions = {
                            onNavigateTo(GyanixScreen.WRONG_QUESTIONS_PRACTICE)
                        },
                        onNavigateToBookmarks = {
                            onNavigateTo(GyanixScreen.BOOKMARKS)
                        },
                        onNavigateToCategory = onSelectCategory
                    )

                    // PROMPT 5 SCREEN 2: Mock Test Center
                    GyanixScreen.TESTS -> MockTestCenterScreen(
                        onStartMockTest = { config ->
                            onConfigureAndStartTest(config)
                        }
                    )

                    // PROMPT 5 SCREEN 3: Wrong Questions Practice
                    GyanixScreen.WRONG_QUESTIONS_PRACTICE -> WrongQuestionsScreen(
                        onNavigateBack = onNavigateBack,
                        onStartPracticeSession = { questions, title ->
                            onStartPracticeSession(questions, title)
                        }
                    )

                    // PROMPT 5 SCREEN 4: Bookmarks Screen
                    GyanixScreen.BOOKMARKS -> BookmarksScreen(
                        onNavigateBack = onNavigateBack,
                        onStartPracticeSession = { questions, title ->
                            onStartPracticeSession(questions, title)
                        }
                    )

                    // PROMPT 5 SCREEN 5: Practice Session
                    GyanixScreen.PRACTICE_SESSION -> PracticeSessionScreen(
                        questions = activePracticeQuestions,
                        sessionTitle = activePracticeTitle,
                        onExitPractice = {
                            onNavigateTo(GyanixScreen.PRACTICE)
                        }
                    )

                    GyanixScreen.SEARCH -> SearchExploreScreen(
                        onCategorySelect = onSelectCategory,
                        onTopicSelect = { cat, topic ->
                            onSelectCategory(cat)
                        },
                        onStartGenericPractice = {
                            onNavigateTo(GyanixScreen.PRACTICE)
                        },
                        onBack = onNavigateBack
                    )

                    GyanixScreen.PROGRESS, GyanixScreen.PROFILE -> {
                        val user = (authState as? AuthState.Authenticated)?.user
                        ProfileProgressScreen(
                            isDarkTheme = isDarkTheme,
                            onToggleTheme = onToggleTheme,
                            initialTab = if (currentScreen == GyanixScreen.PROFILE) "profile" else "progress",
                            userName = user?.name ?: "Aspirant",
                            userEmail = user?.email ?: "aspirant@gyanix.app",
                            onSignOut = {
                                coroutineScope.launch {
                                    authRepository.signOut()
                                    onSetScreen(GyanixScreen.AUTH_WELCOME, listOf(GyanixScreen.AUTH_WELCOME))
                                }
                            },
                            onResetOnboarding = {
                                authRepository.resetOnboardingForTesting()
                                onSetScreen(GyanixScreen.SPLASH, listOf(GyanixScreen.SPLASH))
                            }
                        )
                    }

                    // PROMPT 3 SCREEN 1: Test Configuration
                    GyanixScreen.TEST_CONFIG -> TestConfigurationScreen(
                        initialCategory = selectedCategory,
                        targetTopicId = activeQuizConfig.targetTopicId,
                        targetTopicTitle = activeQuizConfig.targetTopicTitle,
                        targetTopicHindi = activeQuizConfig.targetTopicHindi,
                        initialDifficulty = activeQuizConfig.difficulty,
                        initialQuestionCount = activeQuizConfig.questionCount,
                        onProceedToInstructions = { config ->
                            onConfigureAndStartTest(config)
                        },
                        onBack = onNavigateBack
                    )

                    // PROMPT 3 SCREEN 2: Test Instructions
                    GyanixScreen.TEST_INSTRUCTIONS -> TestInstructionsScreen(
                        quizConfig = activeQuizConfig,
                        onStartTest = onLaunchActiveQuiz,
                        onBack = onNavigateBack
                    )

                    // PROMPT 3 SCREEN 3, 4, 5: Live Quiz Screen (Includes Question Navigator & Submit Dialog)
                    GyanixScreen.QUIZ_ACTIVE -> LiveQuizScreen(
                        quizEngineState = quizEngineState,
                        onQuizSubmitted = { result ->
                            onFinishQuiz(result)
                        },
                        onExitQuiz = {
                            onNavigateTo(GyanixScreen.HOME)
                        }
                    )

                    // PROMPT 4 SCREEN 1: Result Overview
                    GyanixScreen.RESULT_OVERVIEW -> ResultOverviewScreen(
                        sessionResult = lastSessionResult,
                        onNavigateToDetailedAnalysis = { onNavigateTo(GyanixScreen.PERFORMANCE_ANALYSIS) },
                        onNavigateToAnswerReview = { onNavigateTo(GyanixScreen.ANSWER_REVIEW) },
                        onNavigateToWrongQuestions = { onNavigateTo(GyanixScreen.WRONG_QUESTIONS_REVIEW) },
                        onNavigateToSummaryRetry = { onNavigateTo(GyanixScreen.TEST_SUMMARY_RETRY) },
                        onRetryTest = {
                            val retryConfig = lastSessionResult?.config ?: activeQuizConfig
                            onConfigureAndStartTest(retryConfig)
                        },
                        onBackToHome = { onNavigateTo(GyanixScreen.HOME) }
                    )

                    // PROMPT 4 SCREEN 2: Detailed Performance Analysis
                    GyanixScreen.PERFORMANCE_ANALYSIS -> DetailedPerformanceAnalysisScreen(
                        sessionResult = lastSessionResult,
                        onBack = onNavigateBack,
                        onNavigateToReview = { onNavigateTo(GyanixScreen.ANSWER_REVIEW) }
                    )

                    // PROMPT 4 SCREEN 3: Question-by-Question Answer Review
                    GyanixScreen.ANSWER_REVIEW -> QuestionAnswerReviewScreen(
                        sessionResult = lastSessionResult,
                        bookmarkedQuestionIds = bookmarkedQuestionIds,
                        onToggleBookmark = onToggleBookmark,
                        onBack = onNavigateBack
                    )

                    // PROMPT 4 SCREEN 4: Incorrect Questions Review
                    GyanixScreen.WRONG_QUESTIONS_REVIEW -> IncorrectQuestionsReviewScreen(
                        sessionResult = lastSessionResult,
                        bookmarkedQuestionIds = bookmarkedQuestionIds,
                        onToggleBookmark = onToggleBookmark,
                        onBookmarkAllWrong = onBookmarkAll,
                        onPracticeWrongQuestions = { wrongQuestions ->
                            val practiceConfig = QuizConfig(
                                testTitle = "Wrong Questions Revision Drill",
                                questionCount = wrongQuestions.size,
                                timeLimitMinutes = if (wrongQuestions.size <= 5) 5 else wrongQuestions.size,
                                negativeMarking = -0.25f,
                                difficulty = "Focused Practice"
                            )
                            onConfigureAndStartTest(practiceConfig)
                        },
                        onBack = onNavigateBack
                    )

                    // PROMPT 4 SCREEN 5: Test Summary & Retry
                    GyanixScreen.TEST_SUMMARY_RETRY -> TestSummaryRetryScreen(
                        sessionResult = lastSessionResult,
                        bookmarkedCount = bookmarkedQuestionIds.size,
                        onRetrySameConfig = { config ->
                            onConfigureAndStartTest(config)
                        },
                        onPracticeWrong = { wrongQuestions ->
                            val practiceConfig = QuizConfig(
                                testTitle = "Wrong Questions Revision Drill",
                                questionCount = wrongQuestions.size,
                                timeLimitMinutes = if (wrongQuestions.size <= 5) 5 else wrongQuestions.size,
                                negativeMarking = -0.25f,
                                difficulty = "Focused Practice"
                            )
                            onConfigureAndStartTest(practiceConfig)
                        },
                        onReviewSolutions = { onNavigateTo(GyanixScreen.ANSWER_REVIEW) },
                        onBackToHome = { onNavigateTo(GyanixScreen.HOME) },
                        onBack = onNavigateBack
                    )

                    GyanixScreen.DESIGN_SYSTEM_EXPLORER -> DesignSystemGalleryScreen(
                        isDarkTheme = isDarkTheme,
                        onToggleTheme = onToggleTheme,
                        onBack = { onNavigateTo(GyanixScreen.HOME) }
                    )
                }
            }
        }
    }
}

@Composable
fun GyanixBottomNavBar(
    currentScreen: GyanixScreen,
    onTabSelected: (GyanixScreen) -> Unit,
    navItems: List<NavigationTabItem>
) {
    NavigationBar(
        modifier = Modifier
            .navigationBarsPadding()
            .testTag("bottom_nav_bar"),
        containerColor = MaterialTheme.colorScheme.surface,
        tonalElevation = 8.dp
    ) {
        navItems.forEach { item ->
            val isSelected = when (item.screen) {
                GyanixScreen.HOME -> currentScreen == GyanixScreen.HOME
                GyanixScreen.PRACTICE -> currentScreen == GyanixScreen.PRACTICE || currentScreen == GyanixScreen.CATEGORIES || currentScreen == GyanixScreen.CATEGORY_DETAIL
                GyanixScreen.TESTS -> currentScreen == GyanixScreen.TESTS
                GyanixScreen.PROGRESS -> currentScreen == GyanixScreen.PROGRESS
                GyanixScreen.PROFILE -> currentScreen == GyanixScreen.PROFILE
                else -> currentScreen == item.screen
            }

            NavigationBarItem(
                selected = isSelected,
                onClick = { onTabSelected(item.screen) },
                icon = {
                    Icon(
                        imageVector = if (isSelected) item.selectedIcon else item.unselectedIcon,
                        contentDescription = item.label
                    )
                },
                label = {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            fontSize = 11.sp
                        )
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = ElectricCyan400,
                    selectedTextColor = ElectricCyan400,
                    indicatorColor = RoyalBlue600.copy(alpha = 0.25f),
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.75f),
                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.75f)
                ),
                modifier = Modifier.testTag(item.testTag)
            )
        }
    }
}
