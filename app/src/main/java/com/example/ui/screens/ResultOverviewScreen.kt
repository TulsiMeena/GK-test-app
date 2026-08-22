package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.example.ui.model.PerformanceLevel
import com.example.ui.model.QuizAnalysisEngine
import com.example.ui.model.QuizSessionResult
import com.example.ui.model.ScoreBreakdownStat
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

/**
 * PROMPT 4 - SCREEN 1: Result Overview
 * Automatically shown after test submission with circular score ring, performance level,
 * precise mark breakdown and direct navigation to detailed analytics & solution review.
 */
@Composable
fun ResultOverviewScreen(
    sessionResult: QuizSessionResult?,
    onNavigateToDetailedAnalysis: () -> Unit,
    onNavigateToAnswerReview: () -> Unit,
    onNavigateToWrongQuestions: () -> Unit,
    onNavigateToSummaryRetry: () -> Unit,
    onRetryTest: () -> Unit,
    onBackToHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Calculate complete analysis from pure engine
    val analysis: DetailedAnalysisResult = remember(sessionResult) {
        if (sessionResult != null) {
            QuizAnalysisEngine.calculateDetailedAnalysis(sessionResult)
        } else {
            // Default preview fallback
            val mockConfig = com.example.ui.model.QuizConfig(
                testTitle = "Indian Polity & Freedom Struggle Drill",
                questionCount = 20,
                timeLimitMinutes = 15,
                negativeMarking = -0.25f
            )
            val mockResult = QuizSessionResult(
                config = mockConfig,
                questionStates = emptyList(),
                totalQuestions = 20,
                answeredCount = 18,
                unansweredCount = 2,
                markedForReviewCount = 3,
                answeredAndMarkedCount = 2,
                correctCount = 15,
                incorrectCount = 3,
                score = 14.25f,
                maxScore = 20.0f,
                accuracyPercentage = 83,
                timeTakenSeconds = 640
            )
            QuizAnalysisEngine.calculateDetailedAnalysis(mockResult)
        }
    }

    val scoreBreakdown = analysis.scoreBreakdown
    val perfLevel = analysis.performanceLevel
    val testTitle = analysis.sessionResult.config.testTitle

    var animationTarget by remember { mutableFloatStateOf(0f) }
    LaunchedEffect(Unit) {
        animationTarget = (scoreBreakdown.percentage / 100f).coerceIn(0f, 1f)
    }
    val animatedProgress by animateFloatAsState(
        targetValue = animationTarget,
        animationSpec = tween(durationMillis = 1200),
        label = "ScoreProgress"
    )

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("result_overview_screen"),
        contentPadding = PaddingValues(bottom = 96.dp)
    ) {
        // 1. Top Bar
        item {
            ResultOverviewTopBar(
                title = testTitle,
                onBack = onBackToHome,
                onSummaryClick = onNavigateToSummaryRetry
            )
        }

        // 2. Hero Score & Progress Ring
        item {
            ResultScoreHeroCard(
                scoreBreakdown = scoreBreakdown,
                performanceLevel = perfLevel,
                animatedProgress = animatedProgress,
                isAutoSubmitted = analysis.sessionResult.isAutoSubmitted,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 3. Status Metric Tiles
        item {
            ResultStatusTilesGrid(
                correct = scoreBreakdown.correctCount,
                incorrect = scoreBreakdown.incorrectCount,
                unattempted = scoreBreakdown.unattemptedCount,
                timeTakenFormatted = analysis.timeStats.formattedTimeTaken,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )
        }

        // 4. Exact Score Breakdown Card
        item {
            ScoreBreakdownCard(
                scoreBreakdown = scoreBreakdown,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 5. Quick Navigation Hub
        item {
            ResultNavigationHub(
                incorrectCount = scoreBreakdown.incorrectCount,
                unattemptedCount = scoreBreakdown.unattemptedCount,
                totalCount = analysis.sessionResult.totalQuestions,
                onOpenAnalytics = onNavigateToDetailedAnalysis,
                onOpenReview = onNavigateToAnswerReview,
                onOpenWrong = onNavigateToWrongQuestions,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 6. Action Bar
        item {
            ResultPrimaryActions(
                onReviewAll = onNavigateToAnswerReview,
                onRetry = onRetryTest,
                onSummary = onNavigateToSummaryRetry,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp)
            )
        }
    }
}

@Composable
private fun ResultOverviewTopBar(
    title: String,
    onBack: () -> Unit,
    onSummaryClick: () -> Unit
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
                modifier = Modifier.testTag("btn_result_back")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Home",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = null,
                        tint = SuccessGreen,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Test Completed",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = SuccessGreen,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.5.sp
                        )
                    )
                }
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }

        IconButton(
            onClick = onSummaryClick,
            modifier = Modifier.testTag("btn_test_summary")
        ) {
            Icon(
                imageVector = Icons.Default.Assessment,
                contentDescription = "Test Summary",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
private fun ResultScoreHeroCard(
    scoreBreakdown: ScoreBreakdownStat,
    performanceLevel: PerformanceLevel,
    animatedProgress: Float,
    isAutoSubmitted: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("hero_score_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusXl),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, performanceLevel.color.copy(alpha = 0.4f))
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header status badge
            GyanixBadge(
                text = if (isAutoSubmitted) "AUTO SUBMITTED • TIME EXPIRED" else performanceLevel.title.uppercase(),
                backgroundColor = performanceLevel.color.copy(alpha = 0.15f),
                textColor = performanceLevel.color,
                icon = Icons.Default.TrendingUp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Large Circular Score Ring
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(150.dp)
            ) {
                CircularProgressIndicator(
                    progress = { animatedProgress },
                    modifier = Modifier.size(150.dp),
                    color = performanceLevel.color,
                    trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.25f),
                    strokeWidth = 12.dp,
                    strokeCap = StrokeCap.Round
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(12.dp)
                ) {
                    Text(
                        text = "${scoreBreakdown.percentage}%",
                        style = MetricTypography.StatNumberLarge.copy(
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Text(
                        text = "${formatScore(scoreBreakdown.finalScore)} / ${formatScore(scoreBreakdown.maximumMarks)} Marks",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Performance Title & Subtitle
            Text(
                text = performanceLevel.title,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = performanceLevel.color
                ),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = performanceLevel.subtitle,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 18.sp
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Score, Accuracy, Percentile columns
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        MaterialTheme.colorScheme.surface.copy(alpha = 0.6f),
                        RoundedCornerShape(GyanixDimens.radiusMd)
                    )
                    .padding(vertical = 10.dp, horizontal = 12.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ResultHeroMetric(
                    label = "Final Score",
                    value = formatScore(scoreBreakdown.finalScore),
                    color = MaterialTheme.colorScheme.onSurface
                )
                Box(
                    modifier = Modifier
                        .width(1.dp)
                        .height(30.dp)
                        .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
                )
                ResultHeroMetric(
                    label = "Accuracy",
                    value = "${scoreBreakdown.accuracy}%",
                    color = if (scoreBreakdown.accuracy >= 75) SuccessGreen else WarningAmber
                )
                Box(
                    modifier = Modifier
                        .width(1.dp)
                        .height(30.dp)
                        .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
                )
                ResultHeroMetric(
                    label = "Max Marks",
                    value = formatScore(scoreBreakdown.maximumMarks),
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun ResultHeroMetric(
    label: String,
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
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 11.sp
            )
        )
    }
}

@Composable
private fun ResultStatusTilesGrid(
    correct: Int,
    incorrect: Int,
    unattempted: Int,
    timeTakenFormatted: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ResultMetricTile(
            count = "$correct",
            label = "Correct",
            icon = Icons.Default.CheckCircle,
            color = SuccessGreen,
            modifier = Modifier.weight(1f)
        )
        ResultMetricTile(
            count = "$incorrect",
            label = "Incorrect",
            icon = Icons.Default.Close,
            color = ErrorRed,
            modifier = Modifier.weight(1f)
        )
        ResultMetricTile(
            count = "$unattempted",
            label = "Unattempted",
            icon = Icons.Default.HelpOutline,
            color = WarningAmber,
            modifier = Modifier.weight(1f)
        )
        ResultMetricTile(
            count = timeTakenFormatted,
            label = "Time Taken",
            icon = Icons.Default.Timer,
            color = ElectricCyan400,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun ResultMetricTile(
    count: String,
    label: String,
    icon: ImageVector,
    color: Color,
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
                .padding(vertical = 12.dp, horizontal = 4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .background(color.copy(alpha = 0.15f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = color,
                    modifier = Modifier.size(16.dp)
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = count,
                style = MetricTypography.StatNumberMedium.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun ScoreBreakdownCard(
    scoreBreakdown: ScoreBreakdownStat,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("score_breakdown_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Score & Marking Breakdown",
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Correct Marks Line
            ScoreBreakdownRow(
                label = "Correct Answers (${scoreBreakdown.correctCount})",
                marksText = "+${formatScore(scoreBreakdown.grossMarksEarned)} Marks",
                marksColor = SuccessGreen,
                icon = Icons.Default.CheckCircle
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Incorrect Marks Line
            val hasNegativePenalty = scoreBreakdown.negativeMarkingPerIncorrect < 0f
            ScoreBreakdownRow(
                label = if (hasNegativePenalty) {
                    "Incorrect Answers (${scoreBreakdown.incorrectCount} @ ${scoreBreakdown.negativeMarkingPerIncorrect})"
                } else {
                    "Incorrect Answers (${scoreBreakdown.incorrectCount} • No Penalty)"
                },
                marksText = if (hasNegativePenalty) "-${formatScore(scoreBreakdown.negativeMarksDeducted)} Marks" else "0.00 Marks",
                marksColor = if (hasNegativePenalty && scoreBreakdown.negativeMarksDeducted > 0) ErrorRed else MaterialTheme.colorScheme.onSurfaceVariant,
                icon = Icons.Default.Close
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Unattempted Line
            ScoreBreakdownRow(
                label = "Unattempted (${scoreBreakdown.unattemptedCount})",
                marksText = "0.00 Marks",
                marksColor = MaterialTheme.colorScheme.onSurfaceVariant,
                icon = Icons.Default.HelpOutline
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Divider
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.4f))
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Net Final Score Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Final Net Score",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )

                Text(
                    text = "${formatScore(scoreBreakdown.finalScore)} / ${formatScore(scoreBreakdown.maximumMarks)}",
                    style = MetricTypography.StatNumberLarge.copy(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = RoyalBlue400
                    )
                )
            }
        }
    }
}

@Composable
private fun ScoreBreakdownRow(
    label: String,
    marksText: String,
    marksColor: Color,
    icon: ImageVector
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
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = marksColor,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.Normal
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        Text(
            text = marksText,
            style = MaterialTheme.typography.titleSmall.copy(
                color = marksColor,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
private fun ResultNavigationHub(
    incorrectCount: Int,
    unattemptedCount: Int,
    totalCount: Int,
    onOpenAnalytics: () -> Unit,
    onOpenReview: () -> Unit,
    onOpenWrong: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        GyanixSectionHeader(title = "In-Depth Analysis & Solutions")

        // 1. Detailed Performance Analysis Card
        HubOptionCard(
            title = "Detailed Performance Analytics",
            subtitle = "Subject breakdown, accuracy charts, and speed diagnostics",
            icon = Icons.Default.Analytics,
            accentColor = ElectricCyan400,
            badge = "Charts",
            onClick = onOpenAnalytics,
            testTag = "hub_opt_analytics"
        )

        // 2. Question-by-Question Review
        HubOptionCard(
            title = "Question-by-Question Solutions",
            subtitle = "Step-by-step bilingual explanations for all $totalCount questions",
            icon = Icons.Default.Visibility,
            accentColor = RoyalBlue400,
            badge = "All $totalCount",
            onClick = onOpenReview,
            testTag = "hub_opt_review"
        )

        // 3. Incorrect Questions Review
        HubOptionCard(
            title = "Review Incorrect Questions",
            subtitle = if (incorrectCount > 0) "Analyze $incorrectCount mistakes and target weak concepts" else "Perfect! Zero wrong questions in this test",
            icon = Icons.Default.Cancel,
            accentColor = if (incorrectCount > 0) ErrorRed else SuccessGreen,
            badge = if (incorrectCount > 0) "$incorrectCount Wrong" else "0 Wrong",
            onClick = onOpenWrong,
            testTag = "hub_opt_wrong"
        )
    }
}

@Composable
private fun HubOptionCard(
    title: String,
    subtitle: String,
    icon: ImageVector,
    accentColor: Color,
    badge: String,
    onClick: () -> Unit,
    testTag: String
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .testTag(testTag),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Row(
            modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(accentColor.copy(alpha = 0.15f), RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = accentColor,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp
                    ),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            GyanixBadge(
                text = badge,
                backgroundColor = accentColor.copy(alpha = 0.12f),
                textColor = accentColor
            )

            Spacer(modifier = Modifier.width(4.dp))

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Composable
private fun ResultPrimaryActions(
    onReviewAll: () -> Unit,
    onRetry: () -> Unit,
    onSummary: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        GyanixPrimaryButton(
            text = "Review All Solutions",
            onClick = onReviewAll,
            icon = Icons.Default.Visibility,
            modifier = Modifier.fillMaxWidth(),
            testTag = "btn_overview_review_all"
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedButton(
                onClick = onRetry,
                modifier = Modifier
                    .weight(1f)
                    .height(GyanixDimens.buttonHeight)
                    .testTag("btn_overview_retry"),
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
            ) {
                Icon(
                    imageVector = Icons.Default.Replay,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Retry Test",
                    style = MaterialTheme.typography.labelLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }

            OutlinedButton(
                onClick = onSummary,
                modifier = Modifier
                    .weight(1f)
                    .height(GyanixDimens.buttonHeight)
                    .testTag("btn_overview_summary"),
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
            ) {
                Icon(
                    imageVector = Icons.Default.Assessment,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Test Summary",
                    style = MaterialTheme.typography.labelLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }
        }
    }
}

private fun formatScore(score: Float): String {
    return if (score % 1.0f == 0.0f) {
        "${score.toInt()}"
    } else {
        String.format("%.2f", score)
    }
}
