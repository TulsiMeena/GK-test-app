package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.ui.components.GyanixCategoryCard
import com.example.ui.components.GyanixFilterChip
import com.example.ui.components.GyanixSearchBar
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.model.GkCategory
import com.example.ui.model.GyanixData
import com.example.ui.theme.GyanixDimens

@Composable
fun PracticeScreen(
    onNavigateToCategory: (GkCategory) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedFilter by remember { mutableStateOf("All") }

    val filterOptions = listOf("All", "Core GK", "State Special", "Science & Tech", "High Yield")

    val filteredCategories = remember(searchQuery, selectedFilter) {
        GyanixData.categories.filter { cat ->
            val matchesSearch = cat.title.contains(searchQuery, ignoreCase = true) ||
                    cat.titleHindi.contains(searchQuery, ignoreCase = true) ||
                    cat.subtitle.contains(searchQuery, ignoreCase = true)

            val matchesFilter = when (selectedFilter) {
                "All" -> true
                "Core GK" -> cat.id in listOf("history", "polity", "geography", "economy")
                "State Special" -> cat.id == "rajasthan_gk"
                "Science & Tech" -> cat.id == "science"
                "High Yield" -> cat.difficulty == "High Yield"
                else -> true
            }

            matchesSearch && matchesFilter
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = GyanixDimens.screenPadding)
            .testTag("practice_screen_content")
    ) {
        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Subject-Wise GK Practice",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        )

        Text(
            text = "Select any category to practice topic-wise MCQs",
            style = MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Search Bar
        GyanixSearchBar(
            query = searchQuery,
            onQueryChange = { searchQuery = it },
            onClear = { searchQuery = "" }
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Filter Chips Row
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 4.dp)
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

        // Category Cards List
        LazyColumn(
            contentPadding = PaddingValues(top = 4.dp, bottom = 90.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(filteredCategories) { category ->
                GyanixCategoryCard(
                    category = category,
                    onClick = { onNavigateToCategory(category) }
                )
            }
        }
    }
}
