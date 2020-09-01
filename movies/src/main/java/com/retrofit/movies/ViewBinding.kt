package com.retrofit.movies

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("setImageUrl")
fun setImageUrl(view: ImageView, image: String) {
    view.load("https://image.tmdb.org/t/p/w220_and_h330_face" + image)
}

