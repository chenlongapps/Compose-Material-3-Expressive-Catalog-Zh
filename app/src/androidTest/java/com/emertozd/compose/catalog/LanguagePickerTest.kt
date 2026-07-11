package com.emertozd.compose.catalog

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.waitUntilExactlyOneExists
import androidx.core.os.LocaleListCompat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class LanguagePickerTest {
    @get:Rule val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun startInEnglish() {
        composeRule.activity.runOnUiThread {
            AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags("en"))
        }
    }

    @After
    fun restoreSystemLanguage() {
        composeRule.activity.runOnUiThread {
            AppCompatDelegate.setApplicationLocales(LocaleListCompat.getEmptyLocaleList())
        }
    }

    @Test
    fun selectingSimplifiedChineseRecreatesLocalizedCatalog() {
        composeRule.waitUntilExactlyOneExists(hasContentDescription("More options"), 10_000)
        composeRule.onNodeWithContentDescription("More options").performClick()
        composeRule.onNodeWithText("Language").performClick()
        composeRule.onNodeWithText("简体中文").performClick()

        composeRule.waitUntilExactlyOneExists(hasContentDescription("更多选项"), 10_000)
        composeRule.onNodeWithContentDescription("更多选项").performClick()
        composeRule.onNodeWithText("语言").assertExists()
    }
}
