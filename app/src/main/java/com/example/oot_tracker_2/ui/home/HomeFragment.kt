package com.example.oot_tracker_2.ui.home

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
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

        val lightFireArrowButton: ImageButton = binding.fireLighArrowButton
        lightFireArrowButton.setOnLongClickListener(OnLongClickListener {
            lightFireArrowButton.setImageResource(R.drawable.oot3d_half_fire_arrow_wt_background)
            true
        })
        lightFireArrowButton.setOnClickListener {
            lightFireArrowButton.setImageResource(R.drawable.oot3d_half_light_arrow_wt_background)
        }

//        val chronometer: ChronometerWithMS = binding.chronometer
//        val startStopButton: ToggleButton = binding.playPauseButton
//        val stopButton: ImageButton = binding.stopButton
//
//        startStopButton.setOnClickListener {
//            if (startStopButton.isChecked) {
//                chronometer.restart()
//            } else {
//                chronometer.stop()
//            }
//        }
//
//        stopButton.setOnClickListener {
//            if (startStopButton.isChecked) {
//                startStopButton.toggle()
//            }
//            chronometer.stop()
//            chronometer.resetTime()
//        }

//        val chronometer : Chronometer = binding.chronometer
//
//        chronometer.onChronometerTickListener = OnChronometerTickListener { cArg ->
//            val time = SystemClock.elapsedRealtime() - cArg.base
//            val h = (time / 3600000).toInt()
//            val m = (time - h * 3600000).toInt() / 60000
//            val s = (time - h * 3600000 - m * 60000).toInt() / 1000
//            val hh = if (h < 10) "0$h" else h.toString() + ""
//            val mm = if (m < 10) "0$m" else m.toString() + ""
//            val ss = if (s < 10) "0$s" else s.toString() + ""
//            cArg.text = "$hh:$mm:$ss"
//        }
//
//        val startStopButton : ToggleButton = binding.playPauseButton
//        val stopButton : ImageButton = binding.stopButton
//        startStopButton.setOnClickListener{
//            if (startStopButton.isChecked){
//                chronometer.base = SystemClock.elapsedRealtime() - pauseOffSet
//                chronometer.start()
//            }else{
//                pauseOffSet = SystemClock.elapsedRealtime() - chronometer.base
//                chronometer.stop()
//            }
//        }
//
//        stopButton.setOnClickListener{
//            if (startStopButton.isChecked){
//                startStopButton.toggle()
//            }
//            chronometer.stop()
//            pauseOffSet = 0L
//            chronometer.base = SystemClock.elapsedRealtime()
//        }

        return root
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

