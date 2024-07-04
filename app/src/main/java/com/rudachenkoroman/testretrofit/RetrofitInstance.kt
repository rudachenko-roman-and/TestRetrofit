package com.rudachenkoroman.testretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object{
        private const val BASE_URL = "https://dummyjson.com"
        private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val productApi: ProductApi = retrofit.create(ProductApi::class.java)
    }
}