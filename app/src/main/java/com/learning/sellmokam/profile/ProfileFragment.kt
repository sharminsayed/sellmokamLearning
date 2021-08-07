package com.learning.sellmokam.profile

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
import com.learning.sellmokam.adapter.ProfileTabAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {


    val TAG: String = "profileFragment"
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_profile, container, false)
        tabLayout = rootView.findViewById(R.id.tab_layout)
        viewPager = rootView.findViewById(R.id.tabs_viewpager)


        handleTabLayout()
        return rootView

    }

    fun handleTabLayout() {
        // tabLayout.setSelectedTabIndicatorColor(R.color.btn)

        val numberOfTabs = 3
        // tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.isInlineLabel = true

        val adapter = ProfileTabAdapter(childFragmentManager, lifecycle, numberOfTabs)

        viewPager.adapter = adapter
        viewPager.isUserInputEnabled = true

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "My Profile"
                    // tab.setIcon(R.drawable.ic_music)
                }
                1 -> {
                    tab.text = "My Fabourite"
                    // tab.setIcon(R.drawable.ic_movie)

                }
                2 -> {
                    tab.text = "My Add"
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