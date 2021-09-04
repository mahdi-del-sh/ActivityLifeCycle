package com.example.activitylifecycle

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

//private const val TAG : String = "CallBacks"
private const val KEY_INDEX = "index"

class MainActivity : AppCompatActivity() {
    private val scoreViewModel : ScoreViewModel by lazy {
        ViewModelProvider(this)[ScoreViewModel::class.java]
    }
    private lateinit var button : Button
    private lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState!=null){
            scoreViewModel.number= savedInstanceState.get("index") as Int
        }

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        textView.text = scoreViewModel.number.toString()


        button.setOnClickListener{
            scoreViewModel.addOne()
          textView.text = scoreViewModel.number.toString()

        }
    }

override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)
    outState.putInt(KEY_INDEX,scoreViewModel.number)
}






}