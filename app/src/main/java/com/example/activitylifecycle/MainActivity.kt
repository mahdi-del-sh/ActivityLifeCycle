package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val myToast = Toast.makeText(this,"toast",Toast.LENGTH_SHORT)

        button.setOnClickListener{
            myToast.show()
        }
    }
}