package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MentorProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_profile)

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))
        }

        val bookButton = findViewById<Button>(R.id.book)

        bookButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, BookingTimeActivity::class.java))
        }

        val ratingButton = findViewById<TextView>(R.id.yellowbox1)

        ratingButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, RatingActivity::class.java))
        }
    }
}