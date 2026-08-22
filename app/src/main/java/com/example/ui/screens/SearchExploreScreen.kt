package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material.icons.filled.TrendingUp
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
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixCategoryCard
import com.example.ui.components.GyanixSearchBar
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.model.GkCategory
import com.example.ui.model.GkQuestion
import com.example.ui.model.GkTopicItem
import com.example.ui.model.GyanixData
import com.example.ui.model.QuizQuestionDatabase
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SearchExploreScreen(
    onCategorySelect: (GkCategory) -> Unit,
    onTopicSelect: (GkCategory, GkTopicItem) -> Unit,
    onStartGenericPractice: () -> Unit,
    onBack: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }
    val recentSearches = remember {
        mutableStateListOf(
            "Fundamental Rights",
            "1857 Revolt",
            "Indus Valley Civilization",
            "Western Ghats",
            "NITI Aayog",
            "GST Constitutional Amendment",
            "Thar Desert Rivers"
        )
    }

    val popularTopics = remember {
        listOf(
            "Indian Constitution Articles",
            "Freedom Movement & Leaders",
            "National Parks & Sanctuaries",
            "Mughal Dynasty History",
            "Everyday Science & Laws",
            "Rajasthan Forts & Heritage",
            "UN & Global Organizations",
            "Olympics & Major Trophies",
            "UNESCO Heritage Sites"
        )
    }

    // Search Result Matches
    val matchingCategories = remember(searchQuery) {
        if (searchQuery.isBlank()) emptyList()
        else GyanixData.categories.filter { cat ->
            cat.title.contains(searchQuery, ignoreCase = true) ||
                    cat.titleHindi.contains(searchQuery, ignoreCase = true) ||
                    cat.subtitle.contains(searchQuery, ignoreCase = true)
        }
    }

    val matchingTopics = remember(searchQuery) {
        if (searchQuery.isBlank()) emptyList()
        else {
            GyanixData.categories.flatMap { cat ->
                cat.subtopics.filter { top ->
                    top.title.contains(searchQuery, ignoreCase = true) ||
                            top.titleHindi.contains(searchQuery, ignoreCase = true)
                }.map { top -> cat to top }
            }
        }
    }

    val matchingQuestions = remember<List<GkQuestion>>(searchQuery) {
        val trimmed = searchQuery.trim()
        if (trimmed.length < 2) emptyList()
        else {
            QuizQuestionDatabase.allQuestions.asSequence().filter { q: GkQuestion ->
                q.questionEnglish.contains(trimmed, ignoreCase = true) ||
                        q.questionHindi.contains(trimmed, ignoreCase = true) ||
                        q.subtopic.contains(trimmed, ignoreCase = true) ||
                        q.id.equals(trimmed, ignoreCase = true)
            }.take(25).toList()
        }
    }

    val suggestedTopics = remember {
        listOf(
            GyanixData.categories[0] to GyanixData.categories[0].subtopics[3], // 1857 Revolt
            GyanixData.categories[1] to GyanixData.categories[1].subtopics[1], // Fundamental Rights
            GyanixData.categories[2] to GyanixData.categories[2].subtopics[1], // Rivers
            GyanixData.categories[3] to GyanixData.categories[3].subtopics[3], // Human Anatomy
            GyanixData.categories[8] to GyanixData.categories[8].subtopics[0]  // First in India
        )
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("search_explore_screen"),
        contentPadding = PaddingValues(
            start = GyanixDimens.screenPadding,
            end = GyanixDimens.screenPadding,
            top = 8.dp,
            bottom = 96.dp
        ),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Top Header
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
                        modifier = Modifier.testTag("btn_search_back")
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
                        text = "Search & Explore",
                        style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                    Text(
                        text = "Find questions, topics, categories & practice modules",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }
        }

        // Search Input Box
        item {
            GyanixSearchBar(
                query = searchQuery,
                onQueryChange = { searchQuery = it },
                onClear = { searchQuery = "" },
                placeholder = "Search GK topics, categories, questions..."
            )
        }

        if (searchQuery.isNotBlank()) {
            // Live Search Results Mode
            item {
                Text(
                    text = "Search Results for \"$searchQuery\"",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
            }

            if (matchingCategories.isEmpty() && matchingTopics.isEmpty() && matchingQuestions.isEmpty()) {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                            modifier = Modifier.size(48.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "No matching GK questions, topics or categories found",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = onStartGenericPractice,
                            colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600)
                        ) {
                            Text("Try Random Test Instead")
                        }
                    }
                }
            }

            if (matchingCategories.isNotEmpty()) {
                item {
                    GyanixSectionHeader(title = "Matched Categories (${matchingCategories.size})")
                }
                items(matchingCategories) { cat ->
                    GyanixCategoryCard(
                        category = cat,
                        onClick = { onCategorySelect(cat) }
                    )
                }
            }

            if (matchingTopics.isNotEmpty()) {
                item {
                    GyanixSectionHeader(title = "Matched Topics (${matchingTopics.size})")
                }
                items(matchingTopics) { (parentCategory, topic) ->
                    MatchedTopicCard(
                        parentCategory = parentCategory,
                        topic = topic,
                        onClick = { onTopicSelect(parentCategory, topic) }
                    )
                }
            }

            if (matchingQuestions.isNotEmpty()) {
                item {
                    GyanixSectionHeader(title = "Matched Questions (${matchingQuestions.size})")
                }
                items(matchingQuestions, key = { it.id }) { q ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                            .testTag("search_q_${q.id}"),
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
                                GyanixBadge(
                                    text = q.id,
                                    backgroundColor = RoyalBlue600.copy(alpha = 0.2f),
                                    textColor = ElectricCyan400
                                )
                                Text(
                                    text = "${q.category} • ${q.subtopic}",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    ),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = q.questionHindi,
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    fontWeight = FontWeight.Medium,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            if (q.questionEnglish != q.questionHindi) {
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = q.questionEnglish,
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "Ans: ${q.optionsEnglish.getOrNull(q.correctAnswerIndex) ?: q.optionsHindi[q.correctAnswerIndex]}",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = SuccessGreen
                                )
                            )
                        }
                    }
                }
            }
        } else {
            // Idle / Explore Mode

            // 1. Recent Searches
            if (recentSearches.isNotEmpty()) {
                item {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        GyanixSectionHeader(
                            title = "Recent Searches",
                            actionText = "Clear All",
                            onActionClick = { recentSearches.clear() }
                        )

                        FlowRow(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            recentSearches.forEach { query ->
                                RecentSearchChip(
                                    text = query,
                                    onClick = { searchQuery = query },
                                    onRemove = { recentSearches.remove(query) }
                                )
                            }
                        }
                    }
                }
            }

            // 2. Popular Topics
            item {
                Column(modifier = Modifier.fillMaxWidth()) {
                    GyanixSectionHeader(
                        title = "Popular Topics",
                        actionText = "Trending"
                    )

                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        popularTopics.forEach { topicTitle ->
                            PopularTopicTag(
                                title = topicTitle,
                                onClick = {
                                    searchQuery = topicTitle
                                }
                            )
                        }
                    }
                }
            }

            // 3. Trending Practice Categories
            item {
                Column(modifier = Modifier.fillMaxWidth()) {
                    GyanixSectionHeader(
                        title = "Trending Practice Categories",
                        actionText = "View All"
                    )

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        val trending = GyanixData.categories.take(5)
                        items(trending) { cat ->
                            TrendingCategoryMiniCard(
                                category = cat,
                                onClick = { onCategorySelect(cat) }
                            )
                        }
                    }
                }
            }

            // 4. Suggested High-Yield Topics List
            item {
                GyanixSectionHeader(
                    title = "Suggested High-Yield Topics",
                    actionText = "Speed Practice"
                )
            }

            items(suggestedTopics) { (parentCat, topic) ->
                MatchedTopicCard(
                    parentCategory = parentCat,
                    topic = topic,
                    onClick = { onTopicSelect(parentCat, topic) }
                )
            }
        }
    }
}

