package com.retrofit.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.google.android.material.transition.MaterialFadeThrough
import com.retrofit.movies.databinding.FragmentMovieBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentMovie : Fragment(), MoviesAdapter.MovieListener {
    private val viewModel: MainViewModel by viewModels()
    private lateinit var bindings: FragmentMovieBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = FragmentMovieBinding.inflate(inflater, container, false)
        return bindings.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindings.apply {
            lifecycleOwner = lifecycleOwner
            viewModel = viewModel

        }
        viewModel.response.observe(viewLifecycleOwner, Observer { list ->
            bindings.rvMovies.apply {
                adapter = MoviesAdapter(this@FragmentMovie).apply {
                    submitList(list)
                }
            }
        })
    }

    override fun movieClicked(movie: Movies, view: View) {
        /*val extras = FragmentNavigatorExtras(view to getString(R.string.movie_detail_transition_name))
        exitTransition = MaterialElevationScale(false).apply { duration = 300 }
        reenterTransition =  MaterialElevationScale(true).apply { duration = 300 }*/
        exitTransition = MaterialFadeThrough()
        findNavController().navigate(
            FragmentMovieDirections.actiomToSheet(movie.poster_path,movie.overview, movie.title)
        )
    }
}
