package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Science
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixBadge
import com.example.ui.components.GyanixConfirmationDialog
import com.example.ui.components.GyanixFilterChip
import com.example.ui.components.GyanixIconButton
import com.example.ui.components.GyanixLogo
import com.example.ui.components.GyanixOutlineButton
import com.example.ui.components.GyanixPrimaryButton
import com.example.ui.components.GyanixSearchBar
import com.example.ui.components.GyanixSecondaryButton
import com.example.ui.components.GyanixSectionHeader
import com.example.ui.components.LogoVariant
import com.example.ui.theme.DarkNavyBackground
import com.example.ui.theme.DarkNavySurface
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ElectricCyan500
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.LightNeutralBackground
import com.example.ui.theme.LightNeutralSurface
import com.example.ui.theme.MetricTypography
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.RoyalBlue700
import com.example.ui.theme.RoyalBlue900
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

@Composable
fun DesignSystemGalleryScreen(
    isDarkTheme: Boolean,
    onToggleTheme: () -> Unit,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    var showDialog by remember { mutableStateOf(false) }
    var selectedFilterChip by remember { mutableStateOf("High Yield") }
    var sampleSearchQuery by remember { mutableStateOf("Constitution") }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("design_system_gallery"),
        contentPadding = PaddingValues(bottom = 90.dp)
    ) {
        // Top Header
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "GYANIX Design System",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                }

                IconButton(onClick = onToggleTheme) {
                    Icon(
                        imageVector = if (isDarkTheme) Icons.Default.LightMode else Icons.Default.DarkMode,
                        contentDescription = "Toggle Theme",
                        tint = if (isDarkTheme) WarningAmber else RoyalBlue600
                    )
                }
            }
        }

        // 1. BRAND LOGO VARIANTS (Mandatory Deliverable)
        item {
            GyanixSectionHeader(
                title = "1. Brand Logo System",
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding, vertical = 6.dp)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Full Brand Logo",
                        style = MaterialTheme.typography.labelMedium.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                    GyanixLogo(
                        variant = LogoVariant.FULL,
                        size = 48.dp,
                        isDarkTheme = isDarkTheme
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Horizontal Wordmark",
                        style = MaterialTheme.typography.labelMedium.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                    GyanixLogo(
                        variant = LogoVariant.HORIZONTAL,
                        size = 32.dp,
                        isDarkTheme = isDarkTheme
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Icon Only",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            GyanixLogo(variant = LogoVariant.ICON_ONLY, size = 36.dp, isDarkTheme = isDarkTheme)
                        }

                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Monochrome",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            GyanixLogo(variant = LogoVariant.MONOCHROME, size = 36.dp, isDarkTheme = isDarkTheme)
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Light Canvas vs Dark Canvas preview containers
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .background(LightNeutralBackground, RoundedCornerShape(10.dp))
                                .padding(12.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Light Surface",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF0F172A)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            GyanixLogo(variant = LogoVariant.HORIZONTAL, size = 24.dp, isDarkTheme = false)
                        }

                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .background(DarkNavyBackground, RoundedCornerShape(10.dp))
                                .padding(12.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Dark Surface",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            GyanixLogo(variant = LogoVariant.HORIZONTAL, size = 24.dp, isDarkTheme = true)
                        }
                    }
                }
            }
        }

        // 2. COLOR PALETTE TOKENS
        item {
            Spacer(modifier = Modifier.height(16.dp))
            GyanixSectionHeader(
                title = "2. Color Token System",
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    ColorSwatchRow("Primary Royal Blue", RoyalBlue600, "#2563EB")
                    ColorSwatchRow("Electric Cyan (Accent)", ElectricCyan400, "#22D3EE")
                    ColorSwatchRow("Success (Exam Pass)", SuccessGreen, "#10B981")
                    ColorSwatchRow("Warning (Review / Amber)", WarningAmber, "#F59E0B")
                    ColorSwatchRow("Error (Negative Mark)", ErrorRed, "#EF4444")
                    ColorSwatchRow("Purple Accent", PurpleAccent, "#8B5CF6")
                    ColorSwatchRow("Dark Navy Canvas", DarkNavyBackground, "#070B14")
                }
            }
        }

        // 3. TYPOGRAPHY SCALE HIERARCHY
        item {
            Spacer(modifier = Modifier.height(16.dp))
            GyanixSectionHeader(
                title = "3. Typography Hierarchy",
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text("Display Large — 40sp / Bold", style = MaterialTheme.typography.displaySmall)
                    Text("Headline Large — 24sp / Bold", style = MaterialTheme.typography.headlineLarge)
                    Text("Title Medium — 16sp / SemiBold", style = MaterialTheme.typography.titleMedium)
                    Text("Body Large — 16sp / Regular (English & हिन्दी)", style = MaterialTheme.typography.bodyLarge)
                    Text("Stat Number Display: 84.5% / 1,420 MCQs", style = MetricTypography.StatNumberLarge)
                }
            }
        }

        // 4. BUTTONS & INTERACTION STATES
        item {
            Spacer(modifier = Modifier.height(16.dp))
            GyanixSectionHeader(
                title = "4. Button Component System",
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    GyanixPrimaryButton(
                        text = "Primary Button (Start Test)",
                        icon = Icons.Default.PlayArrow,
                        onClick = { showDialog = true },
                        modifier = Modifier.fillMaxWidth()
                    )

                    GyanixSecondaryButton(
                        text = "Secondary Button (Explore Topics)",
                        icon = Icons.Default.Science,
                        onClick = {},
                        modifier = Modifier.fillMaxWidth()
                    )

                    GyanixOutlineButton(
                        text = "Outline Button (Previous Question)",
                        onClick = {},
                        modifier = Modifier.fillMaxWidth()
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        GyanixIconButton(
                            icon = Icons.Default.Notifications,
                            contentDescription = "Notifications",
                            badgeCount = 3,
                            onClick = {}
                        )

                        GyanixIconButton(
                            icon = Icons.Default.EmojiEvents,
                            contentDescription = "Trophies",
                            onClick = {}
                        )
                    }
                }
            }
        }

        // 5. CHIPS & BADGES
        item {
            Spacer(modifier = Modifier.height(16.dp))
            GyanixSectionHeader(
                title = "5. Chips & Status Badges",
                modifier = Modifier.padding(horizontal = GyanixDimens.screenPadding)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GyanixDimens.screenPadding),
                shape = RoundedCornerShape(GyanixDimens.radiusLg),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                border = BorderStroke(GyanixDimens.borderHairline, MaterialTheme.colorScheme.outline)
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        GyanixFilterChip(
                            text = "High Yield",
                            isSelected = selectedFilterChip == "High Yield",
                            onClick = { selectedFilterChip = "High Yield" }
                        )
                        GyanixFilterChip(
                            text = "Moderate",
                            isSelected = selectedFilterChip == "Moderate",
                            onClick = { selectedFilterChip = "Moderate" }
                        )
                        GyanixFilterChip(
                            text = "Advanced",
                            isSelected = selectedFilterChip == "Advanced",
                            onClick = { selectedFilterChip = "Advanced" }
                        )
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        GyanixBadge(text = "LIVE MOCK", backgroundColor = ErrorRed.copy(alpha = 0.15f), textColor = ErrorRed)
                        GyanixBadge(text = "QUALIFIED", backgroundColor = SuccessGreen.copy(alpha = 0.15f), textColor = SuccessGreen)
                        GyanixBadge(text = "SPEED DRILL", backgroundColor = ElectricCyan400.copy(alpha = 0.15f), textColor = ElectricCyan400)
                    }
                }
            }
        }
    }

    if (showDialog) {
        GyanixConfirmationDialog(
            title = "GYANIX Design System",
            message = "This confirmation dialog demonstrates consistent typography, padding, corner radii, and contrast tokens.",
            confirmText = "Got it",
            dismissText = "Cancel",
            onConfirm = { showDialog = false },
            onDismiss = { showDialog = false }
        )
    }
}

@Composable
private fun ColorSwatchRow(name: String, color: Color, hex: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(color, RoundedCornerShape(6.dp))
                    .border(1.dp, Color.White.copy(alpha = 0.2f), RoundedCornerShape(6.dp))
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = name,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
        }
        Text(
            text = hex,
            style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        )
    }
}
