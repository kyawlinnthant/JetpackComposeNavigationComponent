package com.example.composenestednavigation.screens.home

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
import com.example.composenestednavigation.bottom_bar.Destinations

@Composable
fun HomeDetail1Screen(
    text: String,
    navController: NavController
) {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = text)
            Button(onClick = {
                navController.navigate(Destinations.HomeDetail2.route)
            }) {
                Text(text = "Go To Detail 2")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeDetail1ScreenPreview() {

    HomeDetail1Screen(
        text = "args",
        navController = rememberNavController()
    )

}