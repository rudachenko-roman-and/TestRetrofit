package com.rudachenkoroman.testretrofit

data class Product(
    val id: String,
    val title: String,
    val description: String,
    val category: String,
    val price: Float,
    val discountPercentage: Float,
    val rating: Float,
    val stock: Float
)
