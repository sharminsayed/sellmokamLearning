package com.learning.sellmokam.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

import com.learning.sellmokam.chat.MessageFragment
import com.learning.sellmokam.home.CategoryFragment
import com.learning.sellmokam.home.ForYouFragment
import com.learning.sellmokam.home.LookForOppertunityFragment
import com.learning.sellmokam.home.MarketPlaceFragment
import com.learning.sellmokam.profile.MyAddTab
import com.learning.sellmokam.profile.MyFabTab
import com.learning.sellmokam.profile.MyProfileTab


/**
 * @author : Sharmin Sayed
 * @date : 31-Jul-2021 11:28 PM
 * -:=Envisage=:--:=Compose=:--:=Creative=:-
 * Copyright (C) 2021 - All Rights Reserved
 **/

class ProfileTabAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) : FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                // # Music Fragment

                val myProfileTab = MyProfileTab()
                return myProfileTab
            }
            1 -> {
                // # Movies Fragment
                val fabTab = MyFabTab()
                return fabTab
            }
            2 -> {
                // # Books Fragment
                val myAddTab = MyAddTab()
                return myAddTab
            }

            else -> return ForYouFragment()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}


/*
class HomeTabAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 4;
    }

    override fun createFragment(position: Int): Fragment {
      //  val fragment = ForYouFragment();
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
            else -> return null;
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
    */
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
 *//*

    // this counts total number of tabs
//    override fun getCount(): Int {
//        return totalTabs
//    }


}*/
