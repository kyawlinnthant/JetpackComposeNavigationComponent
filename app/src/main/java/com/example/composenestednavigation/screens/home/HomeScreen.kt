package com.example.composenestednavigation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composenestednavigation.bottom_bar.Destinations

@Composable
fun HomeScreen(
    navController: NavController
) {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            var text by remember {
                mutableStateOf("Type Something...")
            }
            BasicTextField(
                modifier = Modifier
                    .background(Color.Gray)
                    .padding(8.dp),
                value = text,
                onValueChange = {
                    text = it
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                navController.navigate(Destinations.HomeDetail1.route + "/$text")
            }) {
                Text(text = "Go To Detail")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}