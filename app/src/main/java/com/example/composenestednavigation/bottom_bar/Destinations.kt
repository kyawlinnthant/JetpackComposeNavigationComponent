package com.example.composenestednavigation.bottom_bar

sealed class Destinations(
    val route: String
) {
    object HomeRoot : Destinations(route = "home_root_screen")
    object HomeDetail1 : Destinations(route = "home_detail1_screen")
    object HomeDetail2 : Destinations(route = "home_detail2_screen")

    object SettingRoot : Destinations(route = "setting_root_screen")
    object SettingDetail1 : Destinations(route = "setting_detail1_screen")
    object SettingDetail2 : Destinations(route = "setting_detail2_screen")
}

const val BOTTOM_NAV_ROUTE = "btn_nav"
const val HOME_ROUTE = "home"
const val SETTING_ROUTE = "setting"