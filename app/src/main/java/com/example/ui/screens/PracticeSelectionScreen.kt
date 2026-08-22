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
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixFilterChip
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.model.GkCategory
import com.example.ui.model.GyanixData
import com.example.ui.model.PracticeModeConfig
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

@Composable
fun PracticeSelectionScreen(
    onStartTest: (PracticeModeConfig, String, String) -> Unit, // mode, difficulty, categoryId
    onBack: (() -> Unit)? = null,
    initialCategoryId: String? = null,
    modifier: Modifier = Modifier
) {
    var selectedDifficulty by remember { mutableStateOf("Mixed") }
    var selectedCategoryFilter by remember { mutableStateOf(initialCategoryId ?: "all") }

    val difficulties = listOf("Easy", "Moderate", "Hard", "Mixed")

    val categoryFilterOptions = remember {
        listOf("all" to "All Categories (Full GK)") +
                GyanixData.categories.map { it.id to it.title }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("practice_selection_screen"),
        contentPadding = PaddingValues(
            start = GyanixDimens.screenPadding,
            end = GyanixDimens.screenPadding,
            top = 8.dp,
            bottom = 96.dp
        ),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Top Bar
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (onBack != null) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.testTag("btn_practice_select_back")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Choose Your Practice",
                        style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                    Text(
                        text = "Select your preferred test format and test your preparation.",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }
        }

        // Difficulty Selector Section
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                GyanixSectionHeader(title = "Select Difficulty Level")

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(difficulties) { diff ->
                        GyanixFilterChip(
                            text = diff,
                            isSelected = selectedDifficulty == diff,
                            onClick = { selectedDifficulty = diff }
                        )
                    }
                }
            }
        }

        // Optional Subject/Category Selector
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                GyanixSectionHeader(
                    title = "Target Subject (Optional)",
                    actionText = if (selectedCategoryFilter != "all") "Reset to All" else null,
                    onActionClick = { selectedCategoryFilter = "all" }
                )

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(categoryFilterOptions) { (id, label) ->
                        val isSelected = selectedCategoryFilter == id
                        Card(
                            onClick = { selectedCategoryFilter = id },
                            shape = RoundedCornerShape(GyanixDimens.radiusSm),
                            colors = CardDefaults.cardColors(
                                containerColor = if (isSelected) RoyalBlue600.copy(alpha = 0.25f)
                                else MaterialTheme.colorScheme.surfaceVariant
                            ),
                            border = BorderStroke(
                                1.dp,
                                if (isSelected) RoyalBlue400 else MaterialTheme.colorScheme.outline
                            ),
                            modifier = Modifier.testTag("cat_chip_$id")
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                if (isSelected) {
                                    Icon(
                                        imageVector = Icons.Default.Check,
                                        contentDescription = null,
                                        tint = ElectricCyan400,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                }
                                Text(
                                    text = label,
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                        color = if (isSelected) ElectricCyan400 else MaterialTheme.colorScheme.onSurface
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }

        // Section Title: Available Practice Modes
        item {
            GyanixSectionHeader(
                title = "Practice & Test Modes (5)",
                actionText = "Exam Simulator"
            )
        }

        // The 5 Practice Mode Cards
        items(GyanixData.practiceModes, key = { it.id }) { mode ->
            PracticeModeCard(
                mode = mode,
                selectedDifficulty = selectedDifficulty,
                selectedCategory = selectedCategoryFilter,
                onStart = {
                    onStartTest(mode, selectedDifficulty, selectedCategoryFilter)
                }
            )
        }
    }
}

@Composable
private fun PracticeModeCard(
    mode: PracticeModeConfig,
    selectedDifficulty: String,
    selectedCategory: String,
    onStart: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onStart,
        modifier = modifier
            .fillMaxWidth()
            .testTag("practice_mode_card_${mode.id}"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(
            if (mode.isRecommended) 1.5.dp else GyanixDimens.borderHairline,
            if (mode.isRecommended) ElectricCyan400 else MaterialTheme.colorScheme.outline
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Top Row: Badge + Duration
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    GyanixBadge(
                        text = mode.difficultyBadge,
                        backgroundColor = mode.badgeColor.copy(alpha = 0.15f),
                        textColor = mode.badgeColor
                    )
                    if (mode.isRecommended) {
                        Spacer(modifier = Modifier.width(6.dp))
                        GyanixBadge(
                            text = "POPULAR",
                            backgroundColor = ElectricCyan400.copy(alpha = 0.15f),
                            textColor = ElectricCyan400,
                            icon = Icons.Default.AutoAwesome
                        )
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Timer,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "${mode.durationMinutes} Mins",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Title and Description
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .background(mode.badgeColor.copy(alpha = 0.15f), RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = mode.icon,
                        contentDescription = null,
                        tint = mode.badgeColor,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = mode.title,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Text(
                        text = mode.description,
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Meta Info and Start Button
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "${mode.questionCount} Questions • $selectedDifficulty Level",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Text(
                        text = if (selectedCategory == "all") "Full GK Syllabus"
                        else "Focused: ${GyanixData.categories.find { it.id == selectedCategory }?.title ?: selectedCategory}",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 10.sp
                        )
                    )
                }

                Button(
                    onClick = onStart,
                    shape = RoundedCornerShape(GyanixDimens.radiusSm),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (mode.isRecommended) ElectricCyan400 else RoyalBlue600,
                        contentColor = if (mode.isRecommended) DarkNavySurfaceElevated else Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 6.dp),
                    modifier = Modifier.testTag("btn_start_${mode.id}")
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "Start",
                            style = MaterialTheme.typography.labelMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = if (mode.isRecommended) DarkNavySurfaceElevated else Color.White
                            )
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            tint = if (mode.isRecommended) DarkNavySurfaceElevated else Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
    }
}
