package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class BookedSessionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booked_session)

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, OwnProfileActivity::class.java))
        }

    }
}