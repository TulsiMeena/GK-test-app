package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
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
import androidx.compose.material.icons.automirrored.filled.HelpOutline
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
import com.example.ui.data.GyanixLocalDataManager
import com.example.ui.model.GkCategory
import com.example.ui.model.GkTopicItem
import com.example.ui.model.GyanixData
import com.example.ui.model.QuestionSource
import com.example.ui.model.QuizConfig
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ElectricCyan500
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * Mock Test Center Screen
 * Purely Topic-Wise Mocks:
 * 1. Select Category -> View all Topics for that category.
 * 2. Tap ANY Topic -> Navigates to a DEDICATED SEPARATE PAGE showing all 5 Mock Tests of that specific topic.
 * 3. On the Topic Page, select any Mock Test (Mock 1 to 5) to start the 15-question test with full exam conditions.
 */
@Composable
fun MockTestCenterScreen(
    onStartMockTest: (QuizConfig) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedLanguage by remember { mutableStateOf("Hindi") }
    var selectedCategory by remember { mutableStateOf(GyanixData.categories.first()) }
    var selectedTopicForMocks by remember { mutableStateOf<GkTopicItem?>(null) }
    var searchQuery by remember { mutableStateOf("") }
    var showNoQuestionsDialog by remember { mutableStateOf<String?>(null) }

    // Dialog when topic has 0 questions
    if (showNoQuestionsDialog != null) {
        AlertDialog(
            onDismissRequest = { showNoQuestionsDialog = null },
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
                Text(
                    text = "इस टॉपिक ($showNoQuestionsDialog) के लिए प्रश्न जल्द ही जोड़े जाएंगे। कृपया भारतीय इतिहास या अन्य उपलब्ध टॉपिक का चयन करें।",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            },
            confirmButton = {
                TextButton(onClick = { showNoQuestionsDialog = null }) {
                    Text("OK / ठीक है", color = RoyalBlue400, fontWeight = FontWeight.Bold)
                }
            }
        )
    }

    AnimatedContent(
        targetState = selectedTopicForMocks,
        transitionSpec = {
            if (targetState != null) {
                slideInHorizontally { width -> width } togetherWith slideOutHorizontally { width -> -width }
            } else {
                slideInHorizontally { width -> -width } togetherWith slideOutHorizontally { width -> width }
            }
        },
        label = "MockTestScreenTransition"
    ) { activeTopic ->
        if (activeTopic != null) {
            // =========================================================================
            // DEDICATED SEPARATE PAGE: TOPIC'S ALL 5 MOCK TESTS
            // =========================================================================
            TopicAllMocksScreen(
                category = selectedCategory,
                topic = activeTopic,
                selectedLanguage = selectedLanguage,
                onLanguageToggle = {
                    selectedLanguage = if (selectedLanguage.equals("Hindi", ignoreCase = true)) "English" else "Hindi"
                },
                onNavigateBack = {
                    selectedTopicForMocks = null
                },
                onStartMockTestNumber = { mockNumber ->
                    val availableCount = QuizQuestionDatabase.getAvailableCount(
                        selectedCategory.id,
                        activeTopic.id,
                        activeTopic.title
                    )
                    if (availableCount == 0) {
                        showNoQuestionsDialog = activeTopic.titleHindi
                    } else {
                        val config = QuizConfig(
                            testTitle = "${activeTopic.titleHindi} — Mock Test $mockNumber",
                            questionCount = 15,
                            timeLimitMinutes = 15,
                            difficulty = when (mockNumber) {
                                1 -> "Easy"
                                2, 3 -> "Moderate"
                                else -> "Hard"
                            },
                            language = selectedLanguage,
                            questionSource = QuestionSource.TOPIC,
                            selectedCategoryIds = setOf(selectedCategory.id),
                            targetTopicId = activeTopic.id,
                            targetTopicTitle = activeTopic.title,
                            targetTopicHindi = "${activeTopic.titleHindi} (Mock $mockNumber)",
                            negativeMarking = -0.25f
                        )
                        onStartMockTest(config)
                    }
                },
                modifier = modifier
            )
        } else {
            // =========================================================================
            // MAIN PAGE: TOPIC LISTING PER CATEGORY
            // =========================================================================
            TopicListScreen(
                selectedCategory = selectedCategory,
                selectedLanguage = selectedLanguage,
                searchQuery = searchQuery,
                onSearchQueryChange = { searchQuery = it },
                onSelectCategory = { selectedCategory = it },
                onLanguageToggle = {
                    selectedLanguage = if (selectedLanguage.equals("Hindi", ignoreCase = true)) "English" else "Hindi"
                },
                onSelectTopic = { topic ->
                    val count = QuizQuestionDatabase.getAvailableCount(
                        selectedCategory.id,
                        topic.id,
                        topic.title
                    )
                    if (count == 0 && selectedCategory.id != "history") {
                        showNoQuestionsDialog = topic.titleHindi
                    } else {
                        selectedTopicForMocks = topic
                    }
                },
                modifier = modifier
            )
        }
    }
}

