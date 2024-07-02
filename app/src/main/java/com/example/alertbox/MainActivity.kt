package com.example.alertbox

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Create Variable of type Dialog.
    private  lateinit var dialog:Dialog

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_background_alartbox))

        //Creating Variables For The Custom Dialog .xml Design.
        val buttonGood = dialog.findViewById<Button>(R.id.btnGood)
        val buttonFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }
buttonFeedback.setOnClickListener {
    //intents or Toast
    Toast.makeText(this, "Congratulations",Toast.LENGTH_SHORT).show()
}


        myButton.setOnClickListener {
            dialog.show()
        }
    }
}