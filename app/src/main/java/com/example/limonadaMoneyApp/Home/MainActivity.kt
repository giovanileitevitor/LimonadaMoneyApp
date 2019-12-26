package com.example.limonadaMoneyApp.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.limonadaMoneyApp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("CicloActivity", "Passed over onCreate")
        setContentView(R.layout.activity_main)

        NavigationUI.setupActionBarWithNavController(
            this, Navigation.findNavController(this,
                R.id.navHost
            )
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.navHost).navigateUp()
    }
}
