package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.model.DetailedAnalysisResult
import com.example.ui.model.GkQuestion
import com.example.ui.model.QuizAnalysisEngine
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.model.QuizSessionResult
import com.example.ui.model.UserQuestionState
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.MetricTypography
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

enum class ReviewFilter(val label: String) {
    ALL("All Questions"),
    INCORRECT("Wrong Answers"),
    UNATTEMPTED("Unattempted"),
    CORRECT("Correct")
}

/**
 * PROMPT 4 - SCREEN 3: Question-by-Question Answer Review
 * Allows candidate to review every question from the completed test with:
 * - Clear distinction of "Your Answer" vs "Correct Answer"
 * - Bilingual question & explanation support
 * - Expandable/collapsible solution notes
 * - Bookmarking capability with persistent state
 * - Segmented filtering (All / Incorrect / Unattempted / Correct)
 */
@Composable
fun QuestionAnswerReviewScreen(
    sessionResult: QuizSessionResult?,
    bookmarkedQuestionIds: Set<String>,
    onToggleBookmark: (String) -> Unit,
    onBack: () -> Unit,
    initialFilter: ReviewFilter = ReviewFilter.ALL,
    modifier: Modifier = Modifier
) {
    val analysis: DetailedAnalysisResult = remember(sessionResult) {
        if (sessionResult != null) {
            QuizAnalysisEngine.calculateDetailedAnalysis(sessionResult)
        } else {
            val sampleQuestions = QuizQuestionDatabase.getSampleQuestions(5)
            val mockStates = sampleQuestions.mapIndexed { idx, q ->
                UserQuestionState(
                    question = q,
                    selectedOptionIndex = if (idx % 2 == 0) q.correctAnswerIndex else (q.correctAnswerIndex + 1) % 4,
                    isVisited = true
                )
            }
            val mockResult = QuizSessionResult(
                config = com.example.ui.model.QuizConfig(testTitle = "Sample Review"),
                questionStates = mockStates,
                totalQuestions = mockStates.size,
                answeredCount = mockStates.size,
                unansweredCount = 0,
                markedForReviewCount = 0,
                answeredAndMarkedCount = 0,
                correctCount = 3,
                incorrectCount = 2,
                score = 2.5f,
                maxScore = 5.0f,
                accuracyPercentage = 60,
                timeTakenSeconds = 120
            )
            QuizAnalysisEngine.calculateDetailedAnalysis(mockResult)
        }
    }

    var currentFilter by remember { mutableStateOf(initialFilter) }
    var isHindi by remember {
        mutableStateOf(sessionResult?.config?.language?.equals("Hindi", ignoreCase = true) == true)
    }

    // Map to keep track of expanded explanation states
    val expandedExplanations = remember { mutableStateMapOf<String, Boolean>() }

    val filteredQuestions = remember(currentFilter, analysis) {
        when (currentFilter) {
            ReviewFilter.ALL -> analysis.sessionResult.questionStates
            ReviewFilter.INCORRECT -> analysis.incorrectQuestions
            ReviewFilter.UNATTEMPTED -> analysis.unattemptedQuestions
            ReviewFilter.CORRECT -> analysis.correctQuestions
        }
    }

    val allCount = analysis.sessionResult.totalQuestions
    val incorrectCount = analysis.incorrectQuestions.size
    val unattemptedCount = analysis.unattemptedQuestions.size
    val correctCount = analysis.correctQuestions.size

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("question_answer_review_screen"),
        contentPadding = PaddingValues(bottom = 96.dp)
    ) {
        // 1. Top Bar
        item {
            ReviewTopBar(
                title = analysis.sessionResult.config.testTitle,
                isHindi = isHindi,
                onToggleLanguage = { isHindi = !isHindi },
                onBack = onBack
            )
        }

        // 2. Filter Tabs
        item {
            ReviewFilterTabs(
                selectedFilter = currentFilter,
                allCount = allCount,
                incorrectCount = incorrectCount,
                unattemptedCount = unattemptedCount,
                correctCount = correctCount,
                onSelectFilter = { currentFilter = it },
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // 3. Questions List
        if (filteredQuestions.isEmpty()) {
            item {
                EmptyFilterState(filter = currentFilter)
            }
        } else {
            items(filteredQuestions, key = { it.question.id }) { questionState ->
                val qId = questionState.question.id
                val isExpanded = expandedExplanations[qId] ?: false
                val isBookmarked = bookmarkedQuestionIds.contains(qId)

                ReviewQuestionCard(
                    questionIndex = analysis.sessionResult.questionStates.indexOf(questionState) + 1,
                    questionState = questionState,
                    isHindi = isHindi,
                    isExpanded = isExpanded,
                    isBookmarked = isBookmarked,
                    onToggleExpand = { expandedExplanations[qId] = !isExpanded },
                    onToggleBookmark = { onToggleBookmark(qId) },
                    negativePenalty = analysis.sessionResult.config.negativeMarking,
                    modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
                )
            }
        }
    }
}

@Composable
private fun ReviewTopBar(
    title: String,
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
                modifier = Modifier.testTag("btn_review_back")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Column {
                Text(
                    text = "Solutions & Explanations",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
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

        // Language toggle
        Surface(
            onClick = onToggleLanguage,
            shape = RoundedCornerShape(20.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)),
            modifier = Modifier.testTag("btn_review_lang_toggle")
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
private fun ReviewFilterTabs(
    selectedFilter: ReviewFilter,
    allCount: Int,
    incorrectCount: Int,
    unattemptedCount: Int,
    correctCount: Int,
    onSelectFilter: (ReviewFilter) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            FilterChip(
                selected = selectedFilter == ReviewFilter.ALL,
                onClick = { onSelectFilter(ReviewFilter.ALL) },
                label = { Text("All ($allCount)") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = RoyalBlue500,
                    selectedLabelColor = Color.White
                )
            )
        }
        item {
            FilterChip(
                selected = selectedFilter == ReviewFilter.INCORRECT,
                onClick = { onSelectFilter(ReviewFilter.INCORRECT) },
                label = { Text("Wrong ($incorrectCount)") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = ErrorRed,
                    selectedLabelColor = Color.White
                )
            )
        }
        item {
            FilterChip(
                selected = selectedFilter == ReviewFilter.UNATTEMPTED,
                onClick = { onSelectFilter(ReviewFilter.UNATTEMPTED) },
                label = { Text("Skipped ($unattemptedCount)") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = WarningAmber,
                    selectedLabelColor = Color.Black
                )
            )
        }
        item {
            FilterChip(
                selected = selectedFilter == ReviewFilter.CORRECT,
                onClick = { onSelectFilter(ReviewFilter.CORRECT) },
                label = { Text("Correct ($correctCount)") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = SuccessGreen,
                    selectedLabelColor = Color.White
                )
            )
        }
    }
}

@Composable
private fun ReviewQuestionCard(
    questionIndex: Int,
    questionState: UserQuestionState,
    isHindi: Boolean,
    isExpanded: Boolean,
    isBookmarked: Boolean,
    onToggleExpand: () -> Unit,
    onToggleBookmark: () -> Unit,
    negativePenalty: Float,
    modifier: Modifier = Modifier
) {
    val q = questionState.question
    val isCorrect = questionState.isCorrect
    val isAnswered = questionState.isAnswered
    val userSelectedIdx = questionState.selectedOptionIndex
    val correctIdx = q.correctAnswerIndex

    val statusBadgeColor = when {
        !isAnswered -> WarningAmber
        isCorrect -> SuccessGreen
        else -> ErrorRed
    }

    val statusBadgeText = when {
        !isAnswered -> "UNATTEMPTED (0 Marks)"
        isCorrect -> "CORRECT (+1.0 Mark)"
        negativePenalty < 0f -> "INCORRECT ($negativePenalty Marks)"
        else -> "INCORRECT (0.0 Marks)"
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("review_question_card_$questionIndex"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, statusBadgeColor.copy(alpha = 0.4f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header Row: Q Number, Category, Status Badge, Bookmark
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Q$questionIndex",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    GyanixBadge(
                        text = q.category,
                        backgroundColor = RoyalBlue500.copy(alpha = 0.15f),
                        textColor = RoyalBlue400
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    GyanixBadge(
                        text = statusBadgeText,
                        backgroundColor = statusBadgeColor.copy(alpha = 0.15f),
                        textColor = statusBadgeColor
                    )
                    Spacer(modifier = Modifier.width(4.dp))
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
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Question Text (Strict single-language display)
            val questionText = if (isHindi) {
                q.questionHindi.ifBlank { q.questionEnglish }
            } else {
                q.questionEnglish.ifBlank { q.questionHindi }
            }

            Text(
                text = questionText,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 22.sp
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Options Matrix
            val rawOptions = if (isHindi) {
                if (q.optionsHindi.isNotEmpty()) q.optionsHindi else q.optionsEnglish
            } else {
                if (q.optionsEnglish.isNotEmpty()) q.optionsEnglish else q.optionsHindi
            }
            val optionLabels = listOf("A", "B", "C", "D")

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                rawOptions.forEachIndexed { optIdx, optText ->
                    val isThisUserChoice = userSelectedIdx == optIdx
                    val isThisCorrectAnswer = correctIdx == optIdx

                    ReviewOptionRow(
                        label = optionLabels.getOrElse(optIdx) { "${optIdx + 1}" },
                        text = optText,
                        isUserChoice = isThisUserChoice,
                        isCorrectChoice = isThisCorrectAnswer
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Expandable Solution / Explanation Box
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
                                text = if (isHindi) "विस्तृत व्याख्या (Explanation)" else "Detailed Explanation",
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
                        Column(modifier = Modifier.padding(top = 10.dp)) {
                            val rawExplanation = if (isHindi) {
                                q.explanationHindi.ifBlank { q.explanationEnglish }
                            } else {
                                q.explanationEnglish.ifBlank { q.explanationHindi }
                            }
                            Text(
                                text = if (rawExplanation.isNotBlank()) rawExplanation else "Explanation unavailable.",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurface,
                                    lineHeight = 20.sp
                                )
                            )

                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "Subtopic: ${q.subtopic} • Difficulty: ${q.difficulty}",
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
private fun ReviewOptionRow(
    label: String,
    text: String,
    isUserChoice: Boolean,
    isCorrectChoice: Boolean
) {
    val borderColor = when {
        isCorrectChoice -> SuccessGreen
        isUserChoice -> ErrorRed
        else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
    }

    val backgroundColor = when {
        isCorrectChoice -> SuccessGreen.copy(alpha = 0.12f)
        isUserChoice -> ErrorRed.copy(alpha = 0.10f)
        else -> MaterialTheme.colorScheme.surface.copy(alpha = 0.4f)
    }

    val labelColor = when {
        isCorrectChoice -> SuccessGreen
        isUserChoice -> ErrorRed
        else -> MaterialTheme.colorScheme.onSurfaceVariant
    }

    Surface(
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        color = backgroundColor,
        border = BorderStroke(if (isCorrectChoice || isUserChoice) 1.5.dp else 1.dp, borderColor),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Option letter pill
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(labelColor.copy(alpha = 0.15f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = label,
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = labelColor
                    )
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            // Option text
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = if (isCorrectChoice || isUserChoice) FontWeight.SemiBold else FontWeight.Normal
                ),
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(8.dp))

            // Status tag with icon and text
            when {
                isCorrectChoice && isUserChoice -> {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .background(SuccessGreen.copy(alpha = 0.2f), RoundedCornerShape(4.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Correct",
                            tint = SuccessGreen,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            text = "Your Answer (Correct)",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = SuccessGreen,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            )
                        )
                    }
                }
                isCorrectChoice -> {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .background(SuccessGreen.copy(alpha = 0.2f), RoundedCornerShape(4.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Correct Answer",
                            tint = SuccessGreen,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            text = "Correct Answer",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = SuccessGreen,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            )
                        )
                    }
                }
                isUserChoice -> {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .background(ErrorRed.copy(alpha = 0.2f), RoundedCornerShape(4.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Wrong Choice",
                            tint = ErrorRed,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            text = "Your Answer",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = ErrorRed,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun EmptyFilterState(filter: ReviewFilter) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = GyanixDimens.screenPadding, vertical = 24.dp),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = when (filter) {
                    ReviewFilter.INCORRECT -> Icons.Default.CheckCircle
                    ReviewFilter.UNATTEMPTED -> Icons.Default.CheckCircle
                    else -> Icons.Default.HelpOutline
                },
                contentDescription = null,
                tint = if (filter == ReviewFilter.INCORRECT || filter == ReviewFilter.UNATTEMPTED) SuccessGreen else ElectricCyan400,
                modifier = Modifier.size(48.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = when (filter) {
                    ReviewFilter.INCORRECT -> "Perfect! You didn't get any questions wrong."
                    ReviewFilter.UNATTEMPTED -> "Excellent! You attempted every question."
                    ReviewFilter.CORRECT -> "No questions answered correctly yet."
                    else -> "No questions available in this list."
                },
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = when (filter) {
                    ReviewFilter.INCORRECT -> "All attempted questions scored full marks."
                    ReviewFilter.UNATTEMPTED -> "100% attempt rate maintained throughout the session."
                    else -> "Check other filter tabs to inspect your answers."
                },
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                ),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }
    }
}
