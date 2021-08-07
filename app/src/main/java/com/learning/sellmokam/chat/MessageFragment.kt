package com.learning.sellmokam.chat

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.learning.sellmokam.R
import com.learning.sellmokam.adapter.HomeTabAdapter
import com.learning.sellmokam.adapter.MessageTabAdapter

class MessageFragment : Fragment() {
    val TAG: String = "HomeFragment"
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_message, container, false)
        tabLayout = rootView.findViewById(R.id.tab_layout)
        viewPager = rootView.findViewById(R.id.tabs_viewpager)


        handleTabLayout()
        return rootView

    }

    fun handleTabLayout() {
        // tabLayout.setSelectedTabIndicatorColor(R.color.btn)

        val numberOfTabs = 2
        // tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.isInlineLabel = true

        val adapter = MessageTabAdapter(childFragmentManager, lifecycle, numberOfTabs)

        viewPager.adapter = adapter
        viewPager.isUserInputEnabled = true

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "All message"
                    // tab.setIcon(R.drawable.ic_music)
                }
                1 -> {
                    tab.text = "Group message"
                    // tab.setIcon(R.drawable.ic_movie)

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