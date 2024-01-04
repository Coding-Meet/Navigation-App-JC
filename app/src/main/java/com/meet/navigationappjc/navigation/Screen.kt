package com.meet.navigationappjc.navigation

/**
 * @author Coding Meet
 * Created 04-01-2024 at 04:28 pm
 */
const val HomeScreenPath="HomeScreen"
const val DetailScreenPath="DetailScreen"
const val LastScreenPath="LastScreen"
sealed class Screen(val route: String) {
    object HomeScreen : Screen(HomeScreenPath)
    object DetailScreen : Screen(DetailScreenPath)
    object LastScreen : Screen(LastScreenPath)
}