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
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.FlashOn
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.ui.components.GyanixPrimaryButton
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.data.PracticeRecommendation
import com.example.ui.model.GkCategory
import com.example.ui.model.GkQuestion
import com.example.ui.model.GyanixData
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.theme.DarkNavyBorder
import com.example.ui.theme.DarkNavySurface
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ElectricCyan500
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * Practice Center Screen (Prompt 5)
 * Premium Central Hub for GK Practice:
 * - 4 Primary Practice Modes
 * - Today's Practice & Daily Goal Progress Tracker
 * - Rule-Based Performance Recommendations (Weak Areas <60%, Strong Mastery >=80%)
 * - Advanced Practice Filter Modal (Category, Subtopic, Difficulty, Count, Mode)
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PracticeCenterScreen(
    onStartPracticeSession: (List<GkQuestion>, String) -> Unit,
    onNavigateToTopicPractice: () -> Unit,
    onNavigateToWrongQuestions: () -> Unit,
    onNavigateToBookmarks: () -> Unit,
    onNavigateToCategory: (GkCategory) -> Unit,
    modifier: Modifier = Modifier
) {
    var showGoalEditDialog by remember { mutableStateOf(false) }
    var showFilterBottomSheet by remember { mutableStateOf(false) }

    // Practice Filter State
    var selectedCategoryFilter by remember { mutableStateOf("All") }
    var selectedDifficultyFilter by remember { mutableStateOf("Mixed") }
    var selectedCountFilter by remember { mutableIntStateOf(20) }
    var selectedModeFilter by remember { mutableStateOf("New Questions") }

    val recommendations = remember {
        GyanixLocalDataManager.getPerformanceRecommendations()
    }

    val weakCategories = remember {
        GyanixLocalDataManager.getWeakCategories()
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("practice_center_screen"),
        contentPadding = PaddingValues(bottom = 32.dp)
    ) {
        // ==========================================
        // 1. HEADER & HERO
        // ==========================================
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding)
                    .padding(top = 16.dp, bottom = 12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Practice Center",
                            style = MaterialTheme.typography.headlineMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground
                            ),
                            modifier = Modifier.testTag("practice_center_title")
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Strengthen your weak areas and improve your accuracy.",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    }

                    // Custom Filter Launcher
                    IconButton(
                        onClick = { showFilterBottomSheet = true },
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(RoyalBlue600.copy(alpha = 0.15f))
                            .testTag("btn_open_practice_filter")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Tune,
                            contentDescription = "Custom Filters",
                            tint = RoyalBlue400
                        )
                    }
                }
            }
        }

        // ==========================================
        // 2. TODAY'S PRACTICE & DAILY GOAL CARD
        // ==========================================
        item {
            TodayPracticeGoalCard(
                completed = GyanixLocalDataManager.todayCompletedQuestionsCount,
                target = GyanixLocalDataManager.dailyQuestionTarget,
                accuracy = GyanixLocalDataManager.todayAccuracyPercentage,
                streakDays = GyanixLocalDataManager.currentStreakDays,
                progressFraction = GyanixLocalDataManager.dailyProgressFraction,
                remaining = GyanixLocalDataManager.remainingDailyQuestions,
                onEditGoal = { showGoalEditDialog = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // ==========================================
        // 3. FOUR PRIMARY PRACTICE MODES
        // ==========================================
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp)
            ) {
                Text(
                    text = "Practice Modes",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    ),
                    modifier = Modifier.padding(bottom = 12.dp)
                )

                // Grid 2x2 of primary practice modes
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Mode 1: QUICK PRACTICE (10 Questions)
                    PrimaryModeCard(
                        title = "Quick Practice",
                        subtitle = "10 speed questions",
                        badge = "10 Qs",
                        badgeColor = ElectricCyan400,
                        icon = Icons.Default.FlashOn,
                        iconBg = ElectricCyan400.copy(alpha = 0.15f),
                        onClick = {
                            val questions = QuizQuestionDatabase.getSampleQuestions(10)
                            onStartPracticeSession(questions, "Quick Practice Drill")
                        },
                        modifier = Modifier.weight(1f),
                        testTag = "btn_mode_quick_practice"
                    )

                    // Mode 2: TOPIC PRACTICE
                    PrimaryModeCard(
                        title = "Topic Practice",
                        subtitle = "Subject & subtopics",
                        badge = "10 Subjects",
                        badgeColor = RoyalBlue400,
                        icon = Icons.Default.Category,
                        iconBg = RoyalBlue400.copy(alpha = 0.15f),
                        onClick = onNavigateToTopicPractice,
                        modifier = Modifier.weight(1f),
                        testTag = "btn_mode_topic_practice"
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Mode 3: WEAK AREA PRACTICE
                    val weakCount = weakCategories.size
                    PrimaryModeCard(
                        title = "Weak Area Practice",
                        subtitle = if (weakCount > 0) "$weakCount weak subjects" else "Target < 60% accuracy",
                        badge = "Target Weak",
                        badgeColor = ErrorRed,
                        icon = Icons.Default.Warning,
                        iconBg = ErrorRed.copy(alpha = 0.15f),
                        onClick = {
                            val weakIds = GyanixLocalDataManager.getWeakCategoryIds()
                            val questions = if (weakIds.isNotEmpty()) {
                                QuizQuestionDatabase.getQuestionsByFilter(categoryId = weakIds.first(), count = 15)
                            } else {
                                QuizQuestionDatabase.getQuestionsByFilter(difficulty = "Moderate", count = 15)
                            }
                            onStartPracticeSession(questions, "Weak Areas Revision")
                        },
                        modifier = Modifier.weight(1f),
                        testTag = "btn_mode_weak_practice"
                    )

                    // Mode 4: WRONG QUESTIONS
                    val wrongTotal = GyanixLocalDataManager.wrongQuestionsMap.size
                    PrimaryModeCard(
                        title = "Wrong Questions",
                        subtitle = if (wrongTotal > 0) "$wrongTotal to master" else "Review mistakes",
                        badge = "$wrongTotal Qs",
                        badgeColor = WarningAmber,
                        icon = Icons.Default.Cancel,
                        iconBg = WarningAmber.copy(alpha = 0.15f),
                        onClick = onNavigateToWrongQuestions,
                        modifier = Modifier.weight(1f),
                        testTag = "btn_mode_wrong_questions"
                    )
                }
            }
        }

        // ==========================================
        // 4. QUICK SHORTCUTS (Bookmarks & Custom)
        // ==========================================
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                val bookmarkCount = GyanixLocalDataManager.bookmarkedQuestionIds.size
                Surface(
                    onClick = onNavigateToBookmarks,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("btn_shortcut_bookmarks"),
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Bookmark,
                            contentDescription = "Bookmarks",
                            tint = WarningAmber,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Bookmarks",
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                            )
                            Text(
                                text = "$bookmarkCount saved questions",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 11.sp
                                )
                            )
                        }
                    }
                }

                Surface(
                    onClick = { showFilterBottomSheet = true },
                    modifier = Modifier
                        .weight(1f)
                        .testTag("btn_shortcut_custom_filter"),
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Tune,
                            contentDescription = "Custom Practice",
                            tint = RoyalBlue400,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Custom Drill",
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                            )
                            Text(
                                text = "Filter by difficulty",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 11.sp
                                )
                            )
                        }
                    }
                }
            }
        }

        // ==========================================
        // 5. RULE-BASED RECOMMENDATIONS
        // ==========================================
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 14.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Smart Recommendations",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                    Text(
                        text = "Based on local performance",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp
                        )
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                recommendations.forEach { rec ->
                    RecommendationCard(
                        recommendation = rec,
                        onStart = {
                            val questions = if (rec.categoryId != null) {
                                QuizQuestionDatabase.getQuestionsByFilter(categoryId = rec.categoryId, count = rec.questionCount)
                            } else if (rec.category == "Wrong Questions") {
                                GyanixLocalDataManager.getWrongQuestionsForPractice(requestedCount = rec.questionCount)
                            } else {
                                QuizQuestionDatabase.getSampleQuestions(rec.questionCount)
                            }
                            onStartPracticeSession(questions, rec.title)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    )
                }
            }
        }

        // ==========================================
        // 6. POPULAR GK TOPICS FAST ACCESS
        // ==========================================
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text(
                    text = "Topic-Wise Deep Practice",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    ),
                    modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
                )

                LazyRow(
                    contentPadding = PaddingValues(horizontal = GyanixDimens.screenPadding),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    items(GyanixData.categories) { cat ->
                        TopicQuickChipCard(
                            category = cat,
                            accuracy = GyanixLocalDataManager.getCategoryAccuracy(cat.id),
                            onClick = { onNavigateToCategory(cat) }
                        )
                    }
                }
            }
        }
    }

    // ==========================================
    // DAILY GOAL EDIT DIALOG
    // ==========================================
    if (showGoalEditDialog) {
        DailyGoalDialog(
            currentTarget = GyanixLocalDataManager.dailyQuestionTarget,
            onDismiss = { showGoalEditDialog = false },
            onConfirm = { newTarget ->
                GyanixLocalDataManager.setDailyGoal(newTarget)
                showGoalEditDialog = false
            }
        )
    }

    // ==========================================
    // PRACTICE FILTER BOTTOM SHEET
    // ==========================================
    if (showFilterBottomSheet) {
        PracticeFilterBottomSheet(
            selectedCategory = selectedCategoryFilter,
            onCategoryChange = { selectedCategoryFilter = it },
            selectedDifficulty = selectedDifficultyFilter,
            onDifficultyChange = { selectedDifficultyFilter = it },
            selectedCount = selectedCountFilter,
            onCountChange = { selectedCountFilter = it },
            selectedMode = selectedModeFilter,
            onModeChange = { selectedModeFilter = it },
            onDismiss = { showFilterBottomSheet = false },
            onApply = {
                showFilterBottomSheet = false
                val questions = when (selectedModeFilter) {
                    "Wrong Questions" -> GyanixLocalDataManager.getWrongQuestionsForPractice(
                        categoryFilter = selectedCategoryFilter,
                        requestedCount = selectedCountFilter
                    )
                    "Bookmarked" -> {
                        val bms = GyanixLocalDataManager.getBookmarkedQuestions()
                        if (bms.isNotEmpty()) bms.take(selectedCountFilter) else QuizQuestionDatabase.getSampleQuestions(selectedCountFilter)
                    }
                    else -> QuizQuestionDatabase.getQuestionsByFilter(
                        categoryId = selectedCategoryFilter,
                        difficulty = selectedDifficultyFilter,
                        count = selectedCountFilter
                    )
                }
                val title = if (selectedCategoryFilter != "All") "$selectedCategoryFilter Practice" else "Custom GK Practice"
                onStartPracticeSession(questions, title)
            }
        )
    }
}

