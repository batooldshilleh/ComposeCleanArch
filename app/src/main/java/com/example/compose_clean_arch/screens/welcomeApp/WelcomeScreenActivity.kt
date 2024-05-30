package com.example.compose_clean_arch.screens.welcomeApp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.compose_clean_arch.R
import com.example.compose_clean_arch.ui.theme.Compose_Clean_ArchTheme

@Composable
fun WelcomeScreen(viewModel: WelcomeViewModel = hiltViewModel()) {
    val nameState = remember { mutableStateOf("") }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            WelcomeContent(
                name = nameState.value,
                onNameSubmit = {
                    nameState.value = it
                    viewModel.setName(it)
                }
            )
        }
    }
}

@Composable
fun WelcomeContent(
    name: String,
    onNameSubmit: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var textFieldValue by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {

        Text(
            text = name.ifBlank { stringResource(id = R.string.welcome_default) },
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = textFieldValue,
            onValueChange = { textFieldValue = it },
            label = { Text("Enter your name") },
            modifier = Modifier.padding(bottom = 16.dp)
        )
        OutlinedButton(
            onClick = { onNameSubmit(textFieldValue) },
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
        ) {
            Text(text = stringResource(id = R.string.post_name))
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
