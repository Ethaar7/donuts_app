package com.example.donutsapp

import android.annotation.SuppressLint
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

//@ExperimentalMaterialApi
//@OptIn(ExperimentalMaterial3Api::class)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun DonutsApp() {
//    DonutsAppTheme() {
//        Scaffold() {
//            val navController = rememberNavController()
//            BottomNavigation()
//        }
//    }
//}


val LocalNavigationProvider = staticCompositionLocalOf<NavHostController> {
    error("No navigation host controller provided.")
}

@ExperimentalMaterialApi
@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DonutsApp() {
    CompositionLocalProvider(LocalNavigationProvider provides rememberNavController()) {
        DonutsNavGraph()
    }
}