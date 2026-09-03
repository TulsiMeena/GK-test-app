package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.HighlightOff
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.ui.components.GyanixPrimaryButton
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.model.GkQuestion
import com.example.ui.theme.DarkNavyBorder
import com.example.ui.theme.DarkNavySurface
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber
import kotlinx.coroutines.delay

/**
 * Practice Session Screen (Prompt 5)
 * Interactive, untimed, instant-feedback practice engine:
 * - Immediate answer verification (Green Check on correct, Red on mistake + true answer highlight)
 * - Immediate concept & solution explanation display
 * - Real-time progress bar with Correct, Incorrect, and Remaining counters
 * - Top Bilingual toggle (ENG / हिन्दी) and Bookmark toggle
 * - Previous / Next navigation
 * - Compact Practice Summary Result on completion with local repository persistence
 */
@Composable
fun PracticeSessionScreen(
    questions: List<GkQuestion>,
    sessionTitle: String = "GK Practice Session",
    onExitPractice: () -> Unit,
    modifier: Modifier = Modifier
) {
    if (questions.isEmpty()) {
        Box(
            modifier = modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("No questions available for this practice filter.")
                Spacer(modifier = Modifier.height(12.dp))
                Button(onClick = onExitPractice) {
                    Text("Return to Practice Center")
                }
            }
        }
        return
    }

    var currentIndex by remember { mutableIntStateOf(0) }
    var isHindiLanguage by remember { mutableStateOf(false) }
    var showExitDialog by remember { mutableStateOf(false) }
    var isSessionCompleted by remember { mutableStateOf(false) }

    // User's selections: QuestionId -> SelectedOptionIndex (0..3)
    val userAnswers = remember { mutableStateMapOf<String, Int>() }

    // Session time tracking
    var timeElapsedSeconds by remember { mutableIntStateOf(0) }

    LaunchedEffect(isSessionCompleted) {
        while (!isSessionCompleted) {
            delay(1000L)
            timeElapsedSeconds++
        }
    }

    val totalQuestions = questions.size
    val currentQuestion = questions.getOrNull(currentIndex) ?: questions.firstOrNull() ?: return
    val selectedOption = userAnswers[currentQuestion.id]
    val isCurrentAnswered = selectedOption != null

    // Live Stats
    val correctCount = userAnswers.count { (qId, selected) ->
        val q = questions.find { it.id == qId }
        q != null && selected == q.correctAnswerIndex
    }
    val incorrectCount = userAnswers.count { (qId, selected) ->
        val q = questions.find { it.id == qId }
        q != null && selected != q.correctAnswerIndex
    }
    val remainingCount = (totalQuestions - userAnswers.size).coerceAtLeast(0)
    val progressFraction = if (totalQuestions > 0) ((currentIndex + 1).toFloat() / totalQuestions.toFloat()).coerceIn(0f, 1f) else 0f

    val isBookmarked = GyanixLocalDataManager.isBookmarked(currentQuestion.id)

    // Check if user completed all questions
    fun checkAndFinishSession() {
        isSessionCompleted = true
        // Record session to local data manager
        GyanixLocalDataManager.recordPracticeSessionSummary(
            completed = userAnswers.size,
            correct = correctCount,
            incorrect = incorrectCount
        )
    }

    if (isSessionCompleted) {
        // ==========================================
        // COMPACT PRACTICE RESULT VIEW
        // ==========================================
        CompactPracticeResultView(
            sessionTitle = sessionTitle,
            total = totalQuestions,
            attempted = userAnswers.size,
            correct = correctCount,
            incorrect = incorrectCount,
            timeElapsedSeconds = timeElapsedSeconds,
            onPracticeAgain = {
                userAnswers.clear()
                currentIndex = 0
                timeElapsedSeconds = 0
                isSessionCompleted = false
            },
            onReviewAnswers = {
                // Return to review mode (keep answers and start from Q1)
                currentIndex = 0
                isSessionCompleted = false
            },
            onExit = onExitPractice,
            modifier = modifier
        )
    } else {
        // ==========================================
        // ACTIVE PRACTICE SCREEN
        // ==========================================
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .testTag("practice_session_screen")
        ) {
            // 1. TOP BAR (Title, Progress, Language & Bookmark)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(
                            onClick = { showExitDialog = true },
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.background.copy(alpha = 0.6f))
                                .testTag("btn_exit_practice_session")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Exit Practice",
                                tint = MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = sessionTitle,
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
                                maxLines = 1
                            )
                            Text(
                                text = "Question ${currentIndex + 1} of $totalQuestions",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = RoyalBlue400,
                                    fontSize = 11.5.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        // Language Switcher
                        Surface(
                            onClick = { isHindiLanguage = !isHindiLanguage },
                            shape = RoundedCornerShape(6.dp),
                            color = MaterialTheme.colorScheme.background.copy(alpha = 0.7f),
                            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)),
                            modifier = Modifier.testTag("btn_practice_language_toggle")
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Translate,
                                    contentDescription = "Language",
                                    tint = RoyalBlue400,
                                    modifier = Modifier.size(12.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = if (isHindiLanguage) "हिन्दी" else "ENG",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 11.sp,
                                        color = RoyalBlue400
                                    )
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(6.dp))

                        // Bookmark Toggle
                        IconButton(
                            onClick = {
                                GyanixLocalDataManager.toggleBookmark(currentQuestion.id)
                            },
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.background.copy(alpha = 0.7f))
                                .testTag("btn_practice_bookmark_toggle")
                        ) {
                            Icon(
                                imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                                contentDescription = "Bookmark",
                                tint = if (isBookmarked) WarningAmber else MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Progress Bar
                LinearProgressIndicator(
                    progress = { progressFraction },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(CircleShape),
                    color = RoyalBlue600,
                    trackColor = MaterialTheme.colorScheme.background.copy(alpha = 0.6f),
                    strokeCap = StrokeCap.Round
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Live Counters Pill
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        LiveScoreChip(
                            icon = Icons.Default.Check,
                            count = correctCount,
                            color = SuccessGreen,
                            label = "Correct"
                        )
                        LiveScoreChip(
                            icon = Icons.Default.Close,
                            count = incorrectCount,
                            color = ErrorRed,
                            label = "Incorrect"
                        )
                    }

                    Text(
                        text = "$remainingCount Remaining",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp
                        )
                    )
                }
            }

            // 2. QUESTION & IMMEDIATE FEEDBACK BODY
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding),
                contentPadding = PaddingValues(top = 16.dp, bottom = 24.dp)
            ) {
                // Category & Difficulty Tags
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(4.dp),
                            color = RoyalBlue400.copy(alpha = 0.15f)
                        ) {
                            Text(
                                text = currentQuestion.category,
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = RoyalBlue400,
                                    fontSize = 11.sp
                                ),
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                            )
                        }

                        Text(
                            text = currentQuestion.difficulty,
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 11.sp
                            )
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                }

                // Question Statement
                item {
                    val questionText = if (isHindiLanguage) {
                        currentQuestion.questionHindi.ifBlank { currentQuestion.questionEnglish }
                    } else {
                        currentQuestion.questionEnglish.ifBlank { currentQuestion.questionHindi }
                    }
                    Text(
                        text = questionText,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onBackground,
                            lineHeight = 22.sp
                        ),
                        modifier = Modifier.testTag("practice_question_text")
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                }

                // 4 Interactive Practice Options with Immediate Feedback
                val rawOptions = if (isHindiLanguage) {
                    if (currentQuestion.optionsHindi.isNotEmpty()) currentQuestion.optionsHindi else currentQuestion.optionsEnglish
                } else {
                    if (currentQuestion.optionsEnglish.isNotEmpty()) currentQuestion.optionsEnglish else currentQuestion.optionsHindi
                }
                items(rawOptions.size) { optionIndex ->
                    val optionText = rawOptions[optionIndex]
                    val isOptionSelected = selectedOption == optionIndex
                    val isCorrectOption = currentQuestion.correctAnswerIndex == optionIndex

                    PracticeOptionTile(
                        index = optionIndex,
                        text = optionText,
                        isSelected = isOptionSelected,
                        isAnswered = isCurrentAnswered,
                        isCorrect = isCorrectOption,
                        onSelect = {
                            if (!isCurrentAnswered) {
                                userAnswers[currentQuestion.id] = optionIndex
                                val isCorrect = optionIndex == currentQuestion.correctAnswerIndex
                                // Update local manager
                                GyanixLocalDataManager.recordQuestionAttempt(isCorrect, currentQuestion.categoryId)
                                if (!isCorrect) {
                                    GyanixLocalDataManager.recordWrongAnswer(currentQuestion, optionIndex)
                                }
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 5.dp)
                    )
                }

                // Immediate Explanation & Feedback Box
                if (isCurrentAnswered) {
                    item {
                        val isUserCorrect = selectedOption == currentQuestion.correctAnswerIndex
                        val rawExplanation = if (isHindiLanguage) {
                            currentQuestion.explanationHindi.ifBlank { currentQuestion.explanationEnglish }
                        } else {
                            currentQuestion.explanationEnglish.ifBlank { currentQuestion.explanationHindi }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        PracticeFeedbackExplanationCard(
                            isCorrect = isUserCorrect,
                            explanation = rawExplanation,
                            subtopic = currentQuestion.subtopic,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }

            // 3. BOTTOM NAVIGATION CONTROLS (Previous, Exit, Next)
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Previous Button
                    OutlinedButton(
                        onClick = {
                            if (currentIndex > 0) currentIndex--
                        },
                        enabled = currentIndex > 0,
                        shape = RoundedCornerShape(GyanixDimens.radiusMd),
                        modifier = Modifier.testTag("btn_practice_previous")
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Previous",
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Previous")
                        }
                    }

                    // Next / Complete Button
                    Button(
                        onClick = {
                            if (currentIndex < totalQuestions - 1) {
                                currentIndex++
                            } else {
                                checkAndFinishSession()
                            }
                        },
                        shape = RoundedCornerShape(GyanixDimens.radiusMd),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (currentIndex == totalQuestions - 1) SuccessGreen else RoyalBlue600
                        ),
                        modifier = Modifier.testTag("btn_practice_next")
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = if (currentIndex == totalQuestions - 1) "Complete Practice" else "Next Question",
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                imageVector = if (currentIndex == totalQuestions - 1) Icons.Default.CheckCircle else Icons.Default.ArrowForward,
                                contentDescription = "Next",
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
        }
    }

    // Exit Confirmation Dialog
    if (showExitDialog) {
        Dialog(onDismissRequest = { showExitDialog = false }) {
            Surface(
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                color = MaterialTheme.colorScheme.surface,
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)),
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Exit Practice Session?",
                        style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Your completed questions will be saved to your daily progress stats.",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(onClick = { showExitDialog = false }) {
                            Text("Continue Practice")
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(
                            onClick = {
                                showExitDialog = false
                                checkAndFinishSession()
                                onExitPractice()
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = ErrorRed)
                        ) {
                            Text("Exit")
                        }
                    }
                }
            }
        }
    }
}

