package com.github.mariemmezghani.guessmydrawing.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mariemmezghani.guessmydrawing.databinding.ActivitySetupBinding

class SetupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySetupBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivitySetupBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
