package com.yoesuv.navigationadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yoesuv.navigationadvanced.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbarMain)
        bottomNavigation.itemIconTintList = null
        BottomNavigationViewHelper.disableShiftMode(bottomNavigation)
    }
}
