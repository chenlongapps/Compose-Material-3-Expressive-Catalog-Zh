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

@file:Suppress("COMPOSABLE_FUNCTION_REFERENCE")

package com.emertozd.compose.catalog.library.model

import androidx.annotation.StringRes
import com.emertozd.compose.catalog.R

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.emertozd.compose.catalog.library.util.AdaptiveNavigationSuiteSampleSourceUrl
import com.emertozd.compose.catalog.library.util.AdaptiveSampleSourceUrl
import com.emertozd.compose.catalog.library.util.SampleSourceUrl
import com.emertozd.compose.catalog.samples.AlertDialogSample
import com.emertozd.compose.catalog.samples.AlertDialogWithIconSample
import com.emertozd.compose.catalog.samples.AllShapes
import com.emertozd.compose.catalog.samples.AnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.AnimatedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.AssistChipSample
import com.emertozd.compose.catalog.samples.BasicAlertDialogSample
import com.emertozd.compose.catalog.samples.BottomAppBarWithFAB
import com.emertozd.compose.catalog.samples.BottomAppBarWithOverflow
import com.emertozd.compose.catalog.samples.BottomSheetScaffoldNestedScrollSample
import com.emertozd.compose.catalog.samples.ButtonGroupSample
import com.emertozd.compose.catalog.samples.ButtonSample
import com.emertozd.compose.catalog.samples.ButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.ButtonWithIconSample
import com.emertozd.compose.catalog.samples.CardSample
import com.emertozd.compose.catalog.samples.CarouselWithShowAllButtonSample
import com.emertozd.compose.catalog.samples.CenteredHorizontalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.CenteredSliderSample
import com.emertozd.compose.catalog.samples.CenteredVerticalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.CheckboxRoundedStrokesSample
import com.emertozd.compose.catalog.samples.CheckboxSample
import com.emertozd.compose.catalog.samples.CheckboxWithTextSample
import com.emertozd.compose.catalog.samples.ChipGroupReflowSample
import com.emertozd.compose.catalog.samples.ChipGroupSingleLineSample
import com.emertozd.compose.catalog.samples.CircularProgressIndicatorSample
import com.emertozd.compose.catalog.samples.CircularWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.ClickableCardSample
import com.emertozd.compose.catalog.samples.ClickableElevatedCardSample
import com.emertozd.compose.catalog.samples.ClickableListItemSample
import com.emertozd.compose.catalog.samples.ClickableListItemWithClickableChildSample
import com.emertozd.compose.catalog.samples.ClickableOutlinedCardSample
import com.emertozd.compose.catalog.samples.ContainedLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.CustomTwoRowsTopAppBar
import com.emertozd.compose.catalog.samples.DateInputSample
import com.emertozd.compose.catalog.samples.DatePickerDialogSample
import com.emertozd.compose.catalog.samples.DatePickerSample
import com.emertozd.compose.catalog.samples.DatePickerWithDateSelectableDatesSample
import com.emertozd.compose.catalog.samples.DateRangePickerSample
import com.emertozd.compose.catalog.samples.DenseTextFieldContentPadding
import com.emertozd.compose.catalog.samples.DeterminateContainedLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.DeterminateLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.DismissibleModalWideNavigationRailSample
import com.emertozd.compose.catalog.samples.DismissibleNavigationDrawerSample
import com.emertozd.compose.catalog.samples.DockedSearchBarScaffoldSample
import com.emertozd.compose.catalog.samples.EditableExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.ElevatedAssistChipSample
import com.emertozd.compose.catalog.samples.ElevatedButtonSample
import com.emertozd.compose.catalog.samples.ElevatedButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.ElevatedCardSample
import com.emertozd.compose.catalog.samples.ElevatedFilterChipSample
import com.emertozd.compose.catalog.samples.ElevatedSplitButtonSample
import com.emertozd.compose.catalog.samples.ElevatedSuggestionChipSample
import com.emertozd.compose.catalog.samples.ElevatedToggleButtonSample
import com.emertozd.compose.catalog.samples.EnterAlwaysTopAppBar
import com.emertozd.compose.catalog.samples.EnterAlwaysTopAppBarWithReverseScrolling
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBar
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarFixed
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarFixedVibrant
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarSpacedAround
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarSpacedBetween
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarSpacedEvenly
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedCenterAlignedLargeFlexibleTopAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedCenterAlignedMediumFlexibleTopAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedLargeTopAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedMediumTopAppBar
import com.emertozd.compose.catalog.samples.ExpandableHorizontalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ExpandableVerticalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.ExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.ExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.ExtraLargeFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.ExtraSmallNarrowSquareIconButtonsSample
import com.emertozd.compose.catalog.samples.FadingHorizontalMultiBrowseCarouselSample
import com.emertozd.compose.catalog.samples.FancyIndicatorContainerTabs
import com.emertozd.compose.catalog.samples.FancyIndicatorTabs
import com.emertozd.compose.catalog.samples.FancyTabs
import com.emertozd.compose.catalog.samples.FilledIconButtonSample
import com.emertozd.compose.catalog.samples.FilledIconToggleButtonSample
import com.emertozd.compose.catalog.samples.FilledSplitButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.FilledTonalIconButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalIconToggleButtonSample
import com.emertozd.compose.catalog.samples.FilterChipSample
import com.emertozd.compose.catalog.samples.FilterChipWithCustomSpacingSample
import com.emertozd.compose.catalog.samples.FilterChipWithLeadingIconSample
import com.emertozd.compose.catalog.samples.FilterChipWithTrailingIconSample
import com.emertozd.compose.catalog.samples.FloatingActionButtonMenuSample
import com.emertozd.compose.catalog.samples.FloatingActionButtonSample
import com.emertozd.compose.catalog.samples.FullScreenSearchBarScaffoldSample
import com.emertozd.compose.catalog.samples.GroupedMenuSample
import com.emertozd.compose.catalog.samples.HorizontalCenteredHeroCarouselSample
import com.emertozd.compose.catalog.samples.HorizontalFloatingToolbarAsScaffoldFabSample
import com.emertozd.compose.catalog.samples.HorizontalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.HorizontalMultiBrowseCarouselSample
import com.emertozd.compose.catalog.samples.HorizontalUncontainedCarouselSample
import com.emertozd.compose.catalog.samples.IconButtonSample
import com.emertozd.compose.catalog.samples.IconToggleButtonSample
import com.emertozd.compose.catalog.samples.IndeterminateCircularProgressIndicatorSample
import com.emertozd.compose.catalog.samples.IndeterminateCircularWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.IndeterminateLinearProgressIndicatorSample
import com.emertozd.compose.catalog.samples.IndeterminateLinearWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.InputChipSample
import com.emertozd.compose.catalog.samples.InputChipWithAvatarSample
import com.emertozd.compose.catalog.samples.LargeAnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.LargeButtonWithIconSample
import com.emertozd.compose.catalog.samples.LargeExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.LargeExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.LargeFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.LargeFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.LargeRoundUniformOutlinedIconButtonSample
import com.emertozd.compose.catalog.samples.LargeToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.LeadingIconTabs
import com.emertozd.compose.catalog.samples.LinearProgressIndicatorSample
import com.emertozd.compose.catalog.samples.LinearWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.ListDetailPaneScaffoldSample
import com.emertozd.compose.catalog.samples.ListDetailPaneScaffoldSampleWithExtraPane
import com.emertozd.compose.catalog.samples.ListDetailPaneScaffoldSampleWithExtraPaneLevitatedAsDialog
import com.emertozd.compose.catalog.samples.ListDetailWithNavigation2Sample
import com.emertozd.compose.catalog.samples.ListDetailWithNavigation3Sample
import com.emertozd.compose.catalog.samples.ListItemWithModeChangeOnLongClickSample
import com.emertozd.compose.catalog.samples.LoadingIndicatorPullToRefreshSample
import com.emertozd.compose.catalog.samples.LoadingIndicatorSample
import com.emertozd.compose.catalog.samples.MediumAnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.MediumButtonWithIconSample
import com.emertozd.compose.catalog.samples.MediumExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.MediumExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.MediumFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.MediumFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.MediumRoundWideIconButtonSample
import com.emertozd.compose.catalog.samples.MediumToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.MenuSample
import com.emertozd.compose.catalog.samples.MenuWithScrollStateSample
import com.emertozd.compose.catalog.samples.ModalBottomSheetSample
import com.emertozd.compose.catalog.samples.ModalNavigationDrawerSample
import com.emertozd.compose.catalog.samples.ModalWideNavigationRailSample
import com.emertozd.compose.catalog.samples.MultiAspectCarouselLazyRowSample
import com.emertozd.compose.catalog.samples.MultiAutocompleteExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.MultiSelectConnectedButtonGroupWithFlowLayoutSample
import com.emertozd.compose.catalog.samples.MultiSelectionListItemSample
import com.emertozd.compose.catalog.samples.MultiSelectionSegmentedListItemSample
import com.emertozd.compose.catalog.samples.NavigationBarItemWithBadge
import com.emertozd.compose.catalog.samples.NavigationBarSample
import com.emertozd.compose.catalog.samples.NavigationRailBottomAlignSample
import com.emertozd.compose.catalog.samples.NavigationRailSample
import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldCustomConfigSample
import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldSample
import com.emertozd.compose.catalog.samples.OneLineListItem
import com.emertozd.compose.catalog.samples.OutlinedButtonSample
import com.emertozd.compose.catalog.samples.OutlinedButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.OutlinedCardSample
import com.emertozd.compose.catalog.samples.OutlinedIconButtonSample
import com.emertozd.compose.catalog.samples.OutlinedIconToggleButtonSample
import com.emertozd.compose.catalog.samples.OutlinedSplitButtonSample
import com.emertozd.compose.catalog.samples.OutlinedTextFieldWithInitialValueAndSelection
import com.emertozd.compose.catalog.samples.OutlinedToggleButtonSample
import com.emertozd.compose.catalog.samples.OverflowingHorizontalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.OverflowingVerticalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.PasswordTextField
import com.emertozd.compose.catalog.samples.PermanentNavigationDrawerSample
import com.emertozd.compose.catalog.samples.PinnedTopAppBar
import com.emertozd.compose.catalog.samples.PinnedTopAppBarWithPreScrolledLazyColumn
import com.emertozd.compose.catalog.samples.PinnedTopAppBarWithReversedLazyGrid
import com.emertozd.compose.catalog.samples.PlainTooltipSample
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaret
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaretBelowAnchor
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaretEndOfAnchor
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaretLeftOfAnchor
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaretRightOfAnchor
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaretStartOfAnchor
import com.emertozd.compose.catalog.samples.PlainTooltipWithCustomCaret
import com.emertozd.compose.catalog.samples.PlainTooltipWithManualInvocationSample
import com.emertozd.compose.catalog.samples.PrimaryIconTabs
import com.emertozd.compose.catalog.samples.PrimaryTextTabs
import com.emertozd.compose.catalog.samples.PullToRefreshCustomIndicatorWithDefaultTransform
import com.emertozd.compose.catalog.samples.PullToRefreshSample
import com.emertozd.compose.catalog.samples.PullToRefreshSampleCustomState
import com.emertozd.compose.catalog.samples.PullToRefreshScalingSample
import com.emertozd.compose.catalog.samples.PullToRefreshViewModelSample
import com.emertozd.compose.catalog.samples.PullToRefreshWithLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.RadioButtonSample
import com.emertozd.compose.catalog.samples.RadioGroupSample
import com.emertozd.compose.catalog.samples.RangeSliderSample
import com.emertozd.compose.catalog.samples.RangeSliderWithCustomComponents
import com.emertozd.compose.catalog.samples.RichTooltipSample
import com.emertozd.compose.catalog.samples.RichTooltipWithCaretSample
import com.emertozd.compose.catalog.samples.RichTooltipWithCustomCaretSample
import com.emertozd.compose.catalog.samples.RichTooltipWithManualInvocationSample
import com.emertozd.compose.catalog.samples.ScaffoldWithCoroutinesSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithCustomSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithIndefiniteSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithMultilineSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithSimpleSnackbar
import com.emertozd.compose.catalog.samples.ScrollableHorizontalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ScrollableVerticalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ScrollingFancyIndicatorContainerTabs
import com.emertozd.compose.catalog.samples.ScrollingPrimaryTextTabs
import com.emertozd.compose.catalog.samples.ScrollingSecondaryTextTabs
import com.emertozd.compose.catalog.samples.SecondaryIconTabs
import com.emertozd.compose.catalog.samples.SecondaryTextTabs
import com.emertozd.compose.catalog.samples.SegmentedButtonMultiSelectSample
import com.emertozd.compose.catalog.samples.SegmentedButtonSingleSelectSample
import com.emertozd.compose.catalog.samples.SegmentedListItemWithExpansionSample
import com.emertozd.compose.catalog.samples.ShortNavigationBarSample
import com.emertozd.compose.catalog.samples.ShortNavigationBarWithHorizontalItemsSample
import com.emertozd.compose.catalog.samples.SimpleBottomAppBar
import com.emertozd.compose.catalog.samples.SimpleBottomSheetScaffoldSample
import com.emertozd.compose.catalog.samples.SimpleCenterAlignedTopAppBar
import com.emertozd.compose.catalog.samples.SimpleCenterAlignedTopAppBarWithSubtitle
import com.emertozd.compose.catalog.samples.SimpleOutlinedTextFieldSample
import com.emertozd.compose.catalog.samples.SimpleSearchBarSample
import com.emertozd.compose.catalog.samples.SimpleTextFieldSample
import com.emertozd.compose.catalog.samples.SimpleTopAppBar
import com.emertozd.compose.catalog.samples.SimpleTopAppBarWithAdaptiveActions
import com.emertozd.compose.catalog.samples.SimpleTopAppBarWithSubtitle
import com.emertozd.compose.catalog.samples.SingleSelectConnectedButtonGroupWithFlowLayoutSample
import com.emertozd.compose.catalog.samples.SingleSelectionListItemSample
import com.emertozd.compose.catalog.samples.SingleSelectionSegmentedListItemSample
import com.emertozd.compose.catalog.samples.SliderSample
import com.emertozd.compose.catalog.samples.SliderWithCustomThumbSample
import com.emertozd.compose.catalog.samples.SliderWithCustomTrackAndThumbSample
import com.emertozd.compose.catalog.samples.SliderWithTrackIconsSample
import com.emertozd.compose.catalog.samples.SmallAnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.SmallButtonSample
import com.emertozd.compose.catalog.samples.SmallExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.SmallExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.SmallFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.SplitButtonWithDropdownMenuSample
import com.emertozd.compose.catalog.samples.SplitButtonWithIconSample
import com.emertozd.compose.catalog.samples.SplitButtonWithTextSample
import com.emertozd.compose.catalog.samples.SplitButtonWithUnCheckableTrailingButtonSample
import com.emertozd.compose.catalog.samples.SquareButtonSample
import com.emertozd.compose.catalog.samples.SquareToggleButtonSample
import com.emertozd.compose.catalog.samples.StepRangeSliderSample
import com.emertozd.compose.catalog.samples.StepsSliderSample
import com.emertozd.compose.catalog.samples.SuggestionChipSample
import com.emertozd.compose.catalog.samples.SupportingPaneScaffoldSample
import com.emertozd.compose.catalog.samples.SupportingPaneScaffoldSampleWithExtraPaneLevitatedAsBottomSheet
import com.emertozd.compose.catalog.samples.SwipeToDismissListItems
import com.emertozd.compose.catalog.samples.SwitchSample
import com.emertozd.compose.catalog.samples.SwitchWithThumbIconSample
import com.emertozd.compose.catalog.samples.TextAndIconTabs
import com.emertozd.compose.catalog.samples.TextArea
import com.emertozd.compose.catalog.samples.TextButtonSample
import com.emertozd.compose.catalog.samples.TextButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.TextFieldWithErrorState
import com.emertozd.compose.catalog.samples.TextFieldWithHideKeyboardOnImeAction
import com.emertozd.compose.catalog.samples.TextFieldWithIcons
import com.emertozd.compose.catalog.samples.TextFieldWithInitialValueAndSelection
import com.emertozd.compose.catalog.samples.TextFieldWithPlaceholder
import com.emertozd.compose.catalog.samples.TextFieldWithPrefixAndSuffix
import com.emertozd.compose.catalog.samples.TextFieldWithSupportingText
import com.emertozd.compose.catalog.samples.TextFieldWithTransformations
import com.emertozd.compose.catalog.samples.ThreeLineListItemWithExtendedSupporting
import com.emertozd.compose.catalog.samples.ThreeLineListItemWithOverlineAndSupporting
import com.emertozd.compose.catalog.samples.TimeInputSample
import com.emertozd.compose.catalog.samples.TimePickerSample
import com.emertozd.compose.catalog.samples.TimePickerSwitchableSample
import com.emertozd.compose.catalog.samples.TintedIconButtonSample
import com.emertozd.compose.catalog.samples.ToggleButtonSample
import com.emertozd.compose.catalog.samples.ToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.TonalSplitButtonSample
import com.emertozd.compose.catalog.samples.TonalToggleButtonSample
import com.emertozd.compose.catalog.samples.TriStateCheckboxRoundedStrokesSample
import com.emertozd.compose.catalog.samples.TriStateCheckboxSample
import com.emertozd.compose.catalog.samples.TwoLineListItem
import com.emertozd.compose.catalog.samples.VerticalButtonGroupSample
import com.emertozd.compose.catalog.samples.VerticalCenteredSliderSample
import com.emertozd.compose.catalog.samples.VerticalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.VerticalSliderSample
import com.emertozd.compose.catalog.samples.WideNavigationRailArrangementsSample
import com.emertozd.compose.catalog.samples.WideNavigationRailCollapsedSample
import com.emertozd.compose.catalog.samples.WideNavigationRailExpandedSample
import com.emertozd.compose.catalog.samples.WideNavigationRailResponsiveSample
import com.emertozd.compose.catalog.samples.XLargeButtonWithIconSample
import com.emertozd.compose.catalog.samples.XLargeToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.XSmallButtonWithIconSample
import com.emertozd.compose.catalog.samples.XSmallFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.XSmallToggleButtonWithIconSample

