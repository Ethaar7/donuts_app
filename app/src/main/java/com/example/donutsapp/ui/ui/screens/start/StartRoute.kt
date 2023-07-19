package com.example.donutsapp.ui.screens.start

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

private const val ROUTE = "StartScreen"

fun NavGraphBuilder.startRoute(navController: NavController) {
    composable(route = ROUTE) {
        StartScreen(navController)
    }
}