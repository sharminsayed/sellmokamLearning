package com.learning.sellmokam.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

import com.learning.sellmokam.chat.MessageFragment
import com.learning.sellmokam.home.CategoryFragment
import com.learning.sellmokam.home.ForYouFragment
import com.learning.sellmokam.home.LookForOppertunityFragment
import com.learning.sellmokam.home.MarketPlaceFragment


/**
 * @author : Sharmin Sayed
 * @date : 31-Jul-2021 11:28 PM
 * -:=Envisage=:--:=Compose=:--:=Creative=:-
 * Copyright (C) 2021 - All Rights Reserved
 **/

class HomeTabAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 4;
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ForYouFragment();
        when (position) {
            0 -> {
                return ForYouFragment()
            }
            1 -> {
                return LookForOppertunityFragment()
            }
            2 -> {

                return MarketPlaceFragment()
            }
            3 -> {

                return CategoryFragment()
            }
            else -> return fragment;
        }
    }

//    override fun getItem(position: Int): Fragment {
//        when (position) {
//            0 -> {
//                //  val homeFragment: HomeFragment = HomeFragment()
//                return SettingsFragment()
//            }
//            1 -> {
//                return MessageFragment()
//            }
//            2 -> {
//                // val movieFragment = MovieFragment()
//                return ProfileFragment()
//            }
//            else -> return
//        }
//    }

    // this is for fragment tabs
    /* override fun getItem(position: Int): Fragment? {
         when (position) {
             0 -> {
                 //  val homeFragment: HomeFragment = HomeFragment()
                 return SettingsFragment()
             }
             1 -> {
                 return MessageFragment()
             }
             2 -> {
                 // val movieFragment = MovieFragment()
                 return ProfileFragment()
             }
             else -> return null
         }
     }
 */
    // this counts total number of tabs
//    override fun getCount(): Int {
//        return totalTabs
//    }


}