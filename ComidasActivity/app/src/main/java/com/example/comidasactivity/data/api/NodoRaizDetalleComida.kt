package com.example.comidasactivity.data.api

import com.google.gson.annotations.SerializedName

data class NodoRaizDetalleComida (
    @SerializedName("meals")
    val detalleComida: List<DetalleComidaRemote>
)