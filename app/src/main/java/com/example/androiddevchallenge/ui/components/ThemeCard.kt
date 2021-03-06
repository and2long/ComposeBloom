/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun ThemeCard(title: String, imgId: Int) {
    Card {
        Surface(
            color = MaterialTheme.colors.primaryVariant
        ) {
            Box(
                modifier = Modifier
                    .height(136.dp)
                    .width(136.dp)
            ) {
                Image(
                    painter = painterResource(id = imgId),
                    contentDescription = null,
                    modifier = Modifier.height(96.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = title,
                    style = MaterialTheme.typography.h2.copy(color = MaterialTheme.colors.onPrimary),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = 16.dp, end = 16.dp, bottom = 12.dp)
                        .fillMaxWidth(),
                )
            }
        }
    }
}

@Preview
@Composable
fun ThemeCardLightPreview() {
    MyTheme(darkTheme = false) {
        ThemeCard("Desert chic", R.mipmap.img10)
    }
}

@Preview
@Composable
fun ThemeCardDarkPreview() {
    MyTheme(darkTheme = true) {
        ThemeCard("Desert chic", R.mipmap.img1)
    }
}
