package com.example.donutsapp.ui.screens.start.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.donutsapp.R
import com.example.donutsapp.ui.Typography

@Composable
fun TextContent(){
    Column() {
        androidx.compose.material3.Text(
            text = stringResource(R.string.donuts),
            style = Typography.titleLarge,
        )

        androidx.compose.material3.Text(
            text = stringResource(R.string.descraption),
            style = Typography.labelSmall
        )
    }
}