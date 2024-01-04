package com.meet.navigationappjc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.meet.navigationappjc.screens.DetailScreen
import com.meet.navigationappjc.screens.HomeScreen
import com.meet.navigationappjc.screens.LastScreen

/**
 * @author Coding Meet
 * Created 04-01-2024 at 04:26 pm
 */

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(
            route = Screen.HomeScreen.route
        ){
            HomeScreen(navController)
        }
        composable(
            route = Screen.DetailScreen.route
        ){
            DetailScreen(navController)
        }
        composable(
            route = Screen.LastScreen.route
        ){
            LastScreen(navController)
        }
    }
}