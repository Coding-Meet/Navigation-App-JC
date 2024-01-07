package com.meet.navigationappjc.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.meet.navigationappjc.navigation.DetailScreenPath
import com.meet.navigationappjc.navigation.Screen

/**
 * @author Coding Meet
 * Created 04-01-2024 at 04:19 pm
 */

@Composable
fun HomeScreen(navController: NavController) {
    var name by remember {
        mutableStateOf("")
    }
    var age by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(value = name, onValueChange = {
            name = it
        }, label = {
            Text(text = "Name")
        })
        OutlinedTextField(value = age, onValueChange = {
            age = it
        }, label = {
            Text(text = "Age")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {
            if (name.trim().isNotEmpty() && age.trim().isNotEmpty()
                ){
                // All Argument Required
//                navController.navigate("$DetailScreenPath/$name/${age.toInt()}")
              // name argument send
//                navController.navigate("$DetailScreenPath/${name.trim()}")

                // name and age both are optional argument
//                navController.navigate("$DetailScreenPath?age=${age.trim().toInt()}")
                navController.navigate("$DetailScreenPath?name=${name}&age=${age.trim().toInt()}")
            }
        }) {
            Text(
                text = "Go to Detail Screen", fontSize = 30.sp
            )
        }
    }
}