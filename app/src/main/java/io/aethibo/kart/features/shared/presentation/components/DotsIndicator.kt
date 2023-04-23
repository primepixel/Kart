package io.aethibo.kart.features.shared.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DotsIndicator(
   totalDots: Int,
   selectedIndex: Int,
   selectedColor: Color,
   unSelectedColor: Color,
   modifier: Modifier = Modifier,
) {
   LazyRow(
      modifier = modifier
         .wrapContentWidth()
         .wrapContentHeight()
   ) {
      items(totalDots) { position ->
         val color = if (selectedIndex == position) selectedColor else unSelectedColor

         Box(
            modifier = Modifier
               .padding(2.dp)
               .clip(CircleShape)
               .background(color)
               .size(8.dp)
         )
      }
   }
}