/**
 * Live Score Counter Chip
 */
@Composable
private fun LiveScoreChip(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    count: Int,
    color: Color,
    label: String
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(color.copy(alpha = 0.15f))
            .padding(horizontal = 8.dp, vertical = 3.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, contentDescription = label, tint = color, modifier = Modifier.size(12.dp))
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "$count $label",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = color, fontSize = 11.sp)
        )
    }
}

/**
 * Interactive Practice Option Tile with Immediate Feedback
 */
@Composable
private fun PracticeOptionTile(
    index: Int,
    text: String,
    isSelected: Boolean,
    isAnswered: Boolean,
    isCorrect: Boolean,
    onSelect: () -> Unit,
    modifier: Modifier = Modifier
) {
    val prefix = when (index) {
        0 -> "A"
        1 -> "B"
        2 -> "C"
        else -> "D"
    }

    // Determine visual state based on whether question has been answered
    val backgroundColor = when {
        !isAnswered -> if (isSelected) RoyalBlue600.copy(alpha = 0.2f) else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        isCorrect -> SuccessGreen.copy(alpha = 0.2f) // Always highlight correct option in green
        isSelected -> ErrorRed.copy(alpha = 0.2f)    // Highlight wrong selected option in red
        else -> MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
    }

    val borderColor = when {
        !isAnswered -> if (isSelected) RoyalBlue400 else MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)
        isCorrect -> SuccessGreen
        isSelected -> ErrorRed
        else -> MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.2f)
    }

    val indicatorColor = when {
        !isAnswered -> if (isSelected) RoyalBlue400 else MaterialTheme.colorScheme.onSurfaceVariant
        isCorrect -> SuccessGreen
        isSelected -> ErrorRed
        else -> MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
    }

    Surface(
        onClick = onSelect,
        enabled = !isAnswered,
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        color = backgroundColor,
        border = BorderStroke(1.5.dp, borderColor),
        modifier = modifier.testTag("practice_option_$index")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Option Letter Box
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .clip(CircleShape)
                    .background(indicatorColor.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                if (isAnswered && isCorrect) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "Correct", tint = SuccessGreen, modifier = Modifier.size(16.dp))
                } else if (isAnswered && isSelected) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Wrong", tint = ErrorRed, modifier = Modifier.size(16.dp))
                } else {
                    Text(
                        text = prefix,
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = indicatorColor
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            // Option Text
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = if (isSelected || (isAnswered && isCorrect)) FontWeight.SemiBold else FontWeight.Normal,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

/**
 * Immediate Feedback and Concept Explanation Card
 */
@Composable
private fun PracticeFeedbackExplanationCard(
    isCorrect: Boolean,
    explanation: String,
    subtopic: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.testTag("practice_explanation_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(
            containerColor = if (isCorrect) SuccessGreen.copy(alpha = 0.12f) else ErrorRed.copy(alpha = 0.12f)
        ),
        border = BorderStroke(1.dp, if (isCorrect) SuccessGreen.copy(alpha = 0.4f) else ErrorRed.copy(alpha = 0.4f))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = if (isCorrect) Icons.Default.CheckCircle else Icons.Default.HighlightOff,
                        contentDescription = null,
                        tint = if (isCorrect) SuccessGreen else ErrorRed,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = if (isCorrect) "Correct Answer!" else "Incorrect Choice",
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = if (isCorrect) SuccessGreen else ErrorRed
                        )
                    )
                }

                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.8f)
                ) {
                    Text(
                        text = subtopic,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontSize = 10.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        ),
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(verticalAlignment = Alignment.Top) {
                Icon(
                    imageVector = Icons.Default.Lightbulb,
                    contentDescription = "Concept",
                    tint = RoyalBlue400,
                    modifier = Modifier.size(16.dp).padding(top = 2.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = explanation,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 12.5.sp,
                        lineHeight = 18.sp
                    )
                )
            }
        }
    }
}

