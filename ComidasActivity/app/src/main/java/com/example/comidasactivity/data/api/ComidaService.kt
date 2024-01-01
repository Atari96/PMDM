package com.example.comidasactivity.data.api

import android.util.Log
import com.example.comidasactivity.modelo.Comida

class ComidaService {
    private val retrofit=RetrofitBuilder.build()
    suspend fun get(tipo:String): CategoriaRemote? {
        Log.i("click3 cs1 ","3 metodo get(tipo) "+tipo)
        val response=retrofit.create(ComidaApiClient::class.java).getComida(tipo)
        return response.body()
    }

    suspend fun getDetalle(id:Int): NodoRaizDetalleComida? {
        Log.i("click cs2 ","metodo getdetalle(id) FUNCIONA "+id.toString())
        val response = retrofit.create(ComidaApiClient::class.java).getReceta(id)
        Log.i("click cs2 Solicitud", "Realizando la solicitud...")
        if (response.isSuccessful) {
            val receta = response.body()
            if (receta != null) {
                Log.i("Click cs recetaOK", receta.toString()) // Puedes imprimir los datos de la receta
                return receta
            } else {
                Log.e("Click cs Error", "Respuesta de receta nula")
            }
        } else {
            Log.e("click cs Error", "La solicitud no fue exitosa: ${response.code()}")
        }
        return response.body()
    }
}