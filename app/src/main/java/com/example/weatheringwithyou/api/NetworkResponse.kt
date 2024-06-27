package com.example.weatheringwithyou.api


//T refers to WeatherModel
sealed class NetworkResponse<out T> {  //out T is so we can wrap it with anything
    data class Success<out T>(val data : T) : NetworkResponse<T>()
    data class Error(val message : String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
 }