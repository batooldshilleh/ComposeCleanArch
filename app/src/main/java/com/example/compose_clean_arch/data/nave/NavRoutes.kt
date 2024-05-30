package com.example.compose_clean_arch.data.nave

sealed class NavRoutes(val route: String) {
    object Main : NavRoutes("main_screen")
    object Welcome : NavRoutes("welcome_screen")

}
