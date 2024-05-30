package com.example.compose_clean_arch.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.compose_clean_arch.R
import com.example.compose_clean_arch.data.nave.NavRoutes

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            ButtonGroup(navController)
        }
    }
}

@Composable
fun ButtonGroup(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        WelcomeButton(navController)
    }
}

@Composable
fun WelcomeButton(navController: NavHostController, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = { navController.navigate(NavRoutes.Welcome.route) },
        modifier = modifier
            .width(150.dp)
            .height(50.dp)
    ) {
        Text(text = stringResource(id = R.string.welcome_btn_text))
    }
}
