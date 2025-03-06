package br.com.fiap.easycit.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomOutlinedTextField(
    modifier: Modifier = Modifier,
    value: String = "",
    label: String = "",
    placeholder: String = "",
    shape: Shape = RoundedCornerShape(10.dp),
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(
        unfocusedContainerColor = Color.White
    ),
    keyboardType: KeyboardType = KeyboardType.Email,
    singleLine: Boolean = true,
    onValueChange: (String) -> Unit = {},
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
                fontSize = 16.sp
            )
        },
        placeholder = {
            Text(text = placeholder)
        },
        modifier = modifier
            .fillMaxWidth()
            .height(42.dp),
        shape = shape,
        colors = colors,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        ),
        singleLine = singleLine
    )
}