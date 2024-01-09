package com.meet.navigationappjc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.meet.navigationappjc.models.User
import com.meet.navigationappjc.screens.DetailScreen
import com.meet.navigationappjc.screens.HomeScreen
import com.meet.navigationappjc.screens.LastScreen
import com.squareup.moshi.Moshi

/**
 * @author Coding Meet
 * Created 04-01-2024 at 04:26 pm
 */

@Composable
fun SetupNavGraph(navController: NavHostController,moshi: Moshi) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(
            route = Screen.HomeScreen.route
        ){
            HomeScreen(navController,moshi)
        }
        composable(
            route = Screen.DetailScreen.route,
            arguments = listOf(
                navArgument("user"){
                    type = NavType.StringType
                    defaultValue = ""
                },
//                navArgument("name"){
//                    type = NavType.StringType
//                    defaultValue = ""
//                },
//                navArgument("age"){
//                    type = NavType.IntType
//                    defaultValue = 10
//                }
            )
        ){

            it.arguments?.getString("user")?.let {userStr ->
                val user = moshi.adapter(User::class.java).fromJson(userStr)!!
                DetailScreen(navController,user.name,user.age)
            }
//           val user =  navController.previousBackStackEntry?.savedStateHandle?.get<User>("user") ?: User()

//            val name = it.arguments?.getString("name","") ?: ""
//            val age = it.arguments?.getInt("age",0) ?: 0
        }
        composable(
            route = Screen.LastScreen.route
        ){
            LastScreen(navController)
        }
    }
}