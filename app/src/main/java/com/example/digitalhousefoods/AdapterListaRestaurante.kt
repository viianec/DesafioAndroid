package com.example.digitalhousefoods

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterListaRestaurante(private val dataset: List<RestauranteModel>, private val listener: (RestauranteModel) -> Unit):
RecyclerView.Adapter<ViewHolderListaRestaurante> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderListaRestaurante {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.lista_restaurantes, parent, false)
        return ViewHolderListaRestaurante(view)
    }
    override fun onBindViewHolder(holder: ViewHolderListaRestaurante, position: Int) {
        val item = dataset[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            listener(item)
        }
    }
        override fun getItemCount() = dataset.size
}
