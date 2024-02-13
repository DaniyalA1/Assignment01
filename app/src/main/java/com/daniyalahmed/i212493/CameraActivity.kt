package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)


        val vidButton = findViewById<Button>(R.id.video)

        vidButton.setOnClickListener {
            startActivity(Intent(this, CameraActivity2::class.java))
        }

        val videoButton = findViewById<ImageButton>(R.id.videobutton)

        videoButton.setOnClickListener {
            startActivity(Intent(this, CameraActivity2::class.java))
        }
    }

}