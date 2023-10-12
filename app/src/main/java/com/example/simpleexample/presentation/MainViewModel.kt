package com.example.simpleexample.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simpleexample.domain.model.Product
import com.example.simpleexample.data.repos.ProductRepositoryImpl
import kotlinx.coroutines.launch

class MainViewModel(private val repo: ProductRepositoryImpl) : ViewModel() {

    private val _product = MutableLiveData<ProductUi>()

    val product: LiveData<ProductUi>
        get() = _product


    init {
        getProduct()
    }


    private fun getProduct() {
        _product.value = repo.getProducts().toProductUi()
    }


}

