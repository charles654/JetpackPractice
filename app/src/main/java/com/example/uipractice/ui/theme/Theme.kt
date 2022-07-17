package com.example.uipractice.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.uipractice.R

private val DarkColorPalette = darkColors(
    primary = baseColor,
    primaryVariant = baseColor,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = baseColor,
    primaryVariant = baseColor,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun UiPracticeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content,

    )
    val pacificoRegular = FontFamily(
        Font(R.font.pacifico_regular)
    )
    val abrilfatRegular = FontFamily(
        Font(R.font.abrilfatface_regular)
    )
}