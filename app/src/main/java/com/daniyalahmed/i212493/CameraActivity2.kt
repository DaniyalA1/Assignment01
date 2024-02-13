package com.daniyalahmed.i212493

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CameraActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera2)

        val photoButton = findViewById<Button>(R.id.photo)

        photoButton.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }

        val photoBt = findViewById<ImageButton>(R.id.photobt)

        photoBt.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}