package com.learning.sellmokam.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import com.learning.sellmokam.R
import com.learning.sellmokam.post.OtherPostDetailsActivity
import com.learning.sellmokam.post.PostDetailsActivity

class MyFabTab : Fragment() {
    lateinit var relativeLayout: RelativeLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.activity_my_fab_tab, container, false)
        relativeLayout=rootView.findViewById(R.id.demo)
        relativeLayout.setOnClickListener {
            val  intent = Intent(context, PostDetailsActivity::class.java)
            startActivity(intent)
        }


        return rootView

    }
}