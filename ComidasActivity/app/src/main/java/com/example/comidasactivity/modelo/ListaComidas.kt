package com.example.comidasactivity.modelo

import com.example.comidasactivity.data.api.CategoriaRemote
import com.example.comidasactivity.data.api.ComidaService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ListaComidas {

    private val api=ComidaService()


    suspend fun getComidas(tipo:String):List<Comida> {
        /*var comidasTipo= mutableListOf<Comida>()
        for (i:Comida in  comidas) {
            if (i.tipo==tipo)
                comidasTipo.add(i)
        }*/
        return withContext(Dispatchers.IO) {

            api.get(tipo)!!?.comidas?.map { it->it.toComida() } ?: emptyList()

        }
        //return comidasTipo
    }

}