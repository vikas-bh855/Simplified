package com.retrofit.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.retrofit.movies.databinding.ItemMoviesBinding

class MoviesAdapter :
    ListAdapter<Movies, MoviesAdapter.MovieViewHolder>(MovieDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    // ViewHolder
    inner class MovieViewHolder(val itemMoviesBinding: ItemMoviesBinding) :
        RecyclerView.ViewHolder(itemMoviesBinding.root) {

        fun bind(movie: Movies) {
            itemMoviesBinding.apply {
                movies = movie
                executePendingBindings()
            }
        }
    }


    class MovieDiffUtil : DiffUtil.ItemCallback<Movies>() {
        override fun areItemsTheSame(oldItem: Movies, newItem: Movies): Boolean {
            return oldItem.poster_path == newItem.poster_path
        }

        override fun areContentsTheSame(oldItem: Movies, newItem: Movies): Boolean {
            return oldItem == newItem
        }
    }
}


