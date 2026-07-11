package com.emertozd.compose.catalog.library.model

import androidx.core.os.LocaleListCompat

enum class AppLanguage(val languageTag: String?) {
    System(null),
    SimplifiedChinese("zh-Hans"),
    English("en"),
    ;

    fun toLocaleList(): LocaleListCompat =
        languageTag?.let(LocaleListCompat::forLanguageTags)
            ?: LocaleListCompat.getEmptyLocaleList()

    companion object {
        fun fromLocaleList(locales: LocaleListCompat): AppLanguage {
            val locale = locales[0] ?: return System
            return when {
                locale.language == "zh" &&
                    locale.script != "Hant" &&
                    locale.country !in setOf("TW", "HK", "MO") -> SimplifiedChinese
                locale.language == "en" -> English
                else -> System
            }
        }
    }
}
