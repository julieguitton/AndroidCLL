package com.example.androidcll.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AcceptedOrdersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Vos livraisons"
    }
    val text: LiveData<String> = _text
}