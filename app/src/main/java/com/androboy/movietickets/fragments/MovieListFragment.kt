package com.androboy.movietickets.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.androboy.movietickets.R
import com.androboy.movietickets.adapter.movieImageViewAdapter
import com.androboy.movietickets.data.models.MovieModelmpl
import com.androboy.movietickets.data.vos.MovieVO
import com.androboy.movietickets.utils.ERROR_MESSAGE
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_movies.*
import kotlinx.android.synthetic.main.fragment_movies.view.*
import kotlinx.android.synthetic.main.movie_infos.*
import kotlinx.android.synthetic.main.movie_infos.view.*

class MovieListFragment : BaseFragment() {


    @SuppressLint("NewApi")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_movie_detail , container  , false)
//        val adapter = movieImageViewAdapter()
//        view.movieImageViewPager.adapter = adapter
//
//        fetchData(adapter)
//
//        view.movieImageViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
//            override fun onPageScrollStateChanged(state: Int) {}
//
//            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {}
//
//            override fun onPageSelected(position: Int) {
//                println("Current Movie Number : $position")
//                setData(movieList.get(position))
//            }
//        })
//
//
//
//        val animation = AnimationUtils.loadAnimation(context , R.anim.bouncing_arrow)
//        view.ivDownArrow.startAnimation(animation)

        return view
    }

    fun setData(movieData: MovieVO)
    {
        tv_movie_name.text=movieData.movieName.toString()
        tvImdb.text=movieData.imdb.toString()
        tvRottenTomato.text = movieData.rottenTomato.toString() + "%"
        tvMetacritics.text = movieData.metaCentric.toString() + "%"
        tv_movie_category.text = movieData.getGenreString()
    }




}