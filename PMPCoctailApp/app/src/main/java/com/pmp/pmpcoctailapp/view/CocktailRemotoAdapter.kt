package com.pmp.pmpcoctailapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pmp.pmpcoctailapp.R
import com.pmp.pmpcoctailapp.model.Cocktail

class CocktailRemotoAdapter (val cocktails: List<Cocktail>,
                            val llamarDetalle : (position: Int) -> Unit
                            ) : RecyclerView.Adapter<CocktailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(R.layout.fragment_item_cocktail, parent, false)
        return CocktailViewHolder(view, llamarDetalle)
    }

    override fun getItemCount(): Int = cocktails.size

    override fun onBindViewHolder(holder: CocktailViewHolder, position: Int) {
        holder.render(cocktails[position])
    }

}