package com.example.composenestednavigation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.composenestednavigation.bottom_bar.BottomBar
import com.example.composenestednavigation.bottom_bar.BottomBarNavGraph

@Composable
fun MainScreen(
) {
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        BottomBarNavGraph(navController = navController)
    }

}
