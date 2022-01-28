package com.example.composenestednavigation.navigation

// 1. we have to define our destinations for our screens
sealed class Destinations(
    val route: String
) {
    object Login : Destinations(route = "login_screen")
    object ForgetPassword : Destinations(route = "forget_password_screen")
    object Register : Destinations(route = "register_screen")
    object Home : Destinations(route = "home_screen")
    object Detail : Destinations(route = "detail_screen")
}

const val AUTH_ROUTE = "auth"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "main"
