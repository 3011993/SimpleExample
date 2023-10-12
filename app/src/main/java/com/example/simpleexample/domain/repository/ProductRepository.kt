package com.example.simpleexample.domain.repository

import com.example.simpleexample.domain.model.Product
import kotlinx.coroutines.flow.Flow


interface ProductRepository {

    fun getProducts () : Product
}