package com.example.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challengechapter3.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {
    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!
    val args: FragmentThreeArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameUser = args.name
        binding.tvName.text = "$nameUser"

        binding.btnFragmentThree.setOnClickListener {
            val aName = FragmentThreeDirections.actionFragmentThreeToFragmentFour(nameUser)
            it.findNavController().navigate(aName)
        }
    }

}