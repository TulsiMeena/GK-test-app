package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixCategoryCard
import com.example.ui.components.GyanixFilterChip
import com.example.ui.components.GyanixSearchBar
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.model.GkCategory
import com.example.ui.model.GyanixData
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.RoyalBlue400

@Composable
fun GkCategoriesScreen(
    onCategoryClick: (GkCategory) -> Unit,
    onStartPractice: (GkCategory) -> Unit,
    onBack: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedFilter by remember { mutableStateOf("All Categories") }

    val filterOptions = listOf(
        "All Categories",
        "Popular",
        "Most Practiced",
        "Weak Areas"
    )

    val filteredCategories = remember(searchQuery, selectedFilter) {
        GyanixData.categories.filter { cat ->
            val matchesSearch = if (searchQuery.isBlank()) true else {
                cat.title.contains(searchQuery, ignoreCase = true) ||
                        cat.titleHindi.contains(searchQuery, ignoreCase = true) ||
                        cat.subtitle.contains(searchQuery, ignoreCase = true) ||
                        cat.subtopics.any { it.title.contains(searchQuery, ignoreCase = true) }
            }

            val matchesFilter = when (selectedFilter) {
                "All Categories" -> true
                "Popular" -> cat.id in listOf("history", "polity", "geography", "science", "static_gk")
                "Most Practiced" -> cat.attemptedCount >= 800
                "Weak Areas" -> cat.accuracy < 80 || cat.progress < 0.50f
                else -> true
            }

            matchesSearch && matchesFilter
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("gk_categories_screen")
    ) {
        // Top App Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = GyanixDimens.screenPadding, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (onBack != null) {
                IconButton(
                    onClick = onBack,
                    modifier = Modifier.testTag("btn_categories_back")
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
                    text = "GK Categories",
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
                Text(
                    text = "Choose a subject and sharpen your knowledge.",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
        }

        // Search Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = GyanixDimens.screenPadding, vertical = 4.dp)
        ) {
            GyanixSearchBar(
                query = searchQuery,
                onQueryChange = { searchQuery = it },
                onClear = { searchQuery = "" },
                placeholder = "Search categories, subjects or topics..."
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Filter Chips Row
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .testTag("categories_filter_chips_row"),
            contentPadding = PaddingValues(horizontal = GyanixDimens.screenPadding),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(filterOptions) { filter ->
                GyanixFilterChip(
                    text = filter,
                    isSelected = selectedFilter == filter,
                    onClick = { selectedFilter = filter }
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Categories List
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .testTag("categories_lazy_column"),
            contentPadding = PaddingValues(
                start = GyanixDimens.screenPadding,
                end = GyanixDimens.screenPadding,
                top = 8.dp,
                bottom = 96.dp
            ),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$selectedFilter (${filteredCategories.size})",
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                    Text(
                        text = "10 Major GK Subjects",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = RoyalBlue400
                        )
                    )
                }
            }

            if (filteredCategories.isEmpty()) {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 40.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Default.Category,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                            modifier = Modifier.size(48.dp)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "No categories matched '$searchQuery'",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    }
                }
            }

            items(filteredCategories, key = { it.id }) { category ->
                GyanixCategoryCard(
                    category = category,
                    onClick = { onCategoryClick(category) },
                    onStartClick = { onStartPractice(category) }
                )
            }
        }
    }
}
