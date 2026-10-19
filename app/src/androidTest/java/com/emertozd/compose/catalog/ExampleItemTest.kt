package com.emertozd.compose.catalog

import android.content.ClipDescription
import android.content.res.Configuration
import android.os.LocaleList
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ClipEntry
import androidx.compose.ui.platform.Clipboard
import androidx.compose.ui.platform.LocalClipboard
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.NativeClipboard
import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.longClick
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performSemanticsAction
import androidx.compose.ui.test.performTouchInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.emertozd.compose.catalog.library.model.Example
import com.emertozd.compose.catalog.library.ui.example.ExampleItem
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleItemTest {
    @get:Rule val composeRule = createComposeRule()

    private val clipboard = RecordingClipboard()
    private var clickedExample: Example? = null
    private val example =
        Example(
            name = "FilledButtonSample",
            description = R.string.component_buttons_description,
            sourceUrl = "https://example.com/sample.kt",
            isExpressive = true,
            content = {},
        )

    @Test
    fun clickOpensExampleWithoutCopying() {
        showExample("en")

        composeRule.onNodeWithText(example.name).performClick()

        composeRule.runOnIdle {
            assertEquals(example, clickedExample)
            assertNull(clipboard.entry)
        }
    }

    @Test
    fun longPressCopiesEnglishNameWithoutOpeningExample() {
        showExample("en")

        composeRule.onNodeWithText(example.name).performTouchInput { longClick() }

        assertCopiedName("Copy example name")
    }

    @Test
    fun longPressInChineseStillCopiesEnglishName() {
        showExample("zh-Hans")

        composeRule.onNodeWithText(example.name).performTouchInput { longClick() }

        assertCopiedName("复制示例名称")
    }

    @Test
    fun accessibilityLongClickCopiesName() {
        showExample("zh-Hans")

        composeRule.onNodeWithText(example.name).performSemanticsAction(
            SemanticsActions.OnLongClick,
        ) { action ->
            assertTrue(action())
        }

        assertCopiedName("复制示例名称")
    }

    private fun showExample(languageTag: String) {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val configuration = Configuration(context.resources.configuration)
        configuration.setLocales(LocaleList.forLanguageTags(languageTag))
        val localizedContext = context.createConfigurationContext(configuration)

        composeRule.setContent {
            CompositionLocalProvider(
                LocalClipboard provides clipboard,
                LocalContext provides localizedContext,
                LocalConfiguration provides configuration,
            ) {
                MaterialTheme {
                    ExampleItem(
                        example = example,
                        markExpressiveComponents = true,
                        onClick = { clickedExample = it },
                    )
                }
            }
        }
    }

    private fun assertCopiedName(expectedLabel: String) {
        composeRule.waitUntil { clipboard.entry != null }
        val node = composeRule.onNodeWithText(example.name).fetchSemanticsNode()
        assertEquals(expectedLabel, node.config[SemanticsActions.OnLongClick].label)
        composeRule.runOnIdle {
            val clipData = requireNotNull(clipboard.entry).clipData
            assertEquals(1, clipData.itemCount)
            assertTrue(clipData.description.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN))
            assertEquals(expectedLabel, clipData.description.label.toString())
            assertEquals(example.name, clipData.getItemAt(0).text.toString())
            assertNull(clickedExample)
        }
    }

    private class RecordingClipboard : Clipboard {
        @Volatile var entry: ClipEntry? = null

        override suspend fun getClipEntry(): ClipEntry? = entry

        override suspend fun setClipEntry(clipEntry: ClipEntry?) {
            entry = clipEntry
        }

        override val nativeClipboard: NativeClipboard
            get() = error("Native clipboard is not used by these tests")
    }
}
