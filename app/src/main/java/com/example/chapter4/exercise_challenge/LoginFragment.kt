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
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.exercise_belum_punya_akun
import kotlinx.android.synthetic.main.fragment_register.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exercise_button_login.setOnClickListener {
            if(exercise_login_input_email.text.isNotEmpty() && exercise_login_input_password.text.isNotEmpty()){
                val sharedPreference = requireContext().getSharedPreferences("DATAUSER", Context.MODE_PRIVATE)
                val dataemail = sharedPreference.getString("EMAIL", "")
                val datapassword = sharedPreference.getString("PASSWORD", "")
                if(exercise_login_input_email.text.toString() == dataemail &&
                    exercise_login_input_password.text.toString() == datapassword){
                    Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment)
                }else{
                    Toast.makeText(requireContext(), "username/password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
        exercise_belum_punya_akun.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }
}