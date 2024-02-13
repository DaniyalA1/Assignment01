package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

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

        val notifyButton = findViewById<ImageButton>(R.id.notificationButton)

        notifyButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, NotficatonActivity::class.java))
        }

        val homeButton = findViewById<ImageButton>(R.id.homebutton)

        homeButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))
        }

        val cardButton = findViewById<CardView>(R.id.cardView1)

        cardButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, MentorProfileActivity::class.java))
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

    }
}