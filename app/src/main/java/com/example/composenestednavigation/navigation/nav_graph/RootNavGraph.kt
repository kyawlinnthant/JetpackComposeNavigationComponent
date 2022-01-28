package com.example.composenestednavigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.composenestednavigation.navigation.AUTH_ROUTE
import com.example.composenestednavigation.navigation.Destinations
import com.example.composenestednavigation.navigation.ROOT_ROUTE

@Composable
fun SetupNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AUTH_ROUTE,
        route = ROOT_ROUTE
    ) {

        authNavGraph(navController = navController)
        homeNavGraph(navController = navController)

    }
}

