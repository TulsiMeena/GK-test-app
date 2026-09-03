package com.example.ui.screens

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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AssignmentTurnedIn
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixCategoryCard
import com.example.ui.components.GyanixLogo
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.components.GyanixStatisticCard
import com.example.ui.components.LogoVariant
import com.example.ui.model.GkCategory
import com.example.ui.model.GyanixData
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.HeroGradientDark
import com.example.ui.theme.HeroGradientLight
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.RoyalBlue700
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

@Composable
fun HomeScreen(
    isDarkTheme: Boolean,
    onToggleTheme: () -> Unit,
    onNavigateToQuiz: () -> Unit,
    onNavigateToCategory: (GkCategory) -> Unit,
    onNavigateToCategoriesList: () -> Unit,
    onNavigateToPracticeSelection: () -> Unit,
    onNavigateToTests: () -> Unit,
    onNavigateToSearch: () -> Unit,
    onNavigateToProfile: () -> Unit,
    onNavigateToNotifications: () -> Unit = {},
    onNavigateToWrongQuestions: () -> Unit = onNavigateToPracticeSelection,
    onNavigateToBookmarks: () -> Unit = onNavigateToPracticeSelection,
    onOpenDesignSystem: () -> Unit,
    userName: String = "Aspirant",
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("home_screen_content"),
        contentPadding = PaddingValues(bottom = 96.dp)
    ) {
        // 1. Top App Header Bar with Logo, Greeting, Search, Notification, Profile
        item {
            HomeTopHeader(
                userName = userName,
                isDarkTheme = isDarkTheme,
                onToggleTheme = onToggleTheme,
                onSearchClick = onNavigateToSearch,
                onNotificationsClick = onNavigateToNotifications,
                onProfileClick = onNavigateToProfile
            )
        }

        // 2. Main Hero Section: "Ready to test your knowledge?"
        item {
            HomeHeroBanner(
                isDarkTheme = isDarkTheme,
                onStartPractice = onNavigateToPracticeSelection,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // 3. Continue In-Progress Test Card
        item {
            HomeContinueTestCard(
                onResumeTest = onNavigateToQuiz,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // 4. Statistics Grid (4 Key Metrics)
        item {
            HomeQuickStatsSection(
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // 5. Quick Actions Hub (Practice, Mock Test, Mistakes, Bookmarks)
        item {
            HomeQuickActionsHub(
                onPracticeClick = onNavigateToPracticeSelection,
                onMockTestClick = onNavigateToTests,
                onMistakesClick = onNavigateToWrongQuestions,
                onBookmarksClick = onNavigateToBookmarks,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // 6. 10 GK Categories Section Header & List
        item {
            GyanixSectionHeader(
                title = "GK Categories (10)",
                actionText = "Explore All",
                onActionClick = onNavigateToCategoriesList,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
            )
        }

        // 7. All 10 Category Cards
        items(GyanixData.categories, key = { it.id }) { category ->
            GyanixCategoryCard(
                category = category,
                onClick = { onNavigateToCategory(category) },
                onStartClick = { onNavigateToCategory(category) },
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // 8. Design System Explorer Banner
        item {
            DesignSystemExploreBanner(
                onClick = onOpenDesignSystem,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 14.dp)
            )
        }
    }
}

@Composable
private fun HomeTopHeader(
    userName: String,
    isDarkTheme: Boolean,
    onToggleTheme: () -> Unit,
    onSearchClick: () -> Unit,
    onNotificationsClick: () -> Unit,
    onProfileClick: () -> Unit
) {
    val initials = remember(userName) {
        val parts = userName.trim().split("\\s+".toRegex()).filter { it.isNotEmpty() }
        when {
            parts.size >= 2 -> "${parts[0].firstOrNull() ?: 'G'}${parts[1].firstOrNull() ?: 'X'}".uppercase()
            parts.isNotEmpty() && parts[0].isNotEmpty() -> parts[0].take(2).uppercase()
            else -> "GX"
        }
    }

    val unreadCount = com.example.services.GyanixNotificationService.unreadCount

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = GyanixDimens.screenPadding, vertical = 10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Brand Logo
            GyanixLogo(
                variant = LogoVariant.HORIZONTAL,
                size = 32.dp,
                showTagline = true,
                isDarkTheme = isDarkTheme
            )

            // Actions: Search + Theme Toggle + Notification + Profile
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Search Trigger
                IconButton(
                    onClick = onSearchClick,
                    modifier = Modifier
                        .size(38.dp)
                        .background(MaterialTheme.colorScheme.surfaceVariant, CircleShape)
                        .testTag("btn_home_search")
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search GK",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Theme Toggle
                IconButton(
                    onClick = onToggleTheme,
                    modifier = Modifier
                        .size(38.dp)
                        .background(MaterialTheme.colorScheme.surfaceVariant, CircleShape)
                        .testTag("btn_theme_toggle")
                ) {
                    Icon(
                        imageVector = if (isDarkTheme) Icons.Default.LightMode else Icons.Default.DarkMode,
                        contentDescription = "Toggle Theme",
                        tint = if (isDarkTheme) WarningAmber else RoyalBlue600,
                        modifier = Modifier.size(18.dp)
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Notifications with unread badge and click action
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .background(MaterialTheme.colorScheme.surfaceVariant, CircleShape)
                        .clickable(onClick = onNotificationsClick)
                        .testTag("btn_home_notifications"),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                    if (unreadCount > 0) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .background(Color(0xFFEF4444), CircleShape)
                                .align(Alignment.TopEnd)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                // User Avatar Profile with dynamic initials
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .background(RoyalBlue600, CircleShape)
                        .clickable(onClick = onProfileClick)
                        .testTag("btn_home_profile"),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = initials,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(6.dp))

        // Dynamic Greeting Subheader with User Name
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Welcome, $userName 👋",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
                Text(
                    text = "Daily Target: Complete ${com.example.ui.data.GyanixLocalDataManager.dailyQuestionTarget} GK MCQs today",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
            GyanixBadge(
                text = "UPSC / SSC / PSC",
                backgroundColor = RoyalBlue600.copy(alpha = 0.15f),
                textColor = RoyalBlue400
            )
        }
    }
}

@Composable
private fun HomeHeroBanner(
    isDarkTheme: Boolean,
    onStartPractice: () -> Unit,
    modifier: Modifier = Modifier
) {
    val gradient = if (isDarkTheme) HeroGradientDark else HeroGradientLight
    val streakDays = com.example.ui.data.GyanixLocalDataManager.currentStreakDays
    val completedToday = com.example.ui.data.GyanixLocalDataManager.todayCompletedQuestionsCount
    val target = com.example.ui.data.GyanixLocalDataManager.dailyQuestionTarget
    val targetFraction = com.example.ui.data.GyanixLocalDataManager.dailyProgressFraction
    val targetPercentage = (targetFraction * 100).toInt()

    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("home_hero_banner"),
        shape = RoundedCornerShape(GyanixDimens.radiusXl),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        border = BorderStroke(1.dp, if (isDarkTheme) RoyalBlue700.copy(alpha = 0.5f) else RoyalBlue400.copy(alpha = 0.3f))
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(20.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    GyanixBadge(
                        text = "DAILY GK DRILL",
                        backgroundColor = ElectricCyan400.copy(alpha = 0.2f),
                        textColor = ElectricCyan400,
                        icon = Icons.Default.AutoAwesome
                    )

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.LocalFireDepartment,
                            contentDescription = null,
                            tint = WarningAmber,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = if (streakDays > 0) "$streakDays Day Streak" else "Start Streak",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = WarningAmber,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Ready to test your knowledge?",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        lineHeight = 28.sp
                    )
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Target high-yield MCQs from Indian History, Polity, Geography & Science designed for competitive exams.",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = Color.White.copy(alpha = 0.88f)
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = onStartPractice,
                        shape = RoundedCornerShape(GyanixDimens.radiusMd),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = ElectricCyan400,
                            contentColor = DarkNavySurfaceElevated
                        ),
                        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp),
                        modifier = Modifier.testTag("btn_hero_start_practice")
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = null,
                                tint = Color(0xFF0F172A),
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Start Practice",
                                style = MaterialTheme.typography.labelLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF0F172A)
                                )
                            )
                        }
                    }

                    // Daily Target Ring (Dynamic)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(
                                progress = { targetFraction },
                                modifier = Modifier.size(38.dp),
                                color = ElectricCyan400,
                                trackColor = Color.White.copy(alpha = 0.2f),
                                strokeWidth = 3.8.dp
                            )
                            Text(
                                text = "$targetPercentage%",
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            Text(
                                text = "Today's Target",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = Color.White.copy(alpha = 0.75f),
                                    fontSize = 10.sp
                                )
                            )
                            Text(
                                text = "$completedToday/$target Done",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
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
private fun HomeContinueTestCard(
    onResumeTest: () -> Unit,
    modifier: Modifier = Modifier
) {
    val history = com.example.ui.data.GyanixLocalDataManager.testHistoryList
    val latestTest = history.firstOrNull()

    Card(
        onClick = onResumeTest,
        modifier = modifier
            .fillMaxWidth()
            .testTag("card_continue_test"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, RoyalBlue500.copy(alpha = 0.4f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    GyanixBadge(
                        text = if (latestTest != null) "RECENT TEST" else "GET STARTED",
                        backgroundColor = if (latestTest != null) WarningAmber.copy(alpha = 0.15f) else ElectricCyan400.copy(alpha = 0.15f),
                        textColor = if (latestTest != null) WarningAmber else ElectricCyan400
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = if (latestTest != null) "${latestTest.accuracyPercentage}% Accuracy" else "15 Practice MCQs",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = latestTest?.testTitle ?: "Full GK Championship Mock #01",
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    ),
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(6.dp))

                LinearProgressIndicator(
                    progress = { if (latestTest != null) (latestTest.accuracyPercentage / 100f).coerceIn(0f, 1f) else 0f },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(5.dp)
                        .clip(RoundedCornerShape(2.5.dp)),
                    color = ElectricCyan400,
                    trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.4f),
                    strokeCap = StrokeCap.Round
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = onResumeTest,
                colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                shape = RoundedCornerShape(GyanixDimens.radiusSm),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp)
            ) {
                Text(
                    text = if (latestTest != null) "Retake" else "Start",
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
        }
    }
}

@Composable
private fun HomeQuickStatsSection(modifier: Modifier = Modifier) {
    val totalAttempted = com.example.ui.data.GyanixLocalDataManager.totalQuestionsAttempted
    val totalTests = com.example.ui.data.GyanixLocalDataManager.totalTestsCompleted
    val accuracy = com.example.ui.data.GyanixLocalDataManager.overallAccuracyPercentage
    val streak = com.example.ui.data.GyanixLocalDataManager.currentStreakDays
    val longestStreak = com.example.ui.data.GyanixLocalDataManager.longestStreakDays
    val todayCompleted = com.example.ui.data.GyanixLocalDataManager.todayCompletedQuestionsCount

    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            GyanixStatisticCard(
                value = "$totalAttempted",
                label = "Questions Attempted",
                icon = Icons.Default.Quiz,
                accentColor = RoyalBlue400,
                subtitle = if (todayCompleted > 0) "+$todayCompleted Today" else "Ready to start",
                modifier = Modifier.weight(1f)
            )
            GyanixStatisticCard(
                value = "$totalTests",
                label = "Tests Completed",
                icon = Icons.Default.AssignmentTurnedIn,
                accentColor = ElectricCyan400,
                subtitle = if (totalTests > 0) "Completed" else "No tests yet",
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            GyanixStatisticCard(
                value = "$accuracy%",
                label = "Overall Accuracy",
                icon = Icons.Default.TrackChanges,
                accentColor = SuccessGreen,
                subtitle = if (totalAttempted > 0) "Active Accuracy" else "New Aspirant",
                modifier = Modifier.weight(1f)
            )
            GyanixStatisticCard(
                value = "$streak Days",
                label = "Current Streak",
                icon = Icons.Default.LocalFireDepartment,
                accentColor = WarningAmber,
                subtitle = if (longestStreak > 0) "Best Record: ${longestStreak}d" else "Start today",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun HomeQuickActionsHub(
    onPracticeClick: () -> Unit,
    onMockTestClick: () -> Unit,
    onMistakesClick: () -> Unit,
    onBookmarksClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        GyanixSectionHeader(title = "Quick Prep Actions")

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            QuickActionTile(
                title = "Practice",
                icon = Icons.Default.Psychology,
                color = RoyalBlue400,
                onClick = onPracticeClick,
                modifier = Modifier.weight(1f)
            )
            QuickActionTile(
                title = "Mock Test",
                icon = Icons.Default.Quiz,
                color = ElectricCyan400,
                onClick = onMockTestClick,
                modifier = Modifier.weight(1f)
            )
            QuickActionTile(
                title = "Mistakes",
                icon = Icons.Default.Warning,
                color = WarningAmber,
                onClick = onMistakesClick,
                badge = "24",
                modifier = Modifier.weight(1f)
            )
            QuickActionTile(
                title = "Bookmarks",
                icon = Icons.Default.BookmarkBorder,
                color = SuccessGreen,
                onClick = onBookmarksClick,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun QuickActionTile(
    title: String,
    icon: ImageVector,
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    badge: String? = null
) {
    Card(
        onClick = onClick,
        modifier = modifier.testTag("quick_action_$title"),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .background(color.copy(alpha = 0.15f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = color,
                        modifier = Modifier.size(20.dp)
                    )
                }
                if (badge != null) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .background(Color(0xFFEF4444), CircleShape)
                            .padding(horizontal = 4.dp, vertical = 1.dp)
                    ) {
                        Text(
                            text = badge,
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = title,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                maxLines = 1
            )
        }
    }
}

@Composable
private fun DesignSystemExploreBanner(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .testTag("banner_design_system"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, RoyalBlue500.copy(alpha = 0.4f))
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(RoyalBlue600.copy(alpha = 0.2f), RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.AutoAwesome,
                    contentDescription = null,
                    tint = ElectricCyan400,
                    modifier = Modifier.size(22.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "GYANIX Design System Explorer",
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
                Text(
                    text = "Preview typography, color palette, badges & UI tokens",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }

            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = null,
                tint = RoyalBlue400,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}
