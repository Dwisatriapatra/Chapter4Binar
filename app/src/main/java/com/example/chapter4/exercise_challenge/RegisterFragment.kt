package com.example.chapter4.exercise_challenge

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapter4.R
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exercise_button_register.setOnClickListener {
            if(exercise_register_input_email.text.isNotEmpty() &&
                exercise_register_input_username.text.isNotEmpty() &&
                exercise_register_input_password.text.isNotEmpty() &&
                exercise_register_input_konfirmasi_password.text.isNotEmpty()){
                val dataEmail = exercise_register_input_email.text.toString()
                val dataUsername = exercise_register_input_username.text.toString()
                val dataPassword = exercise_register_input_password.text.toString()
                val dataKonfirmasiPassword = exercise_register_input_konfirmasi_password.text.toString()
                val sharedPreference = requireContext().getSharedPreferences("DATAUSER", Context.MODE_PRIVATE)
                val sharedPref = sharedPreference.edit()
                sharedPref.putString("EMAIL", dataEmail)
                sharedPref.putString("USERNAME", dataUsername)
                sharedPref.putString("PASSWORD", dataPassword)
                sharedPref.putString("KONFIRMASIPASSWORD", dataKonfirmasiPassword)
                sharedPref.apply()
                Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment)
            }else{
                Toast.makeText(requireContext(), "Semua data harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}