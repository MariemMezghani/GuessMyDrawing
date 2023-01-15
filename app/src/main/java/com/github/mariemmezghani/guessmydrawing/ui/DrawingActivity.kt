package com.github.mariemmezghani.guessmydrawing.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mariemmezghani.guessmydrawing.R
import com.github.mariemmezghani.guessmydrawing.databinding.ActivityDrawingBinding
import com.github.mariemmezghani.guessmydrawing.databinding.ActivitySetupBinding

class DrawingActivity : AppCompatActivity() {

    private var _binding : ActivityDrawingBinding? =null
    private val binding : ActivityDrawingBinding
        get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityDrawingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}