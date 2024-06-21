package com.example.composecleanarch.screens.welcomeApp.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecleanarch.R
import com.example.composecleanarch.ui.theme.ComposeCleanArchTheme

@Composable
fun OutlinedButtonComponent(onNameSubmit: (String) -> Unit, textFieldValue: String){
    OutlinedButton(
        onClick = { onNameSubmit(textFieldValue) },
        modifier = Modifier
            .width(150.dp)
            .height(50.dp)
    ) {
        Text(text = stringResource(id = R.string.post_name))
    }
}

@Preview(showBackground = true)
@Composable
fun OutlinedButtonComponentPreview() {
    ComposeCleanArchTheme {
        TextFieldComponent(
            textFieldValue = "Default Text",
            onValueChange = {},
            label = "Label Text"
        )
    }
}
