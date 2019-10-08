package com.androboy.movietickets.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.androboy.movietickets.fragments.MovieListFragment

class TabPagerAdapter(fm : FragmentManager):
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{
    override fun getItem(position: Int): Fragment {
        return MovieListFragment()
    }

    override fun getCount(): Int {

        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position)
        {
            0 -> "Now Showing"
            1 -> "Cinema"
            else -> "Coming Soon"
        }

    }
}