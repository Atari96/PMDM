package com.example.comidasactivity.view

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comidasactivity.R
import com.example.comidasactivity.modelo.Comida

class ComidaViewHolder(viewItem: View):RecyclerView.ViewHolder(viewItem) {
    var id: TextView =viewItem.findViewById(R.id.textViewId)
    var desc: TextView =viewItem.findViewById(R.id.textViewDesc)
    var foto: ImageView =viewItem.findViewById(R.id.imageViewFoto)
    var view=viewItem

    fun render(comida:Comida) {
        id.text=comida.id.toString()
        desc.text=comida.descripcion.toString()
        Glide.with(view.context).load(comida.foto).into(foto)
        Log.i("click comViewHolder","metodo render(comida)")
    }
}