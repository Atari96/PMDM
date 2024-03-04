package com.pmp.pmpcoctailapp.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pmp.pmpcoctailapp.R
import com.pmp.pmpcoctailapp.model.Cocktail

class CocktailViewHolder (viewItem: View, llamarDetalle: (position: Int) -> Unit): RecyclerView.ViewHolder(viewItem) {
    var id: TextView =viewItem.findViewById(R.id.textViewId)
    var nombre: TextView =viewItem.findViewById(R.id.textViewDesc)
    var foto: ImageView =viewItem.findViewById(R.id.imageViewFoto)
    var view=viewItem

    init {
        viewItem.setOnClickListener {
            llamarDetalle(adapterPosition)
        }
    }

    fun render(cocktail: Cocktail) {
        id.text=cocktail.id.toString()
        nombre.text=cocktail.nombre.toString()
        Glide.with(view.context).load(cocktail.foto).into(foto)
    }
}