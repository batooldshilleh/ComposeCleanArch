package com.example.compose_clean_arch.screens.welcomeApp

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor() : ViewModel() {
    private val _name: MutableStateFlow<String> = MutableStateFlow("")
    val name: StateFlow<String> get() = _name

    fun setName(name: String) {
        _name.value = name
    }
}