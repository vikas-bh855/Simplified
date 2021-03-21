package com.architecture.simplified

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.databinding.DataBindingUtil
import com.architecture.simplified.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.apply {
            motionLayout.setTransition(motionLayout.currentState, R.id.end_home)
            motionLayout.transitionToEnd()

            ivHome.setOnClickListener {
                motionLayout.setTransition(motionLayout.currentState, R.id.end_home)
                motionLayout.transitionToEnd()
            }
            ivBooks.setOnClickListener {
                motionLayout.setTransition(motionLayout.currentState, R.id.end_book)
                motionLayout.transitionToEnd()
            }
            ivMusic.setOnClickListener {
                motionLayout.setTransition(motionLayout.currentState, R.id.end_music)
                motionLayout.transitionToEnd()
            }
            ivDownload.setOnClickListener {
                motionLayout.setTransition(motionLayout.currentState, R.id.end_download)
                motionLayout.transitionToEnd()
            }

            motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
                override fun onTransitionTrigger(
                    p0: MotionLayout?,
                    p1: Int,
                    p2: Boolean,
                    p3: Float
                ) {
                }

                override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                }

                override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                    backgroundBooks.isSelected = false
                    backgroundHome.isSelected = false
                    backgroundDownload.isSelected = false
                    backgroundMusic.isSelected = false
                    if (p2 == R.id.end_book)
                        backgroundBooks.isSelected = p3 > 0f
                    else if (p2 == R.id.end_music)
                        backgroundMusic.isSelected = p3 > 0f
                    else if (p2 == R.id.end_download)
                        backgroundDownload.isSelected = p3 > 0f
                    else
                        backgroundHome.isSelected = p3 > 0f
                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                }
            })
        }
    }
}
