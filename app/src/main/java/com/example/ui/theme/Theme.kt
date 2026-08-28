package com.example.ui.theme

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Dark Theme Color Scheme (Default Experience)
private val GyanixDarkColorScheme = darkColorScheme(
    primary = RoyalBlue500,
    onPrimary = LightNeutralSurface,
    primaryContainer = RoyalBlue800,
    onPrimaryContainer = RoyalBlue300,

    secondary = ElectricCyan400,
    onSecondary = DarkNavyBackground,
    secondaryContainer = DarkNavySurfaceElevated,
    onSecondaryContainer = ElectricCyan200,

    tertiary = PurpleAccent,
    onTertiary = LightNeutralSurface,
    tertiaryContainer = DarkNavySurfaceHigh,
    onTertiaryContainer = PurpleAccentLight,

    background = DarkNavyBackground,
    onBackground = TextPrimaryDark,

    surface = DarkNavySurface,
    onSurface = TextPrimaryDark,
    surfaceVariant = DarkNavySurfaceElevated,
    onSurfaceVariant = TextSecondaryDark,

    outline = DarkNavyBorder,
    outlineVariant = DarkNavyBorderHighlight,

    error = ErrorRed,
    onError = LightNeutralSurface,
    errorContainer = ErrorRedDark,
    onErrorContainer = ErrorRedLight
)

// Light Theme Color Scheme
private val GyanixLightColorScheme = lightColorScheme(
    primary = RoyalBlue600,
    onPrimary = LightNeutralSurface,
    primaryContainer = RoyalBlue100,
    onPrimaryContainer = RoyalBlue700,

    secondary = ElectricCyan500,
    onSecondary = LightNeutralSurface,
    secondaryContainer = ElectricCyan100,
    onSecondaryContainer = RoyalBlue900,

    tertiary = PurpleAccent,
    onTertiary = LightNeutralSurface,
    tertiaryContainer = PurpleAccentLight,
    onTertiaryContainer = RoyalBlue900,

    background = LightNeutralBackground,
    onBackground = TextPrimaryLight,

    surface = LightNeutralSurface,
    onSurface = TextPrimaryLight,
    surfaceVariant = LightNeutralSurfaceElevated,
    onSurfaceVariant = TextSecondaryLight,

    outline = LightNeutralBorder,
    outlineVariant = LightNeutralBorderHighlight,

    error = ErrorRed,
    onError = LightNeutralSurface,
    errorContainer = ErrorRedLight,
    onErrorContainer = ErrorRedDark
)

/**
 * Safely traverses the context chain to find the hosting Activity without crashing.
 */
private fun Context.findActivity(): Activity? {
    var currentContext = this
    while (currentContext is ContextWrapper) {
        if (currentContext is Activity) return currentContext
        currentContext = currentContext.baseContext
    }
    return null
}

@Composable
fun GyanixTheme(
    darkTheme: Boolean = true, // Dark mode is the primary visual experience
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) GyanixDarkColorScheme else GyanixLightColorScheme
    val view = LocalView.current

    if (!view.isInEditMode) {
        SideEffect {
            try {
                view.context.findActivity()?.let { activity ->
                    val window = activity.window
                    val insetsController = WindowCompat.getInsetsController(window, view)
                    insetsController.isAppearanceLightStatusBars = !darkTheme
                    insetsController.isAppearanceLightNavigationBars = !darkTheme
                }
            } catch (e: Throwable) {
                // Safeguard against custom OEM Window controllers
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = GyanixTypography,
        content = content
    )
}

// Backward compatibility alias
@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    GyanixTheme(darkTheme = darkTheme, content = content)
}

