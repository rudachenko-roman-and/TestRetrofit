package com.rudachenkoroman.testretrofit

data class User(
    val id: String,
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val image: String,
    val token: String,
    val refreshToken: String
)
