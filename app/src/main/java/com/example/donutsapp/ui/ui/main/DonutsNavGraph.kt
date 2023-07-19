package com.example.donutsapp

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.donutsapp.screens.BuyScreen
import com.example.donutsapp.screens.FavoriteScreen
import com.example.donutsapp.screens.NotificationScreen
import com.example.donutsapp.screens.ProfileScreen
import com.example.donutsapp.screens.details.detailsRoute
import com.example.donutsapp.screens.home.HomeScreen
import com.example.donutsapp.screens.start.startRoute

@ExperimentalMaterialApi
@ExperimentalMaterial3Api
@Composable
fun DonutsNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.StartScreen.rout
    ) {
        startRoute(navController)
        composable(Screen.HomeScreen.rout) {
            HomeScreen(navController)
        }
        detailsRoute(navController)
        composable(Screen.FavoriteScreen.rout) {
            FavoriteScreen()
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


