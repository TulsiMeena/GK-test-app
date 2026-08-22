package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixPrimaryButton
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.model.CategoryPerformanceStat
import com.example.ui.model.DetailedAnalysisResult
import com.example.ui.model.DifficultyPerformanceStat
import com.example.ui.model.PerformanceInsightItem
import com.example.ui.model.QuizAnalysisEngine
import com.example.ui.model.QuizSessionResult
import com.example.ui.model.TimePerformanceStat
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

/**
 * PROMPT 4 - SCREEN 2: Detailed Performance Analysis
 * Deep examination analytics:
 * - Accuracy & outcome distributions
 * - Category-wise breakdown & progress bars
 * - Difficulty-wise performance matrix
 * - Response speed & time analytics
 * - Deterministic rule-based insights
 */
@Composable
fun DetailedPerformanceAnalysisScreen(
    sessionResult: QuizSessionResult?,
    onBack: () -> Unit,
    onNavigateToReview: () -> Unit,
    modifier: Modifier = Modifier
) {
    val analysis: DetailedAnalysisResult = remember(sessionResult) {
        if (sessionResult != null) {
            QuizAnalysisEngine.calculateDetailedAnalysis(sessionResult)
        } else {
            val mockConfig = com.example.ui.model.QuizConfig(testTitle = "GK Comprehensive Drill")
            val mockResult = QuizSessionResult(
                config = mockConfig,
                questionStates = emptyList(),
                totalQuestions = 25,
                answeredCount = 22,
                unansweredCount = 3,
                markedForReviewCount = 4,
                answeredAndMarkedCount = 2,
                correctCount = 18,
                incorrectCount = 4,
                score = 17.0f,
                maxScore = 25.0f,
                accuracyPercentage = 82,
                timeTakenSeconds = 720
            )
            QuizAnalysisEngine.calculateDetailedAnalysis(mockResult)
        }
    }

    val total = analysis.sessionResult.totalQuestions
    val correct = analysis.scoreBreakdown.correctCount
    val incorrect = analysis.scoreBreakdown.incorrectCount
    val unattempted = analysis.scoreBreakdown.unattemptedCount

    val correctPct = if (total > 0) (correct * 100) / total else 0
    val incorrectPct = if (total > 0) (incorrect * 100) / total else 0
    val unattemptedPct = if (total > 0) (unattempted * 100) / total else 0
    val attemptedPct = correctPct + incorrectPct

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("detailed_analysis_screen"),
        contentPadding = PaddingValues(bottom = 96.dp)
    ) {
        // 1. Top Bar
        item {
            AnalysisTopBar(
                testTitle = analysis.sessionResult.config.testTitle,
                onBack = onBack
            )
        }

        // 2. Accuracy & Attempt Distribution Card
        item {
            AccuracyDistributionCard(
                accuracy = analysis.scoreBreakdown.accuracy,
                attemptedPct = attemptedPct,
                correctPct = correctPct,
                incorrectPct = incorrectPct,
                unattemptedPct = unattemptedPct,
                correctCount = correct,
                incorrectCount = incorrect,
                unattemptedCount = unattempted,
                totalQuestions = total,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 3. Category / Subject-Wise Performance
        item {
            CategoryPerformanceSection(
                categoryStats = analysis.categoryStats,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 4. Difficulty Performance Grid
        item {
            DifficultyPerformanceSection(
                difficultyStats = analysis.difficultyStats,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 5. Time & Speed Diagnostics
        item {
            TimeAnalyticsCard(
                timeStats = analysis.timeStats,
                totalQuestions = total,
                attemptedQuestions = analysis.sessionResult.answeredCount,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 6. Data-Driven Performance Insights
        item {
            PerformanceInsightsSection(
                insights = analysis.insights,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 7. Action Button
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp)
            ) {
                GyanixPrimaryButton(
                    text = "Review Question Solutions",
                    onClick = onNavigateToReview,
                    icon = Icons.Default.Visibility,
                    modifier = Modifier.fillMaxWidth(),
                    testTag = "btn_analysis_to_review"
                )
            }
        }
    }
}

@Composable
private fun AnalysisTopBar(
    testTitle: String,
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = onBack,
            modifier = Modifier.testTag("btn_analysis_back")
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
                text = "Performance Diagnostics",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Text(
                text = testTitle,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun AccuracyDistributionCard(
    accuracy: Int,
    attemptedPct: Int,
    correctPct: Int,
    incorrectPct: Int,
    unattemptedPct: Int,
    correctCount: Int,
    incorrectCount: Int,
    unattemptedCount: Int,
    totalQuestions: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("accuracy_distribution_card"),
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
                Text(
                    text = "Attempt & Accuracy Matrix",
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )

                GyanixBadge(
                    text = "Accuracy: $accuracy%",
                    backgroundColor = if (accuracy >= 75) SuccessGreen.copy(alpha = 0.15f) else WarningAmber.copy(alpha = 0.15f),
                    textColor = if (accuracy >= 75) SuccessGreen else WarningAmber
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Multi-segment horizontal distribution bar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
            ) {
                if (correctPct > 0) {
                    Box(
                        modifier = Modifier
                            .weight(correctPct.toFloat())
                            .fillMaxSize()
                            .background(SuccessGreen)
                    )
                }
                if (incorrectPct > 0) {
                    Box(
                        modifier = Modifier
                            .weight(incorrectPct.toFloat())
                            .fillMaxSize()
                            .background(ErrorRed)
                    )
                }
                if (unattemptedPct > 0) {
                    Box(
                        modifier = Modifier
                            .weight(unattemptedPct.toFloat())
                            .fillMaxSize()
                            .background(WarningAmber.copy(alpha = 0.8f))
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 4 Breakdown Percentages
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                DistributionMetricColumn(
                    label = "Correct",
                    value = "$correctPct%",
                    countText = "$correctCount Qs",
                    color = SuccessGreen
                )
                DistributionMetricColumn(
                    label = "Incorrect",
                    value = "$incorrectPct%",
                    countText = "$incorrectCount Qs",
                    color = ErrorRed
                )
                DistributionMetricColumn(
                    label = "Unattempted",
                    value = "$unattemptedPct%",
                    countText = "$unattemptedCount Qs",
                    color = WarningAmber
                )
                DistributionMetricColumn(
                    label = "Attempt Rate",
                    value = "$attemptedPct%",
                    countText = "${correctCount + incorrectCount}/$totalQuestions Qs",
                    color = ElectricCyan400
                )
            }
        }
    }
}

@Composable
private fun DistributionMetricColumn(
    label: String,
    value: String,
    countText: String,
    color: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(color, CircleShape)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = value,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = color
                )
            )
        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Medium
            )
        )
        Text(
            text = countText,
            style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 10.sp
            )
        )
    }
}

@Composable
private fun CategoryPerformanceSection(
    categoryStats: List<CategoryPerformanceStat>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        GyanixSectionHeader(title = "Subject-Wise Breakdown (${categoryStats.size} Areas)")

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(GyanixDimens.radiusLg),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                if (categoryStats.isEmpty()) {
                    Text(
                        text = "Subject data not available for this session.",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                } else {
                    categoryStats.forEach { stat ->
                        CategoryStatItem(stat = stat)
                    }
                }
            }
        }
    }
}

