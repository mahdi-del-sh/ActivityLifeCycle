package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider



class MainActivity : AppCompatActivity() {

    private lateinit var question : EditText
    private lateinit var send : Button
    private lateinit var show : Button
    private lateinit var questionStr : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        question = findViewById(R.id.Question)
        send = findViewById(R.id.Send)
        show = findViewById(R.id.Show)


        send.setOnClickListener {
            questionStr = question.text.toString()
            val intent  = Intent(this,ChildActivity::class.java)
            intent.putExtra("Question",questionStr)
            startActivity(intent)
        }

        show.setOnClickListener {

        }





    }







}