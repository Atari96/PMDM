package com.pmp.pmpcoctailapp.api

import com.pmp.pmpcoctailapp.model.ListaCocktails
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CocktailApiClient {
    @GET("filter.php")
    suspend fun getCocktail(@Query("c") tipo:String): Response<CategoriaRemote>

    @GET("lookup.php")
    suspend fun getReceta(@Query("i") id:Int): Response<NodoRaizDetalleCocktail>

    @GET("search.php")
    suspend fun getCocktailByName(@Query(value = "s") cocktailName: String): ListaCocktails?
}
