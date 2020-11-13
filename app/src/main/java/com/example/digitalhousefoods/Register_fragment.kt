package com.example.digitalhousefoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_register.*

class Register_fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            registrar(view)
}
    private fun registrar(view: View) {
        view.findViewById<Button>(R.id.btnRegister).setOnClickListener {
            val email = view.findViewById<TextInputEditText>(R.id.txtEmailRegister)?.text.toString()
            val password = view.findViewById<TextInputEditText>(R.id.txtPasswordRegister)?.text.toString()
            val nome = view.findViewById<TextInputEditText>(R.id.txtNomeRegister)?.text.toString()
            val passwordRepeat = view.findViewById<TextInputEditText>(R.id.txtRepeatPasswordRegister)?.text.toString()
            if(nome.isEmpty()) {
                view.findViewById<TextInputEditText>(R.id.txtNomeRegister).error = "Campo vazio!"
            } else if (email.isEmpty()){
                view.findViewById<TextInputEditText>(R.id.txtEmailRegister).error = "Campo vazio!"
            } else if (password.isEmpty()){
                view.findViewById<TextInputEditText>(R.id.txtPasswordRegister).error = "Campo vazio!"
            } else if (txtPasswordRegister != txtRepeatPasswordRegister){
                view.findViewById<TextInputEditText>(R.id.txtRepeatPasswordRegister).error = "As senhas não condizem!."
            } else {
                val navController = findNavController()
                navController.navigate(R.id.action_register2_to_lista_restaurantes)
                Toast.makeText(context, "Usuário cadastrado", Toast.LENGTH_SHORT).show()
            }

        }
        }
    }