data class Example(
    val name: String,
    @param:StringRes val description: Int,
    val sourceUrl: String,
    val isExpressive: Boolean,
    val content: @Composable () -> Unit,
)

private const val AdaptiveExampleSourceUrl = "$AdaptiveSampleSourceUrl/ThreePaneScaffoldSamples.kt"
val AdaptiveExamples =
    listOf(
        Example(
            name = "ListDetailPaneScaffoldSample",
            description = R.string.example_list_detail_pane_scaffold_sample_description,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            ListDetailPaneScaffoldSample()
        },
        Example(
            name = "ListDetailPaneScaffoldSampleWithExtraPane",
            description = R.string.example_list_detail_pane_scaffold_sample_with_extra_pane_description,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            ListDetailPaneScaffoldSampleWithExtraPane()
        },
        Example(
            name = "ListDetailPaneScaffoldSampleWithExtraPaneLevitatedAsDialog",
            description = R.string.example_list_detail_pane_scaffold_sample_with_extra_pane_levitated_as_dialog_description,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            ListDetailPaneScaffoldSampleWithExtraPaneLevitatedAsDialog()
        },
        Example(
            name = "SupportingPaneScaffoldSample",
            description = R.string.example_supporting_pane_scaffold_sample_description,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            SupportingPaneScaffoldSample()
        },
        Example(
            name = "SupportingPaneScaffoldSampleWithExtraPaneLevitatedAsBottomSheet",
            description = R.string.example_supporting_pane_scaffold_sample_with_extra_pane_levitated_as_bottom_sheet_description,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            SupportingPaneScaffoldSampleWithExtraPaneLevitatedAsBottomSheet()
        },
        Example(
            name = "ListDetailWithNavigation2Sample",
            description = R.string.example_list_detail_with_navigation2_sample_description,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            ListDetailWithNavigation2Sample()
        },
        Example(
            name = "ListDetailWithNavigation3Sample",
            description = R.string.example_list_detail_with_navigation3_sample_description,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            ListDetailWithNavigation3Sample()
        },
    )

