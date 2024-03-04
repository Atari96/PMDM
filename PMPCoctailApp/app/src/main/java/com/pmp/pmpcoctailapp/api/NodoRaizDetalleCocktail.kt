package com.pmp.pmpcoctailapp.api

import com.google.gson.annotations.SerializedName
import com.pmp.pmpcoctailapp.model.DetalleCocktail

class NodoRaizDetalleCocktail (
    @SerializedName("drinks")
    val detalleCocktail: List<DetalleCocktailRemote>
)