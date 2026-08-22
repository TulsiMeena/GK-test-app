package com.example.ui.screens.auth

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixLogo
import com.example.ui.components.LogoVariant
import com.example.ui.theme.DarkNavyBackground
import com.example.ui.theme.DarkNavyBorder
import com.example.ui.theme.DarkNavySurface
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ElectricCyan500
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.RoyalBlue700
import com.example.ui.theme.SuccessGreen
import kotlinx.coroutines.launch

data class OnboardingPageData(
    val pageNumber: Int,
    val title: String,
    val description: String,
    val badge: String
)

val onboardingPages = listOf(
    OnboardingPageData(
        pageNumber = 1,
        title = "Master General Knowledge",
        description = "Build a strong GK foundation with carefully organized categories and topics designed for competitive exam preparation.",
        badge = "FOUNDATION & RIGOR"
    ),
    OnboardingPageData(
        pageNumber = 2,
        title = "Practice Topic by Topic",
        description = "Choose a category, explore its topics and practice exactly what you want to improve.",
        badge = "STRUCTURED LEARNING"
    ),
    OnboardingPageData(
        pageNumber = 3,
        title = "Test Your Preparation",
        description = "Take focused mock tests, track your performance and identify the areas where you need more practice.",
        badge = "EXAM READINESS"
    )
)

@Composable
fun OnboardingScreen(
    onFinishOnboarding: () -> Unit,
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(pageCount = { 3 })
    val coroutineScope = rememberCoroutineScope()

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DarkNavyBackground)
            .statusBarsPadding()
            .navigationBarsPadding()
            .testTag("onboarding_screen")
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .widthIn(max = 640.dp)
                .align(Alignment.Center)
        ) {
            // TOP BAR: Logo + Skip / Page counter
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                GyanixLogo(
                    variant = LogoVariant.HORIZONTAL,
                    size = 28.dp,
                    showTagline = false,
                    isDarkTheme = true
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Step Counter Badge
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = DarkNavySurfaceElevated,
                        border = BorderStroke(1.dp, DarkNavyBorder)
                    ) {
                        Text(
                            text = "${pagerState.currentPage + 1} / 3",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = ElectricCyan400,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }

                    // Skip button (visible on pages 1 & 2)
                    if (pagerState.currentPage < 2) {
                        TextButton(
                            onClick = onFinishOnboarding,
                            modifier = Modifier.testTag("onboarding_skip_button")
                        ) {
                            Text(
                                text = "Skip",
                                style = MaterialTheme.typography.labelLarge.copy(
                                    color = Color(0xFF94A3B8),
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    } else {
                        Spacer(modifier = Modifier.width(48.dp))
                    }
                }
            }

            // HORIZONTAL PAGER FOR ONBOARDING SCREENS
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .testTag("onboarding_pager")
            ) { pageIndex ->
                OnboardingPageContent(
                    data = onboardingPages[pageIndex],
                    pageIndex = pageIndex
                )
            }

            // BOTTOM BAR: Indicators & Navigation Controls
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Page Indicator Dots
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 20.dp)
                ) {
                    repeat(3) { index ->
                        val isSelected = pagerState.currentPage == index
                        Box(
                            modifier = Modifier
                                .padding(horizontal = 4.dp)
                                .height(6.dp)
                                .width(if (isSelected) 24.dp else 6.dp)
                                .clip(CircleShape)
                                .background(
                                    if (isSelected) ElectricCyan400 else Color(0xFF334155)
                                )
                        )
                    }
                }

                // Action Buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Back Button (Page 2 & 3)
                    if (pagerState.currentPage > 0) {
                        OutlinedButton(
                            onClick = {
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(pagerState.currentPage - 1)
                                }
                            },
                            modifier = Modifier
                                .weight(1f)
                                .height(52.dp)
                                .testTag("onboarding_back_button"),
                            shape = RoundedCornerShape(14.dp),
                            border = BorderStroke(1.dp, Color(0xFF334155)),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color.White
                            )
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Back",
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.SemiBold)
                            )
                        }
                    }

                    // Next / Get Started Button
                    val isLastPage = pagerState.currentPage == 2
                    Button(
                        onClick = {
                            if (isLastPage) {
                                onFinishOnboarding()
                            } else {
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
                                }
                            }
                        },
                        modifier = Modifier
                            .weight(if (pagerState.currentPage > 0) 1.6f else 1f)
                            .height(52.dp)
                            .testTag(if (isLastPage) "onboarding_get_started_button" else "onboarding_next_button"),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isLastPage) ElectricCyan500 else RoyalBlue600,
                            contentColor = if (isLastPage) Color(0xFF0F172A) else Color.White
                        )
                    ) {
                        Text(
                            text = if (isLastPage) "Get Started" else "Next",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun OnboardingPageContent(
    data: OnboardingPageData,
    pageIndex: Int
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(8.dp))

        // Visual Illustration Card for each page
        when (pageIndex) {
            0 -> OnboardingVisualOne()
            1 -> OnboardingVisualTwo()
            else -> OnboardingVisualThree()
        }

        Spacer(modifier = Modifier.height(28.dp))

        // Badge
        Surface(
            shape = RoundedCornerShape(100.dp),
            color = RoyalBlue500.copy(alpha = 0.15f),
            border = BorderStroke(1.dp, RoyalBlue400.copy(alpha = 0.3f))
        ) {
            Text(
                text = data.badge,
                style = MaterialTheme.typography.labelSmall.copy(
                    color = ElectricCyan400,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.2.sp
                ),
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Title
        Text(
            text = data.title,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Black,
                fontSize = 24.sp,
                color = Color.White
            ),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Description
        Text(
            text = data.description,
            style = MaterialTheme.typography.bodyLarge.copy(
                color = Color(0xFF94A3B8),
                fontSize = 14.5.sp,
                lineHeight = 22.sp
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}

// Visual 1: Education / GK Foundation Illustration
@Composable
private fun OnboardingVisualOne() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = DarkNavySurface),
        border = BorderStroke(1.dp, Color(0xFF1E293B))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Central Academic Shield Emblem
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(72.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.linearGradient(
                                listOf(RoyalBlue700, RoyalBlue500)
                            )
                        )
                ) {
                    Icon(
                        imageVector = Icons.Default.School,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(36.dp)
                    )
                }

                // Grid of Curated Category Badges
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CategoryPill(icon = Icons.Default.HistoryEdu, text = "History", tint = Color(0xFFF59E0B))
                    CategoryPill(icon = Icons.Default.AccountBalance, text = "Polity", tint = Color(0xFF3B82F6))
                    CategoryPill(icon = Icons.Default.Public, text = "Geography", tint = Color(0xFF10B981))
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CategoryPill(icon = Icons.Default.Speed, text = "Science", tint = Color(0xFFEC4899))
                    CategoryPill(icon = Icons.Default.Analytics, text = "Economy", tint = Color(0xFF8B5CF6))
                    CategoryPill(icon = Icons.Default.Star, text = "Static GK", tint = Color(0xFF06B6D4))
                }
            }
        }
    }
}

