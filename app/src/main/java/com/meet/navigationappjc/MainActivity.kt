package com.meet.navigationappjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.meet.navigationappjc.navigation.SetupNavGraph
import com.meet.navigationappjc.ui.theme.NavigationAppJCTheme
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class MainActivity : ComponentActivity() {

    private lateinit var navController : NavHostController

   private val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationAppJCTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController,moshi = moshi)
            }
        }
    }
}
