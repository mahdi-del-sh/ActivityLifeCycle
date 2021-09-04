package com.example.activitylifecycle

import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var number : Int = 1

    fun addOne() {
        number += 1
    }

}




