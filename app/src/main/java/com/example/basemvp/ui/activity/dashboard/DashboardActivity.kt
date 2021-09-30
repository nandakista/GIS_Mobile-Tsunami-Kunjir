package com.example.basemvp.ui.activity.dashboard

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.basemvp.R
import com.example.basemvp.ui.activity.about_tsunami.AboutTsunamiActivity
import com.example.basemvp.ui.activity.about_us.AboutUsActivity
import com.example.basemvp.ui.activity.sig.SigActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.item_popup_success.*

class DashboardActivity : AppCompatActivity() {

    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        if (Build.VERSION.SDK_INT >= 21) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)
        }

        val intent = Intent()
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        showPopUp()
        onClickListener()
    }

    private fun showPopUp() {
        val epicDialog = Dialog(this)
        epicDialog.setContentView(R.layout.item_popup_success)
        epicDialog.tv_popup_title.text = "Selamat Datang !"
        epicDialog.tv_popup_message.text = "Selamat datang di prototype aplikasi Sistem Informasi Geografis (SIG) ini.."
        epicDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        epicDialog.show()

        epicDialog.btn_popup_ok.setOnClickListener {
            epicDialog.dismiss()
//            finish()
        }
    }

    private fun onClickListener() {
        go_sig.setOnClickListener {
            startActivity(Intent(this, SigActivity::class.java))
        }

        go_aboutUs.setOnClickListener {
            startActivity(Intent(this, AboutUsActivity::class.java))
        }

        go_sejarah.setOnClickListener {
            startActivity(Intent(this, AboutTsunamiActivity::class.java))
        }

        go_covid_info.setOnClickListener {
            // startActivity(Intent(this, ))
            Toast.makeText(this, "Coming Soon Fitur !", Toast.LENGTH_LONG).show()
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
//        val intent = Intent()
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        startActivity(intent)
//        finish()
    }
}
