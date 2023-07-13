package com.example.donutsapp.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.DonutsNavGraph
import com.example.donutsapp.Screen
import com.example.donutsapp.ui.theme.TextColorL

@ExperimentalMaterialApi
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun BottomNavigation() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomBar(navController = navController) }) {
        DonutsNavGraph()
    }
}


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        Screen.HomeScreen,
        Screen.FavoriteScreen,
        Screen.NotificationScreen,
        Screen.BuyScreen,
        Screen.ProfileScreen,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(backgroundColor = Color.White) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}


@Composable
fun RowScope.AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = { Text(text = screen.title) },
        icon = {
            Icon(
                painter = painterResource(id = screen.icon),
                contentDescription = null,
                tint = TextColorL
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.rout
        } == true,
        onClick = {
            navController.navigate(screen.rout) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}


//@OptIn(ExperimentalMaterial3Api::class)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun BottomNavigation() {
//    val navController = rememberNavController()
//
//    var bottomState by remember {
//        mutableStateOf("Home")
//    }
//    Scaffold(
//        bottomBar = {
//
//            BottomNavigation(backgroundColor = Color.White, modifier = Modifier.height(68.dp)) {
//
//                BottomNavigationItem(selected = bottomState == "Home",
//                    onClick = { bottomState = "Home" },
//                    label = { Text(text = "") },
//                    icon = {
//                        Icon(
//                            painter = painterResource(R.drawable.home),
//                            contentDescription = null,
//                            tint = TextColorL
//                        )
//                    }
//                )
//
//
//                BottomNavigationItem(selected = bottomState == "DetailScreen",
//                    onClick = { bottomState = "Search" },
//                    label = { Text(text = "") },
//                    icon = {
//                        Icon(
//                            painter = painterResource(R.drawable.heart2),
//                            contentDescription = null,
//                            tint = TextColorL
//                        )
//                    }
//                )
//
//
//                BottomNavigationItem(selected = bottomState == "Notification",
//                    onClick = { bottomState = "Tickets" },
//                    label = { Text(text = "") },
//                    icon = {
//                        Icon(
//                            painter = painterResource(R.drawable.notification),
//                            contentDescription = null,
//                            tint = TextColorL
//                        )
//                    }
//                )
//
//                BottomNavigationItem(selected = bottomState == "Buy",
//                    onClick = { bottomState = "Profile" },
//                    label = { Text(text = "") },
//                    icon = {
//                        Icon(
//                            painter = painterResource(R.drawable.buy),
//                            contentDescription = null,
//                            tint = TextColorL
//                        )
//                    }
//                )
//                BottomNavigationItem(selected = bottomState == "Profile",
//                    onClick = { bottomState = "Profile" },
//                    label = { Text(text = "") },
//                    icon = {
//                        Icon(
//                            painter = painterResource(R.drawable.mingcute_user_2_line),
//                            contentDescription = null,
//                            tint = TextColorL
//                        )
//                    }
//                )
//            }
//        }) {}
//}



