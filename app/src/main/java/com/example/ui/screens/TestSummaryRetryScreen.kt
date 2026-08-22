package com.example.ui.screens

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
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Visibility
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.ui.model.GkQuestion
import com.example.ui.model.QuizAnalysisEngine
import com.example.ui.model.QuizConfig
import com.example.ui.model.QuizSessionResult
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
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * PROMPT 4 - SCREEN 5: Test Summary & Retry Screen
 * Final session audit card with:
 * - Test metadata (Date/Time, Duration, Scope, Mode)
 * - Score summary & accuracy status
 * - Action controls: "Retry Test" (reloads exact config -> instructions),
 *   "Practice Wrong Questions", "Review Answers", "Back to Home".
 */
@Composable
fun TestSummaryRetryScreen(
    sessionResult: QuizSessionResult?,
    bookmarkedCount: Int,
    onRetrySameConfig: (QuizConfig) -> Unit,
    onPracticeWrong: (List<GkQuestion>) -> Unit,
    onReviewSolutions: () -> Unit,
    onBackToHome: () -> Unit,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val analysis: DetailedAnalysisResult = remember(sessionResult) {
        if (sessionResult != null) {
            QuizAnalysisEngine.calculateDetailedAnalysis(sessionResult)
        } else {
            val mockConfig = QuizConfig(testTitle = "Standard GK Mock #01", questionCount = 20)
            val mockResult = QuizSessionResult(
                config = mockConfig,
                questionStates = emptyList(),
                totalQuestions = 20,
                answeredCount = 18,
                unansweredCount = 2,
                markedForReviewCount = 2,
                answeredAndMarkedCount = 1,
                correctCount = 15,
                incorrectCount = 3,
                score = 14.25f,
                maxScore = 20.0f,
                accuracyPercentage = 83,
                timeTakenSeconds = 610
            )
            QuizAnalysisEngine.calculateDetailedAnalysis(mockResult)
        }
    }

    val config = analysis.sessionResult.config
    val breakdown = analysis.scoreBreakdown
    val timeStats = analysis.timeStats
    val wrongQuestions = analysis.incorrectQuestions.map { it.question }

    val formattedDate = remember {
        val sdf = SimpleDateFormat("dd MMM yyyy, hh:mm a", Locale.getDefault())
        sdf.format(Date())
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("test_summary_retry_screen"),
        contentPadding = PaddingValues(bottom = 96.dp)
    ) {
        // 1. Top Bar
        item {
            SummaryTopBar(
                onBack = onBack,
                onHome = onBackToHome
            )
        }

        // 2. Comprehensive Test Summary Card
        item {
            TestSummaryMetaCard(
                title = config.testTitle,
                dateTimeFormatted = formattedDate,
                totalQuestions = analysis.sessionResult.totalQuestions,
                score = breakdown.finalScore,
                maxScore = breakdown.maximumMarks,
                accuracy = breakdown.accuracy,
                timeUsedFormatted = timeStats.formattedTimeTaken,
                negativePenaltyLabel = config.negativeMarkingLabel,
                difficulty = config.difficulty,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 3. Performance Scorecard Details
        item {
            PerformanceAuditCard(
                correct = breakdown.correctCount,
                incorrect = breakdown.incorrectCount,
                unattempted = breakdown.unattemptedCount,
                netScore = breakdown.finalScore,
                percentage = breakdown.percentage,
                bookmarkedCount = bookmarkedCount,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 4. Primary Actions Hub
        item {
            SummaryActionHub(
                hasWrongQuestions = wrongQuestions.isNotEmpty(),
                wrongQuestionsCount = wrongQuestions.size,
                onRetry = { onRetrySameConfig(config) },
                onPracticeWrong = { onPracticeWrong(wrongQuestions) },
                onReview = onReviewSolutions,
                onHome = onBackToHome,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp)
            )
        }
    }
}

@Composable
private fun SummaryTopBar(
    onBack: () -> Unit,
    onHome: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(
                onClick = onBack,
                modifier = Modifier.testTag("btn_summary_back")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "Session Summary & Actions",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
        }

        IconButton(
            onClick = onHome,
            modifier = Modifier.testTag("btn_summary_home")
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
private fun TestSummaryMetaCard(
    title: String,
    dateTimeFormatted: String,
    totalQuestions: Int,
    score: Float,
    maxScore: Float,
    accuracy: Int,
    timeUsedFormatted: String,
    negativePenaltyLabel: String,
    difficulty: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("test_summary_meta_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, RoyalBlue500.copy(alpha = 0.35f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(13.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = dateTimeFormatted,
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 11.sp
                            )
                        )
                    }
                }

                GyanixBadge(
                    text = difficulty.uppercase(),
                    backgroundColor = ElectricCyan400.copy(alpha = 0.15f),
                    textColor = ElectricCyan400
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Metadata Grid (2x2)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MetaGridItem(
                    label = "Questions",
                    value = "$totalQuestions Qs",
                    modifier = Modifier.weight(1f)
                )
                MetaGridItem(
                    label = "Score",
                    value = "${formatScoreValue(score)} / ${formatScoreValue(maxScore)}",
                    modifier = Modifier.weight(1f)
                )
                MetaGridItem(
                    label = "Accuracy",
                    value = "$accuracy%",
                    modifier = Modifier.weight(1f)
                )
                MetaGridItem(
                    label = "Time Spent",
                    value = timeUsedFormatted,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Marking Scheme Info Pill
            Surface(
                shape = RoundedCornerShape(GyanixDimens.radiusSm),
                color = MaterialTheme.colorScheme.surface.copy(alpha = 0.6f),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Negative Marking Scheme",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                    Text(
                        text = negativePenaltyLabel,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = if (negativePenaltyLabel.contains("Off")) SuccessGreen else WarningAmber
                        )
                    )
                }
            }
        }
    }
}

