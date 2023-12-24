package com.example.comidasactivity.data.api

import com.example.comidasactivity.modelo.Comida

class ComidaService {
    private val retrofit=RetrofitBuilder.build()
    suspend fun get(tipo:String): CategoriaRemote? {
        val response=retrofit.create(ComidaApiClient::class.java).getComida(tipo)
        return response.body()
    }



}