package com.example.donutsapp.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.donutsapp.R
import com.example.donutsapp.main.BottomNavigation
import com.example.donutsapp.screens.home.composable.DonutsCard
import com.example.donutsapp.screens.home.composable.HeaderHome
import com.example.donutsapp.screens.home.composable.Search
import com.example.donutsapp.ui.theme.CardColorBank
import com.example.donutsapp.ui.theme.CardColorSecandary
import com.example.donutsapp.ui.theme.Typography

@Composable
fun HomeScreen(navController: NavController) {
    HomeContent()
}

@Preview(showSystemUi = true)
@Composable
fun HomeContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Search()
        Text(
            text = "Today Offers",
            style = Typography.labelLarge,
            modifier = Modifier.padding(16.dp)
        )
        LazyRow(modifier = Modifier, contentPadding = PaddingValues(start = 16.dp, end = 16.dp)) {
            item {
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_12),
                    color = CardColorSecandary
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_9),
                    color = CardColorBank
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_12),
                    color = CardColorSecandary
                )
                HeaderHome(
                    painter = painterResource(id = R.drawable.image_9),
                    color = CardColorBank
                )

            }
        }
        Text(
            text = "Donuts",
            style = Typography.labelLarge,
            modifier = Modifier.padding(16.dp)
        )


        LazyRow(modifier = Modifier,
            contentPadding = PaddingValues( top = 16.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            item {
                DonutsCard(painter = painterResource(id = R.drawable.image_1111))
                DonutsCard(painter = painterResource(id = R.drawable.image_1212))
                DonutsCard(painter = painterResource(id = R.drawable.image_1111))
                DonutsCard(painter = painterResource(id = R.drawable.image_1212))
                DonutsCard(painter = painterResource(id = R.drawable.image_1111))
                DonutsCard(painter = painterResource(id = R.drawable.image_1212))
            }
        }
        BottomNavigation()
    }

}