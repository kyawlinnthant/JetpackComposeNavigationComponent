package com.example.composenestednavigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.composenestednavigation.navigation.AUTH_ROUTE
import com.example.composenestednavigation.navigation.Destinations
import com.example.composenestednavigation.screens.auth.ForgetPasswordScreen
import com.example.composenestednavigation.screens.auth.LoginScreen
import com.example.composenestednavigation.screens.auth.RegisterScreen


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Destinations.Login.route,
        route = AUTH_ROUTE
    ) {
        composable(route = Destinations.Login.route) { LoginScreen(navController = navController) }
        composable(route = Destinations.ForgetPassword.route) { ForgetPasswordScreen(navController = navController) }
        composable(route = Destinations.Register.route) { RegisterScreen(navController = navController) }
    }
}
