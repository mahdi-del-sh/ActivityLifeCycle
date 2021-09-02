package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var textView : TextView
    var number : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        textView.text = 1.toString()


//        val text = "Hello toast!"
//        val duration = Toast.LENGTH_SHORT
//        val myToast = Toast.makeText(this,"toast",Toast.LENGTH_SHORT)

        button.setOnClickListener{
//            myToast.show()
            addOne()
        }
    }

    private fun addOne(){
        number++
        textView.text = number.toString()
    }
}