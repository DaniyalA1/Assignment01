package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        val LoginButton = findViewById<Button>(R.id.login)

        LoginButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }

        val signUpButton = findViewById<Button>(R.id.signup)

        signUpButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, VerifyPhoneNumberActivity::class.java))
        }
    }
}