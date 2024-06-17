package com.example.composecleanarch.screens.welcomeApp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.composecleanarch.R
import com.example.composecleanarch.screens.welcomeApp.component.OutlinedButtonComponent
import com.example.composecleanarch.screens.welcomeApp.component.TextFieldComponent
import com.example.composecleanarch.screens.welcomeApp.component.TextViewComponent
import com.example.composecleanarch.ui.theme.ComposeCleanArchTheme

@Composable
fun WelcomeScreen(viewModel: WelcomeViewModel = hiltViewModel()) {
    val textFieldValue = viewModel.textFildValue.collectAsStateWithLifecycle()
    val name = viewModel.name.collectAsStateWithLifecycle()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            WelcomeContent(
                name = name.value,
                textFieldValue = textFieldValue.value,
                onValueChange = { viewModel.setTextFildValue(it) },
                onNameSubmit = { viewModel.setName(it) }
            )
        }
    }
}

@Composable
fun WelcomeContent(
    name: String,
    textFieldValue: String,
    onValueChange: (String) -> Unit,
    onNameSubmit: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val defaultText = stringResource(id = R.string.welcome_default)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        TextViewComponent(name.ifEmpty { defaultText })
        Spacer(modifier = Modifier.height(16.dp))
        TextFieldComponent(
            textFieldValue = textFieldValue,
            onValueChange = onValueChange,
            label = "Enter your name"
        )
        OutlinedButtonComponent(onNameSubmit = onNameSubmit, textFieldValue = textFieldValue)
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    ComposeCleanArchTheme {
        WelcomeScreen()
    }
}