package com.example.chapter4.alertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        alert_satu_button.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Title satu")
                .setMessage("Ini adalah contoh alert standart")
                .setIcon(R.drawable.ic_launcher_background)
                .setCancelable(true)
                .show()
        }
        alert_dua_button.setOnClickListener {
            val bilPertama = input_bil_pertama.text.toString().toInt()
            val bilKedua = input_bil_kedua.text.toString().toInt()
            val hasil = bilPertama * bilKedua
            val aa = AlertDialog.Builder(this)
            aa.setTitle("Title 2")
            aa.setMessage("Hasil perkaliannya adalah $bilPertama x $bilKedua = $hasil")
            val dialog = aa.create()
            aa.setNegativeButton("Dismiss"){ dialogInterface: DialogInterface, i: Int ->
                dialog.dismiss()
            }
            aa.show()
        }
//        alert_tiga_button.setOnClickListener {
//            val aa = AlertDialog.Builder(this)
//            aa.setTitle("Contoh dismiss")
//            aa.setMessage("Ini adalah contoh penggunaan dismiss")
//            val dialog = aa.create()
//            aa.setPositiveButton("Toast"){ dialogInterface: DialogInterface, i: Int ->
//                Toast.makeText(this, "Terhapus", Toast.LENGTH_SHORT).show()
//            }
//            aa.setNeutralButton("dismiss"){ dialogInterface: DialogInterface, i: Int ->
//                dialog.dismiss()
//            }
//            aa.show()
//        }
        alert_empat_button.setOnClickListener {
            val customDialog = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null, false)
            val dialog = AlertDialog.Builder(this)
                .setView(customDialog)
                .create()
            customDialog.button_custom_dialog.setOnClickListener {
                val datanama = customDialog.dialog_inputan_nama.text.toString()
                Toast.makeText(this, "Namanya adalah $datanama", Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }
            dialog.show()
        }
        alert_lima_button.setOnClickListener {
            AlertDialogFragment().show(supportFragmentManager, "abc")
        }
    }
}