private const val BadgeExampleSourceUrl = "$SampleSourceUrl/BadgeSamples.kt"
val BadgeExamples =
    listOf(
        Example(
            name = "NavigationBarItemWithBadge",
            description = R.string.example_navigation_bar_item_with_badge_description,
            sourceUrl = BadgeExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationBarItemWithBadge()
        }
    )

private const val BottomSheetExampleSourceUrl = "$SampleSourceUrl/BottomSheetSamples.kt"
val BottomSheetExamples =
    listOf(
        Example(
            name = "ModalBottomSheetSample",
            description = R.string.example_modal_bottom_sheet_sample_description,
            sourceUrl = BottomSheetExampleSourceUrl,
            isExpressive = false,
        ) {
            ModalBottomSheetSample()
        },
        Example(
            name = "SimpleBottomSheetScaffoldSample",
            description = R.string.example_simple_bottom_sheet_scaffold_sample_description,
            sourceUrl = BottomSheetExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleBottomSheetScaffoldSample()
        },
        Example(
            name = "BottomSheetScaffoldNestedScrollSample",
            description = R.string.example_bottom_sheet_scaffold_nested_scroll_sample_description,
            sourceUrl = BottomSheetExampleSourceUrl,
            isExpressive = false,
        ) {
            BottomSheetScaffoldNestedScrollSample()
        },
    )

private const val ButtonsExampleSourceUrl = "$SampleSourceUrl/ButtonSamples.kt"
val ButtonsExamples =
    listOf(
        Example(
            name = "ButtonSample",
            description = R.string.example_button_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            ButtonSample()
        },
        Example(
            name = "ButtonWithAnimatedShapeSample",
            description = R.string.example_button_with_animated_shape_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ButtonWithAnimatedShapeSample()
        },
        Example(
            name = "SquareButtonSample",
            description = R.string.example_square_button_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            SquareButtonSample()
        },
        Example(
            name = "SmallButtonSample",
            description = R.string.example_small_button_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallButtonSample()
        },
        Example(
            name = "ElevatedButtonSample",
            description = R.string.example_elevated_button_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedButtonSample()
        },
        Example(
            name = "ElevatedButtonWithAnimatedShapeSample",
            description = R.string.example_elevated_button_with_animated_shape_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ElevatedButtonWithAnimatedShapeSample()
        },
        Example(
            name = "FilledTonalButtonSample",
            description = R.string.example_filled_tonal_button_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledTonalButtonSample()
        },
        Example(
            name = "FilledTonalButtonWithAnimatedShapeSample",
            description = R.string.example_filled_tonal_button_with_animated_shape_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            FilledTonalButtonWithAnimatedShapeSample()
        },
        Example(
            name = "OutlinedButtonSample",
            description = R.string.example_outlined_button_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedButtonSample()
        },
        Example(
            name = "OutlinedButtonWithAnimatedShapeSample",
            description = R.string.example_outlined_button_with_animated_shape_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            OutlinedButtonWithAnimatedShapeSample()
        },
        Example(
            name = "TextButtonSample",
            description = R.string.example_text_button_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            TextButtonSample()
        },
        Example(
            name = "TextButtonWithAnimatedShapeSample",
            description = R.string.example_text_button_with_animated_shape_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            TextButtonWithAnimatedShapeSample()
        },
        Example(
            name = "ButtonWithIconSample",
            description = R.string.example_button_with_icon_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            ButtonWithIconSample()
        },
        Example(
            name = "XSmallButtonWithIconSample",
            description = R.string.example_x_small_button_with_icon_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XSmallButtonWithIconSample()
        },
        Example(
            name = "MediumButtonWithIconSample",
            description = R.string.example_medium_button_with_icon_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumButtonWithIconSample()
        },
        Example(
            name = "LargeButtonWithIconSample",
            description = R.string.example_large_button_with_icon_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeButtonWithIconSample()
        },
        Example(
            name = "XLargeButtonWithIconSample",
            description = R.string.example_x_large_button_with_icon_sample_description,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XLargeButtonWithIconSample()
        },
    )

private const val ButtonGroupsExampleSourceUrl = "$SampleSourceUrl/ButtonGroupSamples.kt"
val ButtonGroupsExamples =
    listOf(
        Example(
            name = "ButtonGroupSample",
            description = R.string.example_button_group_sample_description,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            ButtonGroupSample()
        },
        Example(
            name = "SingleSelectConnectedButtonGroupWithFlowLayoutSample",
            description = R.string.example_single_select_connected_button_group_with_flow_layout_sample_description,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            SingleSelectConnectedButtonGroupWithFlowLayoutSample()
        },
        Example(
            name = "MultiSelectConnectedButtonGroupWithFlowLayoutSample",
            description = R.string.example_multi_select_connected_button_group_with_flow_layout_sample_description,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            MultiSelectConnectedButtonGroupWithFlowLayoutSample()
        },
        Example(
            name = "VerticalButtonGroupSample",
            description = R.string.example_vertical_button_group_sample_description,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            VerticalButtonGroupSample()
        },
    )

private const val CardsExampleSourceUrl = "$SampleSourceUrl/CardSamples.kt"
val CardExamples =
    listOf(
        Example(
            name = "CardSample",
            description = R.string.example_card_sample_description,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            CardSample()
        },
        Example(
            name = "ClickableCardSample",
            description = R.string.example_clickable_card_sample_description,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ClickableCardSample()
        },
        Example(
            name = "ElevatedCardSample",
            description = R.string.example_elevated_card_sample_description,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedCardSample()
        },
        Example(
            name = "ClickableElevatedCardSample",
            description = R.string.example_clickable_elevated_card_sample_description,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ClickableElevatedCardSample()
        },
        Example(
            name = "OutlinedCardSample",
            description = R.string.example_outlined_card_sample_description,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedCardSample()
        },
        Example(
            name = "ClickableOutlinedCardSample",
            description = R.string.example_clickable_outlined_card_sample_description,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ClickableOutlinedCardSample()
        },
    )

private const val CarouselExampleSourceUrl = "$SampleSourceUrl/CarouselSamples.kt"
val CarouselExamples =
    listOf(
        Example(
            name = "HorizontalMultiBrowseCarouselSample",
            description = R.string.example_horizontal_multi_browse_carousel_sample_description,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            HorizontalMultiBrowseCarouselSample()
        },
        Example(
            name = "HorizontalUncontainedCarouselSample",
            description = R.string.example_horizontal_uncontained_carousel_sample_description,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            HorizontalUncontainedCarouselSample()
        },
        Example(
            name = "HorizontalCenteredHeroCarouselSample",
            description = R.string.example_horizontal_centered_hero_carousel_sample_description,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            HorizontalCenteredHeroCarouselSample()
        },
        Example(
            name = "FadingHorizontalMultiBrowseCarouselSample",
            description = R.string.example_fading_horizontal_multi_browse_carousel_sample_description,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            FadingHorizontalMultiBrowseCarouselSample()
        },
        Example(
            name = "CarouselWithShowAllButtonSample",
            description = R.string.example_carousel_with_show_all_button_sample_description,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            CarouselWithShowAllButtonSample()
        },
        Example(
            name = "MultiAspectCarouselLazyRowSample",
            description = R.string.example_multi_aspect_carousel_lazy_row_sample_description,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            MultiAspectCarouselLazyRowSample()
        },
    )

