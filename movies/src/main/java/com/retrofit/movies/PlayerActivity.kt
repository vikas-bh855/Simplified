package com.retrofit.movies

import android.animation.ObjectAnimator
import android.app.Activity
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import android.widget.ImageView
import androidx.annotation.NonNull
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.google.android.exoplayer2.C
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import com.retrofit.movies.databinding.ActivityPlayerBinding
import kotlinx.android.synthetic.main.activity_player.*
import kotlin.math.max
import kotlin.properties.Delegates


class PlayerActivity : Activity() {
    private var bindings: ActivityPlayerBinding by Delegates.notNull()
    private var player: SimpleExoPlayer? = null
    private var scaleGestureDetector: ScaleGestureDetector? = null
    private var exo_orientation: ImageView by Delegates.notNull()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = DataBindingUtil.setContentView(this, R.layout.activity_player)

        playerView!!.systemUiVisibility = (View.SYSTEM_UI_FLAG_LOW_PROFILE
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)

        if (savedInstanceState != null) {
            startPosition = savedInstanceState.getLong(KEY_POSITION)
        } else {
            clearStartPosition()
        }
    }

    protected open fun clearStartPosition() {
        startPosition = C.TIME_UNSET
    }


    override fun onStart() {
        super.onStart()
        if (player == null) {
            initializePlayer();
            if (playerView != null) {
                playerView.onResume();
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (player == null) {
            initializePlayer();
            if (playerView != null) {
                playerView.onResume()
            }
        }
    }

    fun initializePlayer() {
        playerView.findViewById<ImageView>(R.id.exo_ffwd).setOnClickListener {
            if (player != null)
                player!!.seekTo(player!!.currentPosition + 10000)
            ObjectAnimator.ofFloat(it, View.ROTATION, 0f, 100f, 0f).start()
        }
        playerView.findViewById<ImageView>(R.id.exo_rew)
            .setOnClickListener {
                if (player != null && player!!.currentPosition > 10)
                    player!!.seekTo(player!!.currentPosition - +10000)
                ObjectAnimator.ofFloat(it, View.ROTATION, 0f, 100f, 0f).start()
            }
        exo_orientation = playerView.findViewById(R.id.exo_orientation)
        scaleGestureDetector = ScaleGestureDetector(this, CustomOnScaleGestureListener(playerView))

        val dataSourceFactory: DataSource.Factory = DefaultHttpDataSourceFactory()
        val mediaSource: MediaSource = HlsMediaSource.Factory(dataSourceFactory)
            .createMediaSource(MediaItem.fromUri("https://epicon-vh.akamaihd.net/i/content/videos/2017/8/5950b6871d41c86c79000277_playlist.smil/master.m3u8?hdnea=st=1606383646~exp=1606988446~acl=/*~hmac=d634ff6ccdc755c67c9369fc1516b1f1f33a55215226a528bb3ffc7f95ae806a"))
        player = SimpleExoPlayer.Builder(this).build()
        playerView.player = player

        player!!.setMediaSource(mediaSource)
        player!!.prepare()
        player!!.playWhenReady = true
        if (startPosition != C.TIME_UNSET) {
            player!!.seekTo(startPosition)
        }
        setClickListener()
    }

    fun setClickListener() {

        exo_orientation.setOnClickListener {
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                exo_orientation.setImageDrawable(
                    ContextCompat.getDrawable(
                        this@PlayerActivity,
                        R.drawable.fullscreen
                    )
                )
            } else {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                exo_orientation.setImageDrawable(
                    ContextCompat.getDrawable(
                        this@PlayerActivity,
                        R.drawable.portrait
                    )
                )
            }

        }
    }

    private val KEY_POSITION = "KEY_POSITION"
    override fun onSaveInstanceState(@NonNull outState: Bundle) {
        super.onSaveInstanceState(outState)
        updateStartPosition()
        outState.putLong(KEY_POSITION, startPosition)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        super.onTouchEvent(event)
        scaleGestureDetector?.onTouchEvent(event)
        return true
    }

    private var startPosition: Long = 0
    override fun onPause() {
        super.onPause()
        if (playerView != null) {
            playerView.onPause()
        }
        releasePlayer()
    }

    private fun releasePlayer() {
        updateStartPosition()
        if (player != null) {
            player!!.release()
            player = null
        }
    }

    private fun updateStartPosition() {
        if (player != null) {
            startPosition = max(0, player!!.contentPosition)
        }
    }


    private class CustomOnScaleGestureListener(private val player: PlayerView) :
        ScaleGestureDetector.SimpleOnScaleGestureListener() {
        private var scaleFactor = 0f

        override fun onScale(
            detector: ScaleGestureDetector
        ): Boolean {
            scaleFactor = detector.scaleFactor
            return true
        }

        override fun onScaleBegin(
            detector: ScaleGestureDetector
        ): Boolean {
            return true
        }

        override fun onScaleEnd(detector: ScaleGestureDetector) {
            if (scaleFactor > 1) {
                player.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_ZOOM
            } else {
                player.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIT
            }
        }
    }

}
