package com.example.chapter4.exercise_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter4.R

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}