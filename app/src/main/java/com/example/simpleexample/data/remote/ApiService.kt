package com.example.simpleexample.data.remote

import com.example.simpleexample.data.remote.dto.ProductResponse
import retrofit2.Response
import retrofit2.http.GET

const val GET_QUERY = ""

interface ApiService  {

    @GET(GET_QUERY)
    fun getResponse() : Response<ProductResponse?>
}