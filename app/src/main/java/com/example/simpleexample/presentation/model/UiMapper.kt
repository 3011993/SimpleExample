package com.example.simpleexample.presentation.model

import com.example.simpleexample.R
import com.example.simpleexample.domain.model.Product

fun Product.toProductUi(): ProductUiModel {
    val brandName = when (this.product) {
        ProductId.SAMSUNG.firstLetter -> R.string.samsung_product
        ProductId.IPHONE.firstLetter -> R.string.iphone_product
        else -> 0
    }

    return ProductUiModel(
        productChar = this.product, brandName = brandName
    )
}