/**
 * Today's Practice & Daily Goal Card
 */
@Composable
private fun TodayPracticeGoalCard(
    completed: Int,
    target: Int,
    accuracy: Int,
    streakDays: Int,
    progressFraction: Float,
    remaining: Int,
    onEditGoal: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.testTag("today_practice_goal_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Top Row: Goal Title and Edit button
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.TrackChanges,
                        contentDescription = "Daily Goal",
                        tint = RoyalBlue400,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Daily Goal",
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .clickable { onEditGoal() }
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "$completed / $target Qs",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = RoyalBlue400
                        )
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Change Target",
                        tint = RoyalBlue400,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Animated Progress Bar
            LinearProgressIndicator(
                progress = { progressFraction },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(CircleShape),
                color = if (completed >= target) SuccessGreen else RoyalBlue600,
                trackColor = MaterialTheme.colorScheme.surfaceVariant,
                strokeCap = StrokeCap.Round
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = if (completed >= target) {
                    "🎉 Daily target accomplished! Great work!"
                } else {
                    "$remaining questions remaining to achieve today's goal"
                },
                style = MaterialTheme.typography.bodySmall.copy(
                    color = if (completed >= target) SuccessGreen else MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 11.5.sp
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Stats Sub-row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = MaterialTheme.colorScheme.background.copy(alpha = 0.5f),
                        shape = RoundedCornerShape(GyanixDimens.radiusMd)
                    )
                    .padding(vertical = 10.dp, horizontal = 12.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                StatSubPill(
                    title = "Completed",
                    value = "$completed",
                    color = MaterialTheme.colorScheme.onBackground
                )
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                StatSubPill(
                    title = "Accuracy",
                    value = "$accuracy%",
                    color = if (accuracy >= 80) SuccessGreen else if (accuracy >= 60) RoyalBlue400 else WarningAmber
                )
                Box(modifier = Modifier.width(1.dp).height(20.dp).background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)))
                StatSubPill(
                    title = "Streak",
                    value = "$streakDays Days 🔥",
                    color = WarningAmber
                )
            }
        }
    }
}

