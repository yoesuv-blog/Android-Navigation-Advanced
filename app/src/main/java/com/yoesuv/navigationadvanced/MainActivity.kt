package com.yoesuv.navigationadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbarMain)
        bottomNavigation.itemIconTintList = null

        setupNavigation()
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.fragmentMain).navigateUp()
    }

    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.fragmentMain)
        setupActionBarWithNavController( navController)
        NavigationUI.setupWithNavController(bottomNavigation, navController)
    }

    fun hideNavigation(value: Boolean) {
        if (value) {
            bottomNavigation.visibility = View.GONE
        } else {
            bottomNavigation.visibility = View.VISIBLE
        }
    }

}
