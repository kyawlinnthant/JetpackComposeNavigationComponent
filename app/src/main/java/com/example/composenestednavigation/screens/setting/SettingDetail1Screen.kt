package com.example.composenestednavigation.screens.setting

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
fun SettingDetail1Screen(
    navController: NavController
) {

    Surface {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = "This is Setting Detail 1",
                modifier = Modifier.clickable {
                    navController.navigate(Destinations.SettingDetail2.route)
                }
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingDetailScreenPreview() {
    Surface {
        SettingDetail1Screen(navController = rememberNavController())
    }
}