package com.example.studyjams.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val QuizoraColorScheme = lightColorScheme(
    primary = BrandPrimary,
    onPrimary = Color.White,
    primaryContainer = BrandSoft,
    onPrimaryContainer = BrandPrimaryDark,
    secondary = BrandPrimaryDark,
    background = Color.White,
    surface = Color.White,
    onBackground = TextPrimary,
    onSurface = TextPrimary
)

/** The app is always light - the orange gradient design has no dark variant. */
@Composable
fun QuizoraTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = QuizoraColorScheme,
        typography = Typography,
        content = content
    )
}
