package com.example.productapp.Service

import com.example.productapp.ModelAPI.Product
import retrofit2.http.GET

interface APIService {

    @GET("product-list.json")
    suspend fun loadProductList(): List<Product>
}