package com.learning.sellmokam.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.learning.sellmokam.R
import com.learning.sellmokam.post.OtherPostDetailsActivity

class GroupMessageActivity : Fragment() {
    lateinit var linearLayout: LinearLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.activity_group_message, container, false)
        linearLayout=rootView.findViewById(R.id.demo)
        linearLayout.setOnClickListener {
            val  intent = Intent(context, OtherPostDetailsActivity::class.java)
            startActivity(intent)
        }
        return rootView

    }

}