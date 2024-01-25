package com.route.islami_app.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.route.islami_app.R
import com.route.islami_app.ui.home.HomeScreenActivity

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