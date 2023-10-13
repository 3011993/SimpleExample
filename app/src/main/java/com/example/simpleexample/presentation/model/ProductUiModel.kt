package com.example.simpleexample.presentation.model

import androidx.annotation.StringRes
import com.example.simpleexample.R
import com.example.simpleexample.domain.model.Product

data class ProductUiModel(val productChar: String, @StringRes val brandName: Int)


enum class ProductId(val firstLetter: String) {
    SAMSUNG("S"), IPHONE("I")
}


