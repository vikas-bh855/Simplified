package com.architecture.simplified;

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.architecture.simplified.ui.slideshow.LaunchDestination.MAIN_ACTIVITY
import com.architecture.simplified.ui.slideshow.LaunchDestination.ONBOARDING
import com.architecture.simplified.ui.slideshow.LaunchViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: LaunchViewModel by viewModels()
        viewModel.launchDestination.observe(this, Observer { destination ->
            when (destination) {
                MAIN_ACTIVITY -> startActivity(Intent(this, MainActivity::class.java))
                ONBOARDING -> startActivity(Intent(this, OnBoardingActivity::class.java))
            }
            finish()

        })
    }
}
