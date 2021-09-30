package com.example.basemvp.ui.activity.about_tsunami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.basemvp.R
import kotlinx.android.synthetic.main.activity_about_tsunami.*

class AboutTsunamiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_tsunami)

        bb_Tsunami.setOnClickListener {
            finish()
        }

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://upload.wikimedia.org/wikipedia/commons/a/a5/Anak_Krakatau-2.JPG",
            true))
        imageList.add(SlideModel("https://upload.wikimedia.org/wikipedia/commons/c/c1/Sunda_Strait_Tsunami_affected_2018.jpg"))
        imageList.add(SlideModel("https://upload.wikimedia.org/wikipedia/commons/1/13/Anak_Krakatau_2018-12-20_Landsat_8_T1_SR.jpg", "Citra surface reflectance Anak Krakatau dari satelit Landsat 8, dua hari sebelum erupsinya"))
        imageList.add(SlideModel("https://upload.wikimedia.org/wikipedia/commons/2/25/Sunda_strait_tsunami_concert.jpg", "Dampak dari Tsunami 2018 di Kunjir"))
        val imageSlider = findViewById<ImageSlider>(R.id.iv_detail_photo_tsunami)
        imageSlider.setImageList(imageList)
    }
}
