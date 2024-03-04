package com.pmp.pmpcoctailapp.api

import com.google.gson.annotations.SerializedName
import com.pmp.pmpcoctailapp.model.DetalleCocktail

class DetalleCocktailRemote(
    @SerializedName("idDrink")
    val id: Int,
    @SerializedName("strCategory")
    val categoria: String,
    @SerializedName("strDrink")
    val nombre: String,
    @SerializedName("strDrinkThumb")
    var foto: String,
    @SerializedName("strInstructions")
    val receta: String,
    @SerializedName("strIngredient1")
    var ingr1: String?,
    @SerializedName("strIngredient2")
    var ingr2: String?,
    @SerializedName("strIngredient3")
    var ingr3: String?,
    @SerializedName("strIngredient4")
    var ingr4: String?,
    @SerializedName("strIngredient5")
    var ingr5: String?,
    @SerializedName("strMeasure1")
    var cantidad1: String?,
    @SerializedName("strMeasure2")
    var cantidad2: String?,
    @SerializedName("strMeasure3")
    var cantidad3: String?,
    @SerializedName("strMeasure4")
    var cantidad4: String?,
    @SerializedName("strMeasure5")
    var cantidad5: String?
) {
    fun toDetalleCocktail(): DetalleCocktail = DetalleCocktail(
        id = this.id,
        categoria = this.categoria,
        nombre = this.nombre,
        foto = this.foto,
        receta = this.receta,
        ingr1 = this.ingr1 ?: "",
        ingr2 = this.ingr2 ?: "",
        ingr3 = this.ingr3 ?: "",
        ingr4 = this.ingr4 ?: "",
        ingr5 = this.ingr5 ?: "",
        cantidad1 = this.cantidad1 ?: "",
        cantidad2 = this.cantidad2 ?: "",
        cantidad3 = this.cantidad3 ?: "",
        cantidad4 = this.cantidad4 ?: "",
        cantidad5 = this.cantidad5 ?: ""
    )
}