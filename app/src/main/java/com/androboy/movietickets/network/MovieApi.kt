package com.androboy.movietickets.network

import com.androboy.movietickets.network.responses.MovieResponse
import com.androboy.movietickets.utils.GET_MOVIES_URL
import com.androboy.movietickets.utils.PARAM_ACCESS_TOKEN
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MovieApi {

    @POST(GET_MOVIES_URL)
    @FormUrlEncoded
    fun getAllMovies(@Field(PARAM_ACCESS_TOKEN)accessToken : String) : Call<MovieResponse>
}