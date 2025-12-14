package io.github.ykws.example.liquid

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.window.ComposeUIViewController

@Suppress("unused")
fun settingsViewController() = ComposeUIViewController {
    MaterialTheme {
        SettingsScreen(paddingValues = WindowInsets.safeDrawing.asPaddingValues())
    }
}
