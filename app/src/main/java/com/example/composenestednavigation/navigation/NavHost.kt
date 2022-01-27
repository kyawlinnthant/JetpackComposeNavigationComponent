package com.example.composenestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composenestednavigation.screens.auth.ForgetPasswordScreen
import com.example.composenestednavigation.screens.auth.LoginScreen
import com.example.composenestednavigation.screens.auth.RegisterScreen
import com.example.composenestednavigation.screens.home.DetailScreen
import com.example.composenestednavigation.screens.home.HomeScreen

@Composable
fun SetupNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Destinations.Login.route
    ) {

        composable(route = Destinations.Login.route) { LoginScreen(navController = navController) }
        composable(route = Destinations.ForgetPassword.route) { ForgetPasswordScreen(navController = navController) }
        composable(route = Destinations.Register.route) { RegisterScreen(navController = navController) }
        composable(route = Destinations.Home.route) { HomeScreen(navController = navController) }
        composable(
            route = Destinations.Detail.route + "/{argText}"
        ) {
            val arg = it.arguments?.getString("argText") ?: "Nothing Typed"
            DetailScreen(text = arg, navController = navController)
        }
    }
}

