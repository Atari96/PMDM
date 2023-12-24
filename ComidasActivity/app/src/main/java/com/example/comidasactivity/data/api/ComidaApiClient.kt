package com.example.comidasactivity.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ComidaApiClient {
    @GET("filter.php")
   suspend fun getComida(@Query("c") tipo:String):Response<CategoriaRemote>
}