@Composable
private fun StatSubPill(
    title: String,
    value: String,
    color: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = value,
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.Bold,
                color = color
            )
        )
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall.copy(
                fontSize = 11.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        )
    }
}

/**
 * 2x2 Primary Mode Card
 */
@Composable
private fun PrimaryModeCard(
    title: String,
    subtitle: String,
    badge: String,
    badgeColor: Color,
    icon: ImageVector,
    iconBg: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    testTag: String = "primary_mode_card"
) {
    Card(
        onClick = onClick,
        modifier = modifier.testTag(testTag),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f)),
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
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(iconBg),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = title,
                        tint = badgeColor,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = badgeColor.copy(alpha = 0.15f)
                ) {
                    Text(
                        text = badge,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = badgeColor,
                            fontSize = 10.sp
                        ),
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 11.5.sp
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

/**
 * Smart Rule-Based Recommendation Card
 */
@Composable
private fun RecommendationCard(
    recommendation: PracticeRecommendation,
    onStart: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.testTag("recommendation_card_${recommendation.id}"),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.35f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f).padding(end = 12.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = recommendation.badgeColor.copy(alpha = 0.15f)
                    ) {
                        Text(
                            text = recommendation.badgeText,
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = recommendation.badgeColor,
                                fontSize = 10.5.sp
                            ),
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "${recommendation.questionCount} Questions",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp
                        )
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = recommendation.title,
                    style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                )

                Text(
                    text = recommendation.subtitle,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.sp
                    )
                )
            }

            Button(
                onClick = onStart,
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Practice", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Start",
                        modifier = Modifier.size(14.dp)
                    )
                }
            }
        }
    }
}

