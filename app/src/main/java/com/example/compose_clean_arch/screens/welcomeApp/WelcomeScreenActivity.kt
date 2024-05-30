package com.example.compose_clean_arch.screens.welcomeApp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_clean_arch.R
import com.example.compose_clean_arch.ui.theme.Compose_Clean_ArchTheme

@Composable
fun WelcomeScreen() {
    val (text, setText) = remember { mutableStateOf("") }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            WelcomeContent(
                text = text,
                onTextChange = setText,
                onButtonClick = { /* Handle button click */ }
            )
        }
    }
}

@Composable
fun WelcomeContent(
    text: String,
    onTextChange: (String) -> Unit,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(text = stringResource(id = R.string.welcome_default))
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = text,
            onValueChange = onTextChange,
            label = { Text(text = stringResource(id = R.string.enter_name)) },
            modifier = Modifier.padding(bottom = 16.dp)
        )
        OutlinedButton(
            onClick = onButtonClick,
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
        ) {
            Text(text = stringResource(id = R.string.welcome_btn_text))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    Compose_Clean_ArchTheme {
        WelcomeScreen()
    }
}
