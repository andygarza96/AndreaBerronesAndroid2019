package com.example.andreaberronesandroid2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_playground.*

class Playground : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        var pair = Pair("Septiembre", "17")
        var triple = Triple (29,8,2019)
        btnShowPair.setOnClickListener {
            val month = pair.first
            val day = pair.second

            Toast.makeText(this, "month = $month day = $day", Toast.LENGTH_LONG).show()

        }
        btnShowTriple.setOnClickListener {
            val day = triple.first
            val month = triple.second
            val year = triple.third

            Toast.makeText(this, "month = $month day = $day year= $year", Toast.LENGTH_LONG).show()

        }
    }
}
