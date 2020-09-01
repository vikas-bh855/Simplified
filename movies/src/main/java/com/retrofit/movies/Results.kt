package com.retrofit.movies


data class Results(
    val results: List<Movies>
)

data class Movies(
    val poster_path: String
)
