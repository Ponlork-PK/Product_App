package com.example.productapp.ModelAPI

import java.io.Serializable

data class Specs(
    val os: String,
    val cpu: String,
    val memory: String,
    val screenSize: String,
) : Serializable