package com.androboy.movietickets.adapter

import androidx.viewpager.widget.PagerAdapter
import com.androboy.movietickets.data.vos.MovieVO


abstract class BasePagerAdapter<T> : PagerAdapter() {

    protected var dataList : MutableList<T> = ArrayList()

    val movie1 = MovieVO(0 , "IT Chapter Two" , 7.4f , 59 , 48 , null , "" , "" )
    val movie2 = MovieVO(0 , "Annabelle Comes Home" , 9.1f , 90 , 87 , null , "" , "" )
    val movie3 = MovieVO(0 , "47 metres down" , 4.4f , 88 , 48 , null , "" , "" )
    val movie4 = MovieVO(0 , "Spideman Far From Home" , 9.6f , 66 , 90 , null , "" , "" )
    val movies : List<MovieVO>? = listOf(movie1 , movie2 , movie3 , movie4)

    fun setNewData(newData : MutableList<T>){
        dataList = newData
        notifyDataSetChanged()
    }

    fun appendNewData(newData: MutableList<T>)
    {
        dataList = newData
        notifyDataSetChanged()
    }



}