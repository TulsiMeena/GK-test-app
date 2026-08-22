package com.example.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.DarkNavyBackground
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.LightNeutralBackground
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.RoyalBlue700

/**
 * GYANIX Brand Logo System
 * Combines a geometric 'G' letterform with an upward Knowledge Spark star
 * and stylized Open-Book wings to symbolize academic mastery & competitive achievement.
 */

enum class LogoVariant {
    FULL,            // Icon + Wordmark + Tagline
    HORIZONTAL,      // Icon + Wordmark inline
    ICON_ONLY,       // Pure Emblem Icon
    MONOCHROME,      // Single tone (White or Dark Gray)
    LIGHT_BACKGROUND,// Optimized for light canvas
    DARK_BACKGROUND  // Optimized for dark navy canvas
}

@Composable
fun GyanixLogo(
    modifier: Modifier = Modifier,
    variant: LogoVariant = LogoVariant.FULL,
    size: Dp = 40.dp,
    showTagline: Boolean = true,
    isDarkTheme: Boolean = true
) {
    when (variant) {
        LogoVariant.ICON_ONLY -> {
            GyanixLogoIcon(size = size, isMonochrome = false, isDarkTheme = isDarkTheme, modifier = modifier)
        }
        LogoVariant.MONOCHROME -> {
            GyanixLogoIcon(size = size, isMonochrome = true, isDarkTheme = isDarkTheme, modifier = modifier)
        }
        LogoVariant.HORIZONTAL -> {
            Row(
                modifier = modifier.testTag("gyanix_horizontal_logo"),
                verticalAlignment = Alignment.CenterVertically
            ) {
                GyanixLogoIcon(size = size, isMonochrome = false, isDarkTheme = isDarkTheme)
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "GYAN",
                            fontWeight = FontWeight.Black,
                            fontSize = (size.value * 0.52).sp,
                            letterSpacing = 1.sp,
                            color = if (isDarkTheme) Color.White else RoyalBlue700,
                            fontFamily = FontFamily.SansSerif
                        )
                        Text(
                            text = "IX",
                            fontWeight = FontWeight.Black,
                            fontSize = (size.value * 0.52).sp,
                            letterSpacing = 1.sp,
                            color = ElectricCyan400,
                            fontFamily = FontFamily.SansSerif
                        )
                    }
                    if (showTagline) {
                        Text(
                            text = "COMPETITIVE EXAM GK",
                            fontWeight = FontWeight.Bold,
                            fontSize = 8.sp,
                            letterSpacing = 1.5.sp,
                            color = if (isDarkTheme) RoyalBlue400 else RoyalBlue600
                        )
                    }
                }
            }
        }
        LogoVariant.LIGHT_BACKGROUND -> {
            Box(
                modifier = modifier
                    .background(LightNeutralBackground, RoundedCornerShape(12.dp))
                    .padding(12.dp)
            ) {
                GyanixLogoFullContent(size = size, isDarkTheme = false, showTagline = showTagline)
            }
        }
        LogoVariant.DARK_BACKGROUND -> {
            Box(
                modifier = modifier
                    .background(DarkNavyBackground, RoundedCornerShape(12.dp))
                    .padding(12.dp)
            ) {
                GyanixLogoFullContent(size = size, isDarkTheme = true, showTagline = showTagline)
            }
        }
        LogoVariant.FULL -> {
            GyanixLogoFullContent(size = size, isDarkTheme = isDarkTheme, showTagline = showTagline, modifier = modifier)
        }
    }
}

@Composable
private fun GyanixLogoFullContent(
    size: Dp,
    isDarkTheme: Boolean,
    showTagline: Boolean,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.testTag("gyanix_full_logo"),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        GyanixLogoIcon(size = size, isMonochrome = false, isDarkTheme = isDarkTheme)
        Spacer(modifier = Modifier.height(10.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "GYAN",
                fontWeight = FontWeight.Black,
                fontSize = (size.value * 0.55).sp,
                letterSpacing = 2.sp,
                color = if (isDarkTheme) Color.White else RoyalBlue700,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "IX",
                fontWeight = FontWeight.Black,
                fontSize = (size.value * 0.55).sp,
                letterSpacing = 2.sp,
                color = ElectricCyan400,
                fontFamily = FontFamily.SansSerif
            )
        }
        if (showTagline) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Smart GK. Smarter Preparation.",
                fontWeight = FontWeight.Medium,
                fontSize = 11.sp,
                letterSpacing = 0.3.sp,
                color = if (isDarkTheme) Color(0xFF94A3B8) else Color(0xFF64748B)
            )
        }
    }
}

