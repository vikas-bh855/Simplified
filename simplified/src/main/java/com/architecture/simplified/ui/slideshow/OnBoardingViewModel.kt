package com.architecture.simplified.ui.slideshow

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class OnBoardingViewModel @ViewModelInject constructor() : ViewModel() {
    private var _startButton = MutableLiveData<Any>()
    private var _buttonText = MutableLiveData<String>()
    val startButton: LiveData<Any> = _startButton
    val buttonText: LiveData<String> = _buttonText
     fun advance()
    {
        viewModelScope.launch {
            _startButton.postValue("")
        }
    }
    fun buttonText(value:String)
    {
        viewModelScope.launch { _buttonText.postValue(value)}
    }
}