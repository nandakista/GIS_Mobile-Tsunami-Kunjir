package com.example.basemvp.ui.activity.sig

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.webkit.WebViewClient
import com.example.basemvp.R
import kotlinx.android.synthetic.main.activity_sig.*

class SigActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sig)

        //TOOLBAR
        setSupportActionBar(tb_sig)
        supportActionBar?.title = "Peta Dampak Tsunami 2018 pada Kunjir"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        layout_gis.webViewClient = WebViewClient()
        layout_gis.loadUrl("https://nandakista.github.io/SIG")
        val webSettings = layout_gis.settings
        webSettings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        if(layout_gis.canGoBack()) {
            layout_gis.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
