package com.example.notificationservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonStart = findViewById<Button>(R.id.buttonStart)
        val buttonStop = findViewById<Button>(R.id.buttonStop)
        buttonStart.setOnClickListener {
            ForegroundService.startService(this, "Foreground Service is running...")
        }
        buttonStop.setOnClickListener {
            ForegroundService.stopService(this)
        }
    }
}