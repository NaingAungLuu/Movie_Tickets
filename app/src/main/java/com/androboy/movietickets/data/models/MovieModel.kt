package com.androboy.movietickets.data.models

import com.androboy.movietickets.data.vos.MovieVO

interface MovieModel {

    fun getMovies(
        onSuccess : (List<MovieVO>) -> Unit,
        onFailure : (String) -> Unit
    )

}