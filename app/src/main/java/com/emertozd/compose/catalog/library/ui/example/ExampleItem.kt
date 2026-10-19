/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emertozd.compose.catalog.library.ui.example

import android.content.ClipData
import android.widget.Toast
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.ClipEntry
import androidx.compose.ui.platform.LocalClipboard
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.emertozd.compose.catalog.R
import com.emertozd.compose.catalog.library.model.Example
import com.emertozd.compose.catalog.library.ui.common.ItemBanner
import kotlinx.coroutines.launch

@Composable
fun ExampleItem(
    example: Example,
    markExpressiveComponents: Boolean,
    onClick: (example: Example) -> Unit,
) {
    val clipboard = LocalClipboard.current
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val copyLabel = stringResource(R.string.copy_example_name)
    val copiedMessage = stringResource(R.string.example_name_copied)

    OutlinedCard(
        modifier =
            Modifier.fillMaxWidth()
                .clip(CardDefaults.outlinedShape)
                .combinedClickable(
                    role = Role.Button,
                    onClick = { onClick(example) },
                    onLongClickLabel = copyLabel,
                    onLongClick = {
                        coroutineScope.launch {
                            clipboard.setClipEntry(
                                ClipEntry(ClipData.newPlainText(copyLabel, example.name)),
                            )
                            Toast.makeText(context, copiedMessage, Toast.LENGTH_SHORT).show()
                        }
                    },
                ),
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.padding(ExampleItemPadding)) {
                Column(modifier = Modifier.weight(1f, fill = true)) {
                    Text(text = example.name, style = MaterialTheme.typography.titleSmall)
                    Spacer(modifier = Modifier.height(ExampleItemTextPadding))
                    Text(
                        text = stringResource(example.description),
                        style = MaterialTheme.typography.bodySmall,
                    )
                }
                Spacer(modifier = Modifier.width(ExampleItemPadding))
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterVertically),
                )
            }
            if (markExpressiveComponents && example.isExpressive) {
                ItemBanner(
                    text = stringResource(R.string.expressive_badge),
                    bannerSize = ExampleItemBannerSize,
                )
            }
        }
    }
}

private val ExampleItemPadding = 16.dp
private val ExampleItemTextPadding = 8.dp
private val ExampleItemBannerSize = 64.dp
