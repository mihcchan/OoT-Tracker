package com.example.oot_tracker_2.ui

import android.widget.ImageButton
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.oot_tracker_2.R

class SharedViewModel : ViewModel() {

    private val _currentStrength = MutableLiveData<Int>().apply {
        value = 0
    }
    val currentStrength: MutableLiveData<Int> = _currentStrength

    val strr = MutableLiveData<Int>()

    fun curStr(str: Int) {
        strr.value = str
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: MutableLiveData<String> = _text

}