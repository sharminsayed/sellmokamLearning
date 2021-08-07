package com.learning.sellmokam.home

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.learning.sellmokam.adapter.HomeTabAdapter
import com.learning.sellmokam.R

class HomeFragment : Fragment() {
    val TAG: String = "HomeFragment"
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        tabLayout = rootView.findViewById(R.id.tab_layout)
        viewPager = rootView.findViewById(R.id.tabs_viewpager)


        handleTabLayout()
        return rootView

    }

    fun handleTabLayout() {
       // tabLayout.setSelectedTabIndicatorColor(R.color.btn)

        val numberOfTabs = 4
       // tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.isInlineLabel = true

        val adapter = HomeTabAdapter(childFragmentManager, lifecycle, numberOfTabs)

        viewPager.adapter = adapter
        viewPager.isUserInputEnabled = true

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "For you"
                        // tab.setIcon(R.drawable.ic_music)
                }
                1 -> {
                    tab.text = "Looking oppertnity"
                   // tab.setIcon(R.drawable.ic_movie)

                }
                2 -> {
                    tab.text = "Market place"
                   // tab.setIcon(R.drawable.ic_book)
                }
                3 -> {
                    tab.text = "Category"
                    // tab.setIcon(R.drawable.ic_book)
                }

            }
            // Change color of the icons
            tab.icon?.colorFilter =
                BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                    Color.WHITE,
                    BlendModeCompat.SRC_ATOP
                )
        }.attach()



    }

}





/*

tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
        Log.d(TAG, "handleTabLayout: finished")

    }


}*/
