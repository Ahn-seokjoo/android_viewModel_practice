package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore:Int) : ViewModel() {
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private val _eventPlayButton = MutableLiveData<Boolean>()
    val eventPlayButton: LiveData<Boolean>
        get() = _eventPlayButton

    init {
        _score.value = finalScore
    }
    fun onPlayAgain(){
        _eventPlayButton.value = true
    }
    fun onPlayAgainComplete(){
        _eventPlayButton.value = false
    }
}