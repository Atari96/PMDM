package com.example.comidasactivity.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.modelo.ListaComidas
import kotlinx.coroutines.launch

class ComidaViewModel:ViewModel() {
    val comidaLiveData=MutableLiveData<List<Comida>>()
    private val listaComidas= ListaComidas()

    fun get(tipo:String) {
        Log.i("click1 cvm1 ","metodo get lanza listacomidas.getcomidas") // 1 lo primero cuando pulsamos busqueda
        viewModelScope.launch {
            val comidas=listaComidas.getComidas(tipo)
            comidaLiveData.postValue(comidas)
            Log.i("click cvm2","dentro del launch del get")
        }
    }
}