package com.androboy.movietickets.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.androboy.movietickets.R
import com.androboy.movietickets.data.vos.MovieVO
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_movies.*
import kotlinx.android.synthetic.main.movie_image_view_item.view.*

class movieImageViewAdapter : BasePagerAdapter<MovieVO>() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return (view == `object`)
    }

    override fun getCount(): Int {
       return dataList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = LayoutInflater.from(container.context)
        val view = layoutInflater.inflate(R.layout.movie_image_view_item , container ,false)

        Glide.with(view).load(dataList[position].poster).into(view.ivMoviePoster)

        view.setOnClickListener {
//            delegate.onTapMovie()
        }


        container.addView(view)
        return view
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
       container.removeView(`object` as View)
    }



}