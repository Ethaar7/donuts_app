package com.example.donutsapp

sealed class Screen(val rout: String, val title: String, val icon: Int) {
    object HomeScreen : Screen(rout = "HomeScreen", title = "", icon = R.drawable.home)
    object FavoriteScreen : Screen(rout = "Favorite", title = "", icon = R.drawable.heart2)
    object NotificationScreen :
        Screen(rout = "Notification", title = "", icon = R.drawable.notification)

    object BuyScreen : Screen(rout = "Buy", title = "", icon = R.drawable.buy)
    object ProfileScreen :
        Screen(rout = "Profile", title = "", icon = R.drawable.mingcute_user_2_line)

    object StartScreen : Screen(rout = "StartScreen", title = "", icon = 0)
    object DetailsScreen : Screen(rout = "DetailsScreen", title = "", icon = 0)
}