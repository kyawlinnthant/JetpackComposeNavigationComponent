package com.example.composenestednavigation.screens.auth

import androidx.compose.foundation.layout.Box
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
fun RegisterScreen(
    navController: NavController
) {

    Surface {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = {
                navController.popBackStack(navController.graph.startDestinationId, inclusive = true)
                navController.graph.setStartDestination(Destinations.Home.route)
                navController.navigate(Destinations.Home.route)
            }) {
                Text(text = "Do Register")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(navController = rememberNavController())
}
