package com.example.e_commerce.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce.screens.HomeScreenUI
import kotlinx.serialization.Serializable

@Composable
fun AppNavigation(modifier: Modifier=Modifier){
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = HomeScreen ){
        composable<HomeScreen> {
            HomeScreenUI()
        }
    }
}

@Serializable
object HomeScreen