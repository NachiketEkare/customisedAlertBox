package com.example.customisedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.customisedalertbox)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.alertbox))

        val btngood = dialog.findViewById<Button>(R.id.btn2)
        val btnnotgood = dialog.findViewById<Button>(R.id.btn1)

        btngood.setOnClickListener {
            dialog.dismiss()
        }

        btnnotgood.setOnClickListener {
            dialog.dismiss()
        }

        clickButton.setOnClickListener {
            dialog.show()
        }

    }
}