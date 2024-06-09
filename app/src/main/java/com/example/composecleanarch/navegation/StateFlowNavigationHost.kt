package com.example.composecleanarch.navegation

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composecleanarch.data.nave.NavRoutes
import com.example.composecleanarch.screens.home.HomeScreen
import com.example.composecleanarch.screens.welcomeApp.WelcomeScreen

@Composable
fun StateFlowNavigationHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.Main.route
    ) {
        composable(NavRoutes.Main.route) {
            HomeScreen(navController)
        }
        composable(NavRoutes.Welcome.route) {
            WelcomeScreen()
        }
    }
}
