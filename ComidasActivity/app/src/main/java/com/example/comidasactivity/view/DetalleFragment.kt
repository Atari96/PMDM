package com.example.comidasactivity.view

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import com.bumptech.glide.Glide
import com.example.comidasactivity.R
import com.example.comidasactivity.viewmodel.ComidaDetalleViewModel

class DetalleFragment: Fragment(R.layout.fragment_detalle) {


    private val detalleComidasViewModel: ComidaDetalleViewModel by navGraphViewModels(R.id.nav_graph)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        var id: TextView = view.findViewById(R.id.textViewId)
        var categoria: TextView = view.findViewById(R.id.textViewCategoria)
        var area: TextView = view.findViewById(R.id.textViewArea)
        var descripcion: TextView = view.findViewById(R.id.textViewDesc)
        var receta: TextView = view.findViewById(R.id.textViewReceta)
        var foto: ImageView =view.findViewById(R.id.imageViewFoto)
        var ingr1:TextView=view.findViewById(R.id.textViewIngr1)
        var ingr2:TextView=view.findViewById(R.id.textViewIngr2)
        var ingr3:TextView=view.findViewById(R.id.textViewIngr3)
        var ingr4:TextView=view.findViewById(R.id.textViewIngr4)
        var ingr5:TextView=view.findViewById(R.id.textViewIngr5)
        var cantidad1:TextView=view.findViewById(R.id.textViewCant1)
        var cantidad2:TextView=view.findViewById(R.id.textViewCant2)
        var cantidad3:TextView=view.findViewById(R.id.textViewCant3)
        var cantidad4:TextView=view.findViewById(R.id.textViewCant4)
        var cantidad5:TextView=view.findViewById(R.id.textViewCant5)
        var botonAtras: Button=view.findViewById(R.id.buttonAtras)

        Log.i("click10 detalleF", "onViewCreated defAtributos")

        detalleComidasViewModel.detalleComidaLiveData.observe(viewLifecycleOwner){
            id.text=it.id.toString()
            categoria.text=it.categoria
            area.text=it.area
            descripcion.text=it.descripcion
            receta.text=it.receta
            Glide.with(view.context).load(it.foto).into(foto)
            ingr1.text=it.ingr1
            ingr2.text=it.ingr2
            ingr3.text=it.ingr3
            ingr4.text=it.ingr4
            ingr5.text=it.ingr5
            cantidad1.text=it.cantidad1
            cantidad2.text=it.cantidad2
            cantidad3.text=it.cantidad3
            cantidad4.text=it.cantidad4
            cantidad5.text=it.cantidad5
        }
        botonAtras.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
        Log.i("click detalleF", "onViewCreated fin")
    }
}