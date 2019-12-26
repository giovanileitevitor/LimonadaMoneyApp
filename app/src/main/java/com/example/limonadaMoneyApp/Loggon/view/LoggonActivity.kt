package com.example.limonadaMoneyApp.Loggon.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import com.example.limonadaMoneyApp.R

class LoggonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("CicloActivity", "Passed over onCreate")
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_loggon)

        initObservers()

        initListeners()

    }

    private fun initObservers(){

    }

    private fun initListeners(){


    }
}
