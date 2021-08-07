package com.learning.sellmokam.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.learning.sellmokam.R
import com.learning.sellmokam.post.OtherPostDetailsActivity


class ForYouFragment : Fragment() {
    lateinit var linearLayout: LinearLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_for_you, container, false)
        linearLayout=rootView.findViewById(R.id.demo)
        linearLayout.setOnClickListener {
          val  intent = Intent(context, OtherPostDetailsActivity::class.java)
            startActivity(intent)
        }
        return rootView

    }

}