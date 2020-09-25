package com.retrofit.movies

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialFade
import com.google.android.material.transition.MaterialFadeThrough
import com.google.android.material.transition.MaterialSharedAxis
import com.retrofit.movies.databinding.FragmentMovieDetailBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FragmentMovieDetail : Fragment() {
    private val viewModel: MainViewModel by viewModels()
    lateinit var bindings: FragmentMovieDetailBinding
    private val args: FragmentMovieArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        enterTransition = MaterialFadeThrough()
        bindings = FragmentMovieDetailBinding.inflate(inflater, container, false).apply {
            ivPoster.setOnApplyWindowInsetsListener { v, insets ->
                ivPoster.updatePadding(top = insets.systemWindowInsetTop)
                insets
            }
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
            bindings.rvMoviesDetail.apply {
                adapter = MoviesAdapter().apply {
                    submitList(list)
                }
            }
        })
    }
}
