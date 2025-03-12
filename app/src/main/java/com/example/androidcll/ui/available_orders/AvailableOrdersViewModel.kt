package com.example.androidcll.ui.available_orders

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AvailableOrdersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Livraisons disponibles"
    }
    val text: LiveData<String> = _text
}