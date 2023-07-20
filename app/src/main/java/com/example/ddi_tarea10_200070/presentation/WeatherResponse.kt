package com.example.ddi_tarea10_200070.presentation

data class WeatherResponse(
    val main: Main
)

data class Main(
    val temp: Float
)