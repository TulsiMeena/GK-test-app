package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkAdd
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixPrimaryButton
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.model.DetailedAnalysisResult
import com.example.ui.model.GkQuestion
import com.example.ui.model.QuizAnalysisEngine
import com.example.ui.model.QuizSessionResult
import com.example.ui.model.UserQuestionState
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.MetricTypography
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * PROMPT 4 - SCREEN 4: Incorrect Questions Review
 * Dedicated screen isolating all wrong answers from the test with:
 * - Direct "Practice Wrong Questions" action
 * - Bulk bookmarking
 * - Side-by-side comparison of user answer vs correct answer
 * - Expandable bilingual solution explanation
 */
@Composable
fun IncorrectQuestionsReviewScreen(
    sessionResult: QuizSessionResult?,
    bookmarkedQuestionIds: Set<String>,
    onToggleBookmark: (String) -> Unit,
    onBookmarkAllWrong: (List<String>) -> Unit,
    onPracticeWrongQuestions: (List<GkQuestion>) -> Unit,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val analysis: DetailedAnalysisResult = remember(sessionResult) {
        if (sessionResult != null) {
            QuizAnalysisEngine.calculateDetailedAnalysis(sessionResult)
        } else {
            val sampleQuestions = com.example.ui.model.QuizQuestionDatabase.getSampleQuestions(4)
            val mockStates = sampleQuestions.mapIndexed { idx, q ->
                UserQuestionState(
                    question = q,
                    selectedOptionIndex = (q.correctAnswerIndex + 1) % 4, // All wrong for preview
                    isVisited = true
                )
            }
            val mockResult = QuizSessionResult(
                config = com.example.ui.model.QuizConfig(testTitle = "Mock Wrong Questions Review"),
                questionStates = mockStates,
                totalQuestions = mockStates.size,
                answeredCount = mockStates.size,
                unansweredCount = 0,
                markedForReviewCount = 0,
                answeredAndMarkedCount = 0,
                correctCount = 0,
                incorrectCount = mockStates.size,
                score = 0f,
                maxScore = 4.0f,
                accuracyPercentage = 0,
                timeTakenSeconds = 180
            )
            QuizAnalysisEngine.calculateDetailedAnalysis(mockResult)
        }
    }

    var isHindi by remember { mutableStateOf(false) }
    val expandedStates = remember { mutableStateMapOf<String, Boolean>() }
    val wrongQuestions = analysis.incorrectQuestions

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("incorrect_questions_screen"),
        contentPadding = PaddingValues(bottom = 96.dp)
    ) {
        // 1. Top Bar
        item {
            WrongAnswersTopBar(
                title = analysis.sessionResult.config.testTitle,
                wrongCount = wrongQuestions.size,
                isHindi = isHindi,
                onToggleLanguage = { isHindi = !isHindi },
                onBack = onBack
            )
        }

        // 2. Action Header Card (Practice Again + Bookmark All)
        if (wrongQuestions.isNotEmpty()) {
            item {
                WrongQuestionsHeroActionCard(
                    wrongCount = wrongQuestions.size,
                    negativeMarkLoss = analysis.scoreBreakdown.negativeMarksDeducted,
                    onPracticeAgain = {
                        val questionsToPractice = wrongQuestions.map { it.question }
                        onPracticeWrongQuestions(questionsToPractice)
                    },
                    onBookmarkAll = {
                        val ids = wrongQuestions.map { it.question.id }
                        onBookmarkAllWrong(ids)
                    },
                    modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
                )
            }
        }

        // 3. Questions List or Empty State
        if (wrongQuestions.isEmpty()) {
            item {
                ZeroMistakesCard(
                    modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 24.dp)
                )
            }
        } else {
            itemsIndexed(wrongQuestions, key = { _, state -> state.question.id }) { index, questionState ->
                val qId = questionState.question.id
                val isExpanded = expandedStates[qId] ?: false
                val isBookmarked = bookmarkedQuestionIds.contains(qId)

                WrongQuestionCard(
                    index = index + 1,
                    questionState = questionState,
                    isHindi = isHindi,
                    isExpanded = isExpanded,
                    isBookmarked = isBookmarked,
                    onToggleExpand = { expandedStates[qId] = !isExpanded },
                    onToggleBookmark = { onToggleBookmark(qId) },
                    penalty = analysis.sessionResult.config.negativeMarking,
                    modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
                )
            }
        }
    }
}

@Composable
private fun WrongAnswersTopBar(
    title: String,
    wrongCount: Int,
    isHindi: Boolean,
    onToggleLanguage: () -> Unit,
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            IconButton(
                onClick = onBack,
                modifier = Modifier.testTag("btn_wrong_back")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Wrong Answers",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    GyanixBadge(
                        text = "$wrongCount",
                        backgroundColor = if (wrongCount > 0) ErrorRed.copy(alpha = 0.15f) else SuccessGreen.copy(alpha = 0.15f),
                        textColor = if (wrongCount > 0) ErrorRed else SuccessGreen
                    )
                }
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }

        Surface(
            onClick = onToggleLanguage,
            shape = RoundedCornerShape(20.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)),
            modifier = Modifier.testTag("btn_wrong_lang_toggle")
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Translate,
                    contentDescription = "Toggle Language",
                    tint = ElectricCyan400,
                    modifier = Modifier.size(14.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = if (isHindi) "HI / EN" else "EN / हिन्दी",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }
        }
    }
}

