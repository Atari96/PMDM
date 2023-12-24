package com.example.comidasactivity.modelo

import android.util.Log
import com.example.comidasactivity.data.api.CategoriaRemote
import com.example.comidasactivity.data.api.ComidaService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ListaComidas {

    private val api=ComidaService()
    private val comidas:List<Comida> = listOf()

    fun getComidas():List<Comida> =comidas

    suspend fun getComidas(tipo:String):List<Comida> {
        Log.i("click lc1","2 entra en corru getcomidas()") //FUNCIONA
        return withContext(Dispatchers.IO) {
            api.get(tipo)!!?.comidas?.map { it->it.toComida() } ?: emptyList()
        }
        Log.i("click lc2","sale en getcomidas()")
    }

    suspend fun getDetalleComida(id:Int):DetalleComida {
        Log.i("click2 lc3 getdetallecomida", "metodo getDetalleComida()"+id.toString()) // Aparece el id correcto
        val detalleComida = api.getDetalle(id)?.detalleComida?.get(0)?.toDetalleComida()
        Log.d("click lc3 ListaComidas", "Detalle Comida:")
        return withContext(Dispatchers.IO){
            api.getDetalle(id)?.detalleComida?.get(0)?.toDetalleComida()!!
        }
    }
}