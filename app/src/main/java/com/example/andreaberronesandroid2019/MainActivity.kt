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
        btnConverter.setOnClickListener {
            println("Check 3")
            val intent = Intent(this, Converter::class.java)
            startActivity(intent)
        }
        btnDialogo.setOnClickListener {
            println("Check 4")
            val intent = Intent(this, Dialogo::class.java)
            startActivity(intent)
        }
        btnDialogManagment.setOnClickListener {
            println("Check 5")
            val intent = Intent(this, DialogManagment::class.java)
            startActivity(intent)
        }
        btnPlayground.setOnClickListener {
            println("Check 6")
            val intent = Intent(this, Playground::class.java)
            startActivity(intent)
        }
    }
}



