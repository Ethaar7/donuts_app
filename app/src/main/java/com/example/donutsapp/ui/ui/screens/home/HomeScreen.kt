package com.example.donutsapp.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.donutsapp.R
import com.example.donutsapp.Screen
import com.example.donutsapp.screens.home.composable.DonutsCard
import com.example.donutsapp.screens.home.composable.HeaderHome
import com.example.donutsapp.screens.home.composable.Search
import com.example.donutsapp.ui.CardColorBank
import com.example.donutsapp.ui.CardColorSecandary
import com.example.donutsapp.ui.Typography

@ExperimentalMaterialApi
@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navController: NavController) {
    HomeContent(onClick = {
        navController.navigate(Screen.DetailsScreen.rout)
    })
}

@ExperimentalMaterialApi
@ExperimentalMaterial3Api
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
                    text = stringResource(R.string.strawberry_wheel5),
                    onClick = { onClick() }
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_777),
                    color = CardColorBank,
                    text = stringResource(R.string.chocolate_glaze),
                    onClick = { onClick() }
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.strawberry_wheel_donut),
                    color = CardColorSecandary,
                    text = stringResource(R.string.strawberry_wheel5),
                    onClick = { onClick() }
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_777),
                    color = CardColorBank,
                    text = stringResource(R.string.chocolate_glaze),
                    onClick = { onClick() }
                )

            }
        }
        Text(
            text = stringResource(R.string.donuts3),
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
                    text = stringResource(R.string.chocolate_cherry)
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_1212),
                    text = stringResource(R.string.strawberry_rain)
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_10),
                    text = stringResource(R.string.strawberry_coco)
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_1212),
                    text = stringResource(R.string.strawberry_rain)
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_1111),
                    text = stringResource(R.string.chocolate_cherry)
                )
                DonutsCard(
                    painter = painterResource(id = R.drawable.image_10),
                    text = stringResource(R.string.strawberry_coco)
                )
            }
        }
    }

}