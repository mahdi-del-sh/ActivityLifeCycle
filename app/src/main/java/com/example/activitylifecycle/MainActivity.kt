package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.properties.Delegates
private const val TAG : String = "CallBacks"

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var textView : TextView
    var number : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate")

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

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }



    private fun addOne(){
        number++
        textView.text = number.toString()
    }
}