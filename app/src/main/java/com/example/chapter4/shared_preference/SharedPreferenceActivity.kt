package com.example.chapter4.shared_preference

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {
    //deklarasi global
    lateinit var sharedPref :SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)
        if(getSharedPreferences("contoh", Context.MODE_PRIVATE).contains("NAMA")){
            startActivity(Intent(this, HalamanDuaActivity::class.java))
            finish()
        }else{
            //inisialisasi
            sharedPref = getSharedPreferences("contoh", Context.MODE_PRIVATE)
            sharedPreferenceFunc()
        }
    }
    fun sharedPreferenceFunc(){
        button_simpan_shared.setOnClickListener {
            //langkah memasukkan data ke shared preference
            val datanama = shared_inputan_nama.text.toString()
            val sf = sharedPref.edit()
            sf.putString("NAMA" , datanama)
            sf.apply()

            //start activity
            startActivity(Intent(this, HalamanDuaActivity::class.java))
            finish()
        }
    }
}