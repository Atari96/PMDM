package com.pmp.pmpcoctailapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pmp.pmpcoctailapp.model.DetalleCocktail
import com.pmp.pmpcoctailapp.model.ListaCocktails
import kotlinx.coroutines.launch

class CocktailDetalleViewModel : ViewModel() {

    val detalleCocktailLiveData = MutableLiveData<DetalleCocktail>()
    private val listaCocktails = ListaCocktails()

    fun get(id: Int){
        viewModelScope.launch{
            val detalleCocktail = listaCocktails.getDetalleCocktail(id)
            detalleCocktailLiveData.postValue(detalleCocktail)
        }
    }

}