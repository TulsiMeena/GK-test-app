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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.material.icons.filled.Vibration
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import com.example.ui.components.GyanixAchievementCard
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.components.GyanixStatisticCard
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.model.AchievementBadge
import com.example.ui.model.GyanixData
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.RestartAlt
import androidx.compose.material.icons.filled.LockReset

/**
 * Profile & Progress Screen (Prompt 7)
 * Comprehensive Progress Analytics, Category Mastery across all 10 subjects,
 * Streak & Goal Tracking, App Preferences & Profile configuration.
 */
@Composable
fun ProfileProgressScreen(
    isDarkTheme: Boolean,
    onToggleTheme: () -> Unit,
    initialTab: String = "progress",
    userName: String = "Aspirant",
    userEmail: String = "aspirant@gyanix.app",
    onSignOut: () -> Unit = {},
    onResetOnboarding: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableIntStateOf(if (initialTab == "profile") 1 else 0) }
    var hindiLanguageEnabled by remember { mutableStateOf(true) }
    var soundEffectsEnabled by remember { mutableStateOf(true) }
    var hapticsEnabled by remember { mutableStateOf(true) }
    var timerPreference by remember { mutableStateOf("Standard (1 min/Q)") }
    var negativeMarkingPref by remember { mutableStateOf("0.25 (1/4th)") }
    var showResetDialog by remember { mutableStateOf(false) }
    var showSignOutDialog by remember { mutableStateOf(false) }
    var showResetOnboardingDialog by remember { mutableStateOf(false) }

    // Live Stats from Data Manager
    val totalAttempts = GyanixLocalDataManager.todayCompletedQuestionsCount + (GyanixLocalDataManager.testHistoryList.sumOf { it.questionCount })
    val testsCount = GyanixLocalDataManager.testHistoryList.size
    val avgAccuracy = if (testsCount > 0) {
        GyanixLocalDataManager.testHistoryList.map { it.accuracyPercentage }.average().toInt()
    } else {
        GyanixLocalDataManager.todayAccuracyPercentage
    }
    val bestScore = GyanixLocalDataManager.testHistoryList.maxOfOrNull { it.score } ?: 0f
    val currentStreak = GyanixLocalDataManager.currentStreakDays
    val longestStreak = GyanixLocalDataManager.longestStreakDays
    val todayQuestions = GyanixLocalDataManager.todayCompletedQuestionsCount
    val dailyGoal = GyanixLocalDataManager.dailyQuestionTarget

    val badges = remember(totalAttempts, testsCount, avgAccuracy, bestScore, currentStreak) {
        listOf(
            AchievementBadge(
                id = "badge_1",
                name = "Polity Master",
                description = "Scored 90%+ in 5 consecutive Indian Polity tests",
                icon = Icons.Default.EmojiEvents,
                isUnlocked = testsCount >= 5 && avgAccuracy >= 90,
                unlockedDate = if (testsCount >= 5 && avgAccuracy >= 90) "Unlocked" else null
            ),
            AchievementBadge(
                id = "badge_2",
                name = "Active Streak Warrior",
                description = "Practiced daily GK tests for 3+ days without break",
                icon = Icons.Default.LocalFireDepartment,
                isUnlocked = currentStreak >= 3,
                unlockedDate = if (currentStreak >= 3) "Active" else null
            ),
            AchievementBadge(
                id = "badge_3",
                name = "Centurion Scholar",
                description = "Attempted 100+ total GK questions",
                icon = Icons.Default.Star,
                isUnlocked = totalAttempts >= 100,
                unlockedDate = if (totalAttempts >= 100) "Unlocked" else null
            ),
            AchievementBadge(
                id = "badge_4",
                name = "Speed Demon",
                description = "Solved 25 questions under 15 minutes with 85%+ accuracy",
                icon = Icons.Default.Speed,
                isUnlocked = testsCount >= 1 && avgAccuracy >= 85,
                unlockedDate = if (testsCount >= 1 && avgAccuracy >= 85) "Unlocked" else null
            ),
            AchievementBadge(
                id = "badge_5",
                name = "All India Rank #1",
                description = "Score 95%+ in a Full Length Mock Exam",
                icon = Icons.Default.AutoAwesome,
                isUnlocked = bestScore >= 95f,
                unlockedDate = if (bestScore >= 95f) "Top Ranked" else null
            )
        )
    }

    if (showResetDialog) {
        AlertDialog(
            onDismissRequest = { showResetDialog = false },
            title = {
                Text(
                    text = "Reset Test History?",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
            },
            text = {
                Text(
                    text = "This will reset your local attempt counters and clear test history. Your saved bookmarks will remain intact.",
                    style = MaterialTheme.typography.bodyMedium
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        GyanixLocalDataManager.clearTestHistory()
                        showResetDialog = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = ErrorRed)
                ) {
                    Text("Reset")
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }

    if (showSignOutDialog) {
        AlertDialog(
            onDismissRequest = { showSignOutDialog = false },
            title = {
                Text(
                    text = "Sign Out?",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
            },
            text = {
                Text(
                    text = "Are you sure you want to sign out from your GYANIX account?",
                    style = MaterialTheme.typography.bodyMedium
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        showSignOutDialog = false
                        onSignOut()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600)
                ) {
                    Text("Sign Out")
                }
            },
            dismissButton = {
                TextButton(onClick = { showSignOutDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }

    if (showResetOnboardingDialog) {
        AlertDialog(
            onDismissRequest = { showResetOnboardingDialog = false },
            title = {
                Text(
                    text = "Restart Onboarding Flow?",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
            },
            text = {
                Text(
                    text = "This will reset your local onboarding state and re-open the Splash & 3 Onboarding screens for testing.",
                    style = MaterialTheme.typography.bodyMedium
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        showResetOnboardingDialog = false
                        onResetOnboarding()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600)
                ) {
                    Text("Restart Flow")
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetOnboardingDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("profile_progress_screen")
    ) {
        // Top Navigation Tabs: Progress vs Profile
        TabRow(
            selectedTabIndex = selectedTab,
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = RoyalBlue600,
            indicator = { tabPositions ->
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTab]),
                    color = RoyalBlue600,
                    height = 3.dp
                )
            }
        ) {
            Tab(
                selected = selectedTab == 0,
                onClick = { selectedTab = 0 },
                text = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.TrackChanges,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Analytics & Progress",
                            fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                },
                modifier = Modifier.testTag("tab_progress")
            )
            Tab(
                selected = selectedTab == 1,
                onClick = { selectedTab = 1 },
                text = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Profile & Settings",
                            fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                },
                modifier = Modifier.testTag("tab_profile")
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 96.dp)
        ) {
            if (selectedTab == 0) {
                // =========================================================================
                // TAB 1: PROGRESS & ANALYTICS
                // =========================================================================
                item {
                    DailyGoalCard(
                        todayCount = todayQuestions,
                        targetCount = dailyGoal,
                        currentStreak = currentStreak,
                        longestStreak = longestStreak,
                        onUpdateGoal = { newGoal ->
                            GyanixLocalDataManager.setDailyGoal(newGoal)
                        },
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp)
                    )
                }

                item {
                    GyanixSectionHeader(
                        title = "Overall Performance Overview",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
                    )
                }

                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            GyanixStatisticCard(
                                value = "$totalAttempts",
                                label = "Questions Attempted",
                                icon = Icons.Default.Psychology,
                                accentColor = RoyalBlue400,
                                modifier = Modifier.weight(1f)
                            )
                            GyanixStatisticCard(
                                value = "$avgAccuracy%",
                                label = "Avg Accuracy",
                                icon = Icons.Default.TrackChanges,
                                accentColor = SuccessGreen,
                                modifier = Modifier.weight(1f)
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            GyanixStatisticCard(
                                value = "$testsCount",
                                label = "Mock Tests",
                                icon = Icons.Default.Assignment,
                                accentColor = ElectricCyan400,
                                modifier = Modifier.weight(1f)
                            )
                            GyanixStatisticCard(
                                value = String.format("%.1f", bestScore),
                                label = "Best Score",
                                icon = Icons.Default.EmojiEvents,
                                accentColor = WarningAmber,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }

                // 10 GK Category Performance Breakdown
                item {
                    GyanixSectionHeader(
                        title = "Category Mastery (10 Subjects)",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 10.dp)
                    )
                }

                items(GyanixData.categories, key = { it.id }) { category ->
                    val acc = GyanixLocalDataManager.getCategoryAccuracy(category.id)
                    val progressFraction = (acc.toFloat() / 100f).coerceIn(0.1f, 1f)
                    val statusText = when {
                        acc >= 80 -> "Strong"
                        acc >= 65 -> "Moderate"
                        else -> "Needs Focus"
                    }
                    val statusColor = when {
                        acc >= 80 -> SuccessGreen
                        acc >= 65 -> ElectricCyan400
                        else -> WarningAmber
                    }

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp),
                        shape = RoundedCornerShape(GyanixDimens.radiusMd),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = category.title,
                                        style = MaterialTheme.typography.titleSmall.copy(
                                            fontWeight = FontWeight.SemiBold,
                                            color = MaterialTheme.colorScheme.onSurface
                                        )
                                    )
                                    Text(
                                        text = "${category.questionCount} Questions in DB",
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    )
                                }
                                Column(horizontalAlignment = Alignment.End) {
                                    Text(
                                        text = "$acc%",
                                        style = MaterialTheme.typography.titleMedium.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = statusColor
                                        )
                                    )
                                    Text(
                                        text = statusText,
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            fontWeight = FontWeight.Medium,
                                            color = statusColor
                                        )
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            LinearProgressIndicator(
                                progress = { progressFraction },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(6.dp)
                                    .clip(RoundedCornerShape(3.dp)),
                                color = statusColor,
                                trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f),
                                strokeCap = StrokeCap.Round
                            )
                        }
                    }
                }

                // Achievements
                item {
                    GyanixSectionHeader(
                        title = "Achievements & Badges (${badges.count { it.isUnlocked }} / ${badges.size})",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp)
                    )
                }

                items(badges) { badge ->
                    GyanixAchievementCard(
                        achievement = badge,
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
                    )
                }
            } else {
                // =========================================================================
                // TAB 2: PROFILE & APP SETTINGS
                // =========================================================================
                item {
                    ProfileHeaderCard(
                        userName = userName,
                        userEmail = userEmail,
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp)
                    )
                }

                item {
                    GyanixSectionHeader(
                        title = "Target Exam & Study Level",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
                    )
                }

                item {
                    TargetExamSelector(
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
                    )
                }

                item {
                    GyanixSectionHeader(
                        title = "Examination & App Preferences",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 10.dp)
                    )
                }

                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp),
                        shape = RoundedCornerShape(GyanixDimens.radiusLg),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            // Dark Theme Switch
                            PreferenceSwitchRow(
                                icon = if (isDarkTheme) Icons.Default.DarkMode else Icons.Default.LightMode,
                                iconColor = if (isDarkTheme) ElectricCyan400 else RoyalBlue600,
                                title = "Dark Theme",
                                subtitle = "Deep navy/carbon exam canvas",
                                isChecked = isDarkTheme,
                                onCheckedChange = { onToggleTheme() }
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            // Bilingual Hindi Mode
                            PreferenceSwitchRow(
                                icon = Icons.Default.Language,
                                iconColor = RoyalBlue400,
                                title = "Bilingual Hindi Mode",
                                subtitle = "Show Hindi question and English translation simultaneously",
                                isChecked = hindiLanguageEnabled,
                                onCheckedChange = { hindiLanguageEnabled = it }
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            // Sound Effects
                            PreferenceSwitchRow(
                                icon = Icons.Default.VolumeUp,
                                iconColor = PurpleAccent,
                                title = "Sound Effects",
                                subtitle = "Subtle auditory cue on selection and test completion",
                                isChecked = soundEffectsEnabled,
                                onCheckedChange = { soundEffectsEnabled = it }
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            // Vibration / Haptics
                            PreferenceSwitchRow(
                                icon = Icons.Default.Vibration,
                                iconColor = WarningAmber,
                                title = "Haptic Feedback",
                                subtitle = "Light vibration on question navigation & submission",
                                isChecked = hapticsEnabled,
                                onCheckedChange = { hapticsEnabled = it }
                            )
                        }
                    }
                }

                // Daily Goal & Test Defaults
                item {
                    GyanixSectionHeader(
                        title = "Default Exam Parameters",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 10.dp)
                    )
                }

                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp),
                        shape = RoundedCornerShape(GyanixDimens.radiusLg),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            // Negative Marking Options
                            Text(
                                text = "Negative Marking Penalty",
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                listOf("0.25 (1/4th)", "0.33 (1/3rd)", "None (0)").forEach { opt ->
                                    FilterChip(
                                        selected = negativeMarkingPref == opt,
                                        onClick = { negativeMarkingPref = opt },
                                        label = { Text(opt) },
                                        colors = FilterChipDefaults.filterChipColors(
                                            selectedContainerColor = RoyalBlue600,
                                            selectedLabelColor = Color.White
                                        )
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            // Timer Pace Preference
                            Text(
                                text = "Timer Pace Mode",
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                listOf("Standard (1 min/Q)", "Rapid (45s)", "Untimed").forEach { opt ->
                                    FilterChip(
                                        selected = timerPreference == opt,
                                        onClick = { timerPreference = opt },
                                        label = { Text(opt) },
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

                // Account & Authentication Section
                item {
                    GyanixSectionHeader(
                        title = "Account & Authentication",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 10.dp)
                    )
                }

                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp),
                        shape = RoundedCornerShape(GyanixDimens.radiusLg),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = "Signed in as",
                                        style = MaterialTheme.typography.labelMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                                    )
                                    Text(
                                        text = userEmail,
                                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                                    )
                                }
                                Button(
                                    onClick = { showSignOutDialog = true },
                                    colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                                    shape = RoundedCornerShape(8.dp),
                                    modifier = Modifier.testTag("profile_sign_out_button")
                                ) {
                                    Icon(Icons.Default.ExitToApp, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("Sign Out")
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = "Reset Onboarding Flow",
                                        style = MaterialTheme.typography.titleSmall.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = RoyalBlue400
                                        )
                                    )
                                    Text(
                                        text = "Re-test the Splash and 3 Onboarding screens",
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    )
                                }
                                OutlinedButton(
                                    onClick = { showResetOnboardingDialog = true },
                                    colors = ButtonDefaults.outlinedButtonColors(contentColor = RoyalBlue400),
                                    border = BorderStroke(1.dp, RoyalBlue400.copy(alpha = 0.5f)),
                                    modifier = Modifier.testTag("profile_reset_onboarding_button")
                                ) {
                                    Icon(Icons.Default.RestartAlt, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("Restart")
                                }
                            }
                        }
                    }
                }

                // Data Management / Reset
                item {
                    GyanixSectionHeader(
                        title = "Data & Storage",
                        modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 10.dp)
                    )
                }

                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp),
                        shape = RoundedCornerShape(GyanixDimens.radiusLg),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Reset Test Attempts",
                                    style = MaterialTheme.typography.titleSmall.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = ErrorRed
                                    )
                                )
                                Text(
                                    text = "Clear past test attempt logs and score history",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                )
                            }
                            OutlinedButton(
                                onClick = { showResetDialog = true },
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = ErrorRed),
                                border = BorderStroke(1.dp, ErrorRed.copy(alpha = 0.5f))
                            ) {
                                Icon(Icons.Default.DeleteOutline, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Reset")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun DailyGoalCard(
    todayCount: Int,
    targetCount: Int,
    currentStreak: Int,
    longestStreak: Int,
    onUpdateGoal: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var showGoalDialog by remember { mutableStateOf(false) }

    if (showGoalDialog) {
        AlertDialog(
            onDismissRequest = { showGoalDialog = false },
            title = { Text("Set Daily Question Goal", fontWeight = FontWeight.Bold) },
            text = {
                Column {
                    Text("Select your daily GK practice target:")
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        listOf(25, 50, 75, 100).forEach { goal ->
                            FilterChip(
                                selected = targetCount == goal,
                                onClick = {
                                    onUpdateGoal(goal)
                                    showGoalDialog = false
                                },
                                label = { Text("$goal Qs") },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = RoyalBlue600,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showGoalDialog = false }) {
                    Text("Done")
                }
            }
        )
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, RoyalBlue500.copy(alpha = 0.3f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .background(WarningAmber.copy(alpha = 0.2f), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocalFireDepartment,
                            contentDescription = null,
                            tint = WarningAmber,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "Daily Practice Streak",
                            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                        )
                        Text(
                            text = "$currentStreak Days Active (Best: $longestStreak Days)",
                            style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                    }
                }

                IconButton(onClick = { showGoalDialog = true }) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit Daily Goal",
                        tint = RoyalBlue400,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            val progress = if (targetCount > 0) (todayCount.toFloat() / targetCount.toFloat()).coerceIn(0f, 1f) else 0f
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Today's Target: $todayCount / $targetCount Questions",
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
                )
                Text(
                    text = "${(progress * 100).toInt()}%",
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = RoyalBlue400)
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = if (progress >= 1f) SuccessGreen else RoyalBlue600,
                trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f),
                strokeCap = StrokeCap.Round
            )
        }
    }
}

@Composable
private fun ProfileHeaderCard(
    userName: String,
    userEmail: String,
    modifier: Modifier = Modifier
) {
    val initials = remember(userName) {
        val parts = userName.trim().split("\\s+".toRegex())
        when {
            parts.size >= 2 -> "${parts[0].firstOrNull() ?: 'G'}${parts[1].firstOrNull() ?: 'X'}".uppercase()
            parts.isNotEmpty() && parts[0].isNotEmpty() -> parts[0].take(2).uppercase()
            else -> "GX"
        }
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("profile_header_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusXl),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, RoyalBlue500.copy(alpha = 0.3f))
    ) {
        Row(
            modifier = Modifier.padding(18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Avatar
            Box(
                modifier = Modifier
                    .size(58.dp)
                    .background(RoyalBlue600, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = initials,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = userName.ifEmpty { "Aspirant" },
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    GyanixBadge(
                        text = "ACTIVE",
                        backgroundColor = ElectricCyan400.copy(alpha = 0.2f),
                        textColor = ElectricCyan400
                    )
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = userEmail.ifEmpty { "aspirant@gyanix.app" },
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Smart GK. Smarter Preparation.",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = ElectricCyan400
                    )
                )
            }
        }
    }
}

@Composable
private fun TargetExamSelector(modifier: Modifier = Modifier) {
    var selectedExam by remember { mutableStateOf("UPSC CSE / State PSC") }
    val exams = listOf("UPSC CSE / State PSC", "SSC CGL / CHSL", "Railway RRB / NTPC", "Defence (CDS / NDA)", "Rajasthan RPSC / CET")

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Text(
                text = "Selected Target Examination",
                style = MaterialTheme.typography.labelMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(exams) { exam ->
                    FilterChip(
                        selected = selectedExam == exam,
                        onClick = { selectedExam = exam },
                        label = { Text(exam) },
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

@Composable
private fun PreferenceSwitchRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    iconColor: Color,
    title: String,
    subtitle: String,
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = iconColor,
                modifier = Modifier.size(22.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
        }
        Switch(
            checked = isChecked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = RoyalBlue600
            )
        )
    }
}
