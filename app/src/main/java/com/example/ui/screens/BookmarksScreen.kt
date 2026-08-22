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
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Translate
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
import com.example.ui.data.BookmarkRecord
import com.example.ui.data.GyanixLocalDataManager
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
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Bookmarks Screen (Prompt 5)
 * Dedicated screen for saved high-yield questions:
 * - Header: "Bookmarks"
 * - Stats: Total Bookmarked, Categories count, Difficulty distribution (Easy, Moderate, Hard)
 * - Category Filters: All, Indian History, Polity, Geography, Science, Economy, World GK, Sports, Art & Culture, Static GK, Rajasthan GK
 * - Difficulty Filters: All, Easy, Moderate, Hard
 * - Bookmark Cards: Question, Category, Subtopic, Difficulty, Saved Date, Bookmark active icon
 * - Actions: Practice, Remove Bookmark, View Explanation
 * - Centralized local bookmark state sync
 */
@Composable
fun BookmarksScreen(
    onNavigateBack: () -> Unit,
    onStartPracticeSession: (List<GkQuestion>, String) -> Unit,
    modifier: Modifier = Modifier
) {
    var isHindiLanguage by remember { mutableStateOf(false) }
    var selectedCategoryFilter by remember { mutableStateOf("All") }
    var selectedDifficultyFilter by remember { mutableStateOf("All") }

    val allBookmarks = GyanixLocalDataManager.getBookmarkedRecords()
    val totalBookmarks = allBookmarks.size
    val categoriesCovered = allBookmarks.map { it.question.category }.distinct().size
    val easyCount = allBookmarks.count { it.question.difficulty.equals("Easy", ignoreCase = true) }
    val moderateCount = allBookmarks.count { it.question.difficulty.equals("Moderate", ignoreCase = true) }
    val hardCount = allBookmarks.count { it.question.difficulty.equals("Hard", ignoreCase = true) }

    val categoryFilters = listOf(
        "All",
        "Indian History",
        "Indian Polity & Constitution",
        "Indian Geography",
        "General Science",
        "Indian Economy",
        "World GK",
        "Sports & Games",
        "Art & Culture",
        "Static GK",
        "Rajasthan GK"
    )

    val difficultyFilters = listOf("All", "Easy", "Moderate", "Hard")

    val filteredBookmarks = remember(allBookmarks, selectedCategoryFilter, selectedDifficultyFilter) {
        allBookmarks.filter { record ->
            val matchesCategory = if (selectedCategoryFilter == "All") true else {
                record.question.category.equals(selectedCategoryFilter, ignoreCase = true) ||
                        record.question.category.contains(selectedCategoryFilter, ignoreCase = true) ||
                        selectedCategoryFilter.contains(record.question.category, ignoreCase = true)
            }
            val matchesDifficulty = if (selectedDifficultyFilter == "All") true else {
                record.question.difficulty.equals(selectedDifficultyFilter, ignoreCase = true)
            }
            matchesCategory && matchesDifficulty
        }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("bookmarks_screen"),
        contentPadding = PaddingValues(bottom = 36.dp)
    ) {
        // ==========================================
        // 1. TOP APP BAR
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
                                .testTag("btn_bookmarks_back")
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
                                text = "Bookmarks",
                                style = MaterialTheme.typography.titleLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                                ),
                                modifier = Modifier.testTag("bookmarks_header")
                            )
                            Text(
                                text = "Saved questions for high-yield revision",
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
                        modifier = Modifier.testTag("btn_toggle_language_bookmarks_screen")
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
        // 2. STATS & DISTRIBUTION CARD
        // ==========================================
        item {
            BookmarkSummaryCard(
                total = totalBookmarks,
                categoriesCount = categoriesCovered,
                easy = easyCount,
                moderate = moderateCount,
                hard = hardCount,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // ==========================================
        // 3. ACTION BAR & FILTERS
        // ==========================================
        if (totalBookmarks > 0) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    // Practice All Bookmarked CTA Button
                    if (filteredBookmarks.isNotEmpty()) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Showing ${filteredBookmarks.size} Questions",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 11.5.sp
                                )
                            )

                            Button(
                                onClick = {
                                    val questions = filteredBookmarks.map { it.question }
                                    onStartPracticeSession(questions, "Bookmarked Questions Practice")
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                                shape = RoundedCornerShape(8.dp),
                                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                                modifier = Modifier.testTag("btn_practice_all_bookmarks")
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text("Practice All (${filteredBookmarks.size})", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null, modifier = Modifier.size(14.dp))
                                }
                            }
                        }
                    }

                    // Category Filter Row
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = GyanixDimens.screenPadding),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        items(categoryFilters) { cat ->
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

                    // Difficulty Filter Row
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = GyanixDimens.screenPadding),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
                    ) {
                        items(difficultyFilters) { diff ->
                            FilterChip(
                                selected = selectedDifficultyFilter == diff,
                                onClick = { selectedDifficultyFilter = diff },
                                label = { Text(diff) },
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
        // 4. BOOKMARK CARDS OR EMPTY STATE
        // ==========================================
        if (filteredBookmarks.isEmpty()) {
            item {
                BookmarksEmptyState(
                    onExplore = {
                        val questions = QuizQuestionDatabase.getSampleQuestions(15)
                        onStartPracticeSession(questions, "GK Explorer Practice")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = GyanixDimens.screenPadding, vertical = 32.dp)
                )
            }
        } else {
            items(filteredBookmarks, key = { it.questionId }) { record ->
                BookmarkCard(
                    record = record,
                    isHindi = isHindiLanguage,
                    onRemove = {
                        GyanixLocalDataManager.removeBookmark(record.questionId)
                    },
                    onPractice = {
                        onStartPracticeSession(listOf(record.question), "Bookmarked Question Practice")
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
 * Summary Statistics Card for Bookmarks
 */
@Composable
private fun BookmarkSummaryCard(
    total: Int,
    categoriesCount: Int,
    easy: Int,
    moderate: Int,
    hard: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.testTag("bookmark_summary_card"),
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
                        imageVector = Icons.Default.Bookmark,
                        contentDescription = "Bookmarks",
                        tint = WarningAmber,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Saved Knowledge Vault",
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                    )
                }

                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = WarningAmber.copy(alpha = 0.15f)
                ) {
                    Text(
                        text = "$total Saved",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = WarningAmber
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
                BookmarkMetricSubItem(title = "Total", value = "$total", color = WarningAmber)
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                BookmarkMetricSubItem(title = "Categories", value = "$categoriesCount", color = RoyalBlue400)
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                BookmarkMetricSubItem(title = "Easy", value = "$easy", color = SuccessGreen)
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                BookmarkMetricSubItem(title = "Moderate", value = "$moderate", color = ElectricCyan400)
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                BookmarkMetricSubItem(title = "Hard", value = "$hard", color = ErrorRed)
            }
        }
    }
}

@Composable
private fun BookmarkMetricSubItem(title: String, value: String, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = color, fontSize = 14.sp))
        Text(text = title, style = MaterialTheme.typography.bodySmall.copy(fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant))
    }
}