/**
 * Topic Quick Chip Card
 */
@Composable
private fun TopicQuickChipCard(
    category: GkCategory,
    accuracy: Int,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier.width(140.dp),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)),
        border = BorderStroke(1.dp, category.accentColor.copy(alpha = 0.3f))
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .clip(CircleShape)
                    .background(category.accentColor.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = category.icon,
                    contentDescription = category.title,
                    tint = category.accentColor,
                    modifier = Modifier.size(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = category.title,
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = "${category.questionCount} Questions",
                style = MaterialTheme.typography.bodySmall.copy(
                    fontSize = 10.5.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )

            Spacer(modifier = Modifier.height(6.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Acc: $accuracy%",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = if (accuracy >= 80) SuccessGreen else if (accuracy >= 60) RoyalBlue400 else WarningAmber,
                        fontSize = 11.sp
                    )
                )
            }
        }
    }
}

/**
 * Daily Goal Settings Dialog
 */
@Composable
private fun DailyGoalDialog(
    currentTarget: Int,
    onDismiss: () -> Unit,
    onConfirm: (Int) -> Unit
) {
    val presets = listOf(20, 30, 50, 75, 100)
    var selectedTarget by remember { mutableIntStateOf(currentTarget) }

    Dialog(onDismissRequest = onDismiss) {
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
                    text = "Set Daily Question Goal",
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Consistent daily practice improves retention and exam speed.",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.sp
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Presets Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    presets.forEach { targetVal ->
                        val isSelected = selectedTarget == targetVal
                        Surface(
                            onClick = { selectedTarget = targetVal },
                            shape = RoundedCornerShape(8.dp),
                            color = if (isSelected) RoyalBlue600 else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                            border = BorderStroke(
                                1.dp,
                                if (isSelected) RoyalBlue400 else MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)
                            ),
                            modifier = Modifier.padding(horizontal = 2.dp)
                        ) {
                            Text(
                                text = "$targetVal Qs",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface
                                ),
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onDismiss) {
                        Text("Cancel")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = { onConfirm(selectedTarget) },
                        colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600)
                    ) {
                        Text("Save Target")
                    }
                }
            }
        }
    }
}

/**
 * Practice Filter Bottom Sheet (Category, Difficulty, Count, Mode)
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PracticeFilterBottomSheet(
    selectedCategory: String,
    onCategoryChange: (String) -> Unit,
    selectedDifficulty: String,
    onDifficultyChange: (String) -> Unit,
    selectedCount: Int,
    onCountChange: (Int) -> Unit,
    selectedMode: String,
    onModeChange: (String) -> Unit,
    onDismiss: () -> Unit,
    onApply: () -> Unit
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    val categories = listOf("All") + GyanixData.categories.map { it.title }
    val difficulties = listOf("Mixed", "Easy", "Moderate", "Hard")
    val counts = listOf(10, 20, 25, 50)
    val modes = listOf("New Questions", "Previously Attempted", "Wrong Questions", "Bookmarked")

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(bottom = 32.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Custom Practice Filters",
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                )
                IconButton(onClick = onDismiss) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // 1. Question Count
            Text(
                text = "Question Count",
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                counts.forEach { count ->
                    FilterChip(
                        selected = selectedCount == count,
                        onClick = { onCountChange(count) },
                        label = { Text("$count Qs") },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = RoyalBlue600,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // 2. Difficulty
            Text(
                text = "Difficulty Level",
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                difficulties.forEach { diff ->
                    FilterChip(
                        selected = selectedDifficulty == diff,
                        onClick = { onDifficultyChange(diff) },
                        label = { Text(diff) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = RoyalBlue600,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // 3. Question Mode
            Text(
                text = "Question Source",
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(6.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(modes) { mode ->
                    FilterChip(
                        selected = selectedMode == mode,
                        onClick = { onModeChange(mode) },
                        label = { Text(mode) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = RoyalBlue600,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // 4. Category
            Text(
                text = "GK Category",
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(6.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(categories) { cat ->
                    FilterChip(
                        selected = selectedCategory == cat,
                        onClick = { onCategoryChange(cat) },
                        label = { Text(cat) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = RoyalBlue600,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Apply Button
            GyanixPrimaryButton(
                text = "Start Practice Session ($selectedCount Qs)",
                onClick = onApply,
                modifier = Modifier.fillMaxWidth(),
                icon = Icons.Default.PlayArrow,
                testTag = "btn_apply_practice_filters"
            )
        }
    }
}
