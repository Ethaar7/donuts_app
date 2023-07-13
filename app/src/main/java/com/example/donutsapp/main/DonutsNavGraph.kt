package com.example.donutsapp

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.donutsapp.screens.BuyScreen
import com.example.donutsapp.screens.NotificationScreen
import com.example.donutsapp.screens.ProfileScreen
import com.example.donutsapp.screens.details.DetailsScreen
import com.example.donutsapp.screens.details.detailsRoute
import com.example.donutsapp.screens.home.HomeScreen
import com.example.donutsapp.screens.start.startRoute

@ExperimentalMaterial3Api
@ExperimentalMaterialApi
@Composable
fun DonutsNavGraph() {
    val navController = LocalNavigationProvider.current
    NavHost(navController = navController, startDestination = Screen.StartScreen.rout) {
        startRoute(navController)
        composable(Screen.HomeScreen.rout) {
            HomeScreen()
        }
        detailsRoute(navController)
        composable(Screen.DetailsScreen.rout) {
            DetailsScreen()
        }
        composable(Screen.NotificationScreen.rout) {
            NotificationScreen()
        }
        composable(Screen.BuyScreen.rout) {
            BuyScreen()
        }
        composable(Screen.ProfileScreen.rout) {
            ProfileScreen()
        }

    }
}


