package com.example.fragmentviewmodeldatalive

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var _score: Int = 0
    val score: Int get() = _score



    fun printScore(){
       _score += 1
    }
}