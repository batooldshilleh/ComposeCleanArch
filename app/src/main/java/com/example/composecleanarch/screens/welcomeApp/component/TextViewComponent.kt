package com.example.composecleanarch.screens.welcomeApp.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecleanarch.ui.theme.ComposeCleanArchTheme

@Composable
fun TextViewComponent(value: String){
    Text(
        text = value,
        modifier = Modifier.padding(bottom = 16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TextViewComponentPreview() {
    ComposeCleanArchTheme {
        TextViewComponent(
            value = "Default Text",
        )
    }
}