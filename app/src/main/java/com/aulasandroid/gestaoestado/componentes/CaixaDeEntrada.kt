package com.aulasandroid.gestaoestado.componentes

import android.R.attr.label
import android.R.attr.text
import android.inputmethodservice.Keyboard
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeEntrada (
    label: String,
    placeholder: String,
    keyboardType: KeyboardType,
    modifier: Modifier,
    corTema: Color,
    value: String,
atualizarValor: (String) -> Unit

){
    OutlinedTextField(
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = corTema,
            unfocusedTextColor = corTema
        ),
        shape = CircleShape,
        modifier = modifier,
        value = value,
        onValueChange = {
            atualizarValor(it)
        }
    )
}



