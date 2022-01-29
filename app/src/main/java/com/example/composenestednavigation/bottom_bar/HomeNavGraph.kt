package com.example.composenestednavigation.bottom_bar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenestednavigation.screens.home.HomeDetail1Screen
import com.example.composenestednavigation.screens.home.HomeDetail2Screen
import com.example.composenestednavigation.screens.home.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Destinations.HomeRoot.route,
        route = HOME_ROUTE
    ) {
        composable(route = Destinations.HomeRoot.route) { HomeScreen(navController = navController) }
        composable(route = Destinations.HomeDetail1.route + "/{argText}") {
            val arg = it.arguments?.getString("argText") ?: "Nothing Typed"
            HomeDetail1Screen(
                text = arg,
                navController = navController
            )
        }
        composable(route = Destinations.HomeDetail2.route) { HomeDetail2Screen(navController = navController) }
    }
}