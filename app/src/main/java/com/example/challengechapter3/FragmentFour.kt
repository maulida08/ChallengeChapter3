package com.example.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challengechapter3.databinding.FragmentFourBinding

class FragmentFour : Fragment() {
    private var _binding: FragmentFourBinding? = null
    private val binding get() = _binding!!
    val args: FragmentFourArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFragmentFour.setOnClickListener {
            val parcel = DataParcelable(
                binding.etInputOrdometerAwal.text.toString().toInt(),
                binding.etInputOrdometerAkhir.text.toString().toInt(),
                binding.etInputKapasitasTangki.text.toString().toDouble()
            )
            val sendParcel = FragmentFourDirections.actionFragmentFourToFragmentThree(args.aname, parcel)
            it.findNavController().navigate(sendParcel)
        }
    }

}