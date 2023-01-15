package com.github.mariemmezghani.guessmydrawing.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mariemmezghani.guessmydrawing.databinding.FragmentUsernameBinding


class UsernameFragment : Fragment() {

    private var _binding : FragmentUsernameBinding? =null
    private val binding :FragmentUsernameBinding
    get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentUsernameBinding.bind(view)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}