private const val CheckboxesExampleSourceUrl = "$SampleSourceUrl/CheckboxSamples.kt"
val CheckboxesExamples =
    listOf(
        Example(
            name = "CheckboxSample",
            description = R.string.example_checkbox_sample_description,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            CheckboxSample()
        },
        Example(
            name = "CheckboxWithTextSample",
            description = R.string.example_checkbox_with_text_sample_description,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            CheckboxWithTextSample()
        },
        Example(
            name = "CheckboxRoundedStrokesSample",
            description = R.string.example_checkbox_rounded_strokes_sample_description,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            CheckboxRoundedStrokesSample()
        },
        Example(
            name = "TriStateCheckboxSample",
            description = R.string.example_tri_state_checkbox_sample_description,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            TriStateCheckboxSample()
        },
        Example(
            name = "TriStateCheckboxRoundedStrokesSample",
            description = R.string.example_tri_state_checkbox_rounded_strokes_sample_description,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            TriStateCheckboxRoundedStrokesSample()
        },
    )

private const val ChipsExampleSourceUrl = "$SampleSourceUrl/ChipSamples.kt"
val ChipsExamples =
    listOf(
        Example(
            name = "AssistChipSample",
            description = R.string.example_assist_chip_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            AssistChipSample()
        },
        Example(
            name = "ElevatedAssistChipSample",
            description = R.string.example_elevated_assist_chip_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedAssistChipSample()
        },
        Example(
            name = "FilterChipSample",
            description = R.string.example_filter_chip_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilterChipSample()
        },
        Example(
            name = "ElevatedFilterChipSample",
            description = R.string.example_elevated_filter_chip_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedFilterChipSample()
        },
        Example(
            name = "FilterChipWithLeadingIconSample",
            description = R.string.example_filter_chip_with_leading_icon_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilterChipWithLeadingIconSample()
        },
        Example(
            name = "FilterChipWithTrailingIconSample",
            description = R.string.example_filter_chip_with_trailing_icon_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilterChipWithTrailingIconSample()
        },
        Example(
            name = "FilterChipWithCustomSpacingSample",
            description = R.string.example_filter_chip_with_custom_spacing_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilterChipWithCustomSpacingSample()
        },
        Example(
            name = "InputChipSample",
            description = R.string.example_input_chip_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            InputChipSample()
        },
        Example(
            name = "InputChipWithAvatarSample",
            description = R.string.example_input_chip_with_avatar_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            InputChipWithAvatarSample()
        },
        Example(
            name = "SuggestionChipSample",
            description = R.string.example_suggestion_chip_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            SuggestionChipSample()
        },
        Example(
            name = "ElevatedSuggestionChipSample",
            description = R.string.example_elevated_suggestion_chip_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedSuggestionChipSample()
        },
        Example(
            name = "ChipGroupSingleLineSample",
            description = R.string.example_chip_group_single_line_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ChipGroupSingleLineSample()
        },
        Example(
            name = "ChipGroupReflowSample",
            description = R.string.example_chip_group_reflow_sample_description,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ChipGroupReflowSample()
        },
    )

private const val DatePickerExampleSourceUrl = "$SampleSourceUrl/DatePickerSamples.kt"
val DatePickerExamples =
    listOf(
        Example(
            name = "DatePickerSample",
            description = R.string.example_date_picker_sample_description,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DatePickerSample()
        },
        Example(
            name = "DatePickerDialogSample",
            description = R.string.example_date_picker_dialog_sample_description,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DatePickerDialogSample()
        },
        Example(
            name = "DatePickerWithDateSelectableDatesSample",
            description = R.string.example_date_picker_with_date_selectable_dates_sample_description,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DatePickerWithDateSelectableDatesSample()
        },
        Example(
            name = "DateInputSample",
            description = R.string.example_date_input_sample_description,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DateInputSample()
        },
        Example(
            name = "DateRangePickerSample",
            description = R.string.example_date_range_picker_sample_description,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DateRangePickerSample()
        },
    )

private const val DialogExampleSourceUrl = "$SampleSourceUrl/AlertDialogSamples.kt"
val DialogExamples =
    listOf(
        Example(
            name = "AlertDialogSample",
            description = R.string.example_alert_dialog_sample_description,
            sourceUrl = DialogExampleSourceUrl,
            isExpressive = false,
        ) {
            AlertDialogSample()
        },
        Example(
            name = "AlertDialogWithIconSample",
            description = R.string.example_alert_dialog_with_icon_sample_description,
            sourceUrl = DialogExampleSourceUrl,
            isExpressive = false,
        ) {
            AlertDialogWithIconSample()
        },
        Example(
            name = "BasicAlertDialogSample",
            description = R.string.example_basic_alert_dialog_sample_description,
            sourceUrl = DialogExampleSourceUrl,
            isExpressive = false,
        ) {
            BasicAlertDialogSample()
        },
    )

private const val BottomAppBarsExampleSourceUrl = "$SampleSourceUrl/AppBarSamples.kt"
val BottomAppBarsExamples =
    listOf(
        Example(
            name = "SimpleBottomAppBar",
            description = R.string.example_simple_bottom_app_bar_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleBottomAppBar()
        },
        Example(
            name = "BottomAppBarWithFAB",
            description = R.string.example_bottom_app_bar_with_fab_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = false,
        ) {
            BottomAppBarWithFAB()
        },
        Example(
            name = "BottomAppBarWithOverflow",
            description = R.string.example_bottom_app_bar_with_overflow_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            BottomAppBarWithOverflow()
        },
        Example(
            name = "ExitAlwaysBottomAppBar",
            description = R.string.example_exit_always_bottom_app_bar_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitAlwaysBottomAppBar()
        },
        Example(
            name = "ExitAlwaysBottomAppBarSpacedAround",
            description = R.string.example_exit_always_bottom_app_bar_spaced_around_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarSpacedAround()
        },
        Example(
            name = "ExitAlwaysBottomAppBarSpacedBetween",
            description = R.string.example_exit_always_bottom_app_bar_spaced_between_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarSpacedBetween()
        },
        Example(
            name = "ExitAlwaysBottomAppBarSpacedEvenly",
            description = R.string.example_exit_always_bottom_app_bar_spaced_evenly_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarSpacedEvenly()
        },
        Example(
            name = "ExitAlwaysBottomAppBarFixed",
            description = R.string.example_exit_always_bottom_app_bar_fixed_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarFixed()
        },
        Example(
            name = "ExitAlwaysBottomAppBarFixedVibrant",
            description = R.string.example_exit_always_bottom_app_bar_fixed_vibrant_description,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarFixedVibrant()
        },
    )

private const val TopAppBarExampleSourceUrl = "$SampleSourceUrl/AppBarSamples.kt"
val TopAppBarExamples =
    listOf(
        Example(
            name = "SimpleTopAppBar",
            description = R.string.example_simple_top_app_bar_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleTopAppBar()
        },
        Example(
            name = "SimpleTopAppBarWithAdaptiveActions",
            description = R.string.example_simple_top_app_bar_with_adaptive_actions_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleTopAppBarWithAdaptiveActions()
        },
        Example(
            name = "SimpleTopAppBarWithSubtitle",
            description = R.string.example_simple_top_app_bar_with_subtitle_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            SimpleTopAppBarWithSubtitle()
        },
        Example(
            name = "SimpleCenterAlignedTopAppBar",
            description = R.string.example_simple_center_aligned_top_app_bar_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleCenterAlignedTopAppBar()
        },
        Example(
            name = "SimpleCenterAlignedTopAppBarWithSubtitle",
            description = R.string.example_simple_center_aligned_top_app_bar_with_subtitle_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            SimpleCenterAlignedTopAppBarWithSubtitle()
        },
        Example(
            name = "PinnedTopAppBar",
            description = R.string.example_pinned_top_app_bar_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            PinnedTopAppBar()
        },
        Example(
            name = "PinnedTopAppBarWithPreScrolledLazyColumn",
            description = R.string.example_pinned_top_app_bar_with_pre_scrolled_lazy_column_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            PinnedTopAppBarWithPreScrolledLazyColumn()
        },
        Example(
            name = "PinnedTopAppBarWithReversedLazyGrid",
            description = R.string.example_pinned_top_app_bar_with_reversed_lazy_grid_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            PinnedTopAppBarWithReversedLazyGrid()
        },
        Example(
            name = "EnterAlwaysTopAppBar",
            description = R.string.example_enter_always_top_app_bar_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            EnterAlwaysTopAppBar()
        },
        Example(
            name = "EnterAlwaysTopAppBarWithReverseScrolling",
            description = R.string.example_enter_always_top_app_bar_with_reverse_scrolling_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            EnterAlwaysTopAppBarWithReverseScrolling()
        },
        Example(
            name = "ExitUntilCollapsedMediumTopAppBar",
            description = R.string.example_exit_until_collapsed_medium_top_app_bar_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitUntilCollapsedMediumTopAppBar()
        },
        Example(
            name = "ExitUntilCollapsedCenterAlignedMediumFlexibleTopAppBar with subtitle",
            description = R.string.example_exit_until_collapsed_center_aligned_medium_flexible_top_app_bar_with_subtitle_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitUntilCollapsedCenterAlignedMediumFlexibleTopAppBar()
        },
        Example(
            name = "ExitUntilCollapsedLargeTopAppBar",
            description = R.string.example_exit_until_collapsed_large_top_app_bar_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitUntilCollapsedLargeTopAppBar()
        },
        Example(
            name = "ExitUntilCollapsedCenterAlignedLargeFlexibleTopAppBar with subtitle",
            description = R.string.example_exit_until_collapsed_center_aligned_large_flexible_top_app_bar_with_subtitle_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitUntilCollapsedCenterAlignedLargeFlexibleTopAppBar()
        },
        Example(
            name = "CustomTwoRowsTopAppBar",
            description = R.string.example_custom_two_rows_top_app_bar_description,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            CustomTwoRowsTopAppBar()
        },
    )

