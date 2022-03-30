package com.example.chapter4.alertdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.chapter4.R
import kotlinx.android.synthetic.main.fragment_alert_dialog.*

class AlertDialogFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alert_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog_process_button.setOnClickListener {
            val umur = dialog_inputan_umur.text.toString()
            Toast.makeText(requireContext(), "Umur anda: $umur", Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }
}