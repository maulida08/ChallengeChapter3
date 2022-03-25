package com.example.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.challengechapter3.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFragmentTwo.setOnClickListener {
            if (binding.etInputName.text.isNotEmpty()){
                val name = binding.etInputName.text.toString()
                val sendName = FragmentTwoDirections.actionFragmentTwoToFragmentThree(name)
                it.findNavController().navigate(sendName)
            } else {
                Toast.makeText(requireContext(), "Can't Be Empty", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}