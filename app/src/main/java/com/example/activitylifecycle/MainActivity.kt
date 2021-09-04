package com.example.activitylifecycle

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//private const val TAG : String = "CallBacks"

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mahdi = ViewModelProvider(this)[ScoreViewModel::class.java]

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        textView.text = mahdi.number.toString()


        button.setOnClickListener{
          textView.text = mahdi.addOne()

        }
    }






}