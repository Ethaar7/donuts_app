package com.example.donutsapp.screens.home

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

private const val ROUTE = "HomeScreen"

@ExperimentalMaterial3Api
@ExperimentalMaterialApi
fun NavGraphBuilder.homeRoute(navController: NavController) {
    composable(route = ROUTE) {
        HomeScreen()
    }
}