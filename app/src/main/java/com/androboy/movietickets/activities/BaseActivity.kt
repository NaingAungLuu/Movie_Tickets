package com.androboy.movietickets.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androboy.movietickets.data.models.MovieModel
import com.androboy.movietickets.data.models.MovieModelmpl

abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var model : MovieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = MovieModelmpl
    }


}