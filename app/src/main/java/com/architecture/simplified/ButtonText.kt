package com.architecture.simplified


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.architecture.simplified.databinding.OnboardingActivityBinding
import com.architecture.simplified.ui.slideshow.OnBoardingViewModel
import dagger.hilt.android.AndroidEntryPoint

data class ButtonText(val buttonText: String) {
}
