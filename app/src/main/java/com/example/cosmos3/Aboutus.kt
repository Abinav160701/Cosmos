package com.example.cosmos3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Aboutus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)
        supportActionBar?.hide()
    }
}