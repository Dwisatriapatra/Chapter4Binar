package com.example.chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter4.toastandsnackbar.ToastSnackbarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showActivity.setOnClickListener {
            startActivity(Intent(this, ToastSnackbarActivity::class.java))
        }
    }
}