/**
 * Main Topic Listing Screen
 */
@Composable
private fun TopicListScreen(
    selectedCategory: GkCategory,
    selectedLanguage: String,
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onSelectCategory: (GkCategory) -> Unit,
    onLanguageToggle: () -> Unit,
    onSelectTopic: (GkTopicItem) -> Unit,
    modifier: Modifier = Modifier
) {
    val filteredTopics = remember(selectedCategory, searchQuery) {
        if (searchQuery.isBlank()) {
            selectedCategory.subtopics
        } else {
            selectedCategory.subtopics.filter {
                it.title.contains(searchQuery, ignoreCase = true) ||
                it.titleHindi.contains(searchQuery, ignoreCase = true)
            }
        }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("mock_test_center_screen"),
        contentPadding = PaddingValues(bottom = 96.dp)
    ) {
        // 1. SCREEN HEADER
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding)
                    .padding(top = 16.dp, bottom = 12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Topic Wise Mock Tests",
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground
                            ),
                            modifier = Modifier.testTag("mock_tests_title")
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "टॉपिक पर क्लिक करें और उसके सभी 5 मॉक टेस्ट देखें",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    }

                    // Language switcher
                    Surface(
                        onClick = onLanguageToggle,
                        shape = RoundedCornerShape(GyanixDimens.radiusMd),
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                        modifier = Modifier.testTag("mock_lang_toggle")
                    ) {
                        Text(
                            text = if (selectedLanguage.equals("Hindi", ignoreCase = true)) "हिन्दी" else "ENG",
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = ElectricCyan400
                            ),
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 7.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Search Bar for Topics
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = onSearchQueryChange,
                    placeholder = {
                        Text(
                            text = "Search topic (जैसे: सिन्धु घाटी, वैदिक, मौर्य, 1857...)",
                            style = MaterialTheme.typography.bodyMedium.copy(fontSize = 13.sp)
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    singleLine = true,
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = RoyalBlue400,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f),
                        focusedContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
                        unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("topic_search_field")
                )
            }
        }

        // 2. CATEGORY SELECTOR CHIPS
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
            ) {
                Text(
                    text = "Select Category / विषय चुनें:",
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                LazyRow(
                    contentPadding = PaddingValues(horizontal = GyanixDimens.screenPadding),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(GyanixData.categories, key = { it.id }) { cat ->
                        val isSelected = selectedCategory.id == cat.id
                        Surface(
                            onClick = { onSelectCategory(cat) },
                            shape = RoundedCornerShape(GyanixDimens.radiusMd),
                            color = if (isSelected) cat.accentColor.copy(alpha = 0.2f) else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                            border = BorderStroke(
                                1.5.dp,
                                if (isSelected) cat.accentColor else MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)
                            ),
                            modifier = Modifier.testTag("cat_chip_${cat.id}")
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                            ) {
                                Icon(
                                    imageVector = cat.icon,
                                    contentDescription = null,
                                    tint = if (isSelected) cat.accentColor else MaterialTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = cat.titleHindi,
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                        color = if (isSelected) cat.accentColor else MaterialTheme.colorScheme.onSurface
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }

        // 3. CATEGORY HEADER SUMMARY
        item {
            Surface(
                shape = RoundedCornerShape(GyanixDimens.radiusMd),
                color = selectedCategory.accentColor.copy(alpha = 0.10f),
                border = BorderStroke(1.dp, selectedCategory.accentColor.copy(alpha = 0.3f)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "${selectedCategory.titleHindi} (${selectedCategory.title})",
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = selectedCategory.accentColor
                            )
                        )
                        Text(
                            text = "${filteredTopics.size} टॉपिक्स • प्रत्येक टॉपिक में 10 मॉक टेस्ट (15 Qs)",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 11.5.sp
                            )
                        )
                    }

                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = selectedCategory.accentColor.copy(alpha = 0.2f)
                    ) {
                        Text(
                            text = "${filteredTopics.size * 10} Mocks",
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = selectedCategory.accentColor
                            ),
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }

        // 4. TOPIC CARDS (Clicking any opens its dedicated page)
        items(filteredTopics, key = { it.id }) { topic ->
            val availableCount = remember(selectedCategory.id, topic.id) {
                QuizQuestionDatabase.getAvailableCount(selectedCategory.id, topic.id, topic.title)
            }

            TopicNavigationCard(
                category = selectedCategory,
                topic = topic,
                availableCount = availableCount,
                onClick = { onSelectTopic(topic) }
            )
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

/**
 * Topic Card in the main list:
 * Tapping opens the dedicated Topic Mocks Screen
 */
@Composable
private fun TopicNavigationCard(
    category: GkCategory,
    topic: GkTopicItem,
    availableCount: Int,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = GyanixDimens.screenPadding)
            .testTag("topic_card_${topic.id}"),
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.55f)
        ),
        border = BorderStroke(
            1.dp,
            category.accentColor.copy(alpha = 0.35f)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = category.accentColor.copy(alpha = 0.15f)
                    ) {
                        val mockTotal = if (availableCount > 0) (availableCount / 15).coerceAtLeast(1) else 10
                        Text(
                            text = "$mockTotal MOCK TESTS",
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = category.accentColor,
                                fontSize = 10.sp
                            ),
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = if (availableCount > 0) "$availableCount Questions Available" else "Coming Soon",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = if (availableCount > 0) SuccessGreen else MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = topic.titleHindi,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = topic.title,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Surface(
                shape = CircleShape,
                color = category.accentColor.copy(alpha = 0.15f),
                modifier = Modifier.size(38.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "View Mocks",
                        tint = category.accentColor,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

/**
 * =========================================================================
 * DEDICATED SEPARATE SCREEN: ALL 5 MOCKS FOR A SPECIFIC TOPIC
 * =========================================================================
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopicAllMocksScreen(
    category: GkCategory,
    topic: GkTopicItem,
    selectedLanguage: String,
    onLanguageToggle: () -> Unit,
    onNavigateBack: () -> Unit,
    onStartMockTestNumber: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    // Intercept back button to return to topic list
    BackHandler {
        onNavigateBack()
    }

    // Determine available question count and mock count dynamically
    val availableCount = QuizQuestionDatabase.getAvailableCount(
        category.id,
        topic.id,
        topic.title
    )
    val totalMocks = if (availableCount > 0) (availableCount / 15).coerceAtLeast(1) else 10

    // Check count of attempted mocks in this topic
    var attemptedCount = 0
    for (i in 1..totalMocks) {
        val testTitle = "${topic.titleHindi} — Mock Test $i"
        if (GyanixLocalDataManager.isTestAttempted(testTitle)) {
            attemptedCount++
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("topic_all_mocks_screen")
    ) {
        // TOP APP BAR WITH BACK BUTTON
        TopAppBar(
            title = {
                Column {
                    Text(
                        text = topic.titleHindi,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "${category.titleHindi} • All $totalMocks Mock Tests",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = category.accentColor,
                            fontSize = 11.5.sp
                        )
                    )
                }
            },
            navigationIcon = {
                IconButton(
                    onClick = onNavigateBack,
                    modifier = Modifier.testTag("btn_back_to_topics")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back to Topics",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                }
            },
            actions = {
                Surface(
                    onClick = onLanguageToggle,
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .testTag("topic_mocks_lang_toggle")
                ) {
                    Text(
                        text = if (selectedLanguage.equals("Hindi", ignoreCase = true)) "हिन्दी" else "ENG",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = ElectricCyan400
                        ),
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            contentPadding = PaddingValues(
                horizontal = GyanixDimens.screenPadding,
                vertical = 12.dp
            ),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // 1. TOPIC HERO SUMMARY CARD
            item {
                Card(
                    shape = RoundedCornerShape(GyanixDimens.radiusLg),
                    colors = CardDefaults.cardColors(
                        containerColor = category.accentColor.copy(alpha = 0.12f)
                    ),
                    border = BorderStroke(1.dp, category.accentColor.copy(alpha = 0.35f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                shape = RoundedCornerShape(6.dp),
                                color = category.accentColor.copy(alpha = 0.25f)
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
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = category.titleHindi,
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = category.accentColor
                                        )
                                    )
                                }
                            }

                            val qTotal = if (availableCount > 0) availableCount else totalMocks * 15
                            Text(
                                text = "$totalMocks Mocks • $qTotal Qs Total",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = topic.titleHindi,
                            style = MaterialTheme.typography.titleLarge.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        )

                        Text(
                            text = topic.title,
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )

                        Spacer(modifier = Modifier.height(12.dp))
                        HorizontalDivider(
                            color = category.accentColor.copy(alpha = 0.2f),
                            thickness = 1.dp
                        )
                        Spacer(modifier = Modifier.height(12.dp))

                        // Test specs chips row
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            SpecBadge(Icons.Default.Quiz, "15 Questions", "प्रति टेस्ट 15 प्रश्न")
                            SpecBadge(Icons.Default.AccessTime, "15 Minutes", "15 मिनट समय")
                            SpecBadge(Icons.Default.Shield, "-0.25 Mark", "नेगेटिव मार्किंग")
                        }

                        if (attemptedCount > 0) {
                            Spacer(modifier = Modifier.height(12.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "प्रगति (Progress): $attemptedCount of $totalMocks Completed",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = SuccessGreen,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                                Text(
                                    text = "${(attemptedCount * 100) / totalMocks}%",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = SuccessGreen,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            LinearProgressIndicator(
                                progress = { attemptedCount.toFloat() / totalMocks.toFloat() },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(6.dp)
                                    .clip(RoundedCornerShape(3.dp)),
                                color = SuccessGreen,
                                trackColor = MaterialTheme.colorScheme.surfaceVariant
                            )
                        }
                    }
                }
            }

            // 2. SECTION HEADER
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp, bottom = 2.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "सभी $totalMocks मॉक टेस्ट (All $totalMocks Mock Tests):",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                    Text(
                        text = "15 Qs / 15 Min",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = ElectricCyan400,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }

            // 3. ALL MOCK TEST CARDS (1 to totalMocks)
            items(totalMocks) { index ->
                val mockNumber = index + 1
                val testTitle = "${topic.titleHindi} — Mock Test $mockNumber"
                val isAttempted = GyanixLocalDataManager.isTestAttempted(testTitle)
                val bestScore = GyanixLocalDataManager.getBestScoreForTest(testTitle)

                TopicMockDetailCard(
                    mockNumber = mockNumber,
                    topicHindi = topic.titleHindi,
                    isAttempted = isAttempted,
                    bestScore = bestScore,
                    onStart = { onStartMockTestNumber(mockNumber) }
                )
            }

            // 4. TEST INSTRUCTIONS & GUIDELINES
            item {
                Card(
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)
                    ),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, bottom = 80.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null,
                                tint = ElectricCyan400,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "मॉक टेस्ट निर्देश एवं अंक योजना (Exam Pattern)",
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "• प्रत्येक सही उत्तर पर +1.00 अंक दिए जाएंगे।\n" +
                                   "• प्रत्येक गलत उत्तर पर 0.25 (1/4) अंक काटे जाएंगे।\n" +
                                   "• बिना हल किए प्रश्नों पर कोई नकारात्मक अंक नहीं है।\n" +
                                   "• टेस्ट सबमिट करने के बाद सभी 15 प्रश्नों की विस्तृत व्याख्या (Explanation) उपलब्ध होगी।",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                lineHeight = 18.sp
                            )
                        )
                    }
                }
            }
        }
    }
}

/**
 * Individual Mock Test Card on the Topic's Dedicated Screen
 */
@Composable
private fun TopicMockDetailCard(
    mockNumber: Int,
    topicHindi: String,
    isAttempted: Boolean,
    bestScore: Float?,
    onStart: () -> Unit
) {
    val levelName = when (mockNumber) {
        1 -> "बेसिक / Foundational Level"
        2 -> "मध्यम / Concept Builder"
        3 -> "अभ्यास / Conceptual Drill"
        4 -> "परीक्षा स्तर / Exam Standard 1"
        5 -> "परीक्षा स्तर / Exam Standard 2"
        6 -> "कठिन / Advanced Level 1"
        7 -> "कठिन / Advanced Level 2"
        8 -> "गहन अभ्यास / High-Yield Challenge"
        9 -> "टॉपर स्तर / Expert Mastery"
        else -> "ग्रैंड मास्टर / Ultimate Mastery"
    }

    val themeColor = when (mockNumber) {
        1 -> RoyalBlue400
        2 -> ElectricCyan400
        3 -> Color(0xFF38BDF8) // Sky Blue
        4 -> WarningAmber
        5 -> Color(0xFFFB923C) // Orange
        6 -> Color(0xFFA78BFA) // Purple
        7 -> Color(0xFF818CF8) // Indigo
        8 -> Color(0xFFEC4899) // Pink
        9 -> Color(0xFFF43F5E) // Rose
        else -> Color(0xFF10B981) // Emerald Gold/Green
    }

    Card(
        shape = RoundedCornerShape(GyanixDimens.radiusLg),
        colors = CardDefaults.cardColors(
            containerColor = if (isAttempted) {
                MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f)
            } else {
                MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.45f)
            }
        ),
        border = BorderStroke(
            1.2.dp,
            if (isAttempted) SuccessGreen.copy(alpha = 0.6f) else themeColor.copy(alpha = 0.4f)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("topic_mock_detail_card_$mockNumber")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    // Badge Number
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = themeColor.copy(alpha = 0.18f),
                        border = BorderStroke(1.dp, themeColor.copy(alpha = 0.4f)),
                        modifier = Modifier.size(44.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = "#$mockNumber",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    color = themeColor
                                )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "मॉक टेस्ट $mockNumber (Mock $mockNumber)",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            if (isAttempted) {
                                Spacer(modifier = Modifier.width(6.dp))
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = "Attempted",
                                    tint = SuccessGreen,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(2.dp))

                        Text(
                            text = levelName,
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = themeColor,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 11.5.sp
                            )
                        )
                    }
                }

                // Best Score pill if attempted
                if (isAttempted && bestScore != null) {
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = SuccessGreen.copy(alpha = 0.15f),
                        border = BorderStroke(1.dp, SuccessGreen.copy(alpha = 0.3f))
                    ) {
                        Text(
                            text = "Score: ${if (bestScore % 1f == 0f) bestScore.toInt().toString() else String.format("%.2f", bestScore)}/15",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = SuccessGreen,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            HorizontalDivider(
                color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.25f),
                thickness = 1.dp
            )
            Spacer(modifier = Modifier.height(10.dp))

            // Action row: Test specs & Start Button
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "15 प्रश्न • 15 मिनट",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontWeight = FontWeight.Medium
                        )
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "• -0.25",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = WarningAmber,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.5.sp
                        )
                    )
                }

                Button(
                    onClick = onStart,
                    shape = RoundedCornerShape(GyanixDimens.radiusMd),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isAttempted) SuccessGreen else RoyalBlue600
                    ),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    modifier = Modifier.testTag("btn_start_mock_detail_$mockNumber")
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = if (isAttempted) Icons.Default.Replay else Icons.Default.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(15.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = if (isAttempted) "पुनः टेस्ट दें" else "स्टार्ट टेस्ट",
                            style = MaterialTheme.typography.labelMedium.copy(
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

@Composable
private fun SpecBadge(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = ElectricCyan400,
            modifier = Modifier.size(18.dp)
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.labelSmall.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 11.sp
            )
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 9.5.sp
            )
        )
    }
}
