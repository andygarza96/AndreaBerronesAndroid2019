package com.example.andreaberronesandroid2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_converter.*

class Converter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        var etFah = findViewById(R.id.etFah) as EditText
        btnConvert.setOnClickListener {
            var fah = etFah.text.toString().toDouble()
            toCel(fah)
        }

    }

    fun toCel(fahrenheit: Double)  {

        var celsius: Double = (fahrenheit - 32.0) * (5.0/9.0)
        celsius = Math.round(celsius * 100.0) / 100.0
        Toast.makeText(this, "Celsius: ${celsius.toString()}", Toast.LENGTH_LONG).show()
        //if(celsius < 10.0) { changeBck() }
    }
    /*fun changeBck() {
        val colorValue = ContextCompat.getColor(context, R.color.blue)
        bm.setBackgroundColor(colorValue)
        Toast.makeText(this, "It's really cold!", Toast.LENGTH_SHORT).show()
    } */


}

