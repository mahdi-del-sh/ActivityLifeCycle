package com.example.activitylifecycle

import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var number : Int = 1

    fun addOne():String {
        number += 1
        return number.toString()
    }

}




