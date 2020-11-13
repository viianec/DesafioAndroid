package com.example.digitalhousefoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class lista_restaurantes_fragment : Fragment() {
    lateinit var minhaView: View
    lateinit var viewModel: ListaRestauranteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun criarLista(restaurante: List<RestauranteModel>) {
        val recyclerView = minhaView.findViewById<RecyclerView>(R.id.rvRestauranteLista)
        val manager = LinearLayoutManager(context)

        val customAdapter = AdapterListaRestaurante(restaurante) {
//            val bundle = bundleOf(NOME_RESTAURANTE to it.nome, IMAGEM_RESTAURANTE to it.img)
//            val manager = LinearLayoutManager(context)
        }
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = manager
            adapter = customAdapter
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        minhaView = inflater.inflate(R.layout.fragment_lista_restaurantes, container, false)
        viewModel = ViewModelProvider(this,
            ListaRestauranteViewModel.ListaRestauranteViewModelFactory(RestauranteRepositorio())
        ).get(ListaRestauranteViewModel::class.java)

        viewModel.restaurante.observe(this, Observer{
            criarLista(it)
        })
        viewModel.obterLista()
        return minhaView
    }

    companion object {
        const val nomeRestaurante = "nome"
        const val imagemRestaurante = "imagem"
        const val enderecoRestaurante = "endereco"
        const val horarioRestaurante = "horario"
    }
}