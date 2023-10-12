package com.example.simpleexample.presentation

import androidx.annotation.StringRes
import com.example.simpleexample.R
import com.example.simpleexample.domain.model.Product

data class ProductUi(val productChar: String, @StringRes val brandName: Int)


enum class ProductId(val firstLetter: String) {
    SAMSUNG("S"), IPHONE("I")
}

fun Product.toProductUi(): ProductUi {
    val productName = when (this.product) {
        ProductId.SAMSUNG.firstLetter -> R.string.samsung_product
        ProductId.IPHONE.firstLetter -> R.string.iphone_product
        else -> 0
    }

    return ProductUi(
        productChar = this.product, brandName = productName
    )
}

