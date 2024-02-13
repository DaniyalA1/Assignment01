package com.daniyalahmed.i212493

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Post a delayed action to switch to the login activity after 2 seconds
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Finish current activity so the user can't go back
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}