/**
 * Individual Bookmark Card
 */
@Composable
private fun BookmarkCard(
    record: BookmarkRecord,
    isHindi: Boolean,
    onRemove: () -> Unit,
    onPractice: () -> Unit,
    modifier: Modifier = Modifier
) {
    val q = record.question
    var isExpanded by remember { mutableStateOf(false) }

    val questionText = if (isHindi) q.questionHindi else q.questionEnglish
    val explanationText = if (isHindi) q.explanationHindi else q.explanationEnglish
    val correctOptionText = if (isHindi) {
        q.optionsHindi.getOrElse(q.correctAnswerIndex) { "Option ${q.correctAnswerIndex + 1}" }
    } else {
        q.optionsEnglish.getOrElse(q.correctAnswerIndex) { "Option ${q.correctAnswerIndex + 1}" }
    }

    val dateFormatted = remember(record.savedTimestamp) {
        SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Date(record.savedTimestamp))
    }

    Card(
        modifier = modifier.testTag("bookmark_card_${record.questionId}"),
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

                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f)
                    ) {
                        Text(
                            text = q.difficulty,
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 10.sp
                            ),
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }

                    Text(
                        text = "Saved $dateFormatted",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 10.sp
                        )
                    )
                }

                IconButton(
                    onClick = onRemove,
                    modifier = Modifier.size(32.dp).testTag("btn_remove_bm_${record.questionId}")
                ) {
                    Icon(
                        imageVector = Icons.Default.Bookmark,
                        contentDescription = "Remove Bookmark",
                        tint = WarningAmber,
                        modifier = Modifier.size(20.dp)
                    )
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

            Spacer(modifier = Modifier.height(8.dp))

            // Subtopic Label
            Text(
                text = "Topic: ${q.subtopic}",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 11.sp
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Correct Answer Tag
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(SuccessGreen.copy(alpha = 0.1f), RoundedCornerShape(6.dp))
                    .padding(horizontal = 10.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "Correct Answer",
                    tint = SuccessGreen,
                    modifier = Modifier.size(14.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Answer: $correctOptionText",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = SuccessGreen,
                        fontSize = 11.5.sp
                    )
                )
            }

            // Expandable Solution Explanation
            AnimatedVisibility(visible = isExpanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
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
                            text = "Concept Breakdown & Key Facts:",
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

            // Bottom Actions: View Explanation, Practice
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
                            text = if (isExpanded) "Hide Explanation" else "View Explanation",
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

                Row(verticalAlignment = Alignment.CenterVertically) {
                    OutlinedButton(
                        onClick = onRemove,
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)),
                        modifier = Modifier.padding(end = 6.dp)
                    ) {
                        Text("Remove", fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }

                    Button(
                        onClick = onPractice,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                        modifier = Modifier.testTag("btn_practice_bm_${record.questionId}")
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Practice", fontSize = 11.5.sp, fontWeight = FontWeight.Bold)
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
}

/**
 * Empty State for Bookmarks
 */
@Composable
private fun BookmarksEmptyState(
    onExplore: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.testTag("bookmarks_empty_state"),
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
                    .background(WarningAmber.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.BookmarkBorder,
                    contentDescription = "No Bookmarks",
                    tint = WarningAmber,
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = "No bookmarked questions yet.",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Browse questions during quiz or practice sessions and tap the bookmark icon to save key concepts for quick revision.",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 12.5.sp,
                    textAlign = TextAlign.Center
                )
            )

            Spacer(modifier = Modifier.height(18.dp))

            Button(
                onClick = onExplore,
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                modifier = Modifier.testTag("btn_empty_explore_bookmarks")
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Explore Practice Questions", fontWeight = FontWeight.Bold)
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
