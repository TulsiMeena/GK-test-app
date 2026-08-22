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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixPrimaryButton
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.HeroGradientDark
import com.example.ui.theme.MetricTypography
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.RoyalBlue700
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

import com.example.ui.model.QuizSessionResult
import kotlin.math.roundToInt

@Composable
fun ResultScreenPreview(
    onBackToHome: () -> Unit,
    onRetryTest: () -> Unit,
    onReviewSolutions: () -> Unit,
    result: QuizSessionResult? = null,
    modifier: Modifier = Modifier
) {
    val totalQuestions = result?.totalQuestions ?: 50
    val score = result?.score ?: 84.5f
    val maxScore = result?.maxScore ?: 100f
    val correctCount = result?.correctCount ?: 42
    val incorrectCount = result?.incorrectCount ?: 5
    val skippedCount = result?.unansweredCount ?: 3
    val accuracy = result?.accuracyPercentage ?: 88
    val timeFormatted = if (result != null) {
        val mins = result.timeTakenSeconds / 60
        val secs = result.timeTakenSeconds % 60
        if (mins > 0) "${mins}m ${secs}s" else "${secs}s"
    } else "28m"

    val scoreRatio = if (maxScore > 0) (score / maxScore).coerceIn(0f, 1f) else 0.84f
    val testTitle = result?.config?.testTitle ?: "Full GK Mock Test #01"

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("result_screen_content"),
        contentPadding = PaddingValues(bottom = 90.dp)
    ) {
        // Top Bar
        item {
            ResultTopBar(title = testTitle, onBack = onBackToHome)
        }

        // Hero Score Card
        item {
            ResultHeroCard(
                score = score,
                maxScore = maxScore,
                scoreRatio = scoreRatio,
                accuracy = accuracy,
                isAutoSubmitted = result?.isAutoSubmitted ?: false,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // 4 Key Question Status Tiles (Correct, Incorrect, Skipped, Time)
        item {
            ResultBreakdownTiles(
                correct = "$correctCount",
                incorrect = "$incorrectCount",
                skipped = "$skippedCount",
                time = timeFormatted,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // Performance Insight
        item {
            ResultInsightCard(
                accuracy = accuracy,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // Category-wise Performance Bars
        item {
            ResultCategoryBreakdownSection(
                categoryBreakdown = result?.categoryScoreBreakdown,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 8.dp)
            )
        }

        // Actions: Review Answers, Retry, Share
        item {
            ResultActionButtons(
                onReview = onReviewSolutions,
                onRetry = onRetryTest,
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 16.dp)
            )
        }
    }
}

@Composable
private fun ResultTopBar(
    title: String,
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = onBack) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Column {
                Text(
                    text = "Performance Report",
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

        IconButton(onClick = { /* Share scorecard */ }) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Share",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
private fun ResultHeroCard(
    score: Float,
    maxScore: Float,
    scoreRatio: Float,
    accuracy: Int,
    isAutoSubmitted: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("result_hero_card"),
        shape = RoundedCornerShape(GyanixDimens.radiusXl),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(1.dp, RoyalBlue500.copy(alpha = 0.4f))
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GyanixBadge(
                text = if (isAutoSubmitted) "AUTO SUBMITTED • TIME EXPIRED" else if (scoreRatio >= 0.5f) "TEST COMPLETED • QUALIFIED" else "TEST COMPLETED • NEEDS REVISION",
                backgroundColor = if (scoreRatio >= 0.5f) SuccessGreen.copy(alpha = 0.15f) else WarningAmber.copy(alpha = 0.15f),
                textColor = if (scoreRatio >= 0.5f) SuccessGreen else WarningAmber
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Score Circular Ring
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(140.dp)
            ) {
                CircularProgressIndicator(
                    progress = { scoreRatio },
                    modifier = Modifier.size(140.dp),
                    color = if (scoreRatio >= 0.5f) ElectricCyan400 else WarningAmber,
                    trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                    strokeWidth = 10.dp,
                    strokeCap = StrokeCap.Round
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = if (score % 1.0f == 0.0f) "${score.toInt()}" else String.format("%.1f", score),
                        style = MetricTypography.StatNumberLarge.copy(
                            fontSize = 32.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Text(
                        text = "out of ${maxScore.toInt()}",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Rank & Percentile
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ResultMetaColumn(label = "Score Ratio", value = "${(scoreRatio * 100).toInt()}%")
                ResultMetaColumn(label = "Percentile", value = "${(70 + (scoreRatio * 29)).toInt()}%")
                ResultMetaColumn(label = "Accuracy", value = "$accuracy%")
            }
        }
    }
}

@Composable
private fun ResultMetaColumn(label: String, value: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = value,
            style = MaterialTheme.typography.titleSmall.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
        )
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        )
    }
}

@Composable
private fun ResultBreakdownTiles(
    correct: String,
    incorrect: String,
    skipped: String,
    time: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ResultTile(
                count = correct,
                label = "Correct",
                icon = Icons.Default.CheckCircle,
                color = SuccessGreen,
                modifier = Modifier.weight(1f)
            )
            ResultTile(
                count = incorrect,
                label = "Incorrect",
                icon = Icons.Default.Close,
                color = ErrorRed,
                modifier = Modifier.weight(1f)
            )
            ResultTile(
                count = skipped,
                label = "Skipped",
                icon = Icons.Default.HelpOutline,
                color = WarningAmber,
                modifier = Modifier.weight(1f)
            )
            ResultTile(
                count = time,
                label = "Time",
                icon = Icons.Default.Timer,
                color = ElectricCyan400,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ResultTile(
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
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = count,
                style = MetricTypography.StatNumberMedium.copy(
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onSurface
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
private fun ResultInsightCard(
    accuracy: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .background(
                        if (accuracy >= 70) SuccessGreen.copy(alpha = 0.15f) else WarningAmber.copy(alpha = 0.15f),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.TrendingUp,
                    contentDescription = null,
                    tint = if (accuracy >= 70) SuccessGreen else WarningAmber,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = if (accuracy >= 80) "Exceptional Performance & High Accuracy" else if (accuracy >= 60) "Consistent Performance • Room to Improve" else "Foundation Building Required",
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = if (accuracy >= 75) {
                        "Your speed and accuracy are in the top tier. Keep practicing full-length mock tests with negative marking to maintain your competitive edge."
                    } else {
                        "Focus on reviewing incorrect topics and minimizing negative marking on doubtful questions to improve your percentile."
                    },
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
        }
    }
}

@Composable
private fun ResultCategoryBreakdownSection(
    categoryBreakdown: Map<String, Pair<Int, Int>>?,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        GyanixSectionHeader(title = "Subject-Wise Score Breakdown")

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
                if (categoryBreakdown.isNullOrEmpty()) {
                    CategoryBreakdownBar("Indian Polity & Constitution", 0.95f, "19 / 20 Marks", SuccessGreen)
                    CategoryBreakdownBar("Indian History", 0.88f, "17.5 / 20 Marks", RoyalBlue400)
                    CategoryBreakdownBar("Indian Geography", 0.75f, "15 / 20 Marks", ElectricCyan400)
                    CategoryBreakdownBar("General Science", 0.60f, "12 / 20 Marks", WarningAmber)
                    CategoryBreakdownBar("Indian Economy", 0.55f, "11 / 20 Marks", WarningAmber)
                } else {
                    categoryBreakdown.forEach { (catName, pair) ->
                        val correct = pair.first
                        val total = pair.second
                        val ratio = if (total > 0) correct.toFloat() / total.toFloat() else 0f
                        val color = if (ratio >= 0.75f) SuccessGreen else if (ratio >= 0.5f) RoyalBlue400 else WarningAmber
                        CategoryBreakdownBar(
                            subject = catName,
                            scoreRatio = ratio,
                            scoreText = "$correct / $total Correct",
                            barColor = color
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun CategoryBreakdownBar(
    subject: String,
    scoreRatio: Float,
    scoreText: String,
    barColor: Color
) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = subject,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Text(
                text = scoreText,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = barColor
                )
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        LinearProgressIndicator(
            progress = { scoreRatio },
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
                .clip(RoundedCornerShape(3.dp)),
            color = barColor,
            trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
            strokeCap = StrokeCap.Round
        )
    }
}

@Composable
private fun ResultActionButtons(
    onReview: () -> Unit,
    onRetry: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        GyanixPrimaryButton(
            text = "Review Detailed Solutions",
            onClick = onReview,
            icon = Icons.Default.Visibility,
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedButton(
            onClick = onRetry,
            modifier = Modifier
                .fillMaxWidth()
                .height(GyanixDimens.buttonHeight),
            shape = RoundedCornerShape(GyanixDimens.radiusMd),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
        ) {
            Icon(
                imageVector = Icons.Default.Replay,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Re-Attempt Test",
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
        }
    }
}
