package com.example.composenestednavigation.bottom_bar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenestednavigation.screens.setting.SettingDetail1Screen
import com.example.composenestednavigation.screens.setting.SettingDetail2Screen
import com.example.composenestednavigation.screens.setting.SettingScreen

fun NavGraphBuilder.settingNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Destinations.SettingRoot.route,
        route = SETTING_ROUTE
    ) {
        composable(
            route = Destinations.SettingRoot.route
        ) {
            SettingScreen(navController = navController)
        }
        composable(
            route = Destinations.SettingDetail1.route
        ) {
            SettingDetail1Screen(navController = navController)
        }
        composable(
            route = Destinations.SettingDetail2.route
        ) {
            SettingDetail2Screen(navController = navController)
        }
    }

}