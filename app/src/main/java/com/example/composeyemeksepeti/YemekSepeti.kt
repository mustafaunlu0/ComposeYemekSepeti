package com.example.composeyemeksepeti

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeyemeksepeti.ui.theme.AppColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun YemekSepeti() {

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = AppColor,
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "logo",
                            modifier = Modifier
                                .padding(top = 7.dp)
                                .fillMaxHeight(1f)
                                .fillMaxWidth(1f),
                            contentScale = ContentScale.FillBounds,
                            alignment = Alignment.Center
                        )


                    }
                },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp).padding(start = 10.dp)

                    )
                },
                actions = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_favorite),
                        contentDescription = "Menu",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp).padding(horizontal = 5.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_shop),
                        contentDescription = "Menu",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp).padding(horizontal = 5.dp)
                    )
                },
                elevation = 0.dp

            )
        }
    ) {
        SearchBar(Modifier.background(AppColor))
    }

}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {

    BasicTextField(
        value = "",
        onValueChange = { Unit },
        decorationBox = { innerTextField ->
            Row(
                modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(0.06f)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.White)


            ) {

                Icon(imageVector = Icons.Default.Search, contentDescription = "search",
                    modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                    )
                    Text(text = "Restoran veya mağaza arayın", modifier = Modifier.padding(top = 10.dp, start = 2.dp), fontSize = 17.sp,
                        color = Color.Gray
                        )
                innerTextField()  //<-- Add this
            }
        },
    )


}

