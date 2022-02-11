package com.example.oot_tracker_2.model

import android.widget.ImageButton
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.oot_tracker_2.R

class SharedViewModel : ViewModel() {

    private val _currentStrength = MutableLiveData<Int>(0)
    val currentStrength: LiveData<Int> = _currentStrength
    fun setStrength(currentStrength: Int) {
        _currentStrength.value = currentStrength
    }

    private val _currentHookshot = MutableLiveData<Int>(0)
    val currentHookshot: LiveData<Int> = _currentHookshot
    fun setHookshot(currentHookshot: Int) {
        _currentHookshot.value = currentHookshot
    }

    private val _currentMagic = MutableLiveData<Int>(0)
    val currentMagic: LiveData<Int> = _currentMagic
    fun setMagic(currentMagic: Int) {
        _currentMagic.value = currentMagic
    }

    private val _currentScale = MutableLiveData<Int>(0)
    val currentScale: LiveData<Int> = _currentScale
    fun setScale(currentScale: Int) {
        _currentScale.value = currentScale
    }

    private val _currentWallet = MutableLiveData<Int>(0)
    val currentWallet: LiveData<Int> = _currentWallet
    fun setWallet(currentWallet: Int) {
        _currentWallet.value = currentWallet
    }

    private val _currentEgg = MutableLiveData<Int>(0)
    val currentEgg: LiveData<Int> = _currentEgg
    fun setEgg(currentEgg: Int) {
        _currentEgg.value = currentEgg
    }

    private val _slingShotClicked = MutableLiveData<Boolean>(false)
    val slingShotClicked: LiveData<Boolean> = _slingShotClicked
    fun setSlingshot(slingshotClicked: Boolean) {
        _slingShotClicked.value = slingshotClicked
    }

    private val _bombClicked = MutableLiveData<Boolean>(false)
    val bombClicked: LiveData<Boolean> = _bombClicked
    fun setBomb(bombClicked: Boolean) {
        _bombClicked.value = bombClicked
    }

    private val _bombchuClicked = MutableLiveData<Boolean>(false)
    val bombchuClicked: LiveData<Boolean> = _bombchuClicked
    fun setBombchu(bombchuClicked: Boolean) {
        _bombchuClicked.value = bombchuClicked
    }

    private val _bowClicked = MutableLiveData<Boolean>(false)
    val bowClicked: LiveData<Boolean> = _bowClicked
    fun setBow(bowClicked: Boolean) {
        _bowClicked.value = bowClicked
    }

    private val _boomerangClicked = MutableLiveData<Boolean>(false)
    val boomerangClicked: LiveData<Boolean> = _boomerangClicked
    fun setBoomerang(boomerangClicked: Boolean) {
        _boomerangClicked.value = boomerangClicked
    }

    private val _lensClicked = MutableLiveData<Boolean>(false)
    val lensClicked: LiveData<Boolean> = _lensClicked
    fun setLens(lensClicked: Boolean) {
        _lensClicked.value = lensClicked
    }

    private val _hammerClicked = MutableLiveData<Boolean>(false)
    val hammerClicked: LiveData<Boolean> = _hammerClicked
    fun setHammer(hammerClicked: Boolean) {
        _hammerClicked.value = hammerClicked
    }

    private val _goronTunicClicked = MutableLiveData<Boolean>(false)
    val goronTunicClicked: LiveData<Boolean> = _goronTunicClicked
    fun setGoronTunic(goronTunicClicked: Boolean) {
        _goronTunicClicked.value = goronTunicClicked
    }

    private val _zoraTunicClicked = MutableLiveData<Boolean>(false)
    val zoraTunicClicked: LiveData<Boolean> = _zoraTunicClicked
    fun setZoraTunic(zoraTunicClicked: Boolean) {
        _zoraTunicClicked.value = zoraTunicClicked
    }

    private val _rutosClicked = MutableLiveData<Boolean>(false)
    val rutosClicked: LiveData<Boolean> = _rutosClicked
    fun setRutos(rutosClicked: Boolean) {
        _rutosClicked.value = rutosClicked
    }

    private val _mirrorClicked = MutableLiveData<Boolean>(false)
    val mirrorClicked: LiveData<Boolean> = _mirrorClicked
    fun setMirror(mirrorClicked: Boolean) {
        _mirrorClicked.value = mirrorClicked
    }

    private val _fireArrowClicked = MutableLiveData<Boolean>(false)
    val fireArrowClicked: LiveData<Boolean> = _fireArrowClicked
    fun setFireArrow(fireArrowClicked: Boolean) {
        _fireArrowClicked.value = fireArrowClicked
    }

    private val _lightArrowClicked = MutableLiveData<Boolean>(false)
    val lightArrowClicked: LiveData<Boolean> = _lightArrowClicked
    fun setLightArrow(lightArrowClicked: Boolean) {
        _lightArrowClicked.value = lightArrowClicked
    }

    private val _faroreClicked = MutableLiveData<Boolean>(false)
    val faroreClicked: LiveData<Boolean> = _faroreClicked
    fun setFarores(faroreClicked: Boolean) {
        _faroreClicked.value = faroreClicked
    }

    private val _dinClicked = MutableLiveData<Boolean>(false)
    val dinClicked: LiveData<Boolean> = _dinClicked
    fun setDins(dinClicked: Boolean) {
        _dinClicked.value = dinClicked
    }

    private val _ironClicked = MutableLiveData<Boolean>(false)
    val ironClicked: LiveData<Boolean> = _ironClicked
    fun setIron(ironClicked: Boolean) {
        _ironClicked.value = ironClicked
    }

    private val _hoverClicked = MutableLiveData<Boolean>(false)
    val hoverClicked: LiveData<Boolean> = _hoverClicked
    fun setHover(hoverClicked: Boolean) {
        _hoverClicked.value = hoverClicked
    }

    private val _kokiriClicked = MutableLiveData<Boolean>(false)
    val kokiriClicked: LiveData<Boolean> = _kokiriClicked
    fun setKokiri(kokiriClicked: Boolean) {
        _kokiriClicked.value = kokiriClicked
    }

}