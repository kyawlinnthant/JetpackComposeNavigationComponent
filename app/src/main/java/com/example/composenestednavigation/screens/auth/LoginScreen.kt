package com.example.composenestednavigation.screens.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composenestednavigation.navigation.Destinations

@Composable
fun LoginScreen(
    navController: NavController
) {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                navController.popBackStack(navController.graph.startDestinationId, inclusive = true)
                navController.graph.setStartDestination(Destinations.Home.route)
                navController.navigate(Destinations.Home.route)
            }) {
                Text(text = "Do Login")
            }
            Button(onClick = {
                navController.navigate(Destinations.ForgetPassword.route)
            }) {
                Text(text = "Go To Forget Password")
            }
            Button(onClick = {
                navController.navigate(Destinations.Register.route)
            }) {
                Text(text = "Go To Register")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(navController = rememberNavController())
}