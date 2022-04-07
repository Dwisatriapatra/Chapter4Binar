package com.example.chapter4.exercise_challenge

import android.content.Context
import android.os.Bundle
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chapter4.R

import android.os.Handler
import androidx.navigation.Navigation

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            val getShared = requireContext().getSharedPreferences("DATAUSER", Context.MODE_PRIVATE)
            if(getShared.contains("EMAIL") && getShared.contains("EMAIL") &&
                    getShared.contains("PASSWORD") && getShared.contains("KONFIRMASIPASSWORD")){
                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_homeFragment)
            }else{
                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_loginFragment)
            }
        }, 3000)
    }
}