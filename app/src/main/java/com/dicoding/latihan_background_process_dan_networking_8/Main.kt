package com.dicoding.latihan_background_process_dan_networking_8

import com.squareup.moshi.Json

data class Main(
    @Json(name = "temp")
    val temperature: Double
)