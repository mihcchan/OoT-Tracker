package com.example.oot_tracker_2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.oot_tracker_2.R
import com.example.oot_tracker_2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var currentStrength: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val strengthButton: ImageButton = binding.imageButton
        strengthButton.setOnClickListener {
            strengthChange(strengthButton)
        }

        return root
    }

    private fun strengthChange(strengthButton: ImageButton) {
        currentStrength++
        if (currentStrength == 1) {
            strengthButton.setImageResource(R.drawable.oot3d_goron_bracelet_icon)
        } else if (currentStrength == 2) {
            strengthButton.setImageResource(R.drawable.oot3d_silver_gauntlets_icon)
        } else if (currentStrength == 3) {
            strengthButton.setImageResource(R.drawable.oot3d_golden_gauntlets_icon)
        } else {
            strengthButton.setImageResource(R.drawable.oot3d_goron_bracelet_icon_bw)
            currentStrength = 0
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

