package com.retrofit.movies

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class MainViewModel @ViewModelInject constructor(private val apiService: ApiService) : ViewModel() {
    val response = liveData{
        val map = HashMap<String, String>()
        map["api_key"] = "1d9b898a212ea52e283351e521e17871"
        val result = apiService.getMovieList(map)
        emit(result.results)
    }
}