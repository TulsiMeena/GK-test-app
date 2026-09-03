package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.GridOn
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.WarningAmber
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixConfirmationDialog
import com.example.ui.model.GkQuestion
import com.example.ui.model.QuestionStatus
import com.example.ui.model.QuizSessionResult
import com.example.ui.model.TimerAlertState
import com.example.ui.model.UserQuestionState
import com.example.ui.quiz.QuizEngineState
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.MetricTypography
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiveQuizScreen(
    quizEngineState: QuizEngineState,
    onQuizSubmitted: (QuizSessionResult) -> Unit,
    onExitQuiz: () -> Unit,
    modifier: Modifier = Modifier
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    // Anti-accident back handler
    BackHandler(enabled = quizEngineState.isQuizActive && !quizEngineState.isQuizSubmitted) {
        quizEngineState.showExitWarning = true
    }

    // Submission listener: safely handles auto-submission and prevents duplicate callbacks
    var hasHandledSubmission by remember { mutableStateOf(false) }

    LaunchedEffect(quizEngineState.isQuizSubmitted, quizEngineState.sessionResult) {
        val result = quizEngineState.sessionResult
        if (quizEngineState.isQuizSubmitted && result != null && !hasHandledSubmission) {
            hasHandledSubmission = true
            onQuizSubmitted(result)
        }
    }

    val currentQuestion = quizEngineState.currentQuestionState
    var isHindiLanguage by remember {
        mutableStateOf(quizEngineState.config.language.equals("Hindi", ignoreCase = true))
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("live_quiz_screen")
    ) {
        if (currentQuestion != null) {
            Column(modifier = Modifier.fillMaxSize()) {
                // 1. TOP EXAM HEADER BAR
                QuizTopBar(
                    testTitle = quizEngineState.config.testTitle,
                    currentQuestionIndex = quizEngineState.currentQuestionIndex + 1,
                    totalQuestions = quizEngineState.totalQuestions,
                    formattedTime = quizEngineState.formattedRemainingTime,
                    timerAlertState = quizEngineState.timerAlertState,
                    isHindi = isHindiLanguage,
                    onToggleLanguage = { isHindiLanguage = !isHindiLanguage },
                    onOpenPalette = { quizEngineState.showQuestionNavigator = true },
                    onExitQuiz = { quizEngineState.showExitWarning = true }
                )

                // 2. PROGRESS BAR
                LinearProgressIndicator(
                    progress = { quizEngineState.progressFraction },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp),
                    color = ElectricCyan400,
                    trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f),
                    strokeCap = StrokeCap.Square
                )

                // 3. MAIN SCROLLABLE QUESTION & OPTIONS
                LazyColumn(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = GyanixDimens.screenPadding),
                    contentPadding = PaddingValues(top = 14.dp, bottom = 20.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    // Question Card
                    item(key = currentQuestion.question.id) {
                        val activeQuestionText = if (isHindiLanguage) {
                            currentQuestion.question.questionHindi.ifBlank { currentQuestion.question.questionEnglish }
                        } else {
                            currentQuestion.question.questionEnglish.ifBlank { currentQuestion.question.questionHindi }
                        }

                        QuestionCard(
                            questionNumber = quizEngineState.currentQuestionIndex + 1,
                            totalQuestions = quizEngineState.totalQuestions,
                            category = currentQuestion.question.category,
                            subtopic = currentQuestion.question.subtopic,
                            marksScheme = "+${quizEngineState.config.marksPerCorrect} / ${if (quizEngineState.config.negativeMarking == 0.0f) "0.00" else quizEngineState.config.negativeMarking}",
                            questionText = activeQuestionText,
                            isMarkedForReview = currentQuestion.isMarkedForReview,
                            onToggleReview = { quizEngineState.toggleMarkForReview() }
                        )
                    }

                    // Options header label
                    item {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (isHindiLanguage) "सही उत्तर चुनें (SELECT OPTION)" else "SELECT ONE OPTION",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    letterSpacing = 0.8.sp
                                ),
                                modifier = Modifier.padding(start = 4.dp, top = 2.dp)
                            )

                            if (currentQuestion.selectedOptionIndex != null) {
                                Surface(
                                    onClick = { quizEngineState.clearOption() },
                                    shape = RoundedCornerShape(GyanixDimens.radiusFull),
                                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)
                                ) {
                                    Text(
                                        text = if (isHindiLanguage) "विकल्प हटाएं" else "Clear Choice",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            color = WarningAmber,
                                            fontWeight = FontWeight.SemiBold
                                        ),
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                                    )
                                }
                            }
                        }
                    }

                    // 4 Options (A, B, C, D)
                    val activeOptions = if (isHindiLanguage) {
                        if (currentQuestion.question.optionsHindi.isNotEmpty()) {
                            currentQuestion.question.optionsHindi
                        } else {
                            currentQuestion.question.optionsEnglish
                        }
                    } else {
                        if (currentQuestion.question.optionsEnglish.isNotEmpty()) {
                            currentQuestion.question.optionsEnglish
                        } else {
                            currentQuestion.question.optionsHindi
                        }
                    }

                    itemsIndexed(
                        items = activeOptions,
                        key = { idx, _ -> "${currentQuestion.question.id}_opt_$idx" }
                    ) { index, optionText ->
                        val label = when (index) {
                            0 -> "A"
                            1 -> "B"
                            2 -> "C"
                            3 -> "D"
                            else -> "${index + 1}"
                        }
                        val isSelected = currentQuestion.selectedOptionIndex == index

                        OptionCard(
                            label = label,
                            text = optionText,
                            isSelected = isSelected,
                            onClick = { quizEngineState.selectOption(index) },
                            modifier = Modifier.testTag("quiz_option_$index")
                        )
                    }
                }

                // 4. BOTTOM ACTION CONTROLS BAR
                QuizBottomControlsBar(
                    canGoPrevious = quizEngineState.currentQuestionIndex > 0,
                    isLastQuestion = quizEngineState.currentQuestionIndex == quizEngineState.totalQuestions - 1,
                    isMarkedForReview = currentQuestion.isMarkedForReview,
                    onPrevious = { quizEngineState.previousQuestion() },
                    onNext = { quizEngineState.nextQuestion() },
                    onToggleReview = { quizEngineState.toggleMarkForReview() },
                    onSubmit = { quizEngineState.showSubmitConfirmation = true }
                )
            }
        } else {
            // Empty state when question bank is waiting for questions
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.GridOn,
                    contentDescription = null,
                    tint = RoyalBlue400,
                    modifier = Modifier.size(56.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = if (isHindiLanguage) "कोई प्रश्न उपलब्ध नहीं हैं" else "No Questions Available",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = if (isHindiLanguage)
                        "प्रश्नावली खाली कर दी गई है। नए प्रश्न जल्द जोड़े जाएंगे।"
                    else
                        "All questions have been cleared. Ready for new question bank additions.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center
                )
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = onExitQuiz,
                    colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600)
                ) {
                    Text("Go Back / वापस जाएं")
                }
            }
        }

        // 5. QUESTION PALETTE MODAL BOTTOM SHEET
        if (quizEngineState.showQuestionNavigator) {
            ModalBottomSheet(
                onDismissRequest = { quizEngineState.showQuestionNavigator = false },
                sheetState = sheetState,
                containerColor = MaterialTheme.colorScheme.surface,
                modifier = Modifier.testTag("question_palette_sheet")
            ) {
                QuestionPaletteSheetContent(
                    quizEngineState = quizEngineState,
                    onSelectQuestion = { index ->
                        quizEngineState.jumpToQuestion(index)
                    },
                    onSubmitClick = {
                        quizEngineState.showQuestionNavigator = false
                        quizEngineState.showSubmitConfirmation = true
                    }
                )
            }
        }

        // 6. SUBMIT CONFIRMATION MODAL DIALOG
        if (quizEngineState.showSubmitConfirmation) {
            SubmitConfirmationDialog(
                totalQuestions = quizEngineState.totalQuestions,
                answeredCount = quizEngineState.answeredCount,
                unansweredCount = quizEngineState.unansweredCount,
                markedCount = quizEngineState.markedForReviewCount,
                answeredAndMarkedCount = quizEngineState.answeredAndMarkedCount,
                timeRemaining = quizEngineState.formattedRemainingTime,
                onConfirmSubmit = {
                    quizEngineState.showSubmitConfirmation = false
                    val result = quizEngineState.submitQuiz()
                    if (!hasHandledSubmission) {
                        hasHandledSubmission = true
                        onQuizSubmitted(result)
                    }
                },
                onDismiss = { quizEngineState.showSubmitConfirmation = false }
            )
        }

        // 7. ANTI-ACCIDENT EXIT CONFIRMATION DIALOG
        if (quizEngineState.showExitWarning) {
            GyanixConfirmationDialog(
                title = "Exit Test in Progress?",
                message = "Your active test session and recorded responses will be discarded if you leave now.\n\nAre you sure you want to exit?",
                confirmText = "Exit Test",
                dismissText = "Continue Test",
                onConfirm = {
                    quizEngineState.showExitWarning = false
                    onExitQuiz()
                },
                onDismiss = { quizEngineState.showExitWarning = false }
            )
        }
    }
}

