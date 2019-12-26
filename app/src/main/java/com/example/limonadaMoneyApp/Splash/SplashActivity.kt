package com.example.limonadaMoneyApp.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.limonadaMoneyApp.Loggon.view.LoggonActivity
import com.example.limonadaMoneyApp.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT : Long = 3000
    private lateinit var myHandler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("CicloActivity", "Passed over onCreate")
        setContentView(R.layout.activity_splash)

        myHandler = Handler()
        myHandler.postDelayed(
            {
            gotoLoginActivity()
            },
            SPLASH_TIME_OUT
        )
    }

    private fun gotoLoginActivity(){
        val intent = Intent(applicationContext, LoggonActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.i("CicloActivity", "Passed over onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CicloActivity", "Passed over onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CicloActivity", "Passed over onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CicloActivity", "Passed over onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloActivity", "Passed over onDestroy")
    }
}