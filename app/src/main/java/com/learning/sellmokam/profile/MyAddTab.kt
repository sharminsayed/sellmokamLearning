package com.learning.sellmokam.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learning.sellmokam.R

class MyAddTab : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.activity_my_add_tab, container, false)

        //  mView.findViewById(R.id.hello) as TextView
        /* view.btnSetup.setOnClickListener { view ->
             Log.d("btnSetup", "Selected")
         }*/

        // Return the fragment view/layout
        return rootView

    }
}