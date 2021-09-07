package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider



class MainActivity : AppCompatActivity() {

    private lateinit var question : EditText
    private lateinit var send : Button
    private lateinit var show : Button
    private lateinit var questionStr : String
    private lateinit var answer :String
    private val myLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {

        val data: Intent? = it.data
        answer = data?.getStringExtra("answer") ?: "No Answer"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        question = findViewById(R.id.Question)
        send = findViewById(R.id.Send)
        show = findViewById(R.id.Show)


        send.setOnClickListener {
            questionStr = question.text.toString()
            val myIntent = Intent(this, ChildActivity::class.java)
            myIntent.putExtra("question",questionStr)
            myLauncher.launch(myIntent)

        }

        show.setOnClickListener {

        Toast.makeText(this,answer, Toast.LENGTH_LONG).show()

       }





    }







}