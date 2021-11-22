package com.example.bookstore.ui.synopsis

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SynopsisViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is synopsis Fragment"
    }
    val text: LiveData<String> = _text
}