// ==========================================
// TOP EXAM BAR WITH DYNAMIC TIMER & LANGUAGE TOGGLE
// ==========================================

@Composable
private fun QuizTopBar(
    testTitle: String,
    currentQuestionIndex: Int,
    totalQuestions: Int,
    formattedTime: String,
    timerAlertState: TimerAlertState,
    isHindi: Boolean,
    onToggleLanguage: () -> Unit,
    onOpenPalette: () -> Unit,
    onExitQuiz: () -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Close / Exit button
            IconButton(
                onClick = onExitQuiz,
                modifier = Modifier
                    .size(36.dp)
                    .testTag("btn_quiz_exit")
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Exit Test",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            // Title & Question Progress
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f).padding(horizontal = 4.dp)
            ) {
                Text(
                    text = testTitle,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = if (isHindi) "प्रश्न $currentQuestionIndex / $totalQuestions" else "Question $currentQuestionIndex of $totalQuestions",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontWeight = FontWeight.Medium
                    )
                )
            }

            // Controls: Language Toggle, Timer, Palette
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                // Language Switcher Button
                Surface(
                    onClick = onToggleLanguage,
                    shape = RoundedCornerShape(6.dp),
                    color = RoyalBlue600.copy(alpha = 0.15f),
                    border = BorderStroke(1.dp, RoyalBlue400.copy(alpha = 0.5f)),
                    modifier = Modifier.testTag("btn_quiz_language_toggle")
                ) {
                    Text(
                        text = if (isHindi) "हिन्दी" else "ENG",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = RoyalBlue400,
                            fontSize = 11.sp
                        ),
                        modifier = Modifier.padding(horizontal = 7.dp, vertical = 4.dp)
                    )
                }

                // Countdown Timer Box
                val timerBgColor = when (timerAlertState) {
                    TimerAlertState.CRITICAL -> ErrorRed.copy(alpha = 0.2f)
                    TimerAlertState.WARNING -> WarningAmber.copy(alpha = 0.2f)
                    TimerAlertState.NORMAL -> ElectricCyan400.copy(alpha = 0.15f)
                    TimerAlertState.NO_TIMER -> MaterialTheme.colorScheme.surfaceVariant
                }
                val timerTextColor = when (timerAlertState) {
                    TimerAlertState.CRITICAL -> ErrorRed
                    TimerAlertState.WARNING -> WarningAmber
                    TimerAlertState.NORMAL -> ElectricCyan400
                    TimerAlertState.NO_TIMER -> MaterialTheme.colorScheme.onSurfaceVariant
                }

                Surface(
                    shape = RoundedCornerShape(GyanixDimens.radiusSm),
                    color = timerBgColor,
                    border = BorderStroke(1.dp, timerTextColor.copy(alpha = 0.5f)),
                    modifier = Modifier.testTag("quiz_timer_badge")
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Timer,
                            contentDescription = "Timer",
                            tint = timerTextColor,
                            modifier = Modifier.size(13.dp)
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            text = formattedTime,
                            style = MetricTypography.TimerDisplay.copy(
                                color = timerTextColor,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }

                // Question Palette Trigger
                IconButton(
                    onClick = onOpenPalette,
                    modifier = Modifier
                        .size(34.dp)
                        .background(RoyalBlue600.copy(alpha = 0.18f), RoundedCornerShape(8.dp))
                        .testTag("btn_open_palette")
                ) {
                    Icon(
                        imageVector = Icons.Default.GridOn,
                        contentDescription = "Question Palette",
                        tint = RoyalBlue400,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

// ==========================================
// QUESTION CARD COMPONENT
// ==========================================

@Composable
private fun QuestionCard(
    questionNumber: Int,
    totalQuestions: Int,
    category: String,
    subtopic: String,
    marksScheme: String,
    questionText: String,
    isMarkedForReview: Boolean,
    onToggleReview: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("live_question_card")
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header: Q Number, Category, Review flag
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .background(RoyalBlue600, RoundedCornerShape(6.dp))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "Q $questionNumber / $totalQuestions",
                            style = MetricTypography.QuestionNumber.copy(color = Color.White)
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = marksScheme,
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = SuccessGreen,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }

                Surface(
                    onClick = onToggleReview,
                    shape = RoundedCornerShape(GyanixDimens.radiusFull),
                    color = if (isMarkedForReview) PurpleAccent.copy(alpha = 0.2f) else Color.Transparent,
                    border = BorderStroke(1.dp, if (isMarkedForReview) PurpleAccent else MaterialTheme.colorScheme.outline),
                    modifier = Modifier.testTag("btn_toggle_review")
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Flag,
                            contentDescription = "Review",
                            tint = if (isMarkedForReview) PurpleAccent else MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = if (isMarkedForReview) "Marked" else "Review",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = if (isMarkedForReview) PurpleAccent else MaterialTheme.colorScheme.onSurfaceVariant,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Subtopic / Category tag
            Text(
                text = "$category • $subtopic",
                style = MaterialTheme.typography.labelSmall.copy(
                    color = ElectricCyan400,
                    fontWeight = FontWeight.SemiBold
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Question Text (Strictly active language only)
            Text(
                text = questionText,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 24.sp
                )
            )
        }
    }
}

// ==========================================
// 4 OPTION CARD COMPONENT
// ==========================================

@Composable
private fun OptionCard(
    label: String,
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val animatedBg by animateColorAsState(
        targetValue = if (isSelected) RoyalBlue600.copy(alpha = 0.18f) else MaterialTheme.colorScheme.surfaceVariant,
        animationSpec = tween(120),
        label = "optionBg"
    )

    val animatedBorder by animateColorAsState(
        targetValue = if (isSelected) RoyalBlue500 else MaterialTheme.colorScheme.outline,
        animationSpec = tween(120),
        label = "optionBorder"
    )

    Card(
        onClick = onClick,
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = animatedBg),
        border = BorderStroke(if (isSelected) 1.5.dp else 1.dp, animatedBorder),
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Label Circle (A, B, C, D)
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .background(
                        color = if (isSelected) RoyalBlue600 else MaterialTheme.colorScheme.surface,
                        shape = CircleShape
                    )
                    .border(
                        width = 1.dp,
                        color = if (isSelected) RoyalBlue500 else MaterialTheme.colorScheme.outline,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = label,
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface
                    )
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = text,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }

            if (isSelected) {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "Selected",
                    tint = RoyalBlue400,
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}

// ==========================================
// BOTTOM NAVIGATION ACTION CONTROLS
// ==========================================

@Composable
private fun QuizBottomControlsBar(
    canGoPrevious: Boolean,
    isLastQuestion: Boolean,
    isMarkedForReview: Boolean,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onToggleReview: () -> Unit,
    onSubmit: () -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline),
        modifier = Modifier.navigationBarsPadding()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Previous Button
            OutlinedButton(
                onClick = onPrevious,
                enabled = canGoPrevious,
                shape = RoundedCornerShape(GyanixDimens.radiusSm),
                modifier = Modifier.testTag("btn_quiz_prev")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("Previous")
            }

            // Quick Mark for Review
            IconButton(
                onClick = onToggleReview,
                modifier = Modifier
                    .background(
                        if (isMarkedForReview) PurpleAccent.copy(alpha = 0.2f) else MaterialTheme.colorScheme.surfaceVariant,
                        CircleShape
                    )
                    .border(
                        1.dp,
                        if (isMarkedForReview) PurpleAccent else MaterialTheme.colorScheme.outline,
                        CircleShape
                    )
                    .testTag("btn_bottom_mark_review")
            ) {
                Icon(
                    imageVector = Icons.Default.Flag,
                    contentDescription = "Review",
                    tint = if (isMarkedForReview) PurpleAccent else MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(18.dp)
                )
            }

            // Next / Submit Button
            if (isLastQuestion) {
                Button(
                    onClick = onSubmit,
                    shape = RoundedCornerShape(GyanixDimens.radiusSm),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = SuccessGreen,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.testTag("btn_quiz_submit_last")
                ) {
                    Text("Submit Test", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.Default.Send,
                        contentDescription = null,
                        modifier = Modifier.size(14.dp)
                    )
                }
            } else {
                Button(
                    onClick = onNext,
                    shape = RoundedCornerShape(GyanixDimens.radiusSm),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = RoyalBlue600,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.testTag("btn_quiz_next")
                ) {
                    Text("Next", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }
}

// ==========================================
// SCREEN 4: QUESTION NAVIGATOR (PALETTE SHEET)
// ==========================================

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun QuestionPaletteSheetContent(
    quizEngineState: QuizEngineState,
    onSelectQuestion: (Int) -> Unit,
    onSubmitClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        // Sheet Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Question Palette (${quizEngineState.totalQuestions})",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )

            Text(
                text = "${quizEngineState.answeredCount} / ${quizEngineState.totalQuestions} Answered",
                style = MaterialTheme.typography.labelSmall.copy(
                    color = SuccessGreen,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Visual Legend of 5 Statuses
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            LegendItem(
                label = "Answered (${quizEngineState.answeredCount})",
                color = SuccessGreen,
                isFilled = true
            )
            LegendItem(
                label = "Unanswered (${quizEngineState.unansweredCount})",
                color = WarningAmber,
                isFilled = false
            )
            LegendItem(
                label = "Review (${quizEngineState.markedForReviewCount})",
                color = PurpleAccent,
                isFilled = true
            )
            LegendItem(
                label = "Ans + Marked (${quizEngineState.answeredAndMarkedCount})",
                color = RoyalBlue400,
                isFilled = true
            )
            LegendItem(
                label = "Unvisited (${quizEngineState.unvisitedCount})",
                color = Color(0xFF64748B),
                isFilled = false
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Question Grid (1 to N)
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 44.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
        ) {
            itemsIndexed(quizEngineState.questionStates) { index, state ->
                val qNumber = index + 1
                val isCurrent = index == quizEngineState.currentQuestionIndex

                val (bgColor, textColor, borderColor) = when (state.status) {
                    QuestionStatus.ANSWERED -> Triple(SuccessGreen, Color.White, SuccessGreen)
                    QuestionStatus.ANSWERED_AND_MARKED -> Triple(RoyalBlue500, Color.White, PurpleAccent)
                    QuestionStatus.MARKED_FOR_REVIEW -> Triple(PurpleAccent, Color.White, PurpleAccent)
                    QuestionStatus.UNANSWERED -> Triple(MaterialTheme.colorScheme.surfaceVariant, WarningAmber, WarningAmber)
                    QuestionStatus.UNVISITED -> Triple(MaterialTheme.colorScheme.surfaceVariant, MaterialTheme.colorScheme.onSurfaceVariant, MaterialTheme.colorScheme.outline)
                }

                Surface(
                    onClick = { onSelectQuestion(index) },
                    shape = RoundedCornerShape(8.dp),
                    color = bgColor,
                    border = BorderStroke(
                        if (isCurrent) 2.5.dp else 1.dp,
                        if (isCurrent) ElectricCyan400 else borderColor
                    ),
                    modifier = Modifier
                        .size(44.dp)
                        .testTag("palette_btn_$qNumber")
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(
                            text = "$qNumber",
                            style = MaterialTheme.typography.bodySmall.copy(
                                fontWeight = if (isCurrent) FontWeight.ExtraBold else FontWeight.Bold,
                                color = textColor
                            )
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Quick Submit Button in Palette
        Button(
            onClick = onSubmitClick,
            shape = RoundedCornerShape(GyanixDimens.radiusMd),
            colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .testTag("palette_submit_btn")
        ) {
            Text(
                text = "Submit Test (${quizEngineState.answeredCount}/${quizEngineState.totalQuestions} Attempted)",
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
private fun LegendItem(
    label: String,
    color: Color,
    isFilled: Boolean
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(10.dp)
                .background(if (isFilled) color else Color.Transparent, CircleShape)
                .border(1.dp, color, CircleShape)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(
                fontSize = 11.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        )
    }
}

// ==========================================
// SCREEN 5: SUBMIT TEST CONFIRMATION DIALOG
// ==========================================

@Composable
private fun SubmitConfirmationDialog(
    totalQuestions: Int,
    answeredCount: Int,
    unansweredCount: Int,
    markedCount: Int,
    answeredAndMarkedCount: Int,
    timeRemaining: String,
    onConfirmSubmit: () -> Unit,
    onDismiss: () -> Unit
) {
    GyanixConfirmationDialog(
        title = "Submit Test Finalization",
        message = buildString {
            append("You have answered $answeredCount of $totalQuestions questions.")
            if (unansweredCount > 0) {
                append("\n\n⚠️ Caution: You have $unansweredCount unanswered questions.")
            }
            if (markedCount > 0 || answeredAndMarkedCount > 0) {
                append("\n• ${markedCount + answeredAndMarkedCount} questions are marked for review.")
            }
            append("\n• Time Remaining: $timeRemaining")
            append("\n\nAre you sure you want to finalize your submission?")
        },
        confirmText = "Submit Test",
        dismissText = "Keep Answering",
        onConfirm = onConfirmSubmit,
        onDismiss = onDismiss
    )
}
