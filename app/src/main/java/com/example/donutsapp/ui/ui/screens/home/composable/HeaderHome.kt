package com.example.donutsapp.ui.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.Black60
import com.example.donutsapp.ui.Black87
import com.example.donutsapp.ui.CardColorSecandary
import com.example.donutsapp.ui.TextColorL
import com.example.donutsapp.ui.Typography

@Composable
fun HeaderHome(painter: Painter, color: Color, text: String, onClick: () -> Unit) {
    Box() {
        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 36.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color)
                .width(193.dp)
                .height(315.dp)
                .clickable { onClick() }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.vector11),
                contentDescription = "Icon favorite",
                tint = TextColorL,
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .padding(8.dp)
            )

            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier.padding(top = 130.dp)
            ) {
                Text(
                    text = text,
                    style = Typography.labelSmall.copy(Black87, fontSize = 16.sp),
                    modifier = Modifier.padding(start = 16.dp)
                )
                Text(
                    text = stringResource(R.string.Donuts),
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
                .size(180.dp)
                .offset(80.dp),
            contentScale = ContentScale.Fit
        )

    }


}


@Preview(showSystemUi = true)
@Composable
fun Preview() {
    HeaderHome(
        painter = painterResource(id = R.drawable.image_7__1_),
        color = CardColorSecandary,
        text = "Strawberry Wheel",
        onClick = {}
    )
}