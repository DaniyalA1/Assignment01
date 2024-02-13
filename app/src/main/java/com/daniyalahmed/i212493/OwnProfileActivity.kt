package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class OwnProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_own_profile)

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))
        }

        val searchButton = findViewById<ImageButton>(R.id.searchbutton)

        searchButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, SearchActivity::class.java))
        }

        val plusButton = findViewById<ImageButton>(R.id.plusbutton)

        plusButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, AddMentorActivity::class.java))
        }

        val chatButton = findViewById<ImageButton>(R.id.chatbutton)

        chatButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, ChatMenuActivity::class.java))
        }

        val profileButton = findViewById<ImageButton>(R.id.personbutton)

        profileButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, OwnProfileActivity::class.java))
        }

        val editButton1 = findViewById<ImageButton>(R.id.editButton1)

        editButton1.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, EditProfileActivity::class.java))
        }

        val editButton2 = findViewById<ImageButton>(R.id.editButton2)

        editButton2.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, EditProfileActivity::class.java))
        }

        val bookedButton = findViewById<TextView>(R.id.yellowbox1)

        bookedButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, BookedSessionActivity::class.java))
        }

        val homeButton = findViewById<ImageButton>(R.id.homebutton)

        homeButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))
        }


    }
}