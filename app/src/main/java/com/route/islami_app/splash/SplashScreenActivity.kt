package com.route.islami_app.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.route.islami_app.R
import com.route.islami_app.splash.home.HomeScreenActivity
import kotlinx.coroutines.delay

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        starthomescreen()
    }

    private fun starthomescreen() {
        Handler(Looper.getMainLooper()).postDelayed(
            {
                var intent = Intent(this@SplashScreenActivity, HomeScreenActivity::class.java)
                startActivity(intent)
                finish()
            },2000)

    }
}