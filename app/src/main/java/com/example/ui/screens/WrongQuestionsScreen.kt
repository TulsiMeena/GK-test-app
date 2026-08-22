package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.HighlightOff
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.SentimentSatisfiedAlt
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixPrimaryButton
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.data.WrongPracticeFilterMode
import com.example.ui.data.WrongQuestionRecord
import com.example.ui.model.GkQuestion
import com.example.ui.model.QuizQuestionDatabase
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

/**
 * Wrong Questions Screen (Prompt 5)
 * Dedicated screen for auditing and practicing questions previously missed:
 * - Summary: Total Wrong Questions, Recently Wrong, Most Repeated Mistakes, Weak Categories
 * - Practice Modes: Practice All, Practice 10, Practice 25, Weak Category, Recently Incorrect, Most Incorrect, Random Wrong
 * - Cards: Question, Category, Subtopic, Difficulty, User's Previous Answer, Correct Answer, Explanation, Mistake Count
 * - Actions: Practice, Bookmark, Remove from Wrong List
 * - Empty state with friendly CTA
 */
@Composable
fun WrongQuestionsScreen(
    onNavigateBack: () -> Unit,
    onStartPracticeSession: (List<GkQuestion>, String) -> Unit,
    modifier: Modifier = Modifier
) {
    var isHindiLanguage by remember { mutableStateOf(false) }
    var selectedCategoryFilter by remember { mutableStateOf("All") }

    val wrongRecords = GyanixLocalDataManager.getWrongQuestionsList()
    val totalWrong = wrongRecords.size
    val recentlyWrong = wrongRecords.count { System.currentTimeMillis() - it.lastWrongTimestamp < (86400000L * 2) }
    val repeatedMistakes = wrongRecords.count { it.wrongCount > 1 }
    val weakCategoryIds = GyanixLocalDataManager.getWeakCategoryIds()

    val filteredRecords = remember(wrongRecords, selectedCategoryFilter) {
        if (selectedCategoryFilter == "All") {
            wrongRecords
        } else {
            wrongRecords.filter {
                it.question.category.equals(selectedCategoryFilter, ignoreCase = true) ||
                        it.question.categoryId.equals(selectedCategoryFilter, ignoreCase = true)
            }
        }
    }

    val availableCategories = listOf("All") + wrongRecords.map { it.question.category }.distinct()

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("wrong_questions_screen"),
        contentPadding = PaddingValues(bottom = 36.dp)
    ) {
        // ==========================================
        // 1. TOP APP BAR & ACTIONS
        // ==========================================
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding)
                    .padding(top = 16.dp, bottom = 8.dp)
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
                            onClick = onNavigateBack,
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                .testTag("btn_wrong_questions_back")
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Back",
                                tint = MaterialTheme.colorScheme.onSurface
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Wrong Questions",
                                style = MaterialTheme.typography.titleLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                                ),
                                modifier = Modifier.testTag("wrong_questions_header")
                            )
                            Text(
                                text = "Master your previously missed GK questions",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 11.5.sp
                                )
                            )
                        }
                    }

                    // Bilingual Toggle
                    Surface(
                        onClick = { isHindiLanguage = !isHindiLanguage },
                        shape = RoundedCornerShape(8.dp),
                        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)),
                        modifier = Modifier.testTag("btn_toggle_language_wrong_screen")
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Translate,
                                contentDescription = "Language",
                                tint = RoyalBlue400,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = if (isHindiLanguage) "हिन्दी" else "ENG",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = RoyalBlue400
                                )
                            )
                        }
                    }
                }
            }
        }

        // ==========================================
        // 2. SUMMARY STATISTICS CARD
        // ==========================================
        item {
            WrongSummaryCard(
                total = totalWrong,
                recent = recentlyWrong,
                repeated = repeatedMistakes,
                weakCount = weakCategoryIds.size,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // ==========================================
        // 3. WRONG PRACTICE MODES BAR
        // ==========================================
        if (totalWrong > 0) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, bottom = 4.dp)
                ) {
                    Text(
                        text = "Practice Modes",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        ),
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
                    )

                    LazyRow(
                        contentPadding = PaddingValues(horizontal = GyanixDimens.screenPadding),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        val modes = listOf(
                            WrongPracticeFilterMode.ALL,
                            WrongPracticeFilterMode.PRACTICE_10,
                            WrongPracticeFilterMode.PRACTICE_25,
                            WrongPracticeFilterMode.WEAK_CATEGORY,
                            WrongPracticeFilterMode.RECENTLY_INCORRECT,
                            WrongPracticeFilterMode.MOST_INCORRECT,
                            WrongPracticeFilterMode.RANDOM
                        )

                        items(modes) { mode ->
                            WrongPracticeModeChip(
                                mode = mode,
                                onClick = {
                                    val count = when (mode) {
                                        WrongPracticeFilterMode.PRACTICE_10 -> 10
                                        WrongPracticeFilterMode.PRACTICE_25 -> 25
                                        else -> totalWrong
                                    }
                                    val questions = GyanixLocalDataManager.getWrongQuestionsForPractice(
                                        mode = mode,
                                        requestedCount = count
                                    )
                                    onStartPracticeSession(questions, "Mistakes Revision (${mode.label})")
                                }
                            )
                        }
                    }
                }
            }

            // ==========================================
            // 4. CATEGORY FILTER CHIPS
            // ==========================================
            if (availableCategories.size > 2) {
                item {
                    LazyRow(
                        modifier = Modifier.padding(vertical = 8.dp),
                        contentPadding = PaddingValues(horizontal = GyanixDimens.screenPadding),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        items(availableCategories) { cat ->
                            FilterChip(
                                selected = selectedCategoryFilter == cat,
                                onClick = { selectedCategoryFilter = cat },
                                label = { Text(cat) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = RoyalBlue600,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }
                }
            }
        }

        // ==========================================
        // 5. QUESTION CARDS OR EMPTY STATE
        // ==========================================
        if (filteredRecords.isEmpty()) {
            item {
                WrongQuestionsEmptyState(
                    onTakeTest = {
                        val sampleQuestions = QuizQuestionDatabase.getSampleQuestions(15)
                        onStartPracticeSession(sampleQuestions, "Daily Practice Session")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = GyanixDimens.screenPadding, vertical = 32.dp)
                )
            }
        } else {
            items(filteredRecords, key = { it.questionId }) { record ->
                val isBookmarked = GyanixLocalDataManager.isBookmarked(record.questionId)

                WrongQuestionCard(
                    record = record,
                    isHindi = isHindiLanguage,
                    isBookmarked = isBookmarked,
                    onToggleBookmark = {
                        GyanixLocalDataManager.toggleBookmark(record.questionId)
                    },
                    onRemove = {
                        GyanixLocalDataManager.removeFromWrongList(record.questionId)
                    },
                    onPracticeSingle = {
                        onStartPracticeSession(listOf(record.question), "Single Question Practice")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
                )
            }
        }
    }
}

/**
 * Summary Statistics Card for Wrong Questions
 */
@Composable
private fun WrongSummaryCard(
    total: Int,
    recent: Int,
    repeated: Int,
    weakCount: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.testTag("wrong_questions_summary_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
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
                        imageVector = Icons.Default.HighlightOff,
                        contentDescription = "Mistakes",
                        tint = ErrorRed,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Mistake Audit Overview",
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                    )
                }

                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = ErrorRed.copy(alpha = 0.15f)
                ) {
                    Text(
                        text = "$total Questions",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = ErrorRed
                        ),
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = MaterialTheme.colorScheme.background.copy(alpha = 0.5f),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(vertical = 8.dp, horizontal = 6.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                SummaryMetricItem(title = "Total Wrong", value = "$total", color = ErrorRed)
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                SummaryMetricItem(title = "Recently Wrong", value = "$recent", color = WarningAmber)
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                SummaryMetricItem(title = "Repeated (2x+)", value = "$repeated", color = PurpleAccent)
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                SummaryMetricItem(title = "Weak Subjects", value = "$weakCount", color = RoyalBlue400)
            }
        }
    }
}

