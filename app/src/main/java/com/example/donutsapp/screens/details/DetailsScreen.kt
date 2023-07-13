package com.example.donutsapp.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.Screen
import com.example.donutsapp.screens.details.composable.BottomSheet
import com.example.donutsapp.screens.details.composable.Favorite
import com.example.donutsapp.screens.details.composable.HeaderDetails
import com.example.donutsapp.ui.theme.BackgroundColor

@ExperimentalMaterialApi
@Composable
fun DetailsScreen(
    navController: NavController,
    viewModel: DetailsViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    DetailsContent(
        onClickPlus = viewModel::onIncreaseCounter,
        onClickMinus = viewModel::onDecreaseCounter,
        onClickFavorite = viewModel::onClickFavorite,
        state = state,
        onClickBack = {
            navController.popBackStack(Screen.HomeScreen.rout, false)
        }
    )
}


@ExperimentalMaterialApi
@Composable
fun DetailsContent(
    onClickPlus: (DetailsState) -> Unit,
    onClickMinus: (DetailsState) -> Unit,
    onClickFavorite: (DetailsState) -> Unit,
    state: DetailsState,
    onClickBack: () -> Unit
) {
    Column(
        Modifier
            .background(BackgroundColor)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

        ) {

        HeaderDetails(onClickBack = onClickBack)

        Box(contentAlignment = Alignment.TopEnd) {
            BottomSheet(
                state,
                onClickMinus = { onClickMinus(state) },
                onClickPlus = { onClickPlus(state) },
            )
            Column(horizontalAlignment = Alignment.End) {
                Favorite(
                    onClickFavorite = { onClickFavorite(state) }
                )
            }
        }


    }
}

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun Preview() {
    DetailsScreen(navController = rememberNavController())
}