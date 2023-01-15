package com.github.mariemmezghani.guessmydrawing.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mariemmezghani.guessmydrawing.R
import com.github.mariemmezghani.guessmydrawing.databinding.FragmentCreateRoomBinding
import com.github.mariemmezghani.guessmydrawing.databinding.FragmentUsernameBinding

class CreateRoomFragment : Fragment() {
    private var _binding : FragmentCreateRoomBinding? =null
    private val binding : FragmentCreateRoomBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentCreateRoomBinding.bind(view)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

}