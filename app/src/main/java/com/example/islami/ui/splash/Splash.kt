package com.example.islami.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.islami.R
import com.example.islami.ui.home.HomeActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startHomeActivity()
        }, 2000)
    }

     fun startHomeActivity() {
       val intent = Intent(this, HomeActivity::class.java)
         startActivity(intent)
         finish()
    }
}
