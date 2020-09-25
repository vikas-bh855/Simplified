package com.retrofit.movies

import android.os.Bundle
import androidx.navigation.NavArgs
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.IllegalArgumentException

@Suppress("CAST_NEVER_SUCCEEDS")
class MovieDirections constructor(val movies: Movies) : NavDirections {
    override fun getArguments(): Bundle =
        Bundle().apply {
            putString("poster", movies.poster_path)
            putString("overview", movies.overview)
            putString("title", movies.title)
        }

    override fun getActionId(): Int = R.id.actiom_to_sheet
}