package com.retrofit.movies

import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {
    @GET("movie/now_playing")
    suspend fun getMovieList(@QueryMap map: Map<String, String>): Results
}
