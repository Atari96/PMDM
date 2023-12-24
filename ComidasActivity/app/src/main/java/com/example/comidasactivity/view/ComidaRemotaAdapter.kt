package com.example.comidasactivity.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.comidasactivity.R
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.viewmodel.ComidaViewModel

class ComidaRemotaAdapter(val comidas:List<Comida>):RecyclerView.Adapter<ComidaViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaViewHolder {
        var layoutInflater=LayoutInflater.from(parent.context)
        var view=layoutInflater.inflate(R.layout.item_comidas, parent, false)

        return ComidaViewHolder(view)
    }

    override fun getItemCount(): Int=comidas.size

    override fun onBindViewHolder(holder: ComidaViewHolder, position: Int) {
        holder.render(comidas[position])
    }
}