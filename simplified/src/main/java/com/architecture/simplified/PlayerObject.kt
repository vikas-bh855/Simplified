package com.architecture.simplified

import android.view.MotionEvent
import android.view.View
import androidx.databinding.BindingAdapter
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory

class PlayerObject {
    companion object {
        private var playerMap: MutableMap<Int, PlayerView> = mutableMapOf()
        private var currentPlayingVideo: Pair<Int, PlayerView>? = null

        fun releaseAllPlayers() {
            playerMap.map {
                it.value.player!!.release()
            }
        }

        fun playCurrentVideo(index: Int) {
            if (playerMap.isNotEmpty() && !playerMap[index]!!.player!!.playWhenReady) {
                if (currentPlayingVideo != null)
                    currentPlayingVideo?.second?.player!!.playWhenReady = false
                if (playerMap.isNotEmpty()) {
                    playerMap[index]?.player?.playWhenReady = true
                    currentPlayingVideo = Pair(index, playerMap[index]!!)
                }
            }
        }

        @JvmStatic
        @BindingAdapter(value = ["playUrl", "position"], requireAll = false)
        fun PlayerView.loadVideo(url: String, position: Int? = null) {
            val dataSourceFactory: DataSource.Factory = DefaultHttpDataSourceFactory()
            val mediaSource: MediaSource = HlsMediaSource.Factory(dataSourceFactory)
                    .createMediaSource(MediaItem.fromUri(url))
            val player = SimpleExoPlayer.Builder(context).build()
            this.player = player
            player.setMediaSource(mediaSource)
            player.prepare()

            if (playerMap.containsKey(position))
                playerMap.remove(position)
            if (position != null)
                playerMap[position] = this

            setOnTouchListener { v, event ->
                when (event!!.action) {
                    MotionEvent.ACTION_DOWN -> {
                        playerMap[position]!!.player!!.playWhenReady = false
                    }
                    MotionEvent.ACTION_UP -> {
                        playerMap[position]!!.player!!.playWhenReady = true
                    }
                }
                true
            }
        }


    }
}