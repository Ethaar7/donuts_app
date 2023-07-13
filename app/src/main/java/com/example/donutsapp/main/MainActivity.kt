package com.example.donutsapp.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.example.donutsapp.DonutsApp
import com.example.donutsapp.screens.home.HomeScreen

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            BottomSheet()
//            DetailsScreen()
//            StartContent()
            DonutsApp()
//            BottomNavigation()

        }
    }
}

