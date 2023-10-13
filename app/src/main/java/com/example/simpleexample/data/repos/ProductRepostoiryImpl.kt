package com.example.simpleexample.data.repos

import com.example.simpleexample.data.remote.ApiService
import com.example.simpleexample.data.remote.dto.toDomainModel
import com.example.simpleexample.domain.repository.ProductRepository
import com.example.simpleexample.domain.model.Product

class ProductRepositoryImpl(private val apiService: ApiService) : ProductRepository {



    override fun getProducts(): Product {
        val product = apiService.getResponse().body()
        return product!!.toDomainModel()
    }


}