@Composable
private fun CategoryStatItem(stat: CategoryPerformanceStat) {
    val barColor = when {
        stat.accuracyPercentage >= 75 -> SuccessGreen
        stat.accuracyPercentage >= 50 -> RoyalBlue400
        else -> WarningAmber
    }

    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stat.categoryName,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "${stat.accuracyPercentage}% Acc",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = barColor
                    )
                )
                Text(
                    text = " • ${stat.correctCount}/${stat.totalQuestions} Qs",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(6.dp))

        LinearProgressIndicator(
            progress = { stat.scoreRatio },
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
                .clip(RoundedCornerShape(3.dp)),
            color = barColor,
            trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
            strokeCap = StrokeCap.Round
        )

        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Attempted: ${stat.attemptedCount}  |  Wrong: ${stat.incorrectCount}  |  Skipped: ${stat.unattemptedCount}",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }
    }
}

@Composable
private fun DifficultyPerformanceSection(
    difficultyStats: List<DifficultyPerformanceStat>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        GyanixSectionHeader(title = "Performance by Question Difficulty")

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val allDiffs = listOf("Easy", "Moderate", "Hard")
            allDiffs.forEach { diffName ->
                val stat = difficultyStats.find { it.difficulty.equals(diffName, ignoreCase = true) }
                val diffColor = when (diffName) {
                    "Easy" -> SuccessGreen
                    "Moderate" -> ElectricCyan400
                    else -> ErrorRed
                }

                DifficultyCard(
                    difficulty = diffName,
                    stat = stat,
                    accentColor = diffColor,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun DifficultyCard(
    difficulty: String,
    stat: DifficultyPerformanceStat?,
    accentColor: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = difficulty,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = accentColor
                    )
                )
                Text(
                    text = if (stat != null) "${stat.accuracyPercentage}%" else "--",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            if (stat != null) {
                Text(
                    text = "Correct: ${stat.correctCount} / ${stat.totalQuestions}",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                )
                Text(
                    text = "Wrong: ${stat.incorrectCount}",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 10.sp
                    )
                )
                Text(
                    text = "Skipped: ${stat.unattemptedCount}",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 10.sp
                    )
                )
            } else {
                Text(
                    text = "0 Questions",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                )
            }
        }
    }
}

