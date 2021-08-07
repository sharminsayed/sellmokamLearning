package com.learning.sellmokam.authentication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.learning.sellmokam.MainActivity
import com.learning.sellmokam.R

@Suppress("DEPRECATION")
class Splash_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }


    }



   /* fun checkLogin(){
        Splashy(this).setInfiniteDuration(true).show()   // For JAVA : new Splashy(this)

        // Some mock example response operation
        Response.onResponse(object  : Response.onResponse{
            override fun onResponse(response){
                Splashy.hide()				// Hide after operation
            }

        }

                // Listener for completion of splash screen
                Splashy.onComplete(object : Splashy.OnComplete {
            override fun onComplete() {
                Toast.makeText(this@MainActivity, "Logged In", Toast.LENGTH_SHORT).show()
            }

        })
    }*/
