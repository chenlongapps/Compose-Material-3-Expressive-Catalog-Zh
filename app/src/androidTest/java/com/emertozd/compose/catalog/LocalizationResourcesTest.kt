package com.emertozd.compose.catalog

import android.content.res.Configuration
import android.os.LocaleList
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LocalizationResourcesTest {
    @Test
    fun simplifiedChineseResourcesResolveCatalogAndSampleText() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val configuration = Configuration(context.resources.configuration)
        configuration.setLocales(LocaleList.forLanguageTags("zh-Hans"))
        val localizedContext = context.createConfigurationContext(configuration)

        assertEquals("语言", localizedContext.getString(R.string.language))
        assertEquals(
            "自适应布局",
            localizedContext.getString(R.string.component_adaptive_name),
        )
        assertEquals(
            "按钮",
            localizedContext.resources.getStringArray(R.array.sample_text_translation).first(),
        )
    }

    @Test
    fun sampleTranslationArraysStayAligned() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val configuration = Configuration(context.resources.configuration)
        configuration.setLocales(LocaleList.forLanguageTags("zh-Hans"))
        val localizedContext = context.createConfigurationContext(configuration)

        assertEquals(
            context.resources.getStringArray(R.array.sample_text_source).size,
            localizedContext.resources.getStringArray(R.array.sample_text_translation).size,
        )
    }
}
