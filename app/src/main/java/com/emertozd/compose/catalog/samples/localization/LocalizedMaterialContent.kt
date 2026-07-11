package com.emertozd.compose.catalog.samples.localization

import androidx.compose.material3.Icon as MaterialIcon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text as MaterialText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.graphics.vector.ImageVector
import com.emertozd.compose.catalog.R
import java.util.Locale

fun localizedAccessibilityString(text: String): String {
    if (Locale.getDefault().language != "zh") return text
    return when (text) {
        "Expanded" -> "已展开"
        "Collapsed" -> "已收起"
        "Close menu" -> "关闭菜单"
        else -> text
    }
}

@Composable
fun localizedString(text: String): String {
    val source = stringArrayResource(R.array.sample_text_source)
    val translation = stringArrayResource(R.array.sample_text_translation)
    val index = source.indexOf(text)
    if (index >= 0 && index < translation.size) return translation[index]

    val chinese = translation.firstOrNull() == "按钮"
    if (!chinese) return text
    return when {
        text.matches(Regex("Item \\d+")) -> "项目 ${text.substringAfterLast(' ')}"
        text.matches(Regex("Child \\d+")) -> "子项目 ${text.substringAfterLast(' ')}"
        text.matches(Regex("Button \\d+")) -> "按钮 ${text.substringAfterLast(' ')}"
        text.matches(Regex("Tab \\d+.*")) ->
            text.replace("Tab", "标签页").replace("with lots of text", "（文字很多）")
        text.matches(Regex("Action on \\d+")) -> "对项目 ${text.substringAfterLast(' ')} 执行操作"
        text.matches(Regex("Chip \\d+")) -> "信息块 ${text.substringAfterLast(' ')}"
        text.matches(Regex("Image \\d+")) -> "图片 ${text.substringAfterLast(' ')}"
        text.matches(Regex("Suggestion \\d+")) -> "建议 ${text.substringAfterLast(' ')}"
        text.matches(Regex("Text \\d+")) -> "文字 ${text.substringAfterLast(' ')}"
        text.matches(Regex("List item - \\d+")) -> "列表项 - ${text.substringAfterLast(' ')}"
        text.matches(Regex("\\d+ new notifications")) ->
            "${text.substringBefore(' ')} 条新通知"
        text.matches(Regex("\\d+ Page\\nOpen modal rail")) ->
            "第 ${text.substringBefore(' ')} 页\\n打开模态导航轨道"
        text.startsWith("Clickable Surface. Count: ") ->
            text.replace("Clickable Surface. Count: ", "可点击表面。计数：")
        text.startsWith("Snackbar #") -> text.replace("Snackbar #", "Snackbar #")
        text.startsWith("Limit: ") -> text.replace("Limit: ", "限制：")
        text.startsWith("Selected date timestamp: ") ->
            text.replace("Selected date timestamp: ", "已选日期时间戳：")
        text.startsWith("Selected date: ") -> text.replace("Selected date: ", "已选日期：")
        text.startsWith("Entered date timestamp: ") ->
            text.replace("Entered date timestamp: ", "输入的日期时间戳：")
        text.startsWith("Entered time: ") -> text.replace("Entered time: ", "输入的时间：")
        text.startsWith("Visibility: ") -> text.replace("Visibility: ", "可见性：")
        text.startsWith("Saved range (timestamps): ") ->
            text.replace("Saved range (timestamps): ", "已保存范围（时间戳）：")
        text.startsWith("Saved range: ") -> text.replace("Saved range: ", "已保存范围：")
        text.startsWith("The rail is ") ->
            text.removePrefix("The rail is ").removeSuffix(".").let { "导航轨道当前为$it。" }
        text.startsWith("This is a description about ") ->
            text.replace("This is a description about ", "这是关于").replace(".", "的说明。")
        text.startsWith("This is extra content about ") ->
            text.replace("This is extra content about ", "这是关于").replace(".", "的额外内容。")
        text.startsWith("Current NavigationSuiteType: ") ->
            text.replace("Current NavigationSuiteType: ", "当前 NavigationSuiteType：")
        text.startsWith("FAB with ") && text.endsWith(" shape") ->
            text.replace("FAB with ", "使用").replace(" shape", "形状的 FAB")
        text.startsWith("FAB with text style and color from ") ->
            text.replace("FAB with text style and color from ", "FAB 使用来自 ")
                .replace(" expressive theme", " 表现力主题的文字样式和颜色")
                .replace(" theme", " 主题的文字样式和颜色")
        text.startsWith("Note:") -> "注意：此演示在推荐的屏幕尺寸和方向下效果最佳。"
        text.startsWith("PopLatest") -> "PopLatest：不进行特殊的返回处理。"
        text.startsWith("PopUntilContentChange") ->
            "PopUntilContentChange：返回导航会强制更改窗格内容。"
        text.startsWith("PopUntilCurrentDestinationChange") ->
            "PopUntilCurrentDestinationChange：返回导航会强制更改当前目的地。"
        text.startsWith("PopUntilScaffoldValueChange") ->
            "PopUntilScaffoldValueChange：返回导航会强制更改脚手架状态。"
        text.endsWith(" selected") -> localizeSelectedMessage(text)
        else -> text
    }
}

private fun localizeSelectedMessage(text: String): String {
    val tabNumber = Regex("(\\d+)").find(text)?.value ?: return text
    return "已选择标签页 $tabNumber"
}

@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: ((TextLayoutResult) -> Unit)? = null,
    style: TextStyle = LocalTextStyle.current,
) {
    MaterialText(
        text = localizedString(text),
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = style,
    )
}

@Composable
fun Text(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    inlineContent: Map<String, androidx.compose.foundation.text.InlineTextContent> = mapOf(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
) {
    val localized =
        if (text.spanStyles.isEmpty() && text.paragraphStyles.isEmpty()) {
            AnnotatedString(localizedString(text.text))
        } else {
            text
        }
    MaterialText(
        text = localized,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        inlineContent = inlineContent,
        onTextLayout = onTextLayout,
        style = style,
    )
}

@Composable
fun Icon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) {
    MaterialIcon(
        imageVector = imageVector,
        contentDescription = contentDescription?.let { localizedString(it) },
        modifier = modifier,
        tint = tint,
    )
}

@Composable
fun Icon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) {
    MaterialIcon(
        painter = painter,
        contentDescription = contentDescription?.let { localizedString(it) },
        modifier = modifier,
        tint = tint,
    )
}

@Composable
fun Icon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) {
    MaterialIcon(
        bitmap = bitmap,
        contentDescription = contentDescription?.let { localizedString(it) },
        modifier = modifier,
        tint = tint,
    )
}