/**
 * Scalable Vector Emblem Canvas for GYANIX
 */
@Composable
fun GyanixLogoIcon(
    size: Dp = 40.dp,
    isMonochrome: Boolean = false,
    isDarkTheme: Boolean = true,
    modifier: Modifier = Modifier
) {
    val primaryColor = when {
        isMonochrome && isDarkTheme -> Color.White
        isMonochrome && !isDarkTheme -> Color(0xFF0F172A)
        else -> ElectricCyan400
    }

    val secondaryColor = when {
        isMonochrome && isDarkTheme -> Color(0xFF94A3B8)
        isMonochrome && !isDarkTheme -> Color(0xFF64748B)
        else -> RoyalBlue500
    }

    val sparkColor = when {
        isMonochrome -> primaryColor
        else -> Color.White
    }

    Canvas(
        modifier = modifier
            .size(size)
            .testTag("gyanix_logo_icon")
    ) {
        val w = this.size.width
        val h = this.size.height

        // 1. Subtle Glow Aura (if in color mode)
        if (!isMonochrome) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        ElectricCyan400.copy(alpha = 0.25f),
                        Color.Transparent
                    ),
                    center = Offset(w * 0.5f, h * 0.5f),
                    radius = w * 0.48f
                )
            )
        }

        // 2. Stylized Modern 'G' Arc
        val strokeWidth = w * 0.11f
        val gPath = Path().apply {
            // Start at top right of G curve
            moveTo(w * 0.72f, h * 0.26f)
            // Upper curve & left spine
            cubicTo(
                w * 0.38f, h * 0.18f,
                w * 0.18f, h * 0.34f,
                w * 0.18f, h * 0.54f
            )
            // Lower curve
            cubicTo(
                w * 0.18f, h * 0.74f,
                w * 0.38f, h * 0.86f,
                w * 0.68f, h * 0.86f
            )
            // Up to horizontal bar
            lineTo(w * 0.82f, h * 0.86f)
            cubicTo(
                w * 0.86f, h * 0.86f,
                w * 0.88f, h * 0.82f,
                w * 0.88f, h * 0.78f
            )
            lineTo(w * 0.88f, h * 0.54f)
            lineTo(w * 0.56f, h * 0.54f)
        }

        drawPath(
            path = gPath,
            brush = if (isMonochrome) {
                Brush.linearGradient(listOf(primaryColor, primaryColor))
            } else {
                Brush.linearGradient(
                    colors = listOf(primaryColor, secondaryColor),
                    start = Offset(w * 0.2f, h * 0.2f),
                    end = Offset(w * 0.85f, h * 0.85f)
                )
            },
            style = Stroke(
                width = strokeWidth,
                cap = StrokeCap.Round,
                join = StrokeJoin.Round
            )
        )

        // 3. Central Knowledge Spark (4-Point Diamond Star)
        val sparkPath = Path().apply {
            val cx = w * 0.54f
            val cy = h * 0.34f
            val rad = w * 0.15f
            val inner = rad * 0.32f

            moveTo(cx, cy - rad)
            lineTo(cx + inner, cy - inner)
            lineTo(cx + rad, cy)
            lineTo(cx + inner, cy + inner)
            lineTo(cx, cy + rad)
            lineTo(cx - inner, cy + inner)
            lineTo(cx - rad, cy)
            lineTo(cx - inner, cy - inner)
            close()
        }

        drawPath(
            path = sparkPath,
            color = sparkColor,
            style = Fill
        )

        // 4. Stylized Open Book Wings at Bottom
        val wingPath = Path().apply {
            val startY = h * 0.94f
            moveTo(w * 0.28f, startY)
            lineTo(w * 0.50f, startY + (h * 0.04f))
            lineTo(w * 0.72f, startY)
        }

        drawPath(
            path = wingPath,
            color = if (isMonochrome) secondaryColor else ElectricCyan400.copy(alpha = 0.85f),
            style = Stroke(
                width = w * 0.05f,
                cap = StrokeCap.Round
            )
        )
    }
}
