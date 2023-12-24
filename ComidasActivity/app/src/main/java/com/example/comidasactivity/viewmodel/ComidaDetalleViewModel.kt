package com.example.comidasactivity.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.modelo.DetalleComida
import com.example.comidasactivity.modelo.ListaComidas
import kotlinx.coroutines.launch

class ComidaDetalleViewModel:ViewModel() {
    val detalleComidaLiveData = MutableLiveData<DetalleComida>()
    private val listaComidas= ListaComidas()

    fun get(id: Int) {
        Log.i("click", "Iniciando get para ID: $id")
        viewModelScope.launch {
            Log.i("click", "Llamando al servicio getDetalle para ID: $id")
            Log.i("click","detalle "+listaComidas.getDetalleComida(id).categoria.toString())
            val detalleComida = listaComidas.getDetalleComida(id)

            Log.i("click", "Verificando la respuesta del servicio getDetalle")
            detalleComidaLiveData.postValue(detalleComida)
            Log.i("click", "Asignando datos al LiveData detalleComidaLiveData")
        }
    }
}