package com.github.mariemmezghani.guessmydrawing.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mariemmezghani.guessmydrawing.databinding.ActivityDrawingBinding

class DrawingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDrawingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}