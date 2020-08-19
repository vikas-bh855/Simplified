package com.architecture.simplified

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2


class PagerTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        val imageLearn  = page.findViewById<ImageView>(R.id.iv_learn)
        val learn_title  = page.findViewById<TextView>(R.id.learn_title)
        val pageWidth: Int = page.getWidth()
        if (position < -1) { // [-Infinity,-1)
            imageLearn.alpha=1f
        } else if (position <= 1) { // [-1,1]
            imageLearn.translationX= position * (pageWidth/2)//Half the normal speed
            learn_title.translationX= -position * (pageWidth/5)//Half the normal speed
            //imageLearn.translationY= position * (pageWidth / 2)//Half the normal speed
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            imageLearn.alpha=1f
        }
    }
}