package com.example.chapter4.shared_preference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_mini_challenge_sfactivity.*

class MiniChallengeSFActivity : AppCompatActivity() {
    lateinit var sharedPreference : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini_challenge_sfactivity)
        sharedPreference = getSharedPreferences("example", Context.MODE_PRIVATE)

        if(getSharedPreferences("example", Context.MODE_PRIVATE).contains("DATANAMA") &&
            getSharedPreferences("example", Context.MODE_PRIVATE).contains("DATAID")){
            viewSharedPreference()
        }

        button_shared_save.setOnClickListener {
            saveSharedPreferenceFunc()
        }
        button_shared_view.setOnClickListener {
            if(getSharedPreferences("example", Context.MODE_PRIVATE).contains("DATANAMA") &&
                getSharedPreferences("example", Context.MODE_PRIVATE).contains("DATAID")){
                viewSharedPreference()
            }else{
                Toast.makeText(this, "Data kosong", Toast.LENGTH_SHORT).show()
            }
        }
        button_shared_clear.setOnClickListener {
            clearSharedPreferenceFunc()
        }
    }

    fun saveSharedPreferenceFunc(){
        val datanama = inputan_nama_shared_challenge.text.toString()
        val dataid = inputan_id_shared_challenge.text.toString()
        val shf = sharedPreference.edit()
        shf.putString("DATAID", dataid)
        shf.putString("DATANAMA" , datanama)
        shf.apply()
        inputan_nama_shared_challenge.text.clear()
        inputan_id_shared_challenge.text.clear()
    }

    fun viewSharedPreference(){
        sharedPreference = getSharedPreferences("example", Context.MODE_PRIVATE)
        val getId = sharedPreference.getString("DATAID", "")
        val getNama = sharedPreference.getString("DATANAMA", "")
        result_shared_nama.text = ": $getNama"
        result_shared_id.text = ": $getId"
    }

    fun clearSharedPreferenceFunc(){
        val sfEdit = sharedPreference.edit()
        sfEdit.clear()
        sfEdit.apply()
        result_shared_nama.text = ""
        result_shared_id.text = ""
    }
}