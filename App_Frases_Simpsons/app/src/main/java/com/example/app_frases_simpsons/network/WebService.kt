package com.example.app_frases_simpsons.network

import com.example.app_frases_simpsons.models.Personaje
import retrofit2.Response
import retrofit2.http.GET

    interface WebService {
        @GET("quotes?count=12")
        suspend fun obtenerPersonaje(): Response<List<Personaje>>
    }
