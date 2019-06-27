package com.yoesuv.navigationadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.yoesuv.navigationadvanced.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbarMain)
        bottomNavigation.itemIconTintList = null
        BottomNavigationViewHelper.disableShiftMode(bottomNavigation)

        setupNavigation()
        setupBottomNavigation()
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.fragmentMain).navigateUp()
    }

    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.fragmentMain)
        setupActionBarWithNavController( navController)
        NavigationUI.setupWithNavController(toolbarMain, navController)
    }

    private fun setupBottomNavigation() {
        bottomNavigation.setOnNavigationItemSelectedListener { menu ->
            when{
                menu.itemId == R.id.menuHome -> {  }
                menu.itemId == R.id.menuDashboard -> { }
                menu.itemId == R.id.menuNotification -> {  }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

}
