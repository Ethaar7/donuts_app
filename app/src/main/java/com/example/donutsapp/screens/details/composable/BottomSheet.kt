package com.example.donutsapp.screens.details.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.screens.details.DetailsState
import com.example.donutsapp.ui.theme.Black87
import com.example.donutsapp.ui.theme.TextColorL
import com.example.donutsapp.ui.theme.Typography

@ExperimentalMaterialApi
@Composable
fun BottomSheet(
    stat: DetailsState,
    onClickPlus: () -> Unit,
    onClickMinus: () -> Unit,
) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .background(Color.White)
                .height(450.dp)
        ) {

            Column(Modifier.fillMaxSize()) {
                Row() {
                    Text(
                        text = stringResource(R.string.strawberry_wheel),
                        style = Typography.labelLarge.copy(
                            fontSize = 30.sp,
                            color = TextColorL
                        ),
                        modifier = Modifier.padding(16.dp)
                    )

                }
                Text(
                    text = stringResource(R.string.about_gonut),
                    style = Typography.labelSmall.copy(color = Color.Black),
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = stringResource(R.string.sweet),
                    style = Typography.labelMedium,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                )

                Text(
                    text = stringResource(R.string.quantity),
                    style = Typography.labelSmall.copy(color = Color.Black),
                    modifier = Modifier.padding(16.dp)
                )

                Row(
                    modifier = Modifier.padding(start = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    IconButton(
                        onClick = onClickMinus,
                        modifier = Modifier
                            .size(45.dp)
                            .background(Color.White)
                            .clip(RoundedCornerShape(16.dp))
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.minus),
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(45.dp)
                            .background(Color.White)
                            .clip(
                                RoundedCornerShape(32)
                            )
                    ) {
                        Text(
                            text = stat.quantity.toString(),
                            style = Typography.labelSmall.copy(
                                fontSize = 22.sp,
                                color = Black87
                            ),
                            modifier = Modifier
                                .align(Alignment.Center),

                            )
                    }

                    IconButton(
                        onClick = onClickPlus,
                        modifier = Modifier
                            .size(45.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color.Black)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.add),
                            contentDescription = null,
                            tint = Color.White,
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 48.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(modifier = Modifier.height(56.dp)) {
                        Text(
                            text = stringResource(R.string.price) + stat.totalPrice.toString(),
                            style = Typography.labelLarge.copy(color = Black87, fontSize = 30.sp),
                            modifier = Modifier
                                .align(Alignment.Center),
                        )
                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(TextColorL),
                        modifier = Modifier
                            .height(56.dp)
                            .width(248.dp)

                    ) {
                        Text(
                            text = stringResource(R.string.add_to_cart),
                            style = Typography.labelLarge.copy(Color.White),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                }
            }
        }
    }



