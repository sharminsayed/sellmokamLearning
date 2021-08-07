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


/**
 * @author : Sharmin Sayed
 * @date : 31-Jul-2021 11:28 PM
 * -:=Envisage=:--:=Compose=:--:=Creative=:-
 * Copyright (C) 2021 - All Rights Reserved
 **/

class HomeTabAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) : FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                val musicFragment = ForYouFragment()
                return musicFragment
            }
            1 -> {

                val moviesFragment = LookForOppertunityFragment()
                return moviesFragment
            }
            2 -> {

                val booksFragment = MarketPlaceFragment()
                return booksFragment
            }
            3 -> {
                val booksFragment = CategoryFragment()
                return booksFragment
            }
            else -> return ForYouFragment()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}

