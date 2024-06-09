package com.example.composecleanarch.data.nave

sealed class NavRoutes(val route: String) {
    object Main : NavRoutes("main_screen")
    object Welcome : NavRoutes("welcome_screen")

}
