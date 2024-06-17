package com.example.composecleanarch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.compose.rememberNavController
import com.example.composecleanarch.navegation.StateFlowNavigationHost
import com.example.composecleanarch.ui.theme.ComposeCleanArchTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val lifecycleOwner = LocalContext.current as LifecycleOwner
            ComposeCleanArchTheme {
                CompositionLocalProvider(LocalLifecycleOwner provides lifecycleOwner) {
                    val navController = rememberNavController()
                    StateFlowNavigationHost(navController)
                }
            }
        }
    }
}