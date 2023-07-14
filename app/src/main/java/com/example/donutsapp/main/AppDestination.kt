package com.example.donutsapp

sealed class Screen(val rout: String, val title: String, val icon: Int, val icon_focused: Int) {
    object HomeScreen : Screen(
        rout = "HomeScreen",
        title = "",
        icon = R.drawable.homeoutline,
        icon_focused = R.drawable.home
    )

    object FavoriteScreen : Screen(
        rout = "Favorite",
        title = "",
        icon = R.drawable.heart2,
        icon_focused = R.drawable.heart3
    )

    object NotificationScreen :
        Screen(
            rout = "Notification",
            title = "",
            icon = R.drawable.notification,
            icon_focused = R.drawable.notification6
        )

    object BuyScreen :
        Screen(rout = "Buy", title = "", icon = R.drawable.buy, icon_focused = R.drawable.buy2)

    object ProfileScreen :
        Screen(
            rout = "Profile",
            title = "",
            icon = R.drawable.mingcute_user_2_line,
            icon_focused = R.drawable.teenyicons_user_solid
        )

    object StartScreen : Screen(rout = "StartScreen", title = "", icon = 0, icon_focused = 0)
    object DetailsScreen : Screen(rout = "DetailsScreen", title = "", icon = 0, icon_focused = 0)

}
