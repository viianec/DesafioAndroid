package com.example.digitalhousefoods

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

class ListaRestauranteViewModel(
    private val repositorio: RestauranteRepositorio
): ViewModel() {
    val restaurante = MutableLiveData<List<RestauranteModel>>()

    fun obterLista(){
        repositorio.getList{
            restaurante.value = it
        }
    }

class ListaRestauranteViewModelFactory(
private val repositorio: RestauranteRepositorio)
: ViewModelProvider.Factory{
        override fun <T: ViewModel?> create(modelClass: Class<T>): T {
            return ListaRestauranteViewModel(repositorio) as T
        }
    }
}