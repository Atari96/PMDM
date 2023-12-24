package com.example.comidasactivity.view

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.comidasactivity.R
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.viewmodel.ComidaViewModel

class ComidaRemotaAdapter(val comidas: List<Comida>,
                          val llamarDetalle: (position: Int) -> Unit
                        ):RecyclerView.Adapter<ComidaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaViewHolder {
        var layoutInflater=LayoutInflater.from(parent.context)
        var view=layoutInflater.inflate(R.layout.item_comidas, parent, false)
        Log.i("click comoremAdapter", "onCreatedViewHolder ")
        return ComidaViewHolder(view)
    }

    override fun getItemCount(): Int=comidas.size

    override fun onBindViewHolder(holder: ComidaViewHolder, position: Int) {
        Log.i("click4 comidaRemAdpt","4 entra onbindviewholder")
        holder.render(comidas[position])
        holder.itemView.setOnClickListener {
            llamarDetalle.invoke(position)
        }
    }
}