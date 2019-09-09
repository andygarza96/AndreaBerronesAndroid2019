package com.example.andreaberronesandroid2019

import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_time_figther.*

class TimeFigther : AppCompatActivity() {
        var score = 0
        lateinit var countDownTimer: CountDownTimer
        val initialCountDown: Long = 60000
        val countDowninterval: Long = 1000
        var gameStarted = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_figther)

        txtTimeLeft.text = 60.toString()

        txtScoreTap.text = getString(R.string.tap_score, score.toString())

        countDownTimer = object: CountDownTimer(initialCountDown, countDowninterval){
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft : Long = millisUntilFinished/1000
                txtTimeLeft.text = getString(R.string.time_left, timeLeft.toString())
            }

            override fun onFinish() {
                endGame()
            }

        }
        btnTapMe.setOnClickListener {
           val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            it.startAnimation(bounceAnimation)
            incrementScore()

        }

    }
    private fun startGame(){
        countDownTimer.start()
        gameStarted = true

    }
    private fun incrementScore(){
        if(!gameStarted){
            startGame()
        }
        score = score+1
        val newScore = getString(R.string.tap_score, score.toString())
        txtScoreTap.text=newScore
        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            txtScoreTap.startAnimation(bounceAnimation)
    }
    private fun endGame(){
        Toast.makeText(this, "Time's up Your score was: ${score.toString()}", Toast.LENGTH_LONG).show()
        score = 0
        val newScore = getString(R.string.tap_score, score.toString())
        txtScoreTap.text=newScore
        btnTapMe.isClickable = false
    }

}
