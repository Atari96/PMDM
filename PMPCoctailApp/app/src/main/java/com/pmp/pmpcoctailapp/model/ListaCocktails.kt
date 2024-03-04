package com.pmp.pmpcoctailapp.model

import com.pmp.pmpcoctailapp.api.CocktailService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ListaCocktails {

    private val api = CocktailService()

    suspend fun getCocktails(tipo:String):List<Cocktail> {
        return withContext(Dispatchers.IO) {
            api.get(tipo)!!?.cocktails?.map { it->it.toCocktail() } ?: emptyList()
        }
    }

    suspend fun getDetalleCocktail(id:Int):DetalleCocktail {
        val detalleCocktail = api.getDetalle(id)?.detalleCocktail?.get(0)?.toDetalleCocktail()
        return withContext(Dispatchers.IO){
            api.getDetalle(id)?.detalleCocktail?.get(0)?.toDetalleCocktail()!!
        }
    }
}