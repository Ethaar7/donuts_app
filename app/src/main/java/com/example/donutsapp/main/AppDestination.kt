package com.example.donutsapp

sealed class Screen(val rout: String) {
    object StartScreen : Screen("StartScreen")
    object DetailsScreen : Screen("DetailsScreen")
    object HomeScreen : Screen("HomeScreen")
}