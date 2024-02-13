package com.daniyalahmed.i212493

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val forgetPasswordButton = findViewById<Button>(R.id.forgetpassword)

        forgetPasswordButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, ForgetPasswordActivity::class.java))
        }

        val loginButton = findViewById<Button>(R.id.login)

        loginButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))
        }

        val SignupButton = findViewById<Button>(R.id.signup)

        SignupButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}


