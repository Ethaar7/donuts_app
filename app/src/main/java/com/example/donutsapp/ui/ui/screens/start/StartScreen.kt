package com.example.donutsapp.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.donutsapp.R
import com.example.donutsapp.Screen
import com.example.donutsapp.ui.BackgroundColor
import com.example.donutsapp.ui.screens.start.composable.ButtonStart
import com.example.donutsapp.ui.screens.start.composable.TextContent

@Composable
fun StartScreen(navController: NavController) {
    StartContent(onClickStart = {
        navController.navigate(Screen.HomeScreen.rout)
    })
}

@Composable
fun StartContent(
    onClickStart: () -> Unit
) {
    Box(
        modifier = Modifier
            .background(BackgroundColor)
            .fillMaxHeight()
    ) {
        Image(
            painter = painterResource(id = R.drawable.group_417),
            contentDescription = "image",
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter),
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                TextContent()
                ButtonStart(onClickStart = onClickStart)
            }
        }

    }


}