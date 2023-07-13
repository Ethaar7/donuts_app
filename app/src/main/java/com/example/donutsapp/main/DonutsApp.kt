package com.example.donutsapp

import android.annotation.SuppressLint
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.ui.theme.DonutsAppTheme

@ExperimentalMaterialApi
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DonutsApp() {
    DonutsAppTheme() {
        Scaffold() {
            val navController = rememberNavController()
            DonutsNavGraph(navController)
        }

    }

}