package com.example.weatherapp.repository

import com.example.weatherapp.model.Weather
import com.example.weatherapp.model.WeatherCondition

class WeatherRepository {
    fun getWeather(location: String): Weather {
        return Weather(location, 25, WeatherCondition.Sunny)
    }
}