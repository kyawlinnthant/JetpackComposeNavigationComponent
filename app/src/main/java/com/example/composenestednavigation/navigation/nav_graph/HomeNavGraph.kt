package com.example.composenestednavigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenestednavigation.navigation.Destinations
import com.example.composenestednavigation.navigation.HOME_ROUTE
import com.example.composenestednavigation.screens.home.DetailScreen
import com.example.composenestednavigation.screens.home.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Destinations.Home.route,
        route = HOME_ROUTE
    ) {
        composable(route = Destinations.Home.route) { HomeScreen(navController = navController) }
        composable(
            route = Destinations.Detail.route + "/{argText}"
        ) {
            val arg = it.arguments?.getString("argText") ?: "Nothing Typed"
            DetailScreen(text = arg, navController = navController)
        }
    }
}