package com.example.oot_tracker_2.ui.home

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.oot_tracker_2.R
import com.example.oot_tracker_2.databinding.FragmentHomeBinding

import com.example.oot_tracker_2.ChronometerWithMS
import android.view.View.OnLongClickListener


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var currentStrength: Int = 0
    private var currentHookshot: Int = 0
    private var fireArrowClicked: Boolean = false
    private var lightArrowClicked: Boolean = false
    //private var pauseOffSet = 0L

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val strengthButton: ImageButton = binding.strengthButton
        strengthButton.setOnClickListener {
            strengthChange(strengthButton)
        }

        val hookshotButton: ImageButton = binding.hookshotButton
        hookshotButton.setOnClickListener {
            hookshotChange(hookshotButton)
        }

        val fireLightArrowButton: ImageButton = binding.fireLightArrowButton
        fireLightArrowButton.setOnLongClickListener(OnLongClickListener {
            fireArrowClick(fireLightArrowButton)
        })
        fireLightArrowButton.setOnClickListener {
            lightArrowClick(fireLightArrowButton)
        }

        return root
    }

    private fun lightArrowClick(fireLightArrowButton: ImageButton) {
        if (!lightArrowClicked && !fireArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_light_arrow)
            lightArrowClicked = true
        } else if (fireArrowClicked && !lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_light_arrow)
            lightArrowClicked = true
        } else if (!fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_ice_arrow_bw)
            lightArrowClicked = false
        } else if (fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_fire_arrow)
            lightArrowClicked = false
        }
    }

    private fun fireArrowClick(fireLightArrowButton: ImageButton): Boolean {
        if (!fireArrowClicked && !lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_fire_arrow)
            fireArrowClicked = true
        } else if (!fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_light_arrow)
            fireArrowClicked = true
        } else if (fireArrowClicked && !lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_ice_arrow_bw)
            fireArrowClicked = false
        } else if (fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_light_arrow)
            fireArrowClicked = false
        }
        return true
    }

    private fun strengthChange(strengthButton: ImageButton) {
        currentStrength++
        when (currentStrength) {
            1 -> {
                strengthButton.setImageResource(R.drawable.oot3d_goron_bracelet_icon)
            }
            2 -> {
                strengthButton.setImageResource(R.drawable.oot3d_silver_gauntlets_icon)
            }
            3 -> {
                strengthButton.setImageResource(R.drawable.oot3d_golden_gauntlets_icon)
            }
            else -> {
                strengthButton.setImageResource(R.drawable.oot3d_goron_bracelet_icon_bw)
                currentStrength = 0
            }
        }
    }

    private fun hookshotChange(hookshotButton: ImageButton) {
        val hookshotImage: ImageView = binding.hookshotImage
        currentHookshot++
        when (currentHookshot) {
            1 -> {
                hookshotButton.setImageResource(R.drawable.oot3d_hookshot_icon)
            }
            2 -> {
                hookshotButton.setImageResource(R.drawable.oot3d_longshot_icon)
                hookshotImage.setImageResource(R.drawable.oot3d_longshot_icon)
            }
            else -> {
                hookshotButton.setImageResource(R.drawable.oot3d_hookshot_icon_bw)
                hookshotImage.setImageResource(R.drawable.oot3d_hookshot_icon_bw)
                currentHookshot = 0
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

