package com.conamobile.pdpviewpagerfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var TAG:String = MainActivity::class.java.toString()
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.add(PageOneFragment(), "Page1")
        viewPagerAdapter.add(PageTwoFragment(), "Page2")
        viewPager.adapter = viewPagerAdapter
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}