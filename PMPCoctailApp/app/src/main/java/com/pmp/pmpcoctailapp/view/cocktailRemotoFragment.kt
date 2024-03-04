package com.pmp.pmpcoctailapp.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pmp.pmpcoctailapp.R
import com.pmp.pmpcoctailapp.model.Cocktail
import com.pmp.pmpcoctailapp.viewmodel.CocktailDetalleViewModel
import com.pmp.pmpcoctailapp.viewmodel.CocktailViewModel

class cocktailRemotoFragment : Fragment(R.layout.fragment_cocktail_remoto){
    lateinit var adapter : CocktailRemotoAdapter
    private val cocktailsViewModel: CocktailViewModel by navGraphViewModels(R.id.nav_graph)
    private val detalleCocktailsViewModel: CocktailDetalleViewModel by navGraphViewModels(R.id.nav_graph)
    private var cocktails : List<Cocktail> = emptyList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var categoria = arguments?.getString("categoria").toString()

        cocktailsViewModel.cocktailLiveData.observe(viewLifecycleOwner){
            cocktails = it
            var cocktailsRecyclerView: RecyclerView = view.findViewById(R.id.cocktailsRecycleView)
            cocktailsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = CocktailRemotoAdapter(it, {
                llamarDetalle(it)
                view.findNavController().navigate(R.id.detalleFragment)})
            cocktailsRecyclerView.adapter = adapter
        }
    }
    fun llamarDetalle(posicion: Int) {
        detalleCocktailsViewModel.get(cocktails[posicion].id)
    }
}