// Visual 2: Category → Topic → Practice / Mock Test Concept Flow
@Composable
private fun OnboardingVisualTwo() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = DarkNavySurface),
        border = BorderStroke(1.dp, Color(0xFF1E293B))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Step 1: Category Selection
            ConceptFlowRow(
                stepNum = "1",
                label = "Select GK Subject",
                detail = "e.g. Indian Polity & Constitution",
                color = RoyalBlue500,
                icon = Icons.Default.AccountBalance
            )

            // Step 2: Topic Deep Drill
            ConceptFlowRow(
                stepNum = "2",
                label = "Target Specific Topic",
                detail = "Fundamental Rights • Articles • Parliament",
                color = ElectricCyan400,
                icon = Icons.Default.Explore
            )

            // Step 3: Practice & Full Mock
            ConceptFlowRow(
                stepNum = "3",
                label = "Topic Drill & 15-Q Mocks",
                detail = "Bilingual MCQs with Instant Explanations",
                color = SuccessGreen,
                icon = Icons.Default.Quiz
            )
        }
    }
}

// Visual 3: Mock Test / Performance / Score Concept
@Composable
private fun OnboardingVisualThree() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = DarkNavySurface),
        border = BorderStroke(1.dp, Color(0xFF1E293B))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Top mini header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Assessment,
                        contentDescription = null,
                        tint = ElectricCyan400,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Score & Performance Analytics",
                        style = MaterialTheme.typography.labelMedium.copy(
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = SuccessGreen.copy(alpha = 0.2f)
                ) {
                    Text(
                        text = "READY",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = SuccessGreen,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                    )
                }
            }

            // Stats Visual Metrics
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                // Score Box
                Card(
                    modifier = Modifier.weight(1f),
                    colors = CardDefaults.cardColors(containerColor = DarkNavySurfaceElevated),
                    shape = RoundedCornerShape(14.dp),
                    border = BorderStroke(1.dp, Color(0xFF334155))
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Score",
                            style = MaterialTheme.typography.labelSmall.copy(color = Color(0xFF94A3B8))
                        )
                        Text(
                            text = "28 / 30",
                            style = MaterialTheme.typography.titleLarge.copy(
                                color = ElectricCyan400,
                                fontWeight = FontWeight.Black
                            )
                        )
                        Text(
                            text = "Top 5% Rank",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = SuccessGreen,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 10.sp
                            )
                        )
                    }
                }

                // Accuracy Box
                Card(
                    modifier = Modifier.weight(1f),
                    colors = CardDefaults.cardColors(containerColor = DarkNavySurfaceElevated),
                    shape = RoundedCornerShape(14.dp),
                    border = BorderStroke(1.dp, Color(0xFF334155))
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Accuracy",
                            style = MaterialTheme.typography.labelSmall.copy(color = Color(0xFF94A3B8))
                        )
                        Text(
                            text = "93.3%",
                            style = MaterialTheme.typography.titleLarge.copy(
                                color = Color(0xFF10B981),
                                fontWeight = FontWeight.Black
                            )
                        )
                        Text(
                            text = "Exam Level",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = Color(0xFFCBD5E1),
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 10.sp
                            )
                        )
                    }
                }
            }

            // Bottom Feature checklist
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                FeatureCheck(text = "Negative Marking (-0.25)")
                FeatureCheck(text = "Mistake Revision")
            }
        }
    }
}

@Composable
private fun CategoryPill(icon: ImageVector, text: String, tint: Color) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        color = DarkNavySurfaceElevated,
        border = BorderStroke(1.dp, Color(0xFF334155))
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = tint,
                modifier = Modifier.size(13.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.labelSmall.copy(
                    color = Color(0xFFE2E8F0),
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.5.sp
                )
            )
        }
    }
}

@Composable
private fun ConceptFlowRow(
    stepNum: String,
    label: String,
    detail: String,
    color: Color,
    icon: ImageVector
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(DarkNavySurfaceElevated)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(color.copy(alpha = 0.2f))
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(16.dp)
            )
        }
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = detail,
                style = MaterialTheme.typography.labelSmall.copy(
                    color = Color(0xFF94A3B8),
                    fontSize = 10.5.sp
                )
            )
        }
    }
}

@Composable
private fun FeatureCheck(text: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = null,
            tint = ElectricCyan400,
            modifier = Modifier.size(13.dp)
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.copy(
                color = Color(0xFFCBD5E1),
                fontSize = 11.sp
            )
        )
    }
}
