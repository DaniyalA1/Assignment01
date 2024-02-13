package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class VerifyPhoneNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_phone_number)

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        val verifyButton = findViewById<Button>(R.id.verify)

        verifyButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}