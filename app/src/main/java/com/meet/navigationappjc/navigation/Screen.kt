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

    // All Argument Required
//    object DetailScreen : Screen("$DetailScreenPath/{name}/{age}")

    // only name argument pass
//    object DetailScreen : Screen("$DetailScreenPath/{name}?age={age}")

    // name and age both are optional argument
    object DetailScreen : Screen("$DetailScreenPath?name={name}&age={age}")
    object LastScreen : Screen(LastScreenPath)
}