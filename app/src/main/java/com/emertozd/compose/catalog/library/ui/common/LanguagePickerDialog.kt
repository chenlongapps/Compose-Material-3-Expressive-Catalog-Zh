package com.emertozd.compose.catalog.library.ui.common

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.emertozd.compose.catalog.R
import com.emertozd.compose.catalog.library.model.AppLanguage

@Composable
fun LanguagePickerDialog(onDismissRequest: () -> Unit) {
    val selectedLanguage =
        AppLanguage.fromLocaleList(AppCompatDelegate.getApplicationLocales())
    AlertDialog(
        onDismissRequest = onDismissRequest,
        title = { Text(stringResource(R.string.language)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                AppLanguage.entries.forEach { language ->
                    val label =
                        when (language) {
                            AppLanguage.System -> stringResource(R.string.language_follow_system)
                            AppLanguage.SimplifiedChinese ->
                                stringResource(R.string.language_simplified_chinese)
                            AppLanguage.English -> stringResource(R.string.language_english)
                        }
                    Row(
                        modifier =
                            Modifier.fillMaxWidth().selectable(
                                selected = language == selectedLanguage,
                                role = Role.RadioButton,
                                onClick = {
                                    if (language == selectedLanguage) {
                                        onDismissRequest()
                                    } else {
                                        onDismissRequest()
                                        AppCompatDelegate.setApplicationLocales(
                                            language.toLocaleList()
                                        )
                                    }
                                },
                            ),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                    ) {
                        RadioButton(selected = language == selectedLanguage, onClick = null)
                        Text(label)
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismissRequest) { Text(stringResource(R.string.cancel)) }
        },
    )
}
