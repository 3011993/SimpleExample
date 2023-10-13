package com.example.simpleexample.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simpleexample.data.repos.ProductRepositoryImpl
import com.example.simpleexample.presentation.model.ProductUiModel
import com.example.simpleexample.presentation.model.toProductUi

class MainViewModel(private val repo: ProductRepositoryImpl) : ViewModel() {

    private val _product = MutableLiveData<ProductUiModel>()

    val product: LiveData<ProductUiModel>
        get() = _product


    init {
        getProduct()
    }


    private fun getProduct() {
        _product.value = repo.getProducts().toProductUi()
    }


}

