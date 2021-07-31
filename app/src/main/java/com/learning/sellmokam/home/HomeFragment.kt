package com.learning.sellmokam.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import com.learning.sellmokam.R

class HomeFragment : Fragment() {
    lateinit var mView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        mView = inflater!!.inflate(R.layout.fragment_home, container, false)
      //  mView.findViewById(R.id.hello) as TextView
       /* view.btnSetup.setOnClickListener { view ->
            Log.d("btnSetup", "Selected")
        }*/

        // Return the fragment view/layout
        return view

    }


}