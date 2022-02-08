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

    private val _currentHookshot = MutableLiveData<Int>().apply {
        value = 0
    }
    val currentHookshot: MutableLiveData<Int> = _currentHookshot

    private val _currentMagic = MutableLiveData<Int>().apply {
        value = 0
    }
    val currentMagic: MutableLiveData<Int> = _currentMagic

    private val _currentScale = MutableLiveData<Int>().apply {
        value = 0
    }
    val currentScale: MutableLiveData<Int> = _currentScale

    private val _currentWallet = MutableLiveData<Int>().apply {
        value = 0
    }
    val currentWallet: MutableLiveData<Int> = _currentWallet

    private val _currentEgg = MutableLiveData<Int>().apply {
        value = 0
    }
    val currentEgg: MutableLiveData<Int> = _currentEgg

    private val _slingShotClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val slingShotClicked: MutableLiveData<Boolean> = _slingShotClicked

    private val _bombClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val bombClicked: MutableLiveData<Boolean> = _bombClicked

    private val _bombchuClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val bombchuClicked: MutableLiveData<Boolean> = _bombchuClicked

    private val _bowClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val bowClicked: MutableLiveData<Boolean> = _bowClicked

    private val _boomerangClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val boomerangClicked: MutableLiveData<Boolean> = _boomerangClicked

    private val _lensClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val lensClicked: MutableLiveData<Boolean> = _lensClicked

    private val _hammerClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val hammerClicked: MutableLiveData<Boolean> = _hammerClicked

    private val _goronTunicClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val goronTunicClicked: MutableLiveData<Boolean> = _goronTunicClicked

    private val _zoraTunicClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val zoraTunicClicked: MutableLiveData<Boolean> = _zoraTunicClicked

    private val _rutosClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val rutosClicked: MutableLiveData<Boolean> = _rutosClicked

    private val _mirrorClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val mirrorClicked: MutableLiveData<Boolean> = _mirrorClicked

    private val _fireArrowClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val fireArrowClicked: MutableLiveData<Boolean> = _fireArrowClicked

    private val _lightArrowClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val lightArrowClicked: MutableLiveData<Boolean> = _lightArrowClicked

    private val _faroreClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val faroreClicked: MutableLiveData<Boolean> = _faroreClicked

    private val _dinClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val dinClicked: MutableLiveData<Boolean> = _dinClicked

    private val _ironClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val ironClicked: MutableLiveData<Boolean> = _ironClicked

    private val _hoverClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val hoverClicked: MutableLiveData<Boolean> = _hoverClicked

    private val _kokiriClicked = MutableLiveData<Boolean>().apply {
        value = false
    }
    val kokiriClicked: MutableLiveData<Boolean> = _kokiriClicked


}