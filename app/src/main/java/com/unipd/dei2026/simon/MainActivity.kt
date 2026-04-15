package com.unipd.dei2026.simon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.unipd.dei2026.simon.ui.theme.SimonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display on API level < 35
        enableEdgeToEdge()

        setContent {
            SimonTheme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = colorResource(R.color.violet)) { innerPadding ->
                    NavHost(
                        navController = navController, startDestination = "activity1",
                        modifier = Modifier.padding(innerPadding)
                    ) {

                        composable("activity1") {
                            Activity1(
                                onButtonClicked={navController.navigate("activity2")}
                            )
                        }
                        composable("activity2"){
                            Activity2()
                        }
                    }
                }
            }
        }
    }
}
