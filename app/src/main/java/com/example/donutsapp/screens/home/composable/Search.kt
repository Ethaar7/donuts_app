package com.example.donutsapp.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.BackgroundColor
import com.example.donutsapp.ui.theme.Black60
import com.example.donutsapp.ui.theme.TextColorL
import com.example.donutsapp.ui.theme.Typography

@Composable
fun Search() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,

            ) {
            Column {
                Text(
                    text = stringResource(R.string.let_s_donuts),
                    style = Typography.labelLarge.copy(fontSize = 30.sp, color = TextColorL)
                )
                Text(
                    text = stringResource(R.string.favourite),
                    style = Typography.labelSmall.copy(fontSize = 14.sp, color = Black60)
                )
            }

            Icon(
                painter = painterResource(id = R.drawable.ic_round_search),
                contentDescription = null,
                tint = TextColorL,
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(BackgroundColor)
                    .size(45.dp)
                    .align(Alignment.CenterVertically)
                    .padding(4.dp)
            )

        }
    }
}

