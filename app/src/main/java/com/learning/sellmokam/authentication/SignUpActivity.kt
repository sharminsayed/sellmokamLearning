package com.learning.sellmokam.authentication

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.learning.sellmokam.R


class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
      // handleActionBar()

    }

    fun handleActionBar(){

        val actionBar: ActionBar?
        actionBar = supportActionBar
        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        val colorDrawable = ColorDrawable(Color.parseColor("#D7C8CA"))

        // Set BackgroundDrawable
        actionBar!!.setBackgroundDrawable(colorDrawable)
    }

    fun continueSignUp(view: View) {
        intent = Intent(applicationContext, AccountVerifyActivity::class.java)
        startActivity(intent)
    }


}