package com.example.comidasactivity.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comidasactivity.R
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.viewmodel.ComidaDetalleViewModel
import com.example.comidasactivity.viewmodel.ComidaViewModel
import kotlinx.coroutines.launch

class ComidasRemotasFragment:Fragment(R.layout.fragment_comidasremotas) {

    lateinit var adapter:ComidaRemotaAdapter
    private val comidasViewModel: ComidaViewModel by navGraphViewModels(R.id.nav_graph)
    private val detalleComidasViewModel:ComidaDetalleViewModel by navGraphViewModels(R.id.nav_graph)
    private var comidas:List<Comida> = emptyList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("click10 comRemF", "onViewCreated del comRemF")

        var categoria = arguments?.getString("categoria").toString()

        comidasViewModel.comidaLiveData.observe(viewLifecycleOwner) {
            comidas=it
            var comidasRecyclerView: RecyclerView = view.findViewById(R.id.comidasRecycleView)
            comidasRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            adapter = ComidaRemotaAdapter(it,{
                llamarDetalle(it)
                view.findNavController().navigate(R.id.detalleFragment)})
            comidasRecyclerView.adapter = adapter
        }
    }
    fun llamarDetalle(posicion: Int){
        //Log.i("click10 comRemF", "doy clic posicion "+comidas[posicion].id)
        Log.i("click10+2 comRemF", "metodo llamarDetalle()")
            detalleComidasViewModel.get(comidas[posicion].id)
            Log.i("click10+3 comRemF", "sale de llamarDetalle()")
    }
}