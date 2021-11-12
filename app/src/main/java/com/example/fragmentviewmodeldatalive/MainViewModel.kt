package com.example.fragmentviewmodeldatalive

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var _score: MutableLiveData<Int> = MutableLiveData(0)
     val score: LiveData<Int> get() = _score

    fun printScore(){
       _score.value = _score.value?.plus(1)
    }
}