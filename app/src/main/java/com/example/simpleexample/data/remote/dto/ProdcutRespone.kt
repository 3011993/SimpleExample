package com.example.simpleexample.data.remote.dto

import com.example.simpleexample.domain.model.Product

data class ProductResponse(
    val productModel: String? = ""
)


fun ProductResponse.asDomainModel(): Product {
    return Product(
        product = this.productModel?: ""
    )
}