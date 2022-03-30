package com.example.chapter4.toastandsnackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_toast_snackbar.*

class ToastSnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_snackbar)
//        toast_button.setOnClickListener {
//            var nama = input_nama.text.toString()
//            Toast.makeText(this, "Selamat datang $nama", Toast.LENGTH_LONG).show()
//        }
//        snackbar_button.setOnClickListener {
//            var nama = input_nama.text.toString()
//            Snackbar.make(it, "Halo $nama", Snackbar.LENGTH_INDEFINITE)
//                .setAction("Pindah"){
//                    startActivity(Intent(this, HalloActivity::class.java))
//                }.show()
//        }
//        snackbar_button2.setOnClickListener {
//            Snackbar.make(it, "This is a snackbar", Snackbar.LENGTH_INDEFINITE)
//                .setAction("Show Toast"){
//                    Toast.makeText(this, "This is a toast", Toast.LENGTH_SHORT).show()
//                }.show()
//        }
    }
}