@Composable
private fun MetaGridItem(
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = value,
            style = MaterialTheme.typography.titleSmall.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
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
private fun PerformanceAuditCard(
    correct: Int,
    incorrect: Int,
    unattempted: Int,
    netScore: Float,
    percentage: Int,
    bookmarkedCount: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Performance Breakdown",
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                AuditPill(
                    count = "$correct",
                    label = "Correct",
                    color = SuccessGreen,
                    modifier = Modifier.weight(1f)
                )
                AuditPill(
                    count = "$incorrect",
                    label = "Incorrect",
                    color = ErrorRed,
                    modifier = Modifier.weight(1f)
                )
                AuditPill(
                    count = "$unattempted",
                    label = "Skipped",
                    color = WarningAmber,
                    modifier = Modifier.weight(1f)
                )
                AuditPill(
                    count = "$bookmarkedCount",
                    label = "Bookmarked",
                    color = PurpleAccent,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun AuditPill(
    count: String,
    label: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, color.copy(alpha = 0.4f))
    ) {
        Column(
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = count,
                style = MetricTypography.StatNumberMedium.copy(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = color
                )
            )
            Text(
                text = label,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }
    }
}

@Composable
private fun SummaryActionHub(
    hasWrongQuestions: Boolean,
    wrongQuestionsCount: Int,
    onRetry: () -> Unit,
    onPracticeWrong: () -> Unit,
    onReview: () -> Unit,
    onHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        GyanixSectionHeader(title = "Next Action Steps")

        // 1. Retry Test (Primary)
        GyanixPrimaryButton(
            text = "Retry Test (Same Configuration)",
            onClick = onRetry,
            icon = Icons.Default.Replay,
            modifier = Modifier.fillMaxWidth(),
            testTag = "btn_summary_retry_test"
        )

        // 2. Practice Wrong Questions (if any exist)
        if (hasWrongQuestions) {
            Button(
                onClick = onPracticeWrong,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(GyanixDimens.buttonHeight)
                    .testTag("btn_summary_practice_wrong"),
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                    containerColor = ErrorRed.copy(alpha = 0.9f),
                    contentColor = Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Cancel,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Practice $wrongQuestionsCount Wrong Questions",
                    style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
                )
            }
        }

        // 3. Review All Solutions
        OutlinedButton(
            onClick = onReview,
            modifier = Modifier
                .fillMaxWidth()
                .height(GyanixDimens.buttonHeight)
                .testTag("btn_summary_review_answers"),
            shape = RoundedCornerShape(GyanixDimens.radiusMd),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
        ) {
            Icon(
                imageVector = Icons.Default.Visibility,
                contentDescription = null,
                tint = ElectricCyan400,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Review All Answer Explanations",
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
        }

        // 4. Return to Home Dashboard
        OutlinedButton(
            onClick = onHome,
            modifier = Modifier
                .fillMaxWidth()
                .height(GyanixDimens.buttonHeight)
                .testTag("btn_summary_back_home"),
            shape = RoundedCornerShape(GyanixDimens.radiusMd),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f))
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Back to Home Dashboard",
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }
    }
}

private fun formatScoreValue(score: Float): String {
    return if (score % 1.0f == 0.0f) {
        "${score.toInt()}"
    } else {
        String.format("%.2f", score)
    }
}
