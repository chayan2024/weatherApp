package com.example.weatherapp.viewmodel

import com.example.weatherapp.repository.WeatherRepository

// WeatherViewModel.kt
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.model.Weather
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class WeatherViewModel(private val repository: WeatherRepository) : ViewModel() {
    private val _weatherList = MutableStateFlow<List<Weather>>(emptyList())
    val weatherList = _weatherList
    fun getWeather(location: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val sunnyWeather = repository.getWeather("Sunny")
            val cloudyWeather = repository.getWeather("Cloudy")
            val rainyWeather = repository.getWeather("Rainy")
            val stormyWeather = repository.getWeather("Stormy")
            val windyWeather = repository.getWeather("Windy")
            _weatherList.value = listOf(sunnyWeather, cloudyWeather, rainyWeather, stormyWeather, windyWeather)
        }
    }
}
