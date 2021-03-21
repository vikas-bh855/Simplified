package com.architecture.simplified

import ItemAdapter
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.updatePadding
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.architecture.simplified.databinding.PagerActivityBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.pager_activity.*
import kotlin.math.abs


@AndroidEntryPoint
class PagerActivity : AppCompatActivity() {

    companion object {
        const val SCALE_MIN = 0.5f
        const val SCALE_MAX = 1f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val list = listOf(
                ContextCompat.getDrawable(this@PagerActivity, R.drawable.marvel),
                ContextCompat.getDrawable(this@PagerActivity, R.drawable.marvel),
                ContextCompat.getDrawable(this@PagerActivity, R.drawable.marvel),
                ContextCompat.getDrawable(this@PagerActivity, R.drawable.marvel),
                ContextCompat.getDrawable(this@PagerActivity, R.drawable.marvel),
                ContextCompat.getDrawable(this@PagerActivity, R.drawable.marvel)
        )

        DataBindingUtil.setContentView<PagerActivityBinding>(this, R.layout.pager_activity).apply {

            viewPager.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)
            viewPager.offscreenPageLimit = 3
            rvItems.setOnApplyWindowInsetsListener { view, insets ->
                view.updatePadding(top = insets.systemWindowInsetTop)
                insets
            }

            val layoutManager =
                    LinearLayoutManager(this@PagerActivity, LinearLayoutManager.HORIZONTAL, false)
            var headerItemMargin = resources.getDimension(R.dimen.dimens_8dp)
            var headerItemSize = resources.getDimension(R.dimen.dimens_92dp)

            rvItems.layoutManager = layoutManager
            rvItems.adapter =
                    ItemAdapter(this.root, headerGuideline, headerItemSize, headerItemMargin, list)

            viewPager.adapter = PlayerAdapter(this@PagerActivity)


            rvItems.recycledViewPool.setMaxRecycledViews(0, 0)
            viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageScrolled(
                        position: Int,
                        positionOffset: Float,
                        positionOffsetPixels: Int
                ) {
                    val distanceBetweenImages = (headerItemSize * SCALE_MIN + headerItemMargin * 2f).toInt()
                    val imageOffsetPixels = positionOffset * distanceBetweenImages
                    val scrollOffsetPixels = (-(position * distanceBetweenImages + imageOffsetPixels)).toInt()

                    layoutManager.scrollToPositionWithOffset(0, scrollOffsetPixels)

                    for (i in 0 until rvItems.childCount) {
                        val itemView = rvItems.getChildAt(i)
                        val centerX = itemView.x + itemView.width.toFloat() / 5.22f
                        val diffX = abs(headerGuideline.x - centerX)
                        val maxScaleDistance = headerItemSize * 0.7f
                        val scale =
                                if (diffX < maxScaleDistance) SCALE_MAX - diffX / maxScaleDistance * (SCALE_MAX - SCALE_MIN) else SCALE_MIN

                        Log.d("e", "position=  " + i + "  scale=  " + scale + "   maxScale= " + maxScaleDistance +
                                "  diffX=  " + diffX + "  itemView.x=  " + itemView.x + " itemView.width" + itemView.width.toFloat() / 3.5f)
                        itemView.size = (headerItemSize * scale).toInt()
                    }

                    if (positionOffset == 0f)
                        PlayerObject.playCurrentVideo(position)

                }

            })
            rvItems.post { refreshPosition(0f, 0) }
        }
    }

    private var View.size: Int
        get() {
            return layoutParams.width
        }
        set(size) {
            layoutParams.width = size
            layoutParams.height = (size * 0.5f).toInt()
        }

    private fun refreshPosition(positionOffset: Float, position: Int) {
        val layoutManager = rvItems.layoutManager as LinearLayoutManager
        var headerItemMargin = resources.getDimension(R.dimen.dimens_8dp)
        var headerItemSize = resources.getDimension(R.dimen.dimens_92dp)
        val distanceBetweenImages = (headerItemSize * SCALE_MIN + headerItemMargin * 2).toInt()
        val imageOffsetPixels = positionOffset * distanceBetweenImages

        val scrollOffsetPixels = (-(position * distanceBetweenImages + imageOffsetPixels)).toInt()

        layoutManager.scrollToPositionWithOffset(
                0,
                scrollOffsetPixels
        )
    }

    override fun onPause() {
        super.onPause()
       // PlayerObject.releaseAllPlayers()
    }
}


class PlayerAdapter(fragmentManager: FragmentActivity) : FragmentStateAdapter(fragmentManager) {
    override fun getItemCount(): Int {
        return 6
    }


    override fun createFragment(position: Int): Fragment = PagerFragment().apply {
        arguments = Bundle().apply { putInt("position", position) }
    }
}