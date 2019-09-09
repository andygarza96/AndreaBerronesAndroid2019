package com.example.andreaberronesandroid2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_dialog_managment.*
import kotlinx.android.synthetic.main.activity_dialogo.*
import kotlinx.android.synthetic.main.loging_dialog.view.*
import kotlinx.android.synthetic.main.show_dialog.view.*
import kotlinx.android.synthetic.main.sing_out.view.*
import kotlin.system.exitProcess

class DialogManagment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_managment)

        btnShowDialog.setOnClickListener {
            val myDialogView = layoutInflater.inflate(R.layout.show_dialog, null)
            val myBuilder = AlertDialog.Builder(this).setView(myDialogView).setTitle("Image form").show()

            myDialogView.btnAccept.setOnClickListener {
                myBuilder.dismiss()
            }
            btnSingOut.setOnClickListener {
                val myDialogView = layoutInflater.inflate(R.layout.sing_out, null)
                val myBuilder = AlertDialog.Builder(this).setView(myDialogView).setTitle("Log out").show()

                myDialogView.btnYes.setOnClickListener {
                    moveTaskToBack(true);
                    exitProcess(-1)

                }
                myDialogView.btnNo.setOnClickListener {
                    myBuilder.dismiss()
                }


            }
        }
    }
}
