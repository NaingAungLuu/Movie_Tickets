package com.androboy.movietickets.data.models

import com.androboy.movietickets.data.vos.MovieVO
import com.androboy.movietickets.utils.ACCESS_TOKEN

object MovieModelmpl : BaseModel() , MovieModel {

    override fun getMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {
        dataAgent.getAllMovies(
            ACCESS_TOKEN,
            onSuccess,
            onFailure
        )
    }

}