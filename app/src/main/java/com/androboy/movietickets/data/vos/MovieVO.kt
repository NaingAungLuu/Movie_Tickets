package com.androboy.movietickets.data.vos

import androidx.room.util.StringUtil
import com.google.gson.annotations.SerializedName

data class MovieVO(
    @SerializedName("id")
    val id: Int,

    @SerializedName("movie_name")
    val movieName: String,

    @SerializedName("imdb")
    val imdb: Float,

    @SerializedName("rotten_tomato")
    val rottenTomato: Int,

    @SerializedName("meta_centric")
    val metaCentric: Int,

    @SerializedName("genre")
    val genre: List<GenreVO>?,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("poster")
    val poster: String


) {

    fun getGenreString(): String {
        var result = ""
        genre?.forEach {
            result += "${it.name} / "
        }
        return result.removeSuffix("/ ")
    }

}