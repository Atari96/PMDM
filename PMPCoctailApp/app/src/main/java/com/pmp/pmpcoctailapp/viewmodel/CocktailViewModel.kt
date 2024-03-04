package com.pmp.pmpcoctailapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pmp.pmpcoctailapp.model.Cocktail
import com.pmp.pmpcoctailapp.model.ListaCocktails
import kotlinx.coroutines.launch

class CocktailViewModel : ViewModel() {
    val cocktailLiveData= MutableLiveData<List<Cocktail>>()
    private val listaCocktails= ListaCocktails()

    fun get(tipo:String) {
        viewModelScope.launch {
            val cocktails=listaCocktails.getCocktails(tipo)
            cocktailLiveData.postValue(cocktails)
        }
    }
}