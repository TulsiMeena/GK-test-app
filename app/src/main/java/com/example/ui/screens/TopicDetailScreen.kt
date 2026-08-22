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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.model.GkCategory
import com.example.ui.model.GkTopicItem
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * Topic Detail Screen:
 * Breadcrumb: Categories → Selected Category → Selected Topic
 * Shows:
 * - Topic Name (English & Hindi)
 * - Available Questions (Dynamic from Database, currently 0, NO fake count)
 * - Practice Button
 * - Mock Test Button
 */
@Composable
fun TopicDetailScreen(
    category: GkCategory,
    topic: GkTopicItem,
    onBack: () -> Unit,
    onStartMockTest: (mockNumber: Int?) -> Unit,
    onStartPractice: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Dynamic calculation of available questions from QuizQuestionDatabase (no fake number)
    val availableQuestionsCount = remember(category.id, topic.id) {
        QuizQuestionDatabase.getAvailableCount(category.id, topic.id, topic.title)
    }

    val totalMocksForTopic = remember(availableQuestionsCount) {
        if (availableQuestionsCount > 0) {
            (availableQuestionsCount / 15).coerceAtLeast(1)
        } else {
            10
        }
    }

    var showNoQuestionsDialog by remember { mutableStateOf(false) }

    if (showNoQuestionsDialog) {
        AlertDialog(
            onDismissRequest = { showNoQuestionsDialog = false },
            icon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = null,
                    tint = RoyalBlue400,
                    modifier = Modifier.size(36.dp)
                )
            },
            title = {
                Text(
                    text = "No Questions Available",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
            },
            text = {
                Column {
                    Text(
                        text = "No questions are available for this topic yet.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "इस टॉपिक (${topic.titleHindi}) के लिए अभी कोई प्रश्न उपलब्ध नहीं हैं। प्रश्न जोड़े जाने पर आप अभ्यास और टेस्ट शुरू कर सकेंगे।",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = { showNoQuestionsDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600)
                ) {
                    Text("OK / ठीक है")
                }
            }
        )
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("topic_detail_screen"),
        contentPadding = PaddingValues(
            start = GyanixDimens.screenPadding,
            end = GyanixDimens.screenPadding,
            top = 8.dp,
            bottom = 96.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 1. TOP APP BAR WITH CLEAR BREADCRUMB
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.testTag("btn_topic_detail_back")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = topic.title,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = category.titleHindi,
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                // Breadcrumb trail bar: Categories → Category → Topic
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Categories",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(14.dp)
                        )
                        Text(
                            text = category.titleHindi,
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = category.accentColor,
                                fontWeight = FontWeight.SemiBold
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(14.dp)
                        )
                        Text(
                            text = topic.titleHindi,
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = MaterialTheme.colorScheme.onSurface,
                                fontWeight = FontWeight.Bold
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }

        // 2. TOPIC HERO CARD
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("topic_hero_card"),
                shape = RoundedCornerShape(GyanixDimens.radiusXl),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                border = BorderStroke(1.dp, category.accentColor.copy(alpha = 0.4f))
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    DarkNavySurfaceElevated,
                                    Color(0xFF0F172A)
                                )
                            )
                        )
                        .padding(20.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Category Badge
                            Surface(
                                shape = RoundedCornerShape(6.dp),
                                color = category.accentColor.copy(alpha = 0.15f),
                                border = BorderStroke(1.dp, category.accentColor.copy(alpha = 0.3f))
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Icon(
                                        imageVector = category.icon,
                                        contentDescription = null,
                                        tint = category.accentColor,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = category.title,
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            color = category.accentColor,
                                            fontWeight = FontWeight.Bold
                                        )
                                    )
                                }
                            }

                            // Difficulty Chip
                            val difficultyColor = when (topic.difficulty) {
                                "Easy" -> SuccessGreen
                                "Moderate" -> WarningAmber
                                else -> Color(0xFFEF4444)
                            }
                            Surface(
                                shape = RoundedCornerShape(6.dp),
                                color = difficultyColor.copy(alpha = 0.15f)
                            ) {
                                Text(
                                    text = topic.difficulty,
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = difficultyColor,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // Topic Titles (Hindi & English)
                        Text(
                            text = topic.titleHindi,
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = topic.title,
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.White.copy(alpha = 0.75f),
                                fontWeight = FontWeight.Medium
                            )
                        )

                        Spacer(modifier = Modifier.height(16.dp))
                        HorizontalDivider(color = Color.White.copy(alpha = 0.1f))
                        Spacer(modifier = Modifier.height(14.dp))

                        // Real Available Questions Metric (No fake numbers!)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(
                                    text = "Available Questions / उपलब्ध प्रश्न",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = Color.White.copy(alpha = 0.6f)
                                    )
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Row(verticalAlignment = Alignment.Bottom) {
                                    Text(
                                        text = "$availableQuestionsCount",
                                        style = MaterialTheme.typography.headlineMedium.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = if (availableQuestionsCount > 0) SuccessGreen else WarningAmber
                                        )
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = "Questions ($totalMocksForTopic Mocks × 15 MCQs)",
                                        style = MaterialTheme.typography.bodyMedium.copy(
                                            color = Color.White.copy(alpha = 0.6f)
                                        ),
                                        modifier = Modifier.padding(bottom = 3.dp)
                                    )
                                }
                            }

                            if (availableQuestionsCount == 0) {
                                Surface(
                                    shape = RoundedCornerShape(GyanixDimens.radiusSm),
                                    color = WarningAmber.copy(alpha = 0.15f),
                                    border = BorderStroke(1.dp, WarningAmber.copy(alpha = 0.3f))
                                ) {
                                    Text(
                                        text = "Awaiting Questions",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            color = WarningAmber,
                                            fontWeight = FontWeight.SemiBold
                                        ),
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        // 3. ZERO QUESTIONS ALERT (IF EMPTY)
        if (availableQuestionsCount == 0) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(GyanixDimens.radiusLg),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = null,
                            tint = WarningAmber,
                            modifier = Modifier.size(22.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Database Status: 0 Questions",
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Currently no questions are added for this topic. Tests will be dynamically generated as soon as questions are provided in the future.",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            )
                        }
                    }
                }
            }
        }

        // 4. SECTION HEADER: TOPIC MOCK TESTS
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Topic Mock Tests / $totalMocksForTopic मॉक टेस्ट",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = RoyalBlue600.copy(alpha = 0.2f)
                ) {
                    Text(
                        text = "$totalMocksForTopic Mocks • 15 Qs Each",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = RoyalBlue400,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp
                        ),
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }
        }

        // 5. MOCK TEST CARDS (15 Questions Each)
        items(totalMocksForTopic) { index ->
            val mockNum = index + 1
            val mockLevel = when (mockNum) {
                1 -> "Foundational Level (प्रारंभिक स्तर)"
                2 -> "Standard Exam Level (मानक स्तर)"
                3 -> "Conceptual & Analytical (अवधारणात्मक स्तर)"
                4 -> "Advanced High-Yield (उच्च स्तरीय)"
                5 -> "Exam Drill (परीक्षा अभ्यास)"
                6 -> "Advanced Analytical 1 (गहन स्तर 1)"
                7 -> "Advanced Analytical 2 (गहन स्तर 2)"
                8 -> "High Yield Challenge (चुनौतीपूर्ण स्तर)"
                9 -> "Expert Mastery (विशेषज्ञ स्तर)"
                else -> "Final Grand Simulation (अंतिम परीक्षा स्तर)"
            }
            val accentColor = when (mockNum) {
                1 -> RoyalBlue400
                2 -> ElectricCyan400
                3 -> Color(0xFF38BDF8) // Sky Blue
                4 -> Color(0xFFF59E0B) // Amber
                5 -> Color(0xFFFB923C) // Orange
                6 -> Color(0xFFA78BFA) // Purple
                7 -> Color(0xFF818CF8) // Indigo
                8 -> Color(0xFFEC4899) // Pink
                9 -> Color(0xFFF43F5E) // Rose
                else -> Color(0xFF10B981) // Emerald Green
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        if (availableQuestionsCount == 0) {
                            showNoQuestionsDialog = true
                        } else {
                            onStartMockTest(mockNum)
                        }
                    }
                    .testTag("card_topic_mock_test_$mockNum"),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = BorderStroke(1.dp, accentColor.copy(alpha = 0.5f))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(accentColor.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = if (mockNum < 10) "0$mockNum" else "$mockNum",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = accentColor
                            )
                        )
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Mock Test $mockNum (मॉक टेस्ट $mockNum)",
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Spacer(modifier = Modifier.height(3.dp))
                        Text(
                            text = "15 Qs • 15 Mins • -0.25 Mark • $mockLevel",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 12.sp
                            )
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        tint = accentColor,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }

        // 7. CUSTOM TEST CONFIGURATION
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onStartMockTest(null)
                    }
                    .testTag("card_topic_custom_mock_test"),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.surfaceVariant),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Quiz,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(22.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Custom Test Setup / कस्टम सेटअप",
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Customize questions count, timer, and difficulty",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    }

                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }

        // 8. PRACTICE (UNTIMED / TOPIC PRACTICE)
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        if (availableQuestionsCount == 0) {
                            showNoQuestionsDialog = true
                        } else {
                            onStartPractice()
                        }
                    }
                    .testTag("card_topic_practice"),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(category.accentColor.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.School,
                            contentDescription = null,
                            tint = category.accentColor,
                            modifier = Modifier.size(26.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Practice / अभ्यास",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Untimed question practice with instant answers and explanations",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}
