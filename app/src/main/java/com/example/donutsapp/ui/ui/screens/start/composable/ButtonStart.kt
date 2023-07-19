package com.example.donutsapp.ui.screens.start.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.Typography

@Composable
fun ButtonStart(onClickStart: () -> Unit) {
    Button(
        onClick = onClickStart,
        colors = ButtonDefaults.buttonColors(Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp)
            .height(56.dp)

    ) {
        Text(
            text = stringResource(R.string.get_started),
            style = Typography.labelLarge
        )
    }
}