private const val FloatingToolbarsExampleSourceUrl = "$SampleSourceUrl/FloatingToolbarSamples.kt"

val FloatingToolbarsExamples =
    listOf(
        Example(
            name = "ExpandableHorizontalFloatingToolbarSample",
            description = R.string.example_expandable_horizontal_floating_toolbar_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExpandableHorizontalFloatingToolbarSample()
        },
        Example(
            name = "OverflowingHorizontalFloatingToolbarSample",
            description = R.string.example_overflowing_horizontal_floating_toolbar_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            OverflowingHorizontalFloatingToolbarSample()
        },
        Example(
            name = "ScrollableHorizontalFloatingToolbarSample",
            description = R.string.example_scrollable_horizontal_floating_toolbar_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ScrollableHorizontalFloatingToolbarSample()
        },
        Example(
            name = "ExpandableVerticalFloatingToolbarSample",
            description = R.string.example_expandable_vertical_floating_toolbar_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExpandableVerticalFloatingToolbarSample()
        },
        Example(
            name = "OverflowingVerticalFloatingToolbarSample",
            description = R.string.example_overflowing_vertical_floating_toolbar_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            OverflowingVerticalFloatingToolbarSample()
        },
        Example(
            name = "ScrollableVerticalFloatingToolbarSample",
            description = R.string.example_scrollable_vertical_floating_toolbar_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ScrollableVerticalFloatingToolbarSample()
        },
        Example(
            name = "HorizontalFloatingToolbarWithFabSample",
            description = R.string.example_horizontal_floating_toolbar_with_fab_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            HorizontalFloatingToolbarWithFabSample()
        },
        Example(
            name = "CenteredHorizontalFloatingToolbarWithFabSample",
            description = R.string.example_centered_horizontal_floating_toolbar_with_fab_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            CenteredHorizontalFloatingToolbarWithFabSample()
        },
        Example(
            name = "HorizontalFloatingToolbarAsScaffoldFabSample",
            description = R.string.example_horizontal_floating_toolbar_as_scaffold_fab_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            HorizontalFloatingToolbarAsScaffoldFabSample()
        },
        Example(
            name = "VerticalFloatingToolbarWithFabSample",
            description = R.string.example_vertical_floating_toolbar_with_fab_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            VerticalFloatingToolbarWithFabSample()
        },
        Example(
            name = "CenteredVerticalFloatingToolbarWithFabSample",
            description = R.string.example_centered_vertical_floating_toolbar_with_fab_sample_description,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            CenteredVerticalFloatingToolbarWithFabSample()
        },
    )

private const val ExtendedFABExampleSourceUrl = "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val ExtendedFABExamples =
    listOf(
        Example(
            name = "ExtendedFloatingActionButtonSample",
            description = R.string.example_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = false,
        ) {
            ExtendedFloatingActionButtonSample()
        },
        Example(
            name = "SmallExtendedFloatingActionButtonSample",
            description = R.string.example_small_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallExtendedFloatingActionButtonSample()
        },
        Example(
            name = "MediumExtendedFloatingActionButtonSample",
            description = R.string.example_medium_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumExtendedFloatingActionButtonSample()
        },
        Example(
            name = "LargeExtendedFloatingActionButtonSample",
            description = R.string.example_large_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeExtendedFloatingActionButtonSample()
        },
        Example(
            name = "ExtendedFloatingActionButtonTextSample",
            description = R.string.example_extended_floating_action_button_text_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = false,
        ) {
            ExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "SmallExtendedFloatingActionButtonTextSample",
            description = R.string.example_small_extended_floating_action_button_text_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "MediumExtendedFloatingActionButtonTextSample",
            description = R.string.example_medium_extended_floating_action_button_text_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "LargeExtendedFloatingActionButtonTextSample",
            description = R.string.example_large_extended_floating_action_button_text_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "AnimatedExtendedFloatingActionButtonSample",
            description = R.string.example_animated_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = false,
        ) {
            AnimatedExtendedFloatingActionButtonSample()
        },
        Example(
            name = "SmallAnimatedExtendedFloatingActionButtonSample",
            description = R.string.example_small_animated_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallAnimatedExtendedFloatingActionButtonSample()
        },
        Example(
            name = "MediumAnimatedExtendedFloatingActionButtonSample",
            description = R.string.example_medium_animated_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumAnimatedExtendedFloatingActionButtonSample()
        },
        Example(
            name = "LargeAnimatedExtendedFloatingActionButtonSample",
            description = R.string.example_large_animated_extended_floating_action_button_sample_description,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeAnimatedExtendedFloatingActionButtonSample()
        },
    )

private const val FloatingActionButtonsExampleSourceUrl =
    "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val FloatingActionButtonsExamples =
    listOf(
        Example(
            name = "FloatingActionButtonSample",
            description = R.string.example_floating_action_button_sample_description,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            FloatingActionButtonSample()
        },
        Example(
            name = "LargeFloatingActionButtonSample",
            description = R.string.example_large_floating_action_button_sample_description,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            LargeFloatingActionButtonSample()
        },
        Example(
            name = "AnimatedFloatingActionButtonSample",
            description = R.string.example_animated_floating_action_button_sample_description,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            AnimatedFloatingActionButtonSample()
        },
        Example(
            name = "MediumFloatingActionButtonSample",
            description = R.string.example_medium_floating_action_button_sample_description,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumFloatingActionButtonSample()
        },
        Example(
            name = "SmallFloatingActionButtonSample",
            description = R.string.example_small_floating_action_button_sample_description,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            SmallFloatingActionButtonSample()
        },
    )

private const val FloatingActionButtonMenuExampleSourceUrl =
    "$SampleSourceUrl/FloatingActionButtonMenuSamples.kt"
val FloatingActionButtonMenuExamples =
    listOf(
        Example(
            name = "FloatingActionButtonMenuSample",
            description = R.string.example_floating_action_button_menu_sample_description,
            sourceUrl = FloatingActionButtonMenuExampleSourceUrl,
            isExpressive = true,
        ) {
            FloatingActionButtonMenuSample()
        }
    )

private const val ListsExampleSourceUrl = "$SampleSourceUrl/ListSamples.kt"
val ListsExamples =
    listOf(
        Example(
            name = "OneLineListItem",
            description = R.string.example_one_line_list_item_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            OneLineListItem()
        },
        Example(
            name = "TwoLineListItem",
            description = R.string.example_two_line_list_item_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            TwoLineListItem()
        },
        Example(
            name = "ThreeLineListItemWithOverlineAndSupporting",
            description = R.string.example_three_line_list_item_with_overline_and_supporting_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            ThreeLineListItemWithOverlineAndSupporting()
        },
        Example(
            name = "ThreeLineListItemWithExtendedSupporting",
            description = R.string.example_three_line_list_item_with_extended_supporting_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            ThreeLineListItemWithExtendedSupporting()
        },
        Example(
            name = "ClickableListItemSample",
            description = R.string.example_clickable_list_item_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            ClickableListItemSample()
        },
        Example(
            name = "ClickableListItemWithClickableChildSample",
            description = R.string.example_clickable_list_item_with_clickable_child_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            ClickableListItemWithClickableChildSample()
        },
        Example(
            name = "SingleSelectionListItemSample",
            description = R.string.example_single_selection_list_item_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            SingleSelectionListItemSample()
        },
        Example(
            name = "MultiSelectionListItemSample",
            description = R.string.example_multi_selection_list_item_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            MultiSelectionListItemSample()
        },
        Example(
            name = "ListItemWithModeChangeOnLongClickSample",
            description = R.string.example_list_item_with_mode_change_on_long_click_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            ListItemWithModeChangeOnLongClickSample()
        },
        Example(
            name = "SingleSelectionSegmentedListItemSample",
            description = R.string.example_single_selection_segmented_list_item_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            SingleSelectionSegmentedListItemSample()
        },
        Example(
            name = "MultiSelectionSegmentedListItemSample",
            description = R.string.example_multi_selection_segmented_list_item_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            MultiSelectionSegmentedListItemSample()
        },
        Example(
            name = "SegmentedListItemWithExpansionSample",
            description = R.string.example_segmented_list_item_with_expansion_sample_description,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = true,
        ) {
            SegmentedListItemWithExpansionSample()
        },
    )

