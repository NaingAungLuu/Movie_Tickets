package com.androboy.movietickets.network.dataAgents

import com.androboy.movietickets.data.vos.MovieVO
import com.androboy.movietickets.network.MovieApi

interface MovieDataAgent {

    fun getAllMovies(
        accessToken: String,
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (errorMessage: String) -> Unit
    )
}