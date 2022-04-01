package com.example.chapter4.shared_preference

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_halaman_dua.*

class HalamanDuaActivity : AppCompatActivity() {
    lateinit var sf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)
        sf = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        val getNama = sf.getString("NAMA", "")

        shared_result.text = getNama
        button_logout_shared.setOnClickListener {
            logout()
        }
    }

    fun logout(){
        val logoutsf = sf.edit()
        logoutsf.clear()
        logoutsf.apply()
        startActivity(Intent(this, SharedPreferenceActivity::class.java))
        finish()
    }
}