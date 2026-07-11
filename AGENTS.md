# Repository Guidelines

## Project Structure & Module Organization

This repository is a single-module Android application. Gradle configuration lives in `build.gradle.kts`, `settings.gradle.kts`, and `gradle/libs.versions.toml`; application configuration is in `app/build.gradle.kts`.

Kotlin sources are under `app/src/main/java/com/emertozd/compose/catalog/`. Add component demonstrations to `samples/`, catalog navigation and reusable screens to `library/`, and specification UI to `ui/specification/`. Android resources belong in `app/src/main/res/`. Repository-level screenshots are stored in `screenshots/`; `composem3catalog.png` is the README banner.

The app supports English and Simplified Chinese (`zh-Hans`). Default English strings live in `app/src/main/res/values/`; Chinese translations live in `app/src/main/res/values-b+zh+Hans/`. Keep resource keys and array ordering identical across locales. The app-level language picker is implemented with `AppCompatDelegate`; do not add a second language preference store. Visible text in samples should use the shared adapters in `samples/localization/`, while sample function names, API names, URLs, and other technical identifiers remain in English.

## Build, Test, and Development Commands

Use the checked-in Gradle wrapper and JDK 21:

- `./gradlew :app:assembleDebug` builds a debug APK.
- `./gradlew :app:installDebug` installs it on a connected emulator or device.
- `./gradlew :app:testDebugUnitTest` runs local JVM unit tests.
- `./gradlew :app:connectedDebugAndroidTest` runs instrumented and Compose UI tests.
- `./gradlew :app:assembleDebugAndroidTest` builds the instrumented test APK without requiring a device.
- `./gradlew :app:lintDebug` performs Android lint checks.

The project targets Android SDK 36 and supports API 24 and newer. Keep dependency versions centralized in `gradle/libs.versions.toml`.

## Coding Style & Naming Conventions

Follow standard Kotlin and Jetpack Compose conventions: four-space indentation, trailing commas in multiline calls, and small, stateless composables where practical. Use `PascalCase` for classes and `@Composable` functions, `camelCase` for properties and functions, and descriptive filenames such as `ButtonSamples.kt`. Place new samples with related components and use existing `*Samples.kt` files as templates. Run Android Studio formatting and optimize imports before committing; no separate formatter is configured.

Do not introduce new user-visible hardcoded strings in Kotlin. Add English and `zh-Hans` resource entries, or route sample `Text`, `Icon`, and accessibility content through the existing localization adapter. Use locale-aware date, time, and number formatting for dynamic values. Keep dependency versions in `gradle/libs.versions.toml`, including AppCompat and AndroidX test dependencies.

## Testing Guidelines

The build includes JUnit 4, AndroidX Test, Espresso, and Compose UI testing dependencies. Put local tests in `app/src/test/java/` and device tests in `app/src/androidTest/java/`. Name test classes after the subject (`ThemePickerTest`) and test methods by observable behavior. Add tests for navigation, state changes, and user interaction when altering catalog behavior. Localization changes should cover resource resolution in both locales, aligned translation arrays, language-picker selection, Activity recreation, and persistence. Run the unit, lint, and connected tests before submitting UI or resource changes.

## Commit & Pull Request Guidelines

Recent history uses short, imperative summaries such as `add screenshots` and `update project`. Prefer a more specific imperative subject, for example `Add split button samples`, and keep each commit focused.

Pull requests should explain the user-visible change, list verification commands, and link relevant issues. Include emulator screenshots or recordings for UI changes, and call out dependency or minimum-SDK changes explicitly.
