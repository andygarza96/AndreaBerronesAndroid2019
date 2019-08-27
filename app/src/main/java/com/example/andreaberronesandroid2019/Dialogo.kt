package com.example.andreaberronesandroid2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_dialogo.*
import kotlinx.android.synthetic.main.loging_dialog.view.*

class Dialogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogo)

        btnMostrarDialogo.setOnClickListener {
            val myDialogView = layoutInflater.inflate(R.layout.loging_dialog,null)
            val myBuilder = AlertDialog.Builder(this).setView(myDialogView).setTitle("Login Form").show()

            myDialogView.btnDialogLoggin.setOnClickListener {
                val name = myDialogView.txtName.text.toString()
                val email = myDialogView.txtEmail.text.toString()
                val password = myDialogView.txtPassword.text.toString()

                txtMostrarDialogo.setText("Nombre:${name}\nEmail :${email}\nPassword: ${password}")
                myBuilder.dismiss()
            }

            myDialogView.btnDialogCancel.setOnClickListener {
                myBuilder.dismiss()
            }

        }

    }
}
