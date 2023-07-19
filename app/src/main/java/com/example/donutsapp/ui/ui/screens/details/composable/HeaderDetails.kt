package com.example.donutsapp.ui.screens.details.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.TextColorL

@Composable
fun HeaderDetails(onClickBack: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.image_12),
            contentDescription = null
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_round_arrow_back),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 16.dp, start = 16.dp)
                .clickable(onClick = onClickBack),
            tint = TextColorL,

            )

    }


}
