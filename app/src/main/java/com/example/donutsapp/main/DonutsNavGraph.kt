package com.example.donutsapp

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.donutsapp.screens.details.detailsRoute
import com.example.donutsapp.screens.home.homeRoute
import com.example.donutsapp.screens.start.startRoute

@ExperimentalMaterialApi
@Composable
fun DonutsNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.StartScreen.rout) {
        startRoute(navController)
        homeRoute(navController)
        detailsRoute(navController)

    }
}