package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class VideoCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_call)

        val crossButton = findViewById<ImageButton>(R.id.crossbutton)

        crossButton.setOnClickListener {
            // Start the ForgetPasswordActivity
            startActivity(Intent(this, ChatActivity::class.java))
        }
    }
}