package com.example.facebookad


import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import com.facebook.ads.*
import com.facebook.ads.AdSize
import com.facebook.ads.AdView



class MainActivity : ComponentActivity() {
    private lateinit var adView: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adView = AdView(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50)
        //val adContainer = findViewById<View>(R.id.banner_container) as LinearLayout
        val adContainer = findViewById<LinearLayout>(R.id.banner_container)
        adContainer.addView(adView)
        adView.loadAd()
    }
    override fun onDestroy() {
        if (adView != null) {
            adView.destroy()
        }
        super.onDestroy()
    }
}
