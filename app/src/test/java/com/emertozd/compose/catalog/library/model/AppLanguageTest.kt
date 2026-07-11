package com.emertozd.compose.catalog.library.model

import androidx.core.os.LocaleListCompat
import org.junit.Assert.assertEquals
import org.junit.Test

class AppLanguageTest {
    @Test
    fun emptyLocaleListMapsToSystem() {
        assertEquals(
            AppLanguage.System,
            AppLanguage.fromLocaleList(LocaleListCompat.getEmptyLocaleList()),
        )
    }

    @Test
    fun simplifiedChineseLocaleMapsToSimplifiedChinese() {
        assertEquals(
            AppLanguage.SimplifiedChinese,
            AppLanguage.fromLocaleList(LocaleListCompat.forLanguageTags("zh-Hans")),
        )
    }

    @Test
    fun englishLocaleMapsToEnglish() {
        assertEquals(
            AppLanguage.English,
            AppLanguage.fromLocaleList(LocaleListCompat.forLanguageTags("en")),
        )
    }

    @Test
    fun unsupportedLocaleFallsBackToSystem() {
        assertEquals(
            AppLanguage.System,
            AppLanguage.fromLocaleList(LocaleListCompat.forLanguageTags("fr")),
        )
    }

    @Test
    fun traditionalChineseLocaleDoesNotSelectSimplifiedChinese() {
        assertEquals(
            AppLanguage.System,
            AppLanguage.fromLocaleList(LocaleListCompat.forLanguageTags("zh-Hant-TW")),
        )
    }

    @Test
    fun languageOptionsProduceExpectedTags() {
        assertEquals("", AppLanguage.System.toLocaleList().toLanguageTags())
        assertEquals("zh-Hans", AppLanguage.SimplifiedChinese.languageTag)
        assertEquals("zh", AppLanguage.SimplifiedChinese.toLocaleList()[0]?.language)
        assertEquals("en", AppLanguage.English.toLocaleList().toLanguageTags())
    }
}
