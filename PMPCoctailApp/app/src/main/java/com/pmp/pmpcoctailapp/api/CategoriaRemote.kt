package com.pmp.pmpcoctailapp.api

import com.google.gson.annotations.SerializedName

data class CategoriaRemote (
    @SerializedName("drinks")
    val cocktails:List<CocktailRemote>
)