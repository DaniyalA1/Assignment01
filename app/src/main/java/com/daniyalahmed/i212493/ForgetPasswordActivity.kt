package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        val loginButton = findViewById<Button>(R.id.login)

        loginButton.setOnClickListener {
            // Start the LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }

        val sendButton = findViewById<Button>(R.id.send)

        sendButton.setOnClickListener {
            // Start the LoginActivity
            startActivity(Intent(this, ResetPasswordActivity::class.java))
        }
    }
}