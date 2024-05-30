package com.example.compose_clean_arch.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.compose_clean_arch.data.nave.NavRoutes
import com.example.compose_clean_arch.screens.home.MainScreen
import com.example.compose_clean_arch.screens.welcomeApp.WelcomeScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.Main.route
    ) {
        composable(NavRoutes.Main.route) {
            MainScreen(navController)
        }
            composable(NavRoutes.Welcome.route) {
                WelcomeScreen()
            }
    }
}
