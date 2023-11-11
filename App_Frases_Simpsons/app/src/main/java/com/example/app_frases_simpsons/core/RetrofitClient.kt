package com.example.app_frases_simpsons.core

import com.example.app_frases_simpsons.network.WebService
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val webServices: WebService by lazy{
        Retrofit
            .Builder()
            .baseUrl(constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create()

    }
}