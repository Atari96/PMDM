package com.pmp.pmpcoctailapp.api


class CocktailService {

    private val retrofit = RetrofitBuilder.build()

    suspend fun get(tipo : String) : CategoriaRemote? {
        val response = retrofit.create(CocktailApiClient::class.java).getCocktail(tipo)
        return response.body()
    }

    suspend fun getDetalle(id:Int): NodoRaizDetalleCocktail? {
        val response = retrofit.create(CocktailApiClient::class.java).getReceta(id)
        if (response.isSuccessful) {
            val receta = response.body()
            if (receta != null) {
                return receta
            }
        }
        return response.body()
    }
}