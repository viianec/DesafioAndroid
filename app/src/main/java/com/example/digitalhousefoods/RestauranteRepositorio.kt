package com.example.digitalhousefoods

class RestauranteRepositorio() {
    fun getList(callback: (restaurants: List<RestauranteModel>) -> Unit) {
        callback.invoke(obterListaRestaurante())
    }

    fun obterListaRestaurante(): MutableList<RestauranteModel> {
        return restaurante
    }
    var restaurante = mutableListOf<RestauranteModel>(
        RestauranteModel("Tony Roma's",
            "Av. Lavandisca, 717 - Indianópoles, São Paulo", "22:00", R.drawable.restaurante1),
        RestauranteModel("Aoyama - Moema",
        "Alameda dos Arapanés, 532 - Moema", "00:00", R.drawable.restaurante2),
        RestauranteModel("Outback - Moema",
            "Av. Moaci, 187, 187 - Moema, São Paulo", "00:00", R.drawable.restaurante3),
        RestauranteModel("Sí Señor!",
            "Alameda Jauaperi, 626 - Moema", "01:00", R.drawable.restaurante4)
    )


}