package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ChatMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_menu)

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

        val homeButton = findViewById<ImageButton>(R.id.homebutton)

        homeButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))

        }

        val chatButton = findViewById<ImageButton>(R.id.chatbutton)

        chatButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, ChatMenuActivity::class.java))

        }

        val text1boxButton = findViewById<TextView>(R.id.textbox)

        text1boxButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, ChatActivity::class.java))

        }

        val profileButton = findViewById<ImageButton>(R.id.personbutton)

        profileButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, OwnProfileActivity::class.java))
        }

        val communityButton: TextView = findViewById(R.id.cm1)

        communityButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, CommunityChatActivity::class.java))

        }

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}