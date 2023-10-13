package com.example.simpleexample.data.remote.dto

import com.example.simpleexample.domain.model.Product

data class ProductResponse(
    val productModel: String? = ""
)


fun ProductResponse.toDomainModel(): Product {
    return Product(
        product = this.productModel?: ""
    )
}