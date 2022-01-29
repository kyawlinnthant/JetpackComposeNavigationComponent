package com.example.composenestednavigation.bottom_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarDestinations(
    val route: String,
    val title: String,
    val icon: ImageVector

) {
    object Home : BottomBarDestinations(
        route = HOME_ROUTE,
        title = "Home",
        icon = Icons.Default.Home
    )

    object Setting : BottomBarDestinations(
        route = SETTING_ROUTE,
        title = "Setting",
        icon = Icons.Default.Settings
    )
}
