package com.architecture.simplified.ui.slideshow

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.architecture.simplified.SharedPreferenceStorage

class LaunchViewModel @ViewModelInject constructor(private val sharedPreferenceStorage: SharedPreferenceStorage): ViewModel() {
    val launchDestination = liveData{
        if (sharedPreferenceStorage.onboardingCompleted) {
            emit(LaunchDestination.ONBOARDING)
        } else {
            emit(LaunchDestination.MAIN_ACTIVITY)
        }
    }
}

enum class LaunchDestination {
    ONBOARDING,
    MAIN_ACTIVITY
}