@Composable
private fun RecentSearchChip(
    text: String,
    onClick: () -> Unit,
    onRemove: () -> Unit
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(GyanixDimens.radiusSm),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.History,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.labelSmall.copy(
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .clickable(onClick = onRemove),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Remove",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(12.dp)
                )
            }
        }
    }
}

@Composable
private fun PopularTopicTag(
    title: String,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(GyanixDimens.radiusSm),
        colors = CardDefaults.cardColors(containerColor = RoyalBlue600.copy(alpha = 0.12f)),
        border = BorderStroke(1.dp, RoyalBlue400.copy(alpha = 0.3f))
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.LocalFireDepartment,
                contentDescription = null,
                tint = WarningAmber,
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
        }
    }
}

@Composable
private fun TrendingCategoryMiniCard(
    category: GkCategory,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier
            .width(160.dp)
            .testTag("trending_cat_${category.id}"),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, category.accentColor.copy(alpha = 0.4f))
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .background(category.accentColor.copy(alpha = 0.15f), RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = category.icon,
                    contentDescription = null,
                    tint = category.accentColor,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = category.title,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = "${category.questionCount} Questions",
                style = MaterialTheme.typography.labelSmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }
    }
}

@Composable
private fun MatchedTopicCard(
    parentCategory: GkCategory,
    topic: GkTopicItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .testTag("matched_topic_${topic.id}"),
        shape = RoundedCornerShape(GyanixDimens.radiusMd),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .background(parentCategory.accentColor.copy(alpha = 0.15f), RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = parentCategory.icon,
                        contentDescription = null,
                        tint = parentCategory.accentColor,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = topic.title,
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "${parentCategory.title} • ${topic.questionCount} MCQs",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                GyanixBadge(
                    text = topic.difficulty,
                    backgroundColor = parentCategory.accentColor.copy(alpha = 0.12f),
                    textColor = parentCategory.accentColor
                )
                Spacer(modifier = Modifier.width(6.dp))
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}
