package com.meet.navigationappjc.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.meet.navigationappjc.navigation.Screen

/**
 * @author Coding Meet
 * Created 04-01-2024 at 04:20 pm
 */

@Composable
fun LastScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Last Screen",
            fontSize = 40.sp
        )
        Button(onClick = {
//            navController.popBackStack()
//            navController.popBackStack()

            navController.navigate(Screen.HomeScreen.route){
                popUpTo(Screen.HomeScreen.route){
                    inclusive = true
                }
            }

        }) {
            Text(
                text = "Go to Home Screen", fontSize = 30.sp
            )
        }
    }
}