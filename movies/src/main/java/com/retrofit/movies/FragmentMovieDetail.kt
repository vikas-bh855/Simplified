package com.retrofit.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.google.android.material.transition.MaterialFadeThrough
import com.retrofit.movies.databinding.FragmentMovieDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import coil.load
import kotlinx.coroutines.*


@AndroidEntryPoint
class FragmentMovieDetail : Fragment() {
    private val viewModel: MainViewModel by viewModels()
    lateinit var bindings: FragmentMovieDetailBinding
    private val args: FragmentMovieDetailArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
runBlocking {
    CoroutineScope(Dispatchers.IO).launch {
        print("This coroutine is launched in coroutine scope")
    }
}
        enterTransition = MaterialFadeThrough()
        bindings = FragmentMovieDetailBinding.inflate(inflater, container, false).apply {
            ivPoster.setOnApplyWindowInsetsListener { _, insets ->
                ivPoster.updatePadding(top = insets.systemWindowInsetTop)
                insets
            }
            motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
                override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                }

                override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, progress: Float) {
                    bindings.tvRating.isActivated = progress>0.5
                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                }

                override fun onTransitionTrigger(
                    p0: MotionLayout?,
                    p1: Int,
                    p2: Boolean,
                    p3: Float
                ) {
                }
            })
        }

        return bindings.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindings.apply {
            lifecycleOwner = lifecycleOwner
            viewModel = viewModel
            poster = args.poster
            overview = args.overview
            title = args.title
        }
        viewModel.response.observe(viewLifecycleOwner, Observer { list ->
            setImageUrl(bindings.ivPoster1,list[0].poster_path)
            setImageUrl(bindings.ivPoster2,list[1].poster_path)
            setImageUrl(bindings.ivPoster3,list[2].poster_path)
        })
    }
}
