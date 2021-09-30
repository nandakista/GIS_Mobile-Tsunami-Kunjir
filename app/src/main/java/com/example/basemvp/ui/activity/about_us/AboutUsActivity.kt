package com.example.basemvp.ui.activity.about_us

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basemvp.R
import kotlinx.android.synthetic.main.activity_about_us.*

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        tb_AboutUs.setOnClickListener {
            finish()
        }
    }
}