private const val IconButtonExampleSourceUrl = "$SampleSourceUrl/IconButtonSamples.kt"
val IconButtonExamples =
    listOf(
        Example(
            name = "IconButtonSample",
            description = R.string.example_icon_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            IconButtonSample()
        },
        Example(
            name = "TintedIconButtonSample",
            description = R.string.example_tinted_icon_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            TintedIconButtonSample()
        },
        Example(
            name = "IconToggleButtonSample",
            description = R.string.example_icon_toggle_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            IconToggleButtonSample()
        },
        Example(
            name = "FilledIconButtonSample",
            description = R.string.example_filled_icon_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledIconButtonSample()
        },
        Example(
            name = "FilledIconToggleButtonSample",
            description = R.string.example_filled_icon_toggle_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledIconToggleButtonSample()
        },
        Example(
            name = "FilledTonalIconButtonSample",
            description = R.string.example_filled_tonal_icon_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledTonalIconButtonSample()
        },
        Example(
            name = "FilledTonalIconToggleButtonSample",
            description = R.string.example_filled_tonal_icon_toggle_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledTonalIconToggleButtonSample()
        },
        Example(
            name = "OutlinedIconButtonSample",
            description = R.string.example_outlined_icon_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedIconButtonSample()
        },
        Example(
            name = "OutlinedIconToggleButtonSample",
            description = R.string.example_outlined_icon_toggle_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedIconToggleButtonSample()
        },
        Example(
            name = "XSmallNarrowSquareIconButtonsSample",
            description = R.string.example_x_small_narrow_square_icon_buttons_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = true,
        ) {
            ExtraSmallNarrowSquareIconButtonsSample()
        },
        Example(
            name = "MediumRoundWideIconButtonSample",
            description = R.string.example_medium_round_wide_icon_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumRoundWideIconButtonSample()
        },
        Example(
            name = "LargeRoundUniformOutlinedIconButtonSample",
            description = R.string.example_large_round_uniform_outlined_icon_button_sample_description,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeRoundUniformOutlinedIconButtonSample()
        },
    )

private const val LoadingIndicatorsExampleSourceUrl =
    "$SampleSourceUrl/" + "LoadingIndicatorSamples.kt"
val LoadingIndicatorsExamples =
    listOf(
        Example(
            name = "LoadingIndicatorSample",
            description = R.string.example_loading_indicator_sample_description,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            LoadingIndicatorSample()
        },
        Example(
            name = "ContainedLoadingIndicatorSample",
            description = R.string.example_contained_loading_indicator_sample_description,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            ContainedLoadingIndicatorSample()
        },
        Example(
            name = "DeterminateLoadingIndicatorSample",
            description = R.string.example_determinate_loading_indicator_sample_description,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            DeterminateLoadingIndicatorSample()
        },
        Example(
            name = "DeterminateContainedLoadingIndicatorSample",
            description = R.string.example_determinate_contained_loading_indicator_sample_description,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            DeterminateContainedLoadingIndicatorSample()
        },
        Example(
            name = "LoadingIndicatorPullToRefreshSample",
            description = R.string.example_loading_indicator_pull_to_refresh_sample_description,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            LoadingIndicatorPullToRefreshSample()
        },
    )

private const val MenusExampleSourceUrl = "$SampleSourceUrl/MenuSamples.kt"
val MenusExamples =
    listOf(
        Example(
            name = "MenuSample",
            description = R.string.example_menu_sample_description,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            MenuSample()
        },
        Example(
            name = "GroupedMenuSample",
            description = R.string.example_grouped_menu_sample_description,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = true,
        ) {
            GroupedMenuSample()
        },
        Example(
            name = "MenuWithScrollStateSample",
            description = R.string.example_menu_with_scroll_state_sample_description,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            MenuWithScrollStateSample()
        },
        Example(
            name = "ExposedDropdownMenuSample",
            description = R.string.example_exposed_dropdown_menu_sample_description,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = true,
        ) {
            ExposedDropdownMenuSample()
        },
        Example(
            name = "EditableExposedDropdownMenuSample",
            description = R.string.example_editable_exposed_dropdown_menu_sample_description,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            EditableExposedDropdownMenuSample()
        },
        Example(
            name = "MultiAutocompleteExposedDropdownMenuSample",
            description = R.string.example_multi_autocomplete_exposed_dropdown_menu_sample_description,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            MultiAutocompleteExposedDropdownMenuSample()
        },
    )

private const val NavigationBarExampleSourceUrl = "$SampleSourceUrl/NavigationBarSamples.kt"
val NavigationBarExamples =
    listOf(
        Example(
            name = "ShortNavigationBarSample",
            description = R.string.example_short_navigation_bar_sample_description,
            sourceUrl = NavigationBarExampleSourceUrl,
            isExpressive = true,
        ) {
            ShortNavigationBarSample()
        },
        Example(
            name = "ShortNavigationBarWithHorizontalItemsSample",
            description = R.string.example_short_navigation_bar_with_horizontal_items_sample_description,
            sourceUrl = NavigationBarExampleSourceUrl,
            isExpressive = true,
        ) {
            ShortNavigationBarWithHorizontalItemsSample()
        },
        Example(
            name = "NavigationBarSample",
            description = R.string.example_navigation_bar_sample_description,
            sourceUrl = NavigationBarExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationBarSample()
        },
    )

private const val NavigationRailExampleSourceUrl = "$SampleSourceUrl/NavigationRailSamples.kt"
val NavigationRailExamples =
    listOf(
        Example(
            name = "WideNavigationRailResponsiveSample",
            description = R.string.example_wide_navigation_rail_responsive_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailResponsiveSample()
        },
        Example(
            name = "ModalWideNavigationRailSample",
            description = R.string.example_modal_wide_navigation_rail_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            ModalWideNavigationRailSample()
        },
        Example(
            name = "DismissibleModalWideNavigationRailSample",
            description = R.string.example_dismissible_modal_wide_navigation_rail_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            DismissibleModalWideNavigationRailSample()
        },
        Example(
            name = "WideNavigationRailCollapsedSample",
            description = R.string.example_wide_navigation_rail_collapsed_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailCollapsedSample()
        },
        Example(
            name = "WideNavigationRailExpandedSample",
            description = R.string.example_wide_navigation_rail_expanded_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailExpandedSample()
        },
        Example(
            name = "WideNavigationRailArrangementsSample",
            description = R.string.example_wide_navigation_rail_arrangements_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailArrangementsSample()
        },
        Example(
            name = "NavigationRailSample",
            description = R.string.example_navigation_rail_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationRailSample()
        },
        Example(
            name = "NavigationRailBottomAlignSample",
            description = R.string.example_navigation_rail_bottom_align_sample_description,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationRailBottomAlignSample()
        },
    )

private const val NavigationDrawerExampleSourceUrl = "$SampleSourceUrl/DrawerSamples.kt"
val NavigationDrawerExamples =
    listOf(
        Example(
            name = "ModalNavigationDrawerSample",
            description = R.string.example_modal_navigation_drawer_sample_description,
            sourceUrl = NavigationDrawerExampleSourceUrl,
            isExpressive = false,
        ) {
            ModalNavigationDrawerSample()
        },
        Example(
            name = "PermanentNavigationDrawerSample",
            description = R.string.example_permanent_navigation_drawer_sample_description,
            sourceUrl = NavigationDrawerExampleSourceUrl,
            isExpressive = false,
        ) {
            PermanentNavigationDrawerSample()
        },
        Example(
            name = "DismissibleNavigationDrawerSample",
            description = R.string.example_dismissible_navigation_drawer_sample_description,
            sourceUrl = NavigationDrawerExampleSourceUrl,
            isExpressive = false,
        ) {
            DismissibleNavigationDrawerSample()
        },
    )

private const val NavigationSuiteScaffoldExampleSourceUrl =
    "$AdaptiveNavigationSuiteSampleSourceUrl/NavigationSuiteScaffoldSamples.kt"
val NavigationSuiteScaffoldExamples =
    listOf(
        Example(
            name = "NavigationSuiteScaffoldSample",
            description = R.string.example_navigation_suite_scaffold_sample_description,
            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
            isExpressive = true,
        ) {
            NavigationSuiteScaffoldSample()
        },
        Example(
            name = "NavigationSuiteScaffoldCustomConfigSample",
            description = R.string.example_navigation_suite_scaffold_custom_config_sample_description,
            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
            isExpressive = true,
        ) {
            NavigationSuiteScaffoldCustomConfigSample()
        },
    )

private const val ProgressIndicatorsExampleSourceUrl =
    "$SampleSourceUrl/" + "ProgressIndicatorSamples.kt"
val ProgressIndicatorsExamples =
    listOf(
        Example(
            name = "LinearProgressIndicatorSample",
            description = R.string.example_linear_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            LinearProgressIndicatorSample()
        },
        Example(
            name = "LinearWavyProgressIndicatorSample",
            description = R.string.example_linear_wavy_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            LinearWavyProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateLinearProgressIndicatorSample",
            description = R.string.example_indeterminate_linear_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            IndeterminateLinearProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateLinearWavyProgressIndicatorSample",
            description = R.string.example_indeterminate_linear_wavy_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            IndeterminateLinearWavyProgressIndicatorSample()
        },
        Example(
            name = "CircularProgressIndicatorSample",
            description = R.string.example_circular_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            CircularProgressIndicatorSample()
        },
        Example(
            name = "CircularWavyProgressIndicatorSample",
            description = R.string.example_circular_wavy_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            CircularWavyProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateCircularProgressIndicatorSample",
            description = R.string.example_indeterminate_circular_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            IndeterminateCircularProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateCircularWavyProgressIndicatorSample",
            description = R.string.example_indeterminate_circular_wavy_progress_indicator_sample_description,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            IndeterminateCircularWavyProgressIndicatorSample()
        },
    )

