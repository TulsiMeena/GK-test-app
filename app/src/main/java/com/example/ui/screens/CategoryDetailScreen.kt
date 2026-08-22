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
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixFilterChip
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.model.GkCategory
import com.example.ui.model.GkTopicItem
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * Category Detail (Topics List) Screen:
 * Flow: Categories → Selected Category → Topics
 * Shows all syllabus topics for the selected category.
 * Every topic is a clickable card leading to TopicDetailScreen.
 */
@Composable
fun CategoryDetailScreen(
    category: GkCategory,
    onBack: () -> Unit,
    onSelectTopic: (GkTopicItem) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedDifficultyTab by remember { mutableStateOf("All") }
    val difficultyTabs = listOf("All", "Easy", "Moderate", "Hard")

    // Filter subtopics based on selected difficulty
    val filteredSubtopics = remember(selectedDifficultyTab, category) {
        if (selectedDifficultyTab == "All") {
            category.subtopics
        } else {
            category.subtopics.filter { it.difficulty.equals(selectedDifficultyTab, ignoreCase = true) }
        }
    }

    val availableCategoryQuestions = remember(category.id) {
        QuizQuestionDatabase.getAvailableCountForCategory(category.id)
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("category_detail_screen"),
        contentPadding = PaddingValues(
            start = GyanixDimens.screenPadding,
            end = GyanixDimens.screenPadding,
            top = 8.dp,
            bottom = 96.dp
        ),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // 1. Top App Bar & Breadcrumb
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.testTag("btn_detail_back")
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
                            text = category.titleHindi,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = category.title,
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                // Breadcrumb trail bar: Categories → Selected Category
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
                                fontWeight = FontWeight.Bold
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
                            text = "Topics (${category.subtopics.size})",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = MaterialTheme.colorScheme.onSurface,
                                fontWeight = FontWeight.Medium
                            )
                        )
                    }
                }
            }
        }

        // 2. Category Hero Card
        item {
            CategoryHeroBanner(category = category, availableQuestions = availableCategoryQuestions)
        }

        // 3. Section Header & Difficulty Filter
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                GyanixSectionHeader(
                    title = "Category Topics / विषय सूची (${filteredSubtopics.size})",
                    actionText = if (selectedDifficultyTab != "All") "Show All" else null,
                    onActionClick = { selectedDifficultyTab = "All" }
                )

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(difficultyTabs) { tab ->
                        GyanixFilterChip(
                            text = tab,
                            isSelected = selectedDifficultyTab == tab,
                            onClick = { selectedDifficultyTab = tab }
                        )
                    }
                }
            }
        }

        // 4. Topics List (Every Topic is a Clickable Card)
        if (filteredSubtopics.isEmpty()) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No topics found for '$selectedDifficultyTab' difficulty.",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    }
                }
            }
        } else {
            items(filteredSubtopics, key = { it.id }) { topic ->
                TopicListCard(
                    topic = topic,
                    accentColor = category.accentColor,
                    onTopicClick = { onSelectTopic(topic) }
                )
            }
        }
    }
}

@Composable
private fun CategoryHeroBanner(
    category: GkCategory,
    availableQuestions: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(GyanixDimens.radiusXl),
        colors = CardDefaults.cardColors(containerColor = DarkNavySurfaceElevated),
        border = BorderStroke(1.dp, category.accentColor.copy(alpha = 0.4f))
    ) {
        Box(
            modifier = Modifier
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            category.accentColor.copy(alpha = 0.18f),
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
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(category.accentColor.copy(alpha = 0.2f), RoundedCornerShape(12.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = category.icon,
                                contentDescription = null,
                                tint = category.accentColor,
                                modifier = Modifier.size(26.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = category.titleHindi,
                                style = MaterialTheme.typography.titleLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            )
                            Text(
                                text = category.title,
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = Color.White.copy(alpha = 0.7f)
                                )
                            )
                        }
                    }

                    GyanixBadge(
                        text = "${category.subtopics.size} Topics",
                        backgroundColor = category.accentColor.copy(alpha = 0.2f),
                        textColor = category.accentColor
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = category.subtitle,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = Color.White.copy(alpha = 0.75f)
                    )
                )

                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Available Questions / उपलब्ध प्रश्न: $availableQuestions",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = if (availableQuestions > 0) SuccessGreen else WarningAmber,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    Text(
                        text = "Tap a topic to practice or take a test",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = Color.White.copy(alpha = 0.5f),
                            fontSize = 10.sp
                        )
                    )
                }
            }
        }
    }
}

@Composable
private fun TopicListCard(
    topic: GkTopicItem,
    accentColor: Color,
    onTopicClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onTopicClick,
        modifier = modifier
            .fillMaxWidth()
            .testTag("subtopic_item_${topic.id}"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(accentColor.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Topic,
                    contentDescription = null,
                    tint = accentColor,
                    modifier = Modifier.size(22.dp)
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = topic.titleHindi,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    val diffColor = when (topic.difficulty) {
                        "Easy" -> SuccessGreen
                        "Moderate" -> WarningAmber
                        else -> Color(0xFFEF4444)
                    }
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = diffColor.copy(alpha = 0.12f)
                    ) {
                        Text(
                            text = topic.difficulty,
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = diffColor,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            ),
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(3.dp))

                Text(
                    text = topic.title,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "Open Topic",
                tint = accentColor,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}
