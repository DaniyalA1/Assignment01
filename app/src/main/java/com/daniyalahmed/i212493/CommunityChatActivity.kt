package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CommunityChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community_chat)

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

        val callButton = findViewById<ImageButton>(R.id.callButton)

        callButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, VoiceCallActivity::class.java))
        }

        val videoButton = findViewById<ImageButton>(R.id.videoCallButton)

        videoButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, VideoCallActivity::class.java))
        }

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, ChatMenuActivity::class.java))
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
        val homeButton = findViewById<ImageButton>(R.id.homebutton)

        homeButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}