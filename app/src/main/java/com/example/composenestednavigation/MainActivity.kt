package com.example.composenestednavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.composenestednavigation.navigation.SetupNavHost
import com.example.composenestednavigation.ui.theme.ComposeNestedNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNestedNavigationTheme {
                // 2. remember navController
                val navController = rememberNavController()
                // 1. setup NavHost
                SetupNavHost(navController = navController)

            }
        }
    }
}
