package com.retrofit.movies

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("setImageUrl")
fun setImageUrl(view: ImageView, image: String) {
    view.load("https://image.tmdb.org/t/p/w220_and_h330_face" + image)
}

@BindingAdapter("layoutFullScreen")
fun View.layoutFullScreen(previousFullscreen: Boolean, fullscreen: Boolean) {
    if (previousFullscreen != fullscreen && fullscreen) {
        systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
    }
}

