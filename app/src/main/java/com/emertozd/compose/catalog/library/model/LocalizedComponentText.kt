package com.emertozd.compose.catalog.library.model

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.emertozd.compose.catalog.R

private data class ComponentText(
    @param:StringRes val name: Int,
    @param:StringRes val description: Int,
)

private fun Component.textResources(): ComponentText? =
    when (name) {
        "Adaptive" -> ComponentText(R.string.component_adaptive_name, R.string.component_adaptive_description)
        "Badge" -> ComponentText(R.string.component_badge_name, R.string.component_badge_description)
        "Bottom App Bar" -> ComponentText(R.string.component_bottom_app_bar_name, R.string.component_bottom_app_bar_description)
        "Bottom Sheet" -> ComponentText(R.string.component_bottom_sheet_name, R.string.component_bottom_sheet_description)
        "Buttons" -> ComponentText(R.string.component_buttons_name, R.string.component_buttons_description)
        "Button Groups" -> ComponentText(R.string.component_button_groups_name, R.string.component_button_groups_description)
        "Card" -> ComponentText(R.string.component_card_name, R.string.component_card_description)
        "Carousel" -> ComponentText(R.string.component_carousel_name, R.string.component_carousel_description)
        "Checkboxes" -> ComponentText(R.string.component_checkboxes_name, R.string.component_checkboxes_description)
        "Chips" -> ComponentText(R.string.component_chips_name, R.string.component_chips_description)
        "Date pickers" -> ComponentText(R.string.component_date_pickers_name, R.string.component_date_pickers_description)
        "Dialogs" -> ComponentText(R.string.component_dialogs_name, R.string.component_dialogs_description)
        "Extended FAB" -> ComponentText(R.string.component_extended_fab_name, R.string.component_extended_fab_description)
        "Floating action buttons" -> ComponentText(R.string.component_fab_name, R.string.component_fab_description)
        "FAB Menu" -> ComponentText(R.string.component_fab_menu_name, R.string.component_fab_menu_description)
        "Floating Toolbar" -> ComponentText(R.string.component_floating_toolbar_name, R.string.component_floating_toolbar_description)
        "Icon buttons" -> ComponentText(R.string.component_icon_buttons_name, R.string.component_icon_buttons_description)
        "Lists" -> ComponentText(R.string.component_lists_name, R.string.component_lists_description)
        "Loading indicators" -> ComponentText(R.string.component_loading_indicators_name, R.string.component_loading_indicators_description)
        "Menus" -> ComponentText(R.string.component_menus_name, R.string.component_menus_description)
        "Navigation bar" -> ComponentText(R.string.component_navigation_bar_name, R.string.component_navigation_bar_description)
        "Navigation drawer" -> ComponentText(R.string.component_navigation_drawer_name, R.string.component_navigation_drawer_description)
        "Navigation rail" -> ComponentText(R.string.component_navigation_rail_name, R.string.component_navigation_rail_description)
        "Navigation Suite Scaffold" -> ComponentText(R.string.component_navigation_suite_name, R.string.component_navigation_suite_description)
        "Progress indicators" -> ComponentText(R.string.component_progress_indicators_name, R.string.component_progress_indicators_description)
        "Pull-to-Refresh Indicator" -> ComponentText(R.string.component_pull_to_refresh_name, R.string.component_pull_to_refresh_description)
        "Radio buttons" -> ComponentText(R.string.component_radio_buttons_name, R.string.component_radio_buttons_description)
        "Search bars" -> ComponentText(R.string.component_search_bars_name, R.string.component_search_bars_description)
        "Segmented Button" -> ComponentText(R.string.component_segmented_button_name, R.string.component_segmented_button_description)
        "ToggleButtons" -> ComponentText(R.string.component_toggle_buttons_name, R.string.component_toggle_buttons_description)
        "Sliders" -> ComponentText(R.string.component_sliders_name, R.string.component_sliders_description)
        "Snackbars" -> ComponentText(R.string.component_snackbars_name, R.string.component_snackbars_description)
        "Split Button" -> ComponentText(R.string.component_split_button_name, R.string.component_split_button_description)
        "Switches" -> ComponentText(R.string.component_switches_name, R.string.component_switches_description)
        "Tabs" -> ComponentText(R.string.component_tabs_name, R.string.component_tabs_description)
        "Text fields" -> ComponentText(R.string.component_text_fields_name, R.string.component_text_fields_description)
        "Tooltips" -> ComponentText(R.string.component_tooltips_name, R.string.component_tooltips_description)
        "Time Picker" -> ComponentText(R.string.component_time_picker_name, R.string.component_time_picker_description)
        "Top app bar" -> ComponentText(R.string.component_top_app_bar_name, R.string.component_top_app_bar_description)
        "Material Shapes" -> ComponentText(R.string.component_material_shapes_name, R.string.component_material_shapes_description)
        "Swipe to Dismiss" -> ComponentText(R.string.component_swipe_to_dismiss_name, R.string.component_swipe_to_dismiss_description)
        else -> null
    }

@Composable
fun Component.localizedName(): String = textResources()?.let { stringResource(it.name) } ?: name

@Composable
fun Component.localizedDescription(): String =
    textResources()?.let { stringResource(it.description) } ?: description

@Composable
fun Component.localizedAdditionalInfo(): String? =
    when (additionalInfo) {
        "Unofficial" -> stringResource(R.string.unofficial)
        else -> additionalInfo
    }
