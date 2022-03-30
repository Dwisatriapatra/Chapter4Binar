package com.example.chapter4.toastandsnackbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_toast_fragment.setOnClickListener {
            Toast.makeText(requireContext(), "Hallo", Toast.LENGTH_SHORT).show()
        }
        button_snackbar_fragment.setOnClickListener {
            Snackbar.make(it, "This is a snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Pindah"){
                    Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
                }.show()
        }
    }
}