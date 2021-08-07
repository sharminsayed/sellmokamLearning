package com.learning.sellmokam.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.learning.sellmokam.R

class AccountVerifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_verify)
    }

    fun handleVerifyAccount(view: View) {
        intent = Intent(applicationContext, SignInActivity::class.java)
        startActivity(intent)
    }
}