package com.example.donutsapp.screens.details

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

private const val ROUTE = "DetailsScreen"

@ExperimentalMaterialApi
fun NavGraphBuilder.detailsRoute(navController: NavController) {
    composable(route = ROUTE) {
        DetailsScreen(navController)
    }
}