package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, MentorProfileActivity::class.java))
        }

        val submitButton = findViewById<Button>(R.id.submit)

        submitButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, MentorProfileActivity::class.java))
        }
    }
}