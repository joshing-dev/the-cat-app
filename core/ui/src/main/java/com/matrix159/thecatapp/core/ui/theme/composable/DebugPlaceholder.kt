package com.matrix159.thecatapp.core.ui.theme.composable

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource

/**
 * A placeholder that shows a drawable resource only in debug mode.
 */
@Composable
fun debugPlaceholder(@DrawableRes debugPreview: Int) =
  if (LocalInspectionMode.current) {
    painterResource(id = debugPreview)
  } else {
    null
  }