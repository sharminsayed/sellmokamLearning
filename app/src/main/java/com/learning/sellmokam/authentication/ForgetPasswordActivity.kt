package com.learning.sellmokam.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.learning.sellmokam.R

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
    }

    fun handleForgetPaaword(view: View) {
        intent = Intent(applicationContext, ForgetPasswordConfrimActivity::class.java)
        startActivity(intent)
    }
}