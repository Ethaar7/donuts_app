package com.example.donutsapp.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.TextColorL


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavigation() {


    var bottomState by remember {
        mutableStateOf("Home")
    }
    Scaffold(
        bottomBar = {

            BottomNavigation(backgroundColor = Color.White, modifier = Modifier.height(68.dp)) {

                BottomNavigationItem(selected = bottomState == "Home",
                    onClick = { bottomState = "Home" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.home),
                            contentDescription = null,
                            tint = TextColorL
                        )
                    }
                )


                BottomNavigationItem(selected = bottomState == "Favorite",
                    onClick = { bottomState = "Search" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.heart2),
                            contentDescription = null,
                            tint = TextColorL
                        )
                    }
                )


                BottomNavigationItem(selected = bottomState == "Notification",
                    onClick = { bottomState = "Tickets" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.notification),
                            contentDescription = null,
                            tint = TextColorL
                        )
                    }
                )

                BottomNavigationItem(selected = bottomState == "Buy",
                    onClick = { bottomState = "Profile" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.buy),
                            contentDescription = null,
                            tint = TextColorL
                        )
                    }
                )
                BottomNavigationItem(selected = bottomState == "Profile",
                    onClick = { bottomState = "Profile" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.mingcute_user_2_line),
                            contentDescription = null,
                            tint = TextColorL
                        )
                    }
                )
            }
        }) {}
}



