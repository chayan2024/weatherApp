package com.example.weatherapp.repository

import com.example.weatherapp.model.Weather
import com.example.weatherapp.model.WeatherCondition

// WeatherRepository.kt
class WeatherRepository {
    fun getWeather(location: String): Weather {
        // Simulate data fetching from a remote server or database
        return when (location) {
            "Sunny Location" -> Weather(location, 25, WeatherCondition.Sunny)
            "Cloudy Location" -> Weather(location, 20, WeatherCondition.Cloudy)
            "Rainy Location" -> Weather(location, 15, WeatherCondition.Rainy)
            "Stormy Location" -> Weather(location, 18, WeatherCondition.Stormy)
            "Windy Location" -> Weather(location, 22, WeatherCondition.Windy)
            else -> Weather(location, 0, WeatherCondition.Sunny) // Default to sunny for unknown locations
        }
    }
}
