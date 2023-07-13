package com.example.donutsapp.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.LocalNavigationProvider
import com.example.donutsapp.R
import com.example.donutsapp.Screen
import com.example.donutsapp.main.BottomNavigation
import com.example.donutsapp.screens.home.composable.DonutsCard
import com.example.donutsapp.screens.home.composable.HeaderHome
import com.example.donutsapp.screens.home.composable.Search
import com.example.donutsapp.ui.theme.CardColorBank
import com.example.donutsapp.ui.theme.CardColorSecandary
import com.example.donutsapp.ui.theme.Typography

@ExperimentalMaterialApi
@ExperimentalMaterial3Api
@Composable
fun HomeScreen() {
    val navController = LocalNavigationProvider.current
    HomeContent(onClick = {
        navController.navigate(Screen.DetailsScreen.rout)
    })
}

//@Preview(showSystemUi = true)
@ExperimentalMaterial3Api
@ExperimentalMaterialApi
@Composable
fun HomeContent(
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Search()
        Text(
            text = stringResource(R.string.today_offers),
            style = Typography.labelLarge,
            modifier = Modifier.padding(16.dp)
        )
        LazyRow(modifier = Modifier, contentPadding = PaddingValues(end = 16.dp)) {
            item {
                HeaderHome(
                    painter = painterResource(id = R.drawable.strawberry_wheel_donut),
                    color = CardColorSecandary,
                    text = "Strawberry Wheel",
                    onClick = { onClick }
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_999),
                    color = CardColorBank,
                    text = "Chocolate Glaze",
                    onClick = { onClick }
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.strawberry_wheel_donut),
                    color = CardColorSecandary,
                    text = "Strawberry Wheel",
                    onClick = { onClick }
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_999),
                    color = CardColorBank,
                    text = "Chocolate Glaze",
                    onClick = {}
                )

            }
        }
        Text(
            text = "Donuts",
            style = Typography.labelLarge,
            modifier = Modifier.padding(16.dp)
        )

        LazyRow(
            modifier = Modifier,
            contentPadding = PaddingValues(top = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_1111),
                    text = "Chocolate Cherry"
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_1212),
                    text = "Strawberry Rain"
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_10),
                    text = "Strawberry Coco "
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_1212),
                    text = "Strawberry Rain"
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_1111),
                    text = "Chocolate Cherry"
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_10),
                    text = "Strawberry Coco "
                )
            }
        }
        BottomNavigation()
    }

}