package com.example.basemvp.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.basemvp.R
import com.example.basemvp.common.constant.AppConstants
import com.example.basemvp.ui.activity.dashboard.DashboardActivity


class SplashActivity : AppCompatActivity() {

    private val TAG = "SplashActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)
        Handler().postDelayed({
            startActivity(Intent(this, DashboardActivity::class.java))
//            finish()
        }, AppConstants.SPLASH_TIME_MILLISECOND)
    }
}

