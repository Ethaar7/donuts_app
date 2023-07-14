package com.example.donutsapp.screens.details.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.IconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.screens.details.DetailsState
import com.example.donutsapp.ui.theme.TextColorL

@ExperimentalMaterialApi
@Composable
fun Favorite(stat: DetailsState, onClickFavorite: () -> Unit) {

    Box(
        modifier = Modifier
            .offset(0.dp, -36.dp)
            .padding(16.dp)
            .size(45.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {
        IconButton(
            onClick = onClickFavorite,
            modifier = Modifier

        ) {
            Icon(
                painter = painterResource(
                    id = if (stat.isFavorite == true) R.drawable.material_symbols_favorite
                    else R.drawable.ic_round_favorite
                ),
                contentDescription = null,
                tint = TextColorL,
            )
        }
    }

}