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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun ItemGarden(checked: Boolean, title: String, imageId: Int) {
    Box(
        modifier = Modifier
            .height(64.dp)
            .padding(start = 16.dp)
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .height(64.dp)
                .width(64.dp)
                .clip(shape = RoundedCornerShape(size = 4.dp)),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(start = 80.dp)) {
            Box(modifier = Modifier.height(24.dp)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.align(Alignment.BottomStart)
                )
            }
            Box(modifier = Modifier.height(16.dp)) {
                Text(
                    text = "this is a description",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.align(Alignment.BottomStart)
                )
            }
        }
        Checkbox(
            checked = checked,
            onCheckedChange = {},
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 16.dp)
        )
        Divider(
            modifier = Modifier
                .padding(start = 72.dp, end = 16.dp)
                .align(Alignment.BottomStart)
        )
    }
}

@Preview
@Composable
fun LightPreview() {
    MyTheme(darkTheme = false) {
        Surface(color = MaterialTheme.colors.background) {
            ItemGarden(true, "Monstera", R.mipmap.img4)
        }
    }
}

@Preview
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            ItemGarden(false, "Monstera", R.mipmap.img4)
        }
    }
}
