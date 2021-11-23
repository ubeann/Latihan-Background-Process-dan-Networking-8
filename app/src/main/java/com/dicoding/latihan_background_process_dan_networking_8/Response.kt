package com.dicoding.latihan_background_process_dan_networking_8

import com.squareup.moshi.Json

data class Response(
    val id: Int,
    val name: String,
    @Json(name = "weather")
    val weatherList: List<Weather>,
    val main: Main,
)