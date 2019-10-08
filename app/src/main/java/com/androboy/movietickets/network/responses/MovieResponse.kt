package com.androboy.movietickets.network.responses

import com.androboy.movietickets.data.vos.MovieVO
import com.androboy.movietickets.utils.CODE_RESPONSE_OK
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("code")
    val code: Int,

    @SerializedName("message")
    val message : String,

    @SerializedName("data")
    val data : List<MovieVO>

) {
    fun isResponseOk(): Boolean
    {
        return code == CODE_RESPONSE_OK && data != null
    }
}