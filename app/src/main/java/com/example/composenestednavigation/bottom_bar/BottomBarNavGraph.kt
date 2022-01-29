package com.example.composenestednavigation.bottom_bar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composenestednavigation.screens.home.HomeScreen
import com.example.composenestednavigation.screens.setting.SettingScreen

@Composable
fun BottomBarNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = BOTTOM_NAV_ROUTE
    ) {
        homeNavGraph(navController)
        settingNavGraph(navController)
    }
}