/**
 * Compact Practice Result View
 */
@Composable
private fun CompactPracticeResultView(
    sessionTitle: String,
    total: Int,
    attempted: Int,
    correct: Int,
    incorrect: Int,
    timeElapsedSeconds: Int,
    onPracticeAgain: () -> Unit,
    onReviewAnswers: () -> Unit,
    onExit: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accuracy = if (attempted > 0) ((correct.toFloat() / attempted.toFloat()) * 100).toInt() else 0
    val formattedTime = remember(timeElapsedSeconds) {
        val mins = timeElapsedSeconds / 60
        val secs = timeElapsedSeconds % 60
        String.format("%02d:%02d", mins, secs)
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(GyanixDimens.screenPadding)
            .testTag("compact_practice_result_view"),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(GyanixDimens.radiusLg),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f)),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Trophy / Medal Icon
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(if (accuracy >= 70) SuccessGreen.copy(alpha = 0.2f) else RoyalBlue600.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.EmojiEvents,
                        contentDescription = "Complete",
                        tint = if (accuracy >= 70) SuccessGreen else RoyalBlue400,
                        modifier = Modifier.size(36.dp)
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Practice Completed!",
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
                )

                Text(
                    text = sessionTitle,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.5.sp
                    )
                )

                Spacer(modifier = Modifier.height(18.dp))

                // Score & Accuracy Stats Grid
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background.copy(alpha = 0.6f), RoundedCornerShape(GyanixDimens.radiusMd))
                        .padding(vertical = 12.dp, horizontal = 8.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "$accuracy%",
                            style = MaterialTheme.typography.titleLarge.copy(
                                fontWeight = FontWeight.Bold,
                                color = if (accuracy >= 80) SuccessGreen else if (accuracy >= 60) RoyalBlue400 else WarningAmber
                            )
                        )
                        Text("Accuracy", style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant))
                    }

                    Box(modifier = Modifier.width(1.dp).height(28.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "$correct / $total",
                            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold, color = SuccessGreen)
                        )
                        Text("Score", style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant))
                    }

                    Box(modifier = Modifier.width(1.dp).height(28.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = formattedTime,
                            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold, color = RoyalBlue400)
                        )
                        Text("Time", style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant))
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Action Buttons
                GyanixPrimaryButton(
                    text = "Practice Again",
                    onClick = onPracticeAgain,
                    icon = Icons.Default.Refresh,
                    modifier = Modifier.fillMaxWidth(),
                    testTag = "btn_practice_again_result"
                )

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedButton(
                    onClick = onReviewAnswers,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(GyanixDimens.radiusMd)
                ) {
                    Text("Review All Solutions")
                }

                Spacer(modifier = Modifier.height(4.dp))

                TextButton(onClick = onExit) {
                    Text("Back to Practice Center", color = RoyalBlue400)
                }
            }
        }
    }
}
