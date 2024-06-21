package com.example.composecleanarch.screens.welcomeApp.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecleanarch.ui.theme.ComposeCleanArchTheme

@Composable
fun TextFieldComponent(textFieldValue: String, onValueChange: (String) -> Unit, label: String) {
    TextField(
        value = textFieldValue,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = Modifier.padding(bottom = 16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview() {
    ComposeCleanArchTheme {
        TextFieldComponent(
            textFieldValue = "Default Text",
            onValueChange = {},
            label = "Label Text"
        )
    }
}
