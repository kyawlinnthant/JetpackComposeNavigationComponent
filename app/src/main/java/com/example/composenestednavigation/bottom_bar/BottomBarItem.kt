package com.example.composenestednavigation.bottom_bar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarDestinations.Home,
        BottomBarDestinations.Setting
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestinations = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach {
            AddItem(
                screen = it,
                currentDestinations = currentDestinations,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarDestinations,
    currentDestinations: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Nav Icon"
            )
        },
        selected = currentDestinations?.hierarchy?.any { it.route == screen.route } == true,
        unselectedContentColor = LocalContentColor.current.copy(
            alpha = ContentAlpha.disabled
        ),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
                restoreState = true
            }
        }
    )
}