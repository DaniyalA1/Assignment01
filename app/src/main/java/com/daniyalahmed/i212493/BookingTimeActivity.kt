package com.daniyalahmed.i212493

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatButton

class BookingTimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_time)
        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, MentorProfileActivity::class.java))
        }

        val bookButton: Button = findViewById(R.id.bookbutton1)

        bookButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this,  BookedSessionActivity::class.java))
        }
    }
}