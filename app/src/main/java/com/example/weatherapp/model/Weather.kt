package com.example.weatherapp.model
data class Weather(
    val location: String,
    val temperature: Int,
    val condition: WeatherCondition
)
enum class WeatherCondition {
    Sunny, Cloudy, Rainy, Stormy, Windy
}