private const val PullToRefreshExampleSourceUrl = "$SampleSourceUrl/PullToRefreshSamples.kt"
val PullToRefreshExamples =
    listOf(
        Example(
            name = "PullToRefreshSample",
            description = R.string.example_pull_to_refresh_sample_description,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshSample()
        },
        Example(
            name = "PullToRefreshWithLoadingIndicatorSample",
            description = R.string.example_pull_to_refresh_with_loading_indicator_sample_description,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = true,
        ) {
            PullToRefreshWithLoadingIndicatorSample()
        },
        Example(
            name = "PullToRefreshScalingSample",
            description = R.string.example_pull_to_refresh_scaling_sample_description,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshScalingSample()
        },
        Example(
            name = "PullToRefreshSampleCustomState",
            description = R.string.example_pull_to_refresh_sample_custom_state_description,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshSampleCustomState()
        },
        Example(
            name = "PullToRefreshViewModelSample",
            description = R.string.example_pull_to_refresh_view_model_sample_description,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshViewModelSample()
        },
        Example(
            name = "PullToRefreshCustomIndicatorWithDefaultTransform",
            description = R.string.example_pull_to_refresh_custom_indicator_with_default_transform_description,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshCustomIndicatorWithDefaultTransform()
        },
    )

private const val RadioButtonsExampleSourceUrl = "$SampleSourceUrl/RadioButtonSamples.kt"
val RadioButtonsExamples =
    listOf(
        Example(
            name = "RadioButtonSample",
            description = R.string.example_radio_button_sample_description,
            sourceUrl = RadioButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            RadioButtonSample()
        },
        Example(
            name = "RadioGroupSample",
            description = R.string.example_radio_group_sample_description,
            sourceUrl = RadioButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            RadioGroupSample()
        },
    )

private const val SearchBarExampleSourceUrl = "$SampleSourceUrl/SearchBarSamples.kt"
val SearchBarExamples =
    listOf(
        Example(
            name = "SimpleSearchBarSample",
            description = R.string.example_simple_search_bar_sample_description,
            sourceUrl = SearchBarExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleSearchBarSample()
        },
        Example(
            name = "FullScreenSearchBarScaffoldSample",
            description = R.string.example_full_screen_search_bar_scaffold_sample_description,
            sourceUrl = SearchBarExampleSourceUrl,
            isExpressive = true,
        ) {
            FullScreenSearchBarScaffoldSample()
        },
        Example(
            name = "DockedSearchBarScaffoldSample",
            description = R.string.example_docked_search_bar_scaffold_sample_description,
            sourceUrl = SearchBarExampleSourceUrl,
            isExpressive = true,
        ) {
            DockedSearchBarScaffoldSample()
        },
    )

private const val SegmentedButtonSourceUrl = "$SampleSourceUrl/SegmentedButtonSamples.kt"
val SegmentedButtonExamples =
    listOf(
        Example(
            name = "SegmentedButtonSingleSelectSample",
            description = R.string.example_segmented_button_single_select_sample_description,
            sourceUrl = SegmentedButtonSourceUrl,
            isExpressive = false,
        ) {
            SegmentedButtonSingleSelectSample()
        },
        Example(
            name = "SegmentedButtonMultiSelectSample",
            description = R.string.example_segmented_button_multi_select_sample_description,
            sourceUrl = SegmentedButtonSourceUrl,
            isExpressive = false,
        ) {
            SegmentedButtonMultiSelectSample()
        },
    )

private const val ToggleButtonsExampleSourceUrl = "$SampleSourceUrl/ToggleButtonSamples.kt"
val ToggleButtonsExamples =
    listOf(
        Example(
            name = "ToggleButtonSample",
            description = R.string.example_toggle_button_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ToggleButtonSample()
        },
        Example(
            name = "RoundToggleButtonSample",
            description = R.string.example_round_toggle_button_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            SquareToggleButtonSample()
        },
        Example(
            name = "ElevatedToggleButtonSample",
            description = R.string.example_elevated_toggle_button_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ElevatedToggleButtonSample()
        },
        Example(
            name = "TonalToggleButtonSample",
            description = R.string.example_tonal_toggle_button_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            TonalToggleButtonSample()
        },
        Example(
            name = "OutlinedToggleButtonSample",
            description = R.string.example_outlined_toggle_button_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            OutlinedToggleButtonSample()
        },
        Example(
            name = "ToggleButtonWithIconSample",
            description = R.string.example_toggle_button_with_icon_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ToggleButtonWithIconSample()
        },
        Example(
            name = "XSmallToggleButtonWithIconSample",
            description = R.string.example_x_small_toggle_button_with_icon_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XSmallToggleButtonWithIconSample()
        },
        Example(
            name = "MediumToggleButtonWithIconSample",
            description = R.string.example_medium_toggle_button_with_icon_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumToggleButtonWithIconSample()
        },
        Example(
            name = "LargeToggleButtonWithIconSample",
            description = R.string.example_large_toggle_button_with_icon_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeToggleButtonWithIconSample()
        },
        Example(
            name = "XLargeToggleButtonWithIconSample",
            description = R.string.example_x_large_toggle_button_with_icon_sample_description,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XLargeToggleButtonWithIconSample()
        },
    )

private const val SlidersExampleSourceUrl = "$SampleSourceUrl/SliderSamples.kt"
val SlidersExamples =
    listOf(
        Example(
            name = "SliderSample",
            description = R.string.example_slider_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            SliderSample()
        },
        Example(
            name = "StepsSliderSample",
            description = R.string.example_steps_slider_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            StepsSliderSample()
        },
        Example(
            name = "SliderWithCustomThumbSample",
            description = R.string.example_slider_with_custom_thumb_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            SliderWithCustomThumbSample()
        },
        Example(
            name = "SliderWithCustomTrackAndThumbSample",
            description = R.string.example_slider_with_custom_track_and_thumb_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            SliderWithCustomTrackAndThumbSample()
        },
        Example(
            name = "SliderWithTrackIconsSample",
            description = R.string.example_slider_with_track_icons_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            SliderWithTrackIconsSample()
        },
        Example(
            name = "CenteredSliderSample",
            description = R.string.example_centered_slider_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            CenteredSliderSample()
        },
        Example(
            name = "VerticalSliderSample",
            description = R.string.example_vertical_slider_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            VerticalSliderSample()
        },
        Example(
            name = "VerticalCenteredSliderSample",
            description = R.string.example_vertical_centered_slider_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            VerticalCenteredSliderSample()
        },
        Example(
            name = "RangeSliderSample",
            description = R.string.example_range_slider_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            RangeSliderSample()
        },
        Example(
            name = "StepRangeSliderSample",
            description = R.string.example_step_range_slider_sample_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            StepRangeSliderSample()
        },
        Example(
            name = "RangeSliderWithCustomComponents",
            description = R.string.example_range_slider_with_custom_components_description,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            RangeSliderWithCustomComponents()
        },
    )

private const val SnackbarsExampleSourceUrl = "$SampleSourceUrl/ScaffoldSamples.kt"
val SnackbarsExamples =
    listOf(
        Example(
            name = "ScaffoldWithSimpleSnackbar",
            description = R.string.example_scaffold_with_simple_snackbar_description,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithSimpleSnackbar()
        },
        Example(
            name = "ScaffoldWithIndefiniteSnackbar",
            description = R.string.example_scaffold_with_indefinite_snackbar_description,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithIndefiniteSnackbar()
        },
        Example(
            name = "ScaffoldWithCustomSnackbar",
            description = R.string.example_scaffold_with_custom_snackbar_description,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithCustomSnackbar()
        },
        Example(
            name = "ScaffoldWithCoroutinesSnackbar",
            description = R.string.example_scaffold_with_coroutines_snackbar_description,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithCoroutinesSnackbar()
        },
        Example(
            name = "ScaffoldWithMultilineSnackbar",
            description = R.string.example_scaffold_with_multiline_snackbar_description,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithMultilineSnackbar()
        },
    )

private const val SplitButtonSourceUrl = "$SampleSourceUrl/SplitButtonSamples.kt"
val SplitButtonExamples =
    listOf(
        Example(
            name = "FilledSplitButtonSample",
            description = R.string.example_filled_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            FilledSplitButtonSample()
        },
        Example(
            name = "SplitButtonWithUnCheckableTrailingButtonSample",
            description = R.string.example_split_button_with_un_checkable_trailing_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithUnCheckableTrailingButtonSample()
        },
        Example(
            name = "SplitButtonWithDropdownMenuSample",
            description = R.string.example_split_button_with_dropdown_menu_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithDropdownMenuSample()
        },
        Example(
            name = "TonalSplitButtonSample",
            description = R.string.example_tonal_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            TonalSplitButtonSample()
        },
        Example(
            name = "ElevatedSplitButtonSample",
            description = R.string.example_elevated_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            ElevatedSplitButtonSample()
        },
        Example(
            name = "OutlinedSplitButtonSample",
            description = R.string.example_outlined_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            OutlinedSplitButtonSample()
        },
        Example(
            name = "SplitButtonWithTextSample",
            description = R.string.example_split_button_with_text_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithTextSample()
        },
        Example(
            name = "SplitButtonWithIconSample",
            description = R.string.example_split_button_with_icon_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithIconSample()
        },
        Example(
            name = "XSmallFilledSplitButtonSample",
            description = R.string.example_x_small_filled_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            XSmallFilledSplitButtonSample()
        },
        Example(
            name = "MediumFilledSplitButtonSample",
            description = R.string.example_medium_filled_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            MediumFilledSplitButtonSample()
        },
        Example(
            name = "LargeFilledSplitButtonSample",
            description = R.string.example_large_filled_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            LargeFilledSplitButtonSample()
        },
        Example(
            name = "ExtraLargeFilledSplitButtonSample",
            description = R.string.example_extra_large_filled_split_button_sample_description,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            ExtraLargeFilledSplitButtonSample()
        },
    )

