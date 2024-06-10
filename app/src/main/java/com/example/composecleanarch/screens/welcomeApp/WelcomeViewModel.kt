package com.example.composecleanarch.screens.welcomeApp

import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

val localWelcomeState = compositionLocalOf { WelcomeViewModel() }
@HiltViewModel
class WelcomeViewModel @Inject constructor() : ViewModel() {
    private val _textFildValue: MutableStateFlow<String> = MutableStateFlow("")
    private val _name: MutableStateFlow<String> = MutableStateFlow("")

    val textFildValue: StateFlow<String> get() = _textFildValue
    val name: StateFlow<String> get() = _name

    fun setTextFildValue(text: String) {
        _textFildValue.value = text
    }

    fun setName(name: String) {
        _name.value ="welcome $name"
    }
}

