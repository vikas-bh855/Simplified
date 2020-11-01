package com.retrofit.movies

import android.app.Activity
import android.app.ActivityOptions
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.retrofit.movies.databinding.MainActivityBinding
import com.retrofit.movies.databinding.TransitionActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TransitionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<TransitionActivityBinding>(this, R.layout.transition_activity).apply {

        }

    }
}