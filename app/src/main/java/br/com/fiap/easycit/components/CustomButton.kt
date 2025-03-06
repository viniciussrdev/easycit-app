package br.com.fiap.easycit.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: Shape = RoundedCornerShape(10.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(Color.White),
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    fontWeight: FontWeight? = null,
    color: Color = Color.Blue,
    content: @Composable () -> Unit = {}
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        colors = colors
    ) {
        Text(
            text = text,
            fontSize = fontSize,
            fontWeight = fontWeight,
            color = color
        )
        content()
    }
}