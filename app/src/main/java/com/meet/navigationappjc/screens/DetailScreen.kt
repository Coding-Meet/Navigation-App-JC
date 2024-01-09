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
import com.meet.navigationappjc.sharedviewmodel.UserScreenViewModel

/**
 * @author Coding Meet
 * Created 04-01-2024 at 04:20 pm
 */

@Composable
fun DetailScreen(navController: NavController, name: String, age: Int,userScreenViewModel: UserScreenViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Name: $name",
            fontSize = 40.sp
        )
        Text(
            text = "age: $age",
            fontSize = 40.sp
        )
        Button(onClick = {
           navController.navigate(Screen.LastScreen.route)
        }) {
            Text(
                text = "Go to Last Screen", fontSize = 30.sp
            )
        }
    }
}