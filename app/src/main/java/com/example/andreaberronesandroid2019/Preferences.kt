package com.example.andreaberronesandroid2019

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preferences.*

class Preferences : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        val sharedPreferences = getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val name = sharedPreferences.getString("name", "")
        val lastName = sharedPreferences.getString("lastName", "")
        val email = sharedPreferences.getString("email", "")

        this.etxtPName.setText(name)
        this.etxtPLastName.setText(lastName)
        this.etxtPEmail.setText(email)

        btnPClear.setOnClickListener {
                editor.clear()
                editor.commit()

            println("Clear preferences")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnPSave.setOnClickListener {
            editor.putString("name", etxtPName.text.toString())
            editor.putString("lastName", etxtPLastName.text.toString())
            editor.putString("email", etxtPEmail.text.toString())
            editor.commit()
            println("Save preferences")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
