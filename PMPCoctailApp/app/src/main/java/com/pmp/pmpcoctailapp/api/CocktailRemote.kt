package com.pmp.pmpcoctailapp.api

import com.google.gson.annotations.SerializedName
import com.pmp.pmpcoctailapp.model.Cocktail

class CocktailRemote (
    @SerializedName("idDrink")
    val id:Int,
    @SerializedName("strDrink")
    val nombre:String,
    @SerializedName("strDrinkThumb")
    var foto:String
) {
    public fun toCocktail(): Cocktail =Cocktail(
        id=this.id,
        nombre=this.nombre,
        foto=this.foto
    )
}