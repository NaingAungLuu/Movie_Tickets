package com.androboy.movietickets.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androboy.movietickets.R
import com.androboy.movietickets.adapter.TabPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = TabPagerAdapter(supportFragmentManager)
        tabViewPager.adapter = adapter
        tabLayout.setupWithViewPager(tabViewPager)
    }
}
