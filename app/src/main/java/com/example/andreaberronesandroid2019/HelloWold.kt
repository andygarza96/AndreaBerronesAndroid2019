package com.example.andreaberronesandroid2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HelloWold : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_wold)
        println("Hello World")
        Log.d( "Berrones","perro")
    }
}
