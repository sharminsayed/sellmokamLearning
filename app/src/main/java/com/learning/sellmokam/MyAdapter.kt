package com.learning.sellmokam

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.learning.sellmokam.authentication.ProfileFragment
import com.learning.sellmokam.chat.MessageFragment
import com.learning.sellmokam.settings.SettingsFragment

/**
 * @author : Sharmin Sayed
 * @date : 31-Jul-2021 11:28 PM
 * -:=Envisage=:--:=Compose=:--:=Creative=:-
 * Copyright (C) 2021 - All Rights Reserved
 **/

class MyAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3;
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = SettingsFragment();
        when (position) {
            0 -> {
                return SettingsFragment()
            }
            1 -> {
                return MessageFragment()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                return ProfileFragment()
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