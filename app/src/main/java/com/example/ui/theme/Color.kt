package com.example.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

// ==========================================
// GYANIX DESIGN SYSTEM - COLOR TOKENS
// ==========================================

// Primary Brand Palette: Deep Indigo / Royal Blue
val RoyalBlue900 = Color(0xFF0F172A)
val RoyalBlue800 = Color(0xFF1E293B)
val RoyalBlue700 = Color(0xFF1D4ED8)
val RoyalBlue600 = Color(0xFF2563EB)
val RoyalBlue500 = Color(0xFF3B82F6)
val RoyalBlue400 = Color(0xFF60A5FA)
val RoyalBlue300 = Color(0xFF93C5FD)
val RoyalBlue100 = Color(0xFFDBEAFE)
val RoyalBlue50 = Color(0xFFEFF6FF)

// Secondary Accent Palette: Electric Cyan
val ElectricCyan500 = Color(0xFF06B6D4)
val ElectricCyan400 = Color(0xFF22D3EE)
val ElectricCyan300 = Color(0xFF67E8F9)
val ElectricCyan200 = Color(0xFFA5F3FC)
val ElectricCyan100 = Color(0xFFCFFAFE)
val ElectricCyan50 = Color(0xFFECFEFF)

// Dark Theme Surfaces (Deep Navy / Carbon)
val DarkNavyBackground = Color(0xFF070B14)
val DarkNavySurface = Color(0xFF0F172A)
val DarkNavySurfaceElevated = Color(0xFF192238)
val DarkNavySurfaceHigh = Color(0xFF24304D)
val DarkNavyBorder = Color(0xFF1E293B)
val DarkNavyBorderHighlight = Color(0xFF334155)

// Light Theme Surfaces (Crisp Neutral & Off-White)
val LightNeutralBackground = Color(0xFFF8FAFC)
val LightNeutralSurface = Color(0xFFFFFFFF)
val LightNeutralSurfaceElevated = Color(0xFFF1F5F9)
val LightNeutralSurfaceHigh = Color(0xFFE2E8F0)
val LightNeutralBorder = Color(0xFFE2E8F0)
val LightNeutralBorderHighlight = Color(0xFFCBD5E1)

// Typography Colors - Dark Mode
val TextPrimaryDark = Color(0xFFF8FAFC)
val TextSecondaryDark = Color(0xFF94A3B8)
val TextMutedDark = Color(0xFF64748B)

// Typography Colors - Light Mode
val TextPrimaryLight = Color(0xFF0F172A)
val TextSecondaryLight = Color(0xFF475569)
val TextMutedLight = Color(0xFF94A3B8)

// Semantic State Colors
val SuccessGreen = Color(0xFF10B981)
val SuccessGreenLight = Color(0xFFD1FAE5)
val SuccessGreenDark = Color(0xFF065F46)

val WarningAmber = Color(0xFFF59E0B)
val WarningAmberLight = Color(0xFFFEF3C7)
val WarningAmberDark = Color(0xFF78350F)

val ErrorRed = Color(0xFFEF4444)
val ErrorRedLight = Color(0xFFFEE2E2)
val ErrorRedDark = Color(0xFF7F1D1D)

val PurpleAccent = Color(0xFF8B5CF6)
val PurpleAccentLight = Color(0xFFEDE9FE)

// Special Gradients for Cards, Logo, and Highlights
val HeroGradientDark = Brush.linearGradient(
    colors = listOf(
        Color(0xFF1E3A8A),
        Color(0xFF0F172A),
        Color(0xFF090D1A)
    )
)

val HeroGradientLight = Brush.linearGradient(
    colors = listOf(
        Color(0xFF1D4ED8),
        Color(0xFF2563EB),
        Color(0xFF3B82F6)
    )
)

val CyanIndigoGradient = Brush.horizontalGradient(
    colors = listOf(
        Color(0xFF22D3EE),
        Color(0xFF3B82F6)
    )
)

val GoldStreakGradient = Brush.linearGradient(
    colors = listOf(
        Color(0xFFF59E0B),
        Color(0xFFFBBF24),
        Color(0xFFD97706)
    )
)

val CardGlowGradient = Brush.radialGradient(
    colors = listOf(
        Color(0x3322D3EE),
        Color(0x000F172A)
    )
)
