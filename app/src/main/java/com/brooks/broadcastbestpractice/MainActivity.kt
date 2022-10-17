package com.brooks.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import com.brooks.broadcastbestpractice.databinding.ActivityMainBinding


class MainActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.forceOffline.setOnClickListener {
            val intent = Intent("com.brooks.broadcastbestpractice.FORCE_OFFLINE")
            sendBroadcast(intent)
        }
    }
}