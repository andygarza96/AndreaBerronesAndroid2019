package com.example.andreaberronesandroid2019

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shake.*
import java.util.*

class ShakeActivity : AppCompatActivity() {


    private var mSensorManager: SensorManager? = null
    private var mSensorListener: ShakeEventListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shake)

        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
        mSensorListener = ShakeEventListener()

        this.mSensorListener!!.setOnShakeListener {
            play()
        }

    }

    fun play() {
        val random = Random().nextInt(3)
        when (random) {
            0 -> idisparejo.setImageDrawable(getResources().getDrawable(R.drawable.like))
            1 -> idisparejo.setImageDrawable(getResources().getDrawable(R.drawable.middle))
            2 -> idisparejo.setImageDrawable(getResources().getDrawable(R.drawable.unlike))
        }
    }

    override fun onResume() {
        super.onResume()
        mSensorManager!!.registerListener(
            mSensorListener,
            mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_UI
        )
    }

    override fun onPause() {
        mSensorManager!!.unregisterListener(mSensorListener)
        super.onPause()
    }
}
