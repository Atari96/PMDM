package com.pmp.pmpcoctailapp.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.navGraphViewModels
import com.pmp.pmpcoctailapp.R
import com.pmp.pmpcoctailapp.viewmodel.CocktailViewModel

class BusquedaFragment : Fragment(R.layout.fragment_busqueda) {
    private val cocktailsViewModel : CocktailViewModel by navGraphViewModels(R.id.nav_graph)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var tipoCocktailEditText : EditText = view.findViewById(R.id.editTextTipoCocktail)
        var buscarBoton : Button = view.findViewById(R.id.buttonBuscar)
        buscarBoton.setOnClickListener {
            cocktailsViewModel.get(tipoCocktailEditText.text.toString())
            view.findNavController().navigate(R.id.cocktailRemotoFragment)
        }
    }
}