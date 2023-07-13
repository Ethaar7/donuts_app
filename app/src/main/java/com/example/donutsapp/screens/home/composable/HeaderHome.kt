package com.example.donutsapp.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Black60
import com.example.donutsapp.ui.theme.Black87
import com.example.donutsapp.ui.theme.CardColorSecandary
import com.example.donutsapp.ui.theme.TextColorL
import com.example.donutsapp.ui.theme.Typography

@Composable
fun HeaderHome(painter: Painter, color: Color) {
    Column() {
        Box() {

            Column(
                modifier = Modifier
                    .padding(start = 24.dp , end = 32.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color)
                    .width(193.dp)
                    .height(325.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_round_favorite),
                    contentDescription = "Icon fAVORITE",
                    tint = TextColorL,
                    modifier = Modifier
                        .padding(start = 16.dp, top = 16.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(4.dp)
                )



                Column(
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier.padding(top = 150.dp)
                ) {
                    Text(
                        text = "Strawberry Wheel",
                        style = Typography.labelSmall.copy(Black87, fontSize = 16.sp),
                        modifier = Modifier.padding(start = 16.dp)
                    )
                    Text(
                        text = "These Baked Strawberry\n Donuts are filled with\n fresh strawberries...",
                        style = Typography.labelMedium.copy(Black60, fontSize = 12.sp),
                        modifier = Modifier.padding(start = 16.dp, top = 8.dp)
                    )
                    Row(modifier = Modifier.padding(start = 16.dp)) {
                        Text(
                            text = "$20",
                            style = Typography.labelMedium.copy(
                                fontSize = 16.sp,
                                textDecoration = TextDecoration.LineThrough,
                            ),
                            modifier = Modifier.align(Alignment.Bottom)
                        )
                        Text(
                            text = "$16",
                            style = Typography.labelLarge.copy(Black87, fontSize = 22.sp),
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.Bottom)
                        )
                    }


                }

            }
            Image(
                painter = painter,
                contentDescription = "Image type donuts",
                modifier = Modifier
                    .size(200.dp)
                    .offset(80.dp)
            )

        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun Preview() {
    HeaderHome(
        painter = painterResource(id = R.drawable.image_12),
        color = CardColorSecandary
    )}