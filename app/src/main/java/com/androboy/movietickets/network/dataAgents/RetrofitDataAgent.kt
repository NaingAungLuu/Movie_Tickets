package com.androboy.movietickets.network.dataAgents

import com.androboy.movietickets.data.vos.MovieVO
import com.androboy.movietickets.network.MovieApi
import com.androboy.movietickets.network.responses.MovieResponse
import com.androboy.movietickets.utils.BASE_URL
import com.androboy.movietickets.utils.ERROR_MESSAGE
import com.androboy.movietickets.utils.GET_MOVIES_URL
import okhttp3.OkHttpClient
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import java.sql.Time
import java.util.concurrent.TimeUnit

object RetrofitDataAgent : MovieDataAgent {

    private val movieApi: MovieApi

    init {

        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

        val retroFit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        movieApi = retroFit.create(MovieApi::class.java)
    }


    override fun getAllMovies(
        accessToken: String,
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (errorMessage: String) -> Unit
    ) {
        val call = movieApi.getAllMovies(accessToken)
        call.enqueue(object : Callback<MovieResponse> {

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {

                val movieResponse = response.body()

                if(movieResponse != null) {
                    if(movieResponse.isResponseOk())
                    {
                        onSuccess(movieResponse.data)
                    }
                    else
                    {
                        onFailure(movieResponse.message)
                    }

                }
                else
                {
                    onFailure(ERROR_MESSAGE)
                }


            }

        })
    }
}