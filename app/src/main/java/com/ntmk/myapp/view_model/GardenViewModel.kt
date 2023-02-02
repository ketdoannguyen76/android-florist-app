package com.ntmk.myapp.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GardenViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is garden Fragment"
    }
    val text: LiveData<String> = _text
}