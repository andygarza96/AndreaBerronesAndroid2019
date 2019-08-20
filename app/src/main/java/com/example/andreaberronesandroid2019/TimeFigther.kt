package com.example.andreaberronesandroid2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_time_figther.*

class TimeFigther : AppCompatActivity() {
        var score= 0
        lateinit var txtScoreTap: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_figther)

        txtScoreTap.text = "hola"// getString(R.string.tap_score, score.toString())

        btnTapMe.setOnClickListener {
            incrementScore()
        }

    }
    private fun incrementScore(){
        score= score+1
        val newScore = getString(R.string.tap_score, score.toString())
        txtScoreTap.text=newScore
    }
}
