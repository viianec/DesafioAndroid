package com.example.digitalhousefoods

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ViewHolderListaRestaurante(private val view: View): RecyclerView.ViewHolder(view) {
    private val imagem  = view.findViewById<ImageView>(R.id.imgRestauranteItem)
    private val nome = view.findViewById<TextView>(R.id.txtNomeRestauranteItem)
    private val endereco = view.findViewById<TextView>(R.id.txtEnderecoRestauranteItem)
    private val horario = view.findViewById<TextView>(R.id.txtHorarioFechamentoItem)

    @SuppressLint("StringFormatInvalid")
    fun bind(restaurante: RestauranteModel){
        nome.text = restaurante.nome
        endereco.text = restaurante.endereco
        horario.text = view.resources.getString(R.string.fecha_s_22_00, restaurante.horario)
        imagem.setImageDrawable(ContextCompat.getDrawable(view.context, restaurante.img))

    }
}