@Composable
private fun WrongQuestionsHeroActionCard(
    wrongCount: Int,
    negativeMarkLoss: Float,
    onPracticeAgain: () -> Unit,
    onBookmarkAll: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("wrong_questions_hero_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, ErrorRed.copy(alpha = 0.35f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "$wrongCount Mistakes to Correct",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    if (negativeMarkLoss > 0f) {
                        Text(
                            text = "Lost -${String.format("%.2f", negativeMarkLoss)} marks due to negative scoring penalty",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = ErrorRed,
                                fontSize = 11.sp
                            )
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .background(ErrorRed.copy(alpha = 0.15f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Cancel,
                        contentDescription = null,
                        tint = ErrorRed,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = onPracticeAgain,
                    modifier = Modifier
                        .weight(1f)
                        .height(GyanixDimens.buttonHeight)
                        .testTag("btn_practice_wrong_again"),
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = RoyalBlue500,
                        contentColor = Color.White
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Replay,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Practice Again",
                        style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
                    )
                }

                OutlinedButton(
                    onClick = onBookmarkAll,
                    modifier = Modifier
                        .weight(1f)
                        .height(GyanixDimens.buttonHeight)
                        .testTag("btn_bookmark_all_wrong"),
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
                ) {
                    Icon(
                        imageVector = Icons.Default.BookmarkAdd,
                        contentDescription = null,
                        tint = PurpleAccent,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Bookmark All",
                        style = MaterialTheme.typography.labelLarge.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                }
            }
        }
    }
}

@Composable
private fun WrongQuestionCard(
    index: Int,
    questionState: UserQuestionState,
    isHindi: Boolean,
    isExpanded: Boolean,
    isBookmarked: Boolean,
    onToggleExpand: () -> Unit,
    onToggleBookmark: () -> Unit,
    penalty: Float,
    modifier: Modifier = Modifier
) {
    val q = questionState.question
    val userIdx = questionState.selectedOptionIndex ?: 0
    val correctIdx = q.correctAnswerIndex

    val options = if (isHindi && q.optionsHindi.isNotEmpty()) q.optionsHindi else q.optionsEnglish
    val userOptionText = options.getOrElse(userIdx) { "Option ${userIdx + 1}" }
    val correctOptionText = options.getOrElse(correctIdx) { "Option ${correctIdx + 1}" }
    val optionLabels = listOf("A", "B", "C", "D")

    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("wrong_card_$index"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, ErrorRed.copy(alpha = 0.3f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header Tags
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Mistake #$index",
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = ErrorRed
                        )
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    GyanixBadge(
                        text = q.category,
                        backgroundColor = RoyalBlue500.copy(alpha = 0.15f),
                        textColor = RoyalBlue400
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    GyanixBadge(
                        text = q.difficulty,
                        backgroundColor = MaterialTheme.colorScheme.surface,
                        textColor = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                IconButton(
                    onClick = onToggleBookmark,
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                        contentDescription = "Bookmark",
                        tint = if (isBookmarked) PurpleAccent else MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Question text
            Text(
                text = if (isHindi && q.questionHindi.isNotEmpty()) q.questionHindi else q.questionEnglish,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 22.sp
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Clear Side-by-Side / Stacked Comparison (Your Answer vs Correct Answer)
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                // Your Selected (Incorrect) Answer Box
                Surface(
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    color = ErrorRed.copy(alpha = 0.10f),
                    border = BorderStroke(1.5.dp, ErrorRed),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .background(ErrorRed.copy(alpha = 0.2f), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = optionLabels.getOrElse(userIdx) { "${userIdx + 1}" },
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = ErrorRed
                                )
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = null,
                                    tint = ErrorRed,
                                    modifier = Modifier.size(14.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Your Answer (Incorrect)",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = ErrorRed,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = userOptionText,
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }
                }

                // Correct Answer Box
                Surface(
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    color = SuccessGreen.copy(alpha = 0.10f),
                    border = BorderStroke(1.5.dp, SuccessGreen),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .background(SuccessGreen.copy(alpha = 0.2f), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = optionLabels.getOrElse(correctIdx) { "${correctIdx + 1}" },
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = SuccessGreen
                                )
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Check,
                                    contentDescription = null,
                                    tint = SuccessGreen,
                                    modifier = Modifier.size(14.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Correct Answer",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = SuccessGreen,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = correctOptionText,
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Expandable Solution Explanation
            Surface(
                onClick = onToggleExpand,
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                color = MaterialTheme.colorScheme.surface,
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Lightbulb,
                                contentDescription = null,
                                tint = ElectricCyan400,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Why This is Correct",
                                style = MaterialTheme.typography.labelLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                        }

                        Icon(
                            imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                            contentDescription = if (isExpanded) "Collapse" else "Expand",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    AnimatedVisibility(
                        visible = isExpanded,
                        enter = fadeIn() + expandVertically(),
                        exit = fadeOut() + shrinkVertically()
                    ) {
                        Column(modifier = Modifier.padding(top = 8.dp)) {
                            val explanation = if (isHindi && q.explanationHindi.isNotEmpty()) q.explanationHindi else q.explanationEnglish
                            Text(
                                text = if (explanation.isNotBlank()) explanation else "Explanation unavailable.",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurface,
                                    lineHeight = 20.sp
                                )
                            )

                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Topic: ${q.subtopic}",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 10.sp
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ZeroMistakesCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, SuccessGreen.copy(alpha = 0.4f))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .background(SuccessGreen.copy(alpha = 0.15f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = null,
                    tint = SuccessGreen,
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Perfect! You didn't get any questions wrong.",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Every attempted question was accurate with zero penalty deductions. Keep up this standard on higher difficulty levels.",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 18.sp
                ),
                textAlign = TextAlign.Center
            )
        }
    }
}
