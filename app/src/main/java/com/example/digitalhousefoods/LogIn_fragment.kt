package com.example.digitalhousefoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_log_in.*


class LogIn_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        login(view)
        registrar(view, navController)

    }

    private fun login(view: View) {
        view.findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_logIn_to_lista_restaurantes)
        }
    }

    private fun registrar(view: View, navController: NavController) {
        view.findViewById<Button>(R.id.btnRegisterLogin).setOnClickListener {
            navController.navigate(R.id.action_logIn_to_register2)

        }

    }
}
