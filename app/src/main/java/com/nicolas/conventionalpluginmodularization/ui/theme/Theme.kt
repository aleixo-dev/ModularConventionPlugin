package com.nicolas.conventionalpluginmodularization.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun ConventionalPluginModularizationTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = lightColorScheme()

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}