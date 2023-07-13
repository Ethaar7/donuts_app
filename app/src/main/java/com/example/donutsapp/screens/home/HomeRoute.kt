package com.example.donutsapp.screens.home

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

private const val ROUTE = "HomeScreen"

@ExperimentalMaterialApi
fun NavGraphBuilder.homeRoute(navController: NavController) {
    composable(route = ROUTE) {
        HomeScreen(navController)
    }
}