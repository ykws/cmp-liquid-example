package io.github.ykws.example.liquid

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController

@Suppress("unused")
fun homeViewController() = ComposeUIViewController {
    MaterialTheme {
        HomeScreen(paddingValues = PaddingValues(0.dp))
    }
}