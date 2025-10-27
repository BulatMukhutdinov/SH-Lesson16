package tat.mukhutdinov.dessertRelease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import tat.mukhutdinov.dessertRelease.ui.DessertReleaseApp
import tat.mukhutdinov.dessertRelease.ui.theme.DessertReleaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DessertReleaseTheme {
                DessertReleaseApp()
            }
        }
    }
}