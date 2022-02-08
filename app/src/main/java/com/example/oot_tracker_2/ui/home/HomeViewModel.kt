package com.example.oot_tracker_2.ui.home

import android.widget.ImageButton
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    val currentStr: MutableLiveData<ImageButton> by lazy {
        MutableLiveData<ImageButton>()
    }


    private val _currentStrength = MutableLiveData<Int>().apply {
        value = 0
    }
    val currentStrength: MutableLiveData<Int> = _currentStrength
}