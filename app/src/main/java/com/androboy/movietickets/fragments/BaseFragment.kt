package com.androboy.movietickets.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.androboy.movietickets.adapter.movieImageViewAdapter
import com.androboy.movietickets.data.models.MovieModel
import com.androboy.movietickets.data.models.MovieModelmpl
import com.androboy.movietickets.data.vos.MovieVO
import com.androboy.movietickets.utils.ERROR_MESSAGE
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_movies.*

abstract class BaseFragment : Fragment() {

    protected lateinit var model : MovieModel
    protected lateinit var movieList : MutableList<MovieVO>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = MovieModelmpl
    }

    fun showSnackBarWithButton (msg : String , action : String , adapter: movieImageViewAdapter)
    {
        Snackbar.make(rootView , msg , Snackbar.LENGTH_LONG).setAction(action) {
            fetchData(adapter)
        }.show()
    }

    protected fun fetchData(adapter: movieImageViewAdapter)
    {
        model.getMovies(onSuccess = { movies ->
            pbLoading?.visibility= View.INVISIBLE
            adapter.setNewData(movies.toMutableList())

        }, onFailure = { msg ->
            pbLoading?.visibility= View.INVISIBLE
            showSnackBarWithButton(msg , "Retry" , adapter)
        })
    }

}