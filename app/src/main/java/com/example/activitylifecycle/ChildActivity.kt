package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ChildActivity : AppCompatActivity() {
    private lateinit var answer : EditText
    private lateinit var show : Button
    private lateinit var question : TextView
    private lateinit var send : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        answer     = findViewById(R.id.ChildAnswer)
        show       = findViewById(R.id.ChildShow)
        question   = findViewById(R.id.ChildQuestion)
        send       = findViewById(R.id.ChildSend)

        show.setOnClickListener {

        }

        send.setOnClickListener {

        }

    }
}