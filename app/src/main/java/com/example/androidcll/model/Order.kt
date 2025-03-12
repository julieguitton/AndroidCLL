package com.example.androidcll.model

data class Order(
    val id: String,
    val clientName: String,
    val deliveryAddress: String,
    val status: String // "En cours", "Livrée", etc.
)