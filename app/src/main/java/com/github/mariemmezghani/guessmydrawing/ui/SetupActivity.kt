package com.github.mariemmezghani.guessmydrawing.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.github.mariemmezghani.guessmydrawing.databinding.ActivitySetupBinding


class SetupActivity : AppCompatActivity() {


    private var _binding : ActivitySetupBinding? =null
    private val binding : ActivitySetupBinding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        _binding= ActivitySetupBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
