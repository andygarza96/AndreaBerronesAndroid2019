package com.example.andreaberronesandroid2019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHelloWorld.setOnClickListener {
            println("Check 1")
            val intent = Intent(this, HelloWold::class.java)
            startActivity(intent)
        }
        btnTimeFigther.setOnClickListener {
            println("Check 2")
            val intent = Intent(this, TimeFigther::class.java)
            startActivity(intent)
        }
        btnDialogo.setOnClickListener {
            println("Check 4")
            val intent = Intent(this, Dialogo::class.java)
            startActivity(intent)
        }
    }
}



