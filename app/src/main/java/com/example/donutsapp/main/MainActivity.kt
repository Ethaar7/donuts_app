@file:OptIn(ExperimentalMaterialApi::class)

package com.example.donutsapp.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.donutsapp.DonutsApp
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalMaterial3Api
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//         val systemUiController = rememberSystemUiController()
//            systemUiController.setSystemBarsColor()
            DonutsApp()
        }
    }
}

