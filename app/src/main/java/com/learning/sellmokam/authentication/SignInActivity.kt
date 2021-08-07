package com.learning.sellmokam.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.learning.sellmokam.MainActivity
import com.learning.sellmokam.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

    fun continueSignIn(view: View) {
        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }

    fun forgetPassword(view: View) {
        intent = Intent(applicationContext, ForgetPasswordActivity::class.java)
        startActivity(intent)
    }
}