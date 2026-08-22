package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
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
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.RemoveCircleOutline
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixFilterChip
import com.example.ui.model.GkCategory
import com.example.ui.model.GyanixData
import com.example.ui.model.QuestionSource
import com.example.ui.model.QuizConfig
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ElectricCyan500
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * Mock Test Configuration Screen
 * Configures:
 * 1. Question Count (10, 25, 50, 100)
 * 2. Difficulty (Easy, Moderate, Hard, Mixed)
 * 3. Language (Hindi, English)
 * 4. Negative Marking (None/0.00, -0.25, -0.50)
 * 5. Timer (No Timer/0, 10 Minutes, 20 Minutes, 30 Minutes, 60 Minutes)
 *
 * Checks dynamic question count from database.
 * If 0 questions available, displays "No questions are available for this topic yet."
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TestConfigurationScreen(
    onProceedToInstructions: (QuizConfig) -> Unit,
    onBack: () -> Unit,
    initialCategory: GkCategory? = null,
    initialCategoryId: String? = initialCategory?.id,
    targetTopicId: String? = null,
    targetTopicTitle: String? = null,
    targetTopicHindi: String? = null,
    initialDifficulty: String = "Mixed",
    initialQuestionCount: Int = 10,
    modifier: Modifier = Modifier
) {
    var questionCount by remember { mutableIntStateOf(initialQuestionCount) }
    var difficulty by remember { mutableStateOf(initialDifficulty) }

    val isTopicSpecific = !targetTopicId.isNullOrBlank()

    var questionSource by remember {
        mutableStateOf(
            if (isTopicSpecific) QuestionSource.TOPIC
            else if (initialCategoryId != null) QuestionSource.SINGLE_CATEGORY
            else QuestionSource.RANDOM_GK
        )
    }

    var selectedSingleCategoryId by remember {
        mutableStateOf(initialCategoryId ?: "geo")
    }

    var selectedMultipleCategoryIds by remember {
        mutableStateOf(
            if (initialCategoryId != null) setOf(initialCategoryId) else setOf("hist", "geo", "polity")
        )
    }

    var timeLimitMinutes by remember { mutableIntStateOf(20) }
    var negativeMarking by remember { mutableFloatStateOf(-0.25f) }
    var language by remember { mutableStateOf("Hindi") }
    var showEmptyQuestionsDialog by remember { mutableStateOf(false) }

    val categories = GyanixData.categories

    // Calculate available questions dynamically
    val availableQuestionsCount = remember(
        questionSource, selectedSingleCategoryId, selectedMultipleCategoryIds, targetTopicId, targetTopicTitle
    ) {
        when (questionSource) {
            QuestionSource.TOPIC -> {
                val catId = initialCategoryId ?: selectedSingleCategoryId
                QuizQuestionDatabase.getAvailableCount(catId, targetTopicId ?: "", targetTopicTitle ?: "")
            }
            QuestionSource.SINGLE_CATEGORY -> {
                QuizQuestionDatabase.getAvailableCountForCategory(selectedSingleCategoryId)
            }
            QuestionSource.MULTIPLE_CATEGORIES -> {
                selectedMultipleCategoryIds.sumOf { QuizQuestionDatabase.getAvailableCountForCategory(it) }
            }
            QuestionSource.RANDOM_GK -> {
                QuizQuestionDatabase.allQuestions.size
            }
        }
    }

    val effectiveCategoryIds = when (questionSource) {
        QuestionSource.TOPIC -> setOf(initialCategoryId ?: selectedSingleCategoryId)
        QuestionSource.SINGLE_CATEGORY -> setOf(selectedSingleCategoryId)
        QuestionSource.MULTIPLE_CATEGORIES -> selectedMultipleCategoryIds
        QuestionSource.RANDOM_GK -> categories.map { it.id }.toSet()
    }

    val selectedCategoryTitle = categories.find { it.id == (initialCategoryId ?: selectedSingleCategoryId) }?.titleHindi ?: "GK Subject"

    val testTitle = when (questionSource) {
        QuestionSource.TOPIC -> "$selectedCategoryTitle — ${targetTopicHindi ?: targetTopicTitle ?: "Topic"} Mock"
        QuestionSource.SINGLE_CATEGORY -> "$selectedCategoryTitle Mock Test"
        QuestionSource.MULTIPLE_CATEGORIES -> "${selectedMultipleCategoryIds.size} Subjects Custom Mock"
        QuestionSource.RANDOM_GK -> "Full GK Speed Mock"
    }

    val quizConfig = remember(
        testTitle, questionCount, difficulty, language, questionSource, effectiveCategoryIds,
        targetTopicId, targetTopicTitle, targetTopicHindi, timeLimitMinutes, negativeMarking
    ) {
        QuizConfig(
            testTitle = testTitle,
            questionCount = questionCount,
            difficulty = difficulty,
            language = language,
            questionSource = questionSource,
            selectedCategoryIds = effectiveCategoryIds,
            targetTopicId = targetTopicId,
            targetTopicTitle = targetTopicTitle,
            targetTopicHindi = targetTopicHindi,
            timeLimitMinutes = timeLimitMinutes,
            negativeMarking = negativeMarking,
            marksPerCorrect = 1.0f
        )
    }

    if (showEmptyQuestionsDialog) {
        AlertDialog(
            onDismissRequest = { showEmptyQuestionsDialog = false },
            icon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    tint = RoyalBlue400,
                    contentDescription = null,
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
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "वर्तमान में इस टॉपिक के लिए डेटाबेस में कोई प्रश्न उपलब्ध नहीं है। जैसे ही प्रश्न जोड़े जाएंगे, आप तुरंत टेस्ट शुरू कर सकेंगे।",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = { showEmptyQuestionsDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600)
                ) {
                    Text("OK / ठीक है")
                }
            }
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("test_configuration_screen")
    ) {
        // Top Navigation Bar with Breadcrumb
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBack,
                    modifier = Modifier.testTag("btn_config_back")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Column {
                    Text(
                        text = "Mock Test Configuration",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                    Text(
                        text = "मॉक टेस्ट सेटअप • ${if (isTopicSpecific) targetTopicHindi ?: targetTopicTitle ?: "" else "कस्टम परीक्षा सेटअप"}",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }

            // Breadcrumb Trail
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
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                    Icon(
                        imageVector = Icons.Default.ChevronRight,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(14.dp)
                    )
                    Text(
                        text = selectedCategoryTitle,
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = RoyalBlue400,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    if (isTopicSpecific) {
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(14.dp)
                        )
                        Text(
                            text = targetTopicHindi ?: targetTopicTitle ?: "Topic",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = MaterialTheme.colorScheme.onSurface,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Icon(
                        imageVector = Icons.Default.ChevronRight,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(14.dp)
                    )
                    Text(
                        text = "Mock Test",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = SuccessGreen,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = GyanixDimens.screenPadding),
            contentPadding = PaddingValues(top = 8.dp, bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // ZERO QUESTIONS WARNING BANNER (IF APPLICABLE)
            if (availableQuestionsCount == 0) {
                item {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(GyanixDimens.radiusLg),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        border = BorderStroke(1.dp, WarningAmber.copy(alpha = 0.4f))
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null,
                                tint = WarningAmber,
                                modifier = Modifier.size(24.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "No questions are available for this topic yet.",
                                    style = MaterialTheme.typography.titleSmall.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "Available Questions: 0 • Tests are generated dynamically once questions are added.",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                )
                            }
                        }
                    }
                }
            }

            // 1. QUESTION SCOPE / SOURCE
            if (!isTopicSpecific) {
                item {
                    SectionCard(
                        title = "1. Question Scope / विषय चयन",
                        icon = Icons.Default.Layers
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            listOf(
                                QuestionSource.SINGLE_CATEGORY,
                                QuestionSource.MULTIPLE_CATEGORIES,
                                QuestionSource.RANDOM_GK
                            ).forEach { source ->
                                val isSelected = questionSource == source
                                Surface(
                                    onClick = { questionSource = source },
                                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                                    color = if (isSelected) RoyalBlue600.copy(alpha = 0.15f) else MaterialTheme.colorScheme.surface,
                                    border = BorderStroke(
                                        if (isSelected) 1.5.dp else 1.dp,
                                        if (isSelected) RoyalBlue500 else MaterialTheme.colorScheme.outline
                                    ),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("source_option_${source.name}")
                                ) {
                                    Row(
                                        modifier = Modifier.padding(12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(22.dp)
                                                .background(
                                                    if (isSelected) RoyalBlue600 else Color.Transparent,
                                                    CircleShape
                                                )
                                                .border(
                                                    1.5.dp,
                                                    if (isSelected) RoyalBlue500 else MaterialTheme.colorScheme.outline,
                                                    CircleShape
                                                ),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            if (isSelected) {
                                                Icon(
                                                    imageVector = Icons.Default.Check,
                                                    contentDescription = null,
                                                    tint = Color.White,
                                                    modifier = Modifier.size(12.dp)
                                                )
                                            }
                                        }

                                        Spacer(modifier = Modifier.width(12.dp))

                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = source.displayName,
                                                style = MaterialTheme.typography.bodyMedium.copy(
                                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                                    color = MaterialTheme.colorScheme.onSurface
                                                )
                                            )
                                            Text(
                                                text = source.description,
                                                style = MaterialTheme.typography.bodySmall.copy(
                                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                                )
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                item {
                    SectionCard(
                        title = "1. Topic Scope / चयनित विषय",
                        icon = Icons.Default.Layers
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(
                                    text = targetTopicHindi ?: targetTopicTitle ?: "Topic",
                                    style = MaterialTheme.typography.titleMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                )
                                Text(
                                    text = "Category: $selectedCategoryTitle (Strict Isolation)",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                )
                            }
                            GyanixBadge(
                                text = "Topic Isolated",
                                backgroundColor = RoyalBlue600.copy(alpha = 0.15f),
                                textColor = RoyalBlue400
                            )
                        }
                    }
                }
            }

            // 2. QUESTION COUNT SELECTOR (10, 25, 50, 100)
            item {
                SectionCard(
                    title = "2. Question Count / प्रश्नों की संख्या",
                    icon = Icons.Default.FormatListNumbered
                ) {
                    val countOptions = listOf(10, 25, 50, 100)

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        countOptions.forEach { count ->
                            val isSelected = questionCount == count
                            Surface(
                                onClick = { questionCount = count },
                                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                                color = if (isSelected) RoyalBlue600 else MaterialTheme.colorScheme.surface,
                                border = BorderStroke(
                                    1.dp,
                                    if (isSelected) RoyalBlue500 else MaterialTheme.colorScheme.outline
                                ),
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("count_btn_$count")
                            ) {
                                Column(
                                    modifier = Modifier.padding(vertical = 12.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = "$count",
                                        style = MaterialTheme.typography.titleLarge.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface
                                        )
                                    )
                                    Text(
                                        text = "MCQs",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            color = if (isSelected) Color.White.copy(alpha = 0.8f) else MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 3. DIFFICULTY SELECTOR (Easy, Moderate, Hard, Mixed)
            item {
                SectionCard(
                    title = "3. Difficulty Level / कठिनाई स्तर",
                    icon = Icons.Default.Speed
                ) {
                    val diffList = listOf("Easy", "Moderate", "Hard", "Mixed")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        diffList.forEach { diff ->
                            val isSelected = difficulty == diff
                            val badgeColor = when (diff) {
                                "Easy" -> SuccessGreen
                                "Moderate" -> WarningAmber
                                "Hard" -> ErrorRed
                                else -> PurpleAccent
                            }

                            Surface(
                                onClick = { difficulty = diff },
                                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                                color = if (isSelected) badgeColor.copy(alpha = 0.2f) else MaterialTheme.colorScheme.surface,
                                border = BorderStroke(
                                    if (isSelected) 1.5.dp else 1.dp,
                                    if (isSelected) badgeColor else MaterialTheme.colorScheme.outline
                                ),
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("diff_btn_$diff")
                            ) {
                                Column(
                                    modifier = Modifier.padding(vertical = 10.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = diff,
                                        style = MaterialTheme.typography.bodyMedium.copy(
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                            color = if (isSelected) badgeColor else MaterialTheme.colorScheme.onSurface
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 4. TIME LIMIT (No Timer, 10m, 20m, 30m, 60m)
            item {
                SectionCard(
                    title = "4. Timer / समय सीमा",
                    icon = Icons.Default.Timer
                ) {
                    val timeOptions = listOf(
                        0 to "No Timer",
                        10 to "10 Mins",
                        20 to "20 Mins",
                        30 to "30 Mins",
                        60 to "60 Mins"
                    )

                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        timeOptions.forEach { (mins, label) ->
                            val isSelected = timeLimitMinutes == mins
                            Surface(
                                onClick = { timeLimitMinutes = mins },
                                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                                color = if (isSelected) ElectricCyan500.copy(alpha = 0.15f) else MaterialTheme.colorScheme.surface,
                                border = BorderStroke(
                                    1.dp,
                                    if (isSelected) ElectricCyan400 else MaterialTheme.colorScheme.outline
                                ),
                                modifier = Modifier.testTag("time_btn_$mins")
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Timer,
                                        contentDescription = null,
                                        tint = if (isSelected) ElectricCyan400 else MaterialTheme.colorScheme.onSurfaceVariant,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = label,
                                        style = MaterialTheme.typography.bodyMedium.copy(
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                            color = if (isSelected) ElectricCyan400 else MaterialTheme.colorScheme.onSurface
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 5. NEGATIVE MARKING (None, -0.25, -0.50)
            item {
                SectionCard(
                    title = "5. Negative Marking / नकारात्मक अंकन",
                    icon = Icons.Default.RemoveCircleOutline
                ) {
                    val negativeOptions = listOf(
                        0.0f to "None (0.00)",
                        -0.25f to "-0.25 (1/4th)",
                        -0.50f to "-0.50 (1/2nd)"
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        negativeOptions.forEach { (negVal, label) ->
                            val isSelected = negativeMarking == negVal
                            Surface(
                                onClick = { negativeMarking = negVal },
                                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                                color = if (isSelected) RoyalBlue600.copy(alpha = 0.18f) else MaterialTheme.colorScheme.surface,
                                border = BorderStroke(
                                    if (isSelected) 1.5.dp else 1.dp,
                                    if (isSelected) RoyalBlue500 else MaterialTheme.colorScheme.outline
                                ),
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("neg_btn_$negVal")
                            ) {
                                Column(
                                    modifier = Modifier.padding(vertical = 10.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = label,
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                            color = if (isSelected) RoyalBlue400 else MaterialTheme.colorScheme.onSurface
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 6. LANGUAGE MODE (Hindi, English)
            item {
                SectionCard(
                    title = "6. Language / भाषा",
                    icon = Icons.Default.Translate
                ) {
                    val languageOptions = listOf(
                        "Hindi" to "Hindi (हिन्दी)",
                        "English" to "English (अंग्रेज़ी)"
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        languageOptions.forEach { (langVal, label) ->
                            val isSelected = language == langVal
                            Surface(
                                onClick = { language = langVal },
                                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                                color = if (isSelected) RoyalBlue600.copy(alpha = 0.18f) else MaterialTheme.colorScheme.surface,
                                border = BorderStroke(
                                    if (isSelected) 1.5.dp else 1.dp,
                                    if (isSelected) RoyalBlue500 else MaterialTheme.colorScheme.outline
                                ),
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("lang_btn_$langVal")
                            ) {
                                Column(
                                    modifier = Modifier.padding(vertical = 12.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = label,
                                        style = MaterialTheme.typography.bodyMedium.copy(
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                            color = if (isSelected) RoyalBlue400 else MaterialTheme.colorScheme.onSurface
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 7. START TEST / PROCEED BUTTON
            item {
                Button(
                    onClick = {
                        if (availableQuestionsCount == 0) {
                            showEmptyQuestionsDialog = true
                        } else {
                            onProceedToInstructions(quizConfig)
                        }
                    },
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = RoyalBlue600,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                        .testTag("btn_proceed_instructions")
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = if (availableQuestionsCount == 0) "Start Mock Test / टेस्ट शुरू करें" else "Proceed to Test Instructions",
                            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SectionCard(
    title: String,
    icon: ImageVector,
    content: @Composable () -> Unit
) {
    Card(
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = RoyalBlue400,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }
            Spacer(modifier = Modifier.height(14.dp))
            content()
        }
    }
}
