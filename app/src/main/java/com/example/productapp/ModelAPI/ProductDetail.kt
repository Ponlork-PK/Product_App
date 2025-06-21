package com.example.productapp.ModelAPI

import java.io.Serializable

data class ProductDetail(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val price: String,
    val specs: Specs,
) : Serializable