@Composable
private fun TimeAnalyticsCard(
    timeStats: TimePerformanceStat,
    totalQuestions: Int,
    attemptedQuestions: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("time_analytics_card"),
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
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Speed,
                        contentDescription = null,
                        tint = ElectricCyan400,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Time & Speed Analytics",
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                }

                GyanixBadge(
                    text = if (timeStats.isUntimed) "Untimed Drill" else "Timed Exam",
                    backgroundColor = RoyalBlue600.copy(alpha = 0.15f),
                    textColor = RoyalBlue400
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TimeStatBox(
                    title = "Time Used",
                    value = timeStats.formattedTimeTaken,
                    subtitle = if (!timeStats.isUntimed) "of ${timeStats.totalConfiguredTimeSeconds / 60}m allowed" else "Total elapsed",
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TimeStatBox(
                    title = "Avg Speed",
                    value = "${timeStats.averageTimePerAttemptedSeconds}s",
                    subtitle = "per question attempt",
                    modifier = Modifier.weight(1f)
                )
            }

            if (timeStats.fastestQuestionTimeSeconds != null && timeStats.slowestQuestionTimeSeconds != null) {
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            MaterialTheme.colorScheme.surface.copy(alpha = 0.5f),
                            RoundedCornerShape(GyanixDimens.radiusSm)
                        )
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Fastest: ${timeStats.fastestQuestionTimeSeconds}s",
                        style = MaterialTheme.typography.labelSmall.copy(color = SuccessGreen)
                    )
                    Text(
                        text = "Slowest: ${timeStats.slowestQuestionTimeSeconds}s",
                        style = MaterialTheme.typography.labelSmall.copy(color = WarningAmber)
                    )
                }
            }
        }
    }
}

@Composable
private fun TimeStatBox(
    title: String,
    value: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.labelSmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = value,
                style = MetricTypography.StatNumberMedium.copy(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }
    }
}

@Composable
private fun PerformanceInsightsSection(
    insights: List<PerformanceInsightItem>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        GyanixSectionHeader(title = "Data-Driven Performance Insights")

        if (insights.isEmpty()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
            ) {
                Text(
                    text = "Continue taking more tests to generate detailed learning recommendations.",
                    style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant),
                    modifier = Modifier.padding(16.dp)
                )
            }
        } else {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                insights.forEach { insight ->
                    InsightCard(insight = insight)
                }
            }
        }
    }
}

@Composable
private fun InsightCard(insight: PerformanceInsightItem) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Row(
            modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .background(insight.type.color.copy(alpha = 0.15f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = insight.icon,
                    contentDescription = null,
                    tint = insight.type.color,
                    modifier = Modifier.size(18.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = insight.title,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
                Spacer(modifier = Modifier.height(3.dp))
                Text(
                    text = insight.description,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        lineHeight = 18.sp
                    )
                )
            }
        }
    }
}