@Composable
private fun SummaryMetricItem(title: String, value: String, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = color))
        Text(text = title, style = MaterialTheme.typography.bodySmall.copy(fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant))
    }
}

/**
 * Wrong Practice Mode Chip
 */
@Composable
private fun WrongPracticeModeChip(
    mode: WrongPracticeFilterMode,
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f),
        border = BorderStroke(1.dp, RoyalBlue400.copy(alpha = 0.35f)),
        modifier = Modifier.testTag("btn_wrong_mode_${mode.name}")
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = mode.label,
                tint = RoyalBlue400,
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Column {
                Text(
                    text = mode.label,
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = mode.description,
                    style = MaterialTheme.typography.bodySmall.copy(
                        fontSize = 9.5.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
        }
    }
}

/**
 * Detailed Wrong Question Card
 */
@Composable
private fun WrongQuestionCard(
    record: WrongQuestionRecord,
    isHindi: Boolean,
    isBookmarked: Boolean,
    onToggleBookmark: () -> Unit,
    onRemove: () -> Unit,
    onPracticeSingle: () -> Unit,
    modifier: Modifier = Modifier
) {
    val q = record.question
    var isExpanded by remember { mutableStateOf(false) }

    val questionText = if (isHindi) q.questionHindi else q.questionEnglish
    val userOptionText = if (isHindi) {
        q.optionsHindi.getOrElse(record.userLastSelectedOption) { "Option ${record.userLastSelectedOption + 1}" }
    } else {
        q.optionsEnglish.getOrElse(record.userLastSelectedOption) { "Option ${record.userLastSelectedOption + 1}" }
    }
    val correctOptionText = if (isHindi) {
        q.optionsHindi.getOrElse(q.correctAnswerIndex) { "Option ${q.correctAnswerIndex + 1}" }
    } else {
        q.optionsEnglish.getOrElse(q.correctAnswerIndex) { "Option ${q.correctAnswerIndex + 1}" }
    }
    val explanationText = if (isHindi) q.explanationHindi else q.explanationEnglish

    Card(
        modifier = modifier.testTag("wrong_question_card_${record.questionId}"),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.35f))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            // Badges Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = RoyalBlue400.copy(alpha = 0.15f)
                    ) {
                        Text(
                            text = q.category,
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = RoyalBlue400,
                                fontSize = 10.5.sp
                            ),
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }

                    if (record.wrongCount > 1) {
                        Surface(
                            shape = RoundedCornerShape(4.dp),
                            color = ErrorRed.copy(alpha = 0.15f)
                        ) {
                            Text(
                                text = "Missed ${record.wrongCount}x",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = ErrorRed,
                                    fontSize = 10.sp
                                ),
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = onToggleBookmark,
                        modifier = Modifier.size(32.dp).testTag("btn_bm_wrong_${record.questionId}")
                    ) {
                        Icon(
                            imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                            contentDescription = "Bookmark",
                            tint = if (isBookmarked) WarningAmber else MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    IconButton(
                        onClick = onRemove,
                        modifier = Modifier.size(32.dp).testTag("btn_remove_wrong_${record.questionId}")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Remove",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Question Text
            Text(
                text = questionText,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            // User's Wrong Answer vs Correct Answer
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                // User Answer (Red)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.HighlightOff,
                        contentDescription = "Your Answer",
                        tint = ErrorRed,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Your Answer: ",
                        style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = ErrorRed, fontSize = 11.sp)
                    )
                    Text(
                        text = userOptionText,
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.5.sp),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }

                // Correct Answer (Green)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Correct Answer",
                        tint = SuccessGreen,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Correct Answer: ",
                        style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = SuccessGreen, fontSize = 11.sp)
                    )
                    Text(
                        text = correctOptionText,
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.5.sp, fontWeight = FontWeight.SemiBold),
                        color = SuccessGreen
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Expandable Solution Explanation
            AnimatedVisibility(visible = isExpanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(RoyalBlue600.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
                        .padding(10.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = "Explanation",
                            tint = RoyalBlue400,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Exam Fact & Solution:",
                            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = RoyalBlue400)
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = explanationText,
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.9f),
                            fontSize = 12.sp,
                            lineHeight = 17.sp
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Card Bottom Actions: Expand Toggle & Practice Single
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(
                    onClick = { isExpanded = !isExpanded },
                    contentPadding = PaddingValues(horizontal = 4.dp, vertical = 0.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = if (isExpanded) "Hide Solution" else "View Solution",
                            style = MaterialTheme.typography.labelSmall.copy(color = RoyalBlue400, fontWeight = FontWeight.Bold)
                        )
                        Icon(
                            imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                            contentDescription = null,
                            tint = RoyalBlue400,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }

                Button(
                    onClick = onPracticeSingle,
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                    modifier = Modifier.testTag("btn_practice_single_${record.questionId}")
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Practice This", fontSize = 11.5.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = "Practice",
                            modifier = Modifier.size(12.dp)
                        )
                    }
                }
            }
        }
    }
}

/**
 * Empty State for Wrong Questions
 */
@Composable
private fun WrongQuestionsEmptyState(
    onTakeTest: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.testTag("wrong_questions_empty_state"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(SuccessGreen.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.SentimentSatisfiedAlt,
                    contentDescription = "Zero Mistakes",
                    tint = SuccessGreen,
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = "No incorrect questions yet.",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Take a Mock Test or Subject Practice session to evaluate your knowledge and track areas needing improvement.",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 12.5.sp,
                    textAlign = TextAlign.Center
                )
            )

            Spacer(modifier = Modifier.height(18.dp))

            Button(
                onClick = onTakeTest,
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                modifier = Modifier.testTag("btn_empty_take_test")
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Start Practice Session", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(6.dp))
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Start",
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }
}