private const val SwitchExampleSourceUrl = "$SampleSourceUrl/SwitchSamples.kt"
val SwitchExamples =
    listOf(
        Example(
            name = "SwitchSample",
            description = R.string.example_switch_sample_description,
            sourceUrl = SwitchExampleSourceUrl,
            isExpressive = false,
        ) {
            SwitchSample()
        },
        Example(
            name = "SwitchWithThumbIconSample",
            description = R.string.example_switch_with_thumb_icon_sample_description,
            sourceUrl = SwitchExampleSourceUrl,
            isExpressive = false,
        ) {
            SwitchWithThumbIconSample()
        },
    )

private const val TabsExampleSourceUrl = "$SampleSourceUrl/TabSamples.kt"
val TabsExamples =
    listOf(
        Example(
            name = "PrimaryTextTabs",
            description = R.string.example_primary_text_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            PrimaryTextTabs()
        },
        Example(
            name = "PrimaryIconTabs",
            description = R.string.example_primary_icon_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            PrimaryIconTabs()
        },
        Example(
            name = "SecondaryTextTabs",
            description = R.string.example_secondary_text_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            SecondaryTextTabs()
        },
        Example(
            name = "SecondaryIconTabs",
            description = R.string.example_secondary_icon_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            SecondaryIconTabs()
        },
        Example(
            name = "TextAndIconTabs",
            description = R.string.example_text_and_icon_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            TextAndIconTabs()
        },
        Example(
            name = "LeadingIconTabs",
            description = R.string.example_leading_icon_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            LeadingIconTabs()
        },
        Example(
            name = "ScrollingPrimaryTextTabs",
            description = R.string.example_scrolling_primary_text_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScrollingPrimaryTextTabs()
        },
        Example(
            name = "ScrollingSecondaryTextTabs",
            description = R.string.example_scrolling_secondary_text_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScrollingSecondaryTextTabs()
        },
        Example(
            name = "FancyTabs",
            description = R.string.example_fancy_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            FancyTabs()
        },
        Example(
            name = "FancyIndicatorTabs",
            description = R.string.example_fancy_indicator_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            FancyIndicatorTabs()
        },
        Example(
            name = "FancyIndicatorContainerTabs",
            description = R.string.example_fancy_indicator_container_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            FancyIndicatorContainerTabs()
        },
        Example(
            name = "ScrollingFancyIndicatorContainerTabs",
            description = R.string.example_scrolling_fancy_indicator_container_tabs_description,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScrollingFancyIndicatorContainerTabs()
        },
    )

private const val TimePickerDescription = "Time Picker examples"
private const val TimePickerSourceUrl = "$SampleSourceUrl/TimePicker.kt"
val TimePickerExamples =
    listOf(
        Example(
            name = "TimePickerSample",
            description = R.string.example_time_picker_sample_description,
            sourceUrl = TimePickerSourceUrl,
            isExpressive = false,
        ) {
            TimePickerSample()
        },
        Example(
            name = "TimeInputSample",
            description = R.string.example_time_input_sample_description,
            sourceUrl = TimePickerSourceUrl,
            isExpressive = false,
        ) {
            TimeInputSample()
        },
        Example(
            name = "TimePickerSwitchableSample",
            description = R.string.example_time_picker_switchable_sample_description,
            sourceUrl = TimePickerSourceUrl,
            isExpressive = false,
        ) {
            TimePickerSwitchableSample()
        },
    )

private const val TextFieldsExampleSourceUrl = "$SampleSourceUrl/TextFieldSamples.kt"
val TextFieldsExamples =
    listOf(
            Example(
                name = "SimpleTextFieldSample",
                description = R.string.example_simple_text_field_sample_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                SimpleTextFieldSample()
            },
            Example(
                name = "TextFieldWithInitialValueAndSelection",
                description = R.string.example_text_field_with_initial_value_and_selection_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithInitialValueAndSelection()
            },
            Example(
                name = "SimpleOutlinedTextFieldSample",
                description = R.string.example_simple_outlined_text_field_sample_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                SimpleOutlinedTextFieldSample()
            },
            Example(
                name = "OutlinedTextFieldWithInitialValueAndSelection",
                description = R.string.example_outlined_text_field_with_initial_value_and_selection_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                OutlinedTextFieldWithInitialValueAndSelection()
            },
            Example(
                name = "TextFieldWithTransformations",
                description = R.string.example_text_field_with_transformations_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithTransformations()
            },
            Example(
                name = "TextFieldWithIcons",
                description = R.string.example_text_field_with_icons_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithIcons()
            },
            Example(
                name = "TextFieldWithPlaceholder",
                description = R.string.example_text_field_with_placeholder_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithPlaceholder()
            },
            Example(
                name = "TextFieldWithPrefixAndSuffix",
                description = R.string.example_text_field_with_prefix_and_suffix_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithPrefixAndSuffix()
            },
            Example(
                name = "TextFieldWithErrorState",
                description = R.string.example_text_field_with_error_state_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithErrorState()
            },
            Example(
                name = "TextFieldWithSupportingText",
                description = R.string.example_text_field_with_supporting_text_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithSupportingText()
            },
            Example(
                name = "DenseTextFieldContentPadding",
                description = R.string.example_dense_text_field_content_padding_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                DenseTextFieldContentPadding()
            },
            Example(
                name = "PasswordTextField",
                description = R.string.example_password_text_field_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                PasswordTextField()
            },
            Example(
                name = "TextFieldWithHideKeyboardOnImeAction",
                description = R.string.example_text_field_with_hide_keyboard_on_ime_action_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithHideKeyboardOnImeAction()
            },
            Example(
                name = "TextArea",
                description = R.string.example_text_area_description,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextArea()
            },
        )
        .map {
            // By default text field samples are minimal and don't have a `width` modifier to
            // restrict the width. As a result, they grow horizontally if enough text is typed. To
            // prevent this behavior in Catalog app, the code below restricts the width of every
            // text field sample
            it.copy(content = { Box(Modifier.wrapContentWidth().width(280.dp)) { it.content() } })
        }

private const val TooltipsExampleSourceUrl = "$SampleSourceUrl/TooltipSamples.kt"
val TooltipsExamples =
    listOf(
        Example(
            name = "PlainTooltipSample",
            description = R.string.example_plain_tooltip_sample_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipSample()
        },
        Example(
            name = "PlainTooltipWithManualInvocationSample",
            description = R.string.example_plain_tooltip_with_manual_invocation_sample_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithManualInvocationSample()
        },
        Example(
            name = "PlainTooltipWithCaret",
            description = R.string.example_plain_tooltip_with_caret_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCaret()
        },
        Example(
            name = "PlainTooltipWithCaretBelowAnchor",
            description = R.string.example_plain_tooltip_with_caret_below_anchor_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCaretBelowAnchor()
        },
        Example(
            name = "PlainTooltipWithCaretLeftOfAnchor",
            description = R.string.example_plain_tooltip_with_caret_left_of_anchor_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCaretLeftOfAnchor()
        },
        Example(
            name = "PlainTooltipWithCaretRightOfAnchor",
            description = R.string.example_plain_tooltip_with_caret_right_of_anchor_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCaretRightOfAnchor()
        },
        Example(
            name = "PlainTooltipWithCaretStartOfAnchor",
            description = R.string.example_plain_tooltip_with_caret_start_of_anchor_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCaretStartOfAnchor()
        },
        Example(
            name = "PlainTooltipWithCaretEndOfAnchor",
            description = R.string.example_plain_tooltip_with_caret_end_of_anchor_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCaretEndOfAnchor()
        },
        Example(
            name = "PlainTooltipWithCustomCaret",
            description = R.string.example_plain_tooltip_with_custom_caret_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCustomCaret()
        },
        Example(
            name = "RichTooltipSample",
            description = R.string.example_rich_tooltip_sample_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipSample()
        },
        Example(
            name = "RichTooltipWithManualInvocationSample",
            description = R.string.example_rich_tooltip_with_manual_invocation_sample_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipWithManualInvocationSample()
        },
        Example(
            name = "RichTooltipWithCaretSample",
            description = R.string.example_rich_tooltip_with_caret_sample_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipWithCaretSample()
        },
        Example(
            name = "RichTooltipWithCustomCaretSample",
            description = R.string.example_rich_tooltip_with_custom_caret_sample_description,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipWithCustomCaretSample()
        },
    )

val MaterialShapesExamples =
    listOf(
        Example(
            name = "ShapesSample",
            description = R.string.example_shapes_sample_description,
            sourceUrl = "$SampleSourceUrl/MaterialShapesSamples.kt",
            isExpressive = true,
        ) {
            AllShapes()
        }
    )

val SwipeToDismissExamples =
    listOf(
        Example(
            name = "SwipeToDismiss",
            description = R.string.example_swipe_to_dismiss_description,
            sourceUrl = "$SampleSourceUrl/SwipeToDismissSamples.kt",
            isExpressive = true,
        ) {
            SwipeToDismissListItems()
        }
    )
