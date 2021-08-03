package com.learning.sellmokam.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
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
        tabLayout = rootView.findViewById(R.id.tabLayout)
        viewPager = rootView.findViewById(R.id.viewPager)


        //  mView.findViewById(R.id.hello) as TextView
        /* view.btnSetup.setOnClickListener { view ->
             Log.d("btnSetup", "Selected")
         }*/

        // Return the fragment view/layout
        handleTabLayout()
        return rootView

    }

    fun handleTabLayout() {
        Log.d(TAG, "handleTabLayout: creating")
        tabLayout.addTab(tabLayout.newTab().setText("For you"))
        tabLayout.addTab(tabLayout.newTab().setText("Looking opportunity"))
        tabLayout.addTab(tabLayout.newTab().setText("Market place"))
        tabLayout.addTab(tabLayout.newTab().setText("Category"))
        tabLayout.tabGravity = TabLayout.GRAVITY_CENTER

        Log.d(TAG, "handleTabLayout: tab no "+tabLayout.tabCount)
        val adapter = HomeTabAdapter(this)
        viewPager.adapter = adapter

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


}