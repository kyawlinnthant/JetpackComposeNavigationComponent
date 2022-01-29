package com.example.composenestednavigation.screens.setting

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
import com.example.composenestednavigation.bottom_bar.Destinations

@Composable
fun SettingScreen(
    navController: NavController
) {

    Surface {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = {
                navController.navigate(Destinations.SettingDetail1.route)
            }) {
                Text(text = "Go To Setting Detail")

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun SettingScreenPreview() {
    Surface {
        SettingScreen(navController = rememberNavController())
    }
}