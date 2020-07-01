package com.architecture.simplified.ui.slideshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class LaunchViewModel : ViewModel() {
    val launchDestination = liveData {
        if (true) {
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