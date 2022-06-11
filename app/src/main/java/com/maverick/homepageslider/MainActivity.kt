package com.maverick.homepageslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private val titles = arrayOf("Home", "Explore", "Setting")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager: ViewPager2 = findViewById<ViewPager2>(R.id.pager)
        viewpager.adapter = PageAdapter(this)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            tab.text = titles[position]
        }.attach()

        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_baseline_home_24)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_baseline_explore_24)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_baseline_settings_24)
    }
}