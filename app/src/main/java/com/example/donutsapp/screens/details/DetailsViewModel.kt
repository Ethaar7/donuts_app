package com.example.donutsapp.screens.details

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


@HiltViewModel
class DetailsViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(DetailsState())
    val state = _state.asStateFlow()

    fun onIncreaseCounter(state: DetailsState) {
        _state.update { it.copy(quantity = state.quantity + 1) }
        _state.update { it.copy(price = state.price, totalPrice = state.totalPrice + state.price) }
    }

    fun onDecreaseCounter(state: DetailsState) {
        _state.update { if (state.quantity > 1) it.copy(quantity = state.quantity - 1) else it }
        _state.update {
            if (state.totalPrice > 16) it.copy(
                price = state.price,
                totalPrice = state.totalPrice - state.price
            ) else it
        }
    }

    fun onClickFavorite(state: DetailsState) {
        _state.value = _state.value.copy(isFavorite = !state.isFavorite)
    }
}

