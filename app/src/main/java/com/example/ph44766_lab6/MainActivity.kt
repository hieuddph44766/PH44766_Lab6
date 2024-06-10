package com.example.ph44766_lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ph44766_lab6.ui.theme.PH44766_Lab6Theme
import com.example.ph44766_lab6.screens.Bai1
import com.example.ph44766_lab6.screens.Bai2
import com.example.ph44766_lab6.screens.MainScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "bt") {
        composable("bt") {
            MainScreen(navController)
        }
        composable("b1") {
            Bai1()
        }
        composable("b2") {
            Bai2()
        }
    }
}