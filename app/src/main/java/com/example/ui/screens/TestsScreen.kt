package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.ui.components.GyanixFilterChip
import com.example.ui.components.GyanixTestCard
import com.example.ui.model.ExamTestItem
import com.example.ui.theme.GyanixDimens

@Composable
fun TestsScreen(
    onStartTest: (ExamTestItem) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedFilter by remember { mutableStateOf("All Tests") }
    val tabs = listOf("All Tests", "Full Mock", "Subject Wise", "Previous Year (PYQ)", "Speed Test")

    val sampleTests = remember {
        listOf(
            ExamTestItem(
                id = "mock_1",
                title = "UPSC Prelims General Studies Mock #01",
                categoryName = "Comprehensive GK (All 10 Subjects)",
                questionsCount = 100,
                durationMinutes = 120,
                totalMarks = 200,
                negativeMarking = "-0.66",
                difficulty = "UPSC Standard",
                attemptsCount = 4280,
                isFeatured = true,
                tag = "Full Mock"
            ),
            ExamTestItem(
                id = "mock_2",
                title = "Indian Polity & Constitution High-Yield Test",
                categoryName = "Articles, Amendments & Supreme Court Judgments",
                questionsCount = 50,
                durationMinutes = 45,
                totalMarks = 100,
                negativeMarking = "-0.50",
                difficulty = "Moderate",
                attemptsCount = 6120,
                tag = "Subject Wise"
            ),
            ExamTestItem(
                id = "mock_3",
                title = "SSC CGL 2024 Tier-1 GK Paper (Shift 1)",
                categoryName = "Official Previous Year Exam Paper",
                questionsCount = 25,
                durationMinutes = 20,
                totalMarks = 50,
                negativeMarking = "-0.50",
                difficulty = "Exam Level",
                attemptsCount = 8940,
                tag = "Previous Year (PYQ)"
            ),
            ExamTestItem(
                id = "mock_4",
                title = "Indian Freedom Struggle & Modern History Speed Drill",
                categoryName = "1857 to 1947 Major Events & Personalities",
                questionsCount = 30,
                durationMinutes = 15,
                totalMarks = 60,
                negativeMarking = "-0.33",
                difficulty = "Speed Drill",
                attemptsCount = 3150,
                tag = "Speed Test"
            ),
            ExamTestItem(
                id = "mock_5",
                title = "Rajasthan Special GK & Art & Culture Mock",
                categoryName = "RAS / RSMSSB Targeted GK Exam",
                questionsCount = 60,
                durationMinutes = 60,
                totalMarks = 120,
                negativeMarking = "-0.33",
                difficulty = "State Exam",
                attemptsCount = 2480,
                tag = "Subject Wise"
            )
        )
    }

    val filteredTests = remember(selectedFilter) {
        if (selectedFilter == "All Tests") sampleTests
        else sampleTests.filter { it.tag.contains(selectedFilter, ignoreCase = true) || selectedFilter.contains(it.tag, ignoreCase = true) }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = GyanixDimens.screenPadding)
            .testTag("tests_screen_content")
    ) {
        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Competitive Exam Test Series",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        )

        Text(
            text = "Timed mock tests with negative marking & ranking simulator",
            style = MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Tabs Row
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 4.dp)
        ) {
            items(tabs) { tab ->
                GyanixFilterChip(
                    text = tab,
                    isSelected = selectedFilter == tab,
                    onClick = { selectedFilter = tab }
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Test Cards List
        LazyColumn(
            contentPadding = PaddingValues(top = 4.dp, bottom = 90.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(filteredTests) { testItem ->
                GyanixTestCard(
                    testItem = testItem,
                    onStartTest = { onStartTest(testItem) }
                )
            }
        }
    }
}
