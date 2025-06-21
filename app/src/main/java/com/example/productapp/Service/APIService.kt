package com.example.productapp.Service

import com.example.productapp.ModelAPI.Product
import com.example.productapp.ModelAPI.ProductDetail
import retrofit2.http.GET

interface APIService {

    @GET("product-list.json")
    suspend fun getProductList(): List<Product>
    suspend fun getProductDetail(): List<ProductDetail>
}