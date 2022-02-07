package com.example.oot_tracker_2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.oot_tracker_2.R
import com.example.oot_tracker_2.databinding.FragmentHomeBinding

import android.view.View.OnLongClickListener


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var currentStrength: Int = 0
    private var currentHookshot: Int = 0
    private var currentMagic: Int = 0
    private var currentScale: Int = 0
    private var currentWallet: Int = 0
    private var slingShotClicked: Boolean = false
    private var bombClicked: Boolean = false
    private var bombchuClicked: Boolean = false
    private var bowClicked: Boolean = false
    private var boomerangClicked: Boolean = false
    private var lensClicked: Boolean = false
    private var hammerClicked: Boolean = false
    private var goronTunicClicked: Boolean = false
    private var zoraTunicClicked: Boolean = false
    private var rutosClicked: Boolean = false
    private var mirrorClicked: Boolean = false
    private var fireArrowClicked: Boolean = false
    private var lightArrowClicked: Boolean = false
    private var faroreClicked: Boolean = false
    private var dinClicked: Boolean = false
    private var ironClicked: Boolean = false
    private var hoverClicked: Boolean = false

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


        val slingShotButton: ImageButton = binding.slingshotButton
        slingShotButton.setOnClickListener {
            slingShotClicked(slingShotButton)
        }

        val bombButton: ImageButton = binding.bombButton
        bombButton.setOnClickListener {
            bombClicked(bombButton)
        }

        val bombchuButton: ImageButton = binding.bombchuButton
        bombchuButton.setOnClickListener {
            bombchuClicked(bombchuButton)
        }

        val bowButton: ImageButton = binding.bowButton
        bowButton.setOnClickListener {
            bowClicked(bowButton)
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

        val faroreDinButton: ImageButton = binding.faroreDinButton
        faroreDinButton.setOnLongClickListener(OnLongClickListener {
            dinClick(faroreDinButton)
        })
        faroreDinButton.setOnClickListener {
            faroreClick(faroreDinButton)
        }

        val magicButton: ImageButton = binding.magicButton
        magicButton.setOnClickListener {
            magicChange(magicButton)
        }

        val hoverIronBootsButton: ImageButton = binding.hoverIronBootsButton
        hoverIronBootsButton.setOnLongClickListener(OnLongClickListener {
            hoverBootsClick(hoverIronBootsButton)
        })
        hoverIronBootsButton.setOnClickListener {
            ironBootsClick(hoverIronBootsButton)
        }

        val boomerangButton: ImageButton = binding.boomerangButton
        boomerangButton.setOnClickListener {
            boomerangClick(boomerangButton)
        }

        val scaleButton: ImageButton = binding.scaleButton
        scaleButton.setOnClickListener {
            scaleChange(scaleButton)
        }


        val strengthButton: ImageButton = binding.strengthButton
        strengthButton.setOnClickListener {
            strengthChange(strengthButton)
        }

        val lensButton: ImageButton = binding.lensButton
        lensButton.setOnClickListener {
            lensClick(lensButton)
        }

        val hammerButton: ImageButton = binding.hammerButton
        hammerButton.setOnClickListener {
            hammerClick(hammerButton)
        }

        val zoraGoronTunicButton: ImageButton = binding.zoraGoronTunicButton
        zoraGoronTunicButton.setOnLongClickListener(OnLongClickListener {
            zoraTunicClick(zoraGoronTunicButton)
        })
        zoraGoronTunicButton.setOnClickListener {
            goronTunicClick(zoraGoronTunicButton)
        }

        val walletButton: ImageButton = binding.walletButton
        walletButton.setOnClickListener {
            walletChange(walletButton)
        }

        val rutosButton: ImageButton = binding.rutosButton
        rutosButton.setOnClickListener {
            rutosClick(rutosButton)
        }

        val mirrorButton: ImageButton = binding.mirrorButton
        mirrorButton.setOnClickListener {
            mirrorClick(mirrorButton)
        }

        return root
    }

    private fun mirrorClick(mirrorButton: ImageButton) {
        if (!mirrorClicked) {
            mirrorButton.setImageResource(R.drawable.oot3d_mirror_shield_icon)
            mirrorClicked = true
        } else {
            mirrorButton.setImageResource(R.drawable.oot3d_mirror_shield_icon_bw)
            mirrorClicked = false
        }
    }

    private fun rutosClick(rutosButton: ImageButton) {
        if (!rutosClicked) {
            rutosButton.setImageResource(R.drawable.oot3d_ruto_s_letter_icon)
            rutosClicked = true
        } else {
            rutosButton.setImageResource(R.drawable.oot3d_ruto_s_letter_icon_bw)
            rutosClicked = false
        }
    }

    private fun hammerClick(hammerButton: ImageButton) {
        if (!hammerClicked) {
            hammerButton.setImageResource(R.drawable.oot3d_megaton_hammer_icon)
            hammerClicked = true
        } else {
            hammerButton.setImageResource(R.drawable.oot3d_megaton_hammer_icon_bw)
            hammerClicked = false
        }
    }

    private fun lensClick(lensButton: ImageButton) {
        if (!lensClicked) {
            lensButton.setImageResource(R.drawable.oot3d_lens_of_truth_icon)
            lensClicked = true
        } else {
            lensButton.setImageResource(R.drawable.oot3d_lens_of_truth_icon_bw)
            lensClicked = false
        }
    }

    private fun boomerangClick(boomerangButton: ImageButton) {
        if (!boomerangClicked) {
            boomerangButton.setImageResource(R.drawable.oot3d_boomerang_icon)
            boomerangClicked = true
        } else {
            boomerangButton.setImageResource(R.drawable.oot3d_boomerang_icon_bw)
            boomerangClicked = false
        }
    }

    private fun bowClicked(bombchuButton: ImageButton) {
        if (!bowClicked) {
            bombchuButton.setImageResource(R.drawable.oot3d_fairy_bow_icon)
            bowClicked = true
        } else {
            bombchuButton.setImageResource(R.drawable.oot3d_fairy_bow_icon_bw)
            bowClicked = false
        }
    }

    private fun bombchuClicked(bombchuButton: ImageButton) {
        if (!bombchuClicked) {
            bombchuButton.setImageResource(R.drawable.oot3d_bombchu_icon)
            bombchuClicked = true
        } else {
            bombchuButton.setImageResource(R.drawable.oot3d_bombchu_icon_bw)
            bombchuClicked = false
        }
    }

    private fun bombClicked(bombButton: ImageButton) {
        if (!bombClicked) {
            bombButton.setImageResource(R.drawable.oot3d_bomb_icon)
            bombClicked = true
        } else {
            bombButton.setImageResource(R.drawable.oot3d_bomb_icon_bw)
            bombClicked = false
        }
    }

    private fun slingShotClicked(slingShotButton: ImageButton) {
        if (!slingShotClicked) {
            slingShotButton.setImageResource(R.drawable.oot3d_fairy_slingshot_icon)
            slingShotClicked = true
        } else {
            slingShotButton.setImageResource(R.drawable.oot3d_fairy_slingshot_icon_bw)
            slingShotClicked = false
        }
    }

    private fun lightArrowClick(fireLightArrowButton: ImageButton) {
        if (!fireArrowClicked && !lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_light_arrow)
            lightArrowClicked = true
        } else if (fireArrowClicked && !lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_light_arrow)
            lightArrowClicked = true
        } else if (!fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_light_arrow_bw)
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
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_light_arrow_bw)
            fireArrowClicked = false
        } else if (fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_light_arrow)
            fireArrowClicked = false
        }
        return true
    }

    private fun faroreClick(faroreDinButton: ImageButton) {
        if (!dinClicked && !faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_half_farore_s_wind_icon)
            faroreClicked = true
        } else if (dinClicked && !faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_farore_s_din_s_fire_icon)
            faroreClicked = true
        } else if (!dinClicked && faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_farore_s_wind_icon_bw)
            faroreClicked = false
        } else if (dinClicked && faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_half_din_s_fire_icon)
            faroreClicked = false
        }
    }

    private fun dinClick(faroreDinButton: ImageButton): Boolean {
        if (!dinClicked && !faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_half_din_s_fire_icon)
            dinClicked = true
        } else if (!dinClicked && faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_farore_s_din_s_fire_icon)
            dinClicked = true
        } else if (dinClicked && !faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_din_s_fire_icon_bw)
            dinClicked = false
        } else if (dinClicked && faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_half_farore_s_wind_icon)
            dinClicked = false
        }
        return true
    }

    private fun ironBootsClick(fireLightArrowButton: ImageButton) {
        if (!hoverClicked && !ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_iron_boots_icon)
            ironClicked = true
        } else if (hoverClicked && !ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon)
            ironClicked = true
        } else if (!hoverClicked && ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon_bw)
            ironClicked = false
        } else if (hoverClicked && ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_hover_boots_icon)
            ironClicked = false
        }
    }

    private fun hoverBootsClick(fireLightArrowButton: ImageButton): Boolean {
        if (!hoverClicked && !ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_hover_boots_icon)
            hoverClicked = true
        } else if (!hoverClicked && ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon)
            hoverClicked = true
        } else if (hoverClicked && !ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon_bw)
            hoverClicked = false
        } else if (hoverClicked && ironClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_iron_boots_icon)
            hoverClicked = false
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

    private fun magicChange(magicButton: ImageButton) {
        currentMagic++
        when (currentMagic) {
            1 -> {
                magicButton.setImageResource(R.drawable.oot3d_magic_jar)
            }
            2 -> {
                magicButton.setImageResource(R.drawable.oot3d_magic_jar_big)
            }
            else -> {
                magicButton.setImageResource(R.drawable.oot3d_magic_jar_bw)
                currentMagic = 0
            }
        }
    }

    private fun hookshotChange(hookshotButton: ImageButton) {
        currentHookshot++
        when (currentHookshot) {
            1 -> {
                hookshotButton.setImageResource(R.drawable.oot3d_hookshot_icon)
            }
            2 -> {
                hookshotButton.setImageResource(R.drawable.oot3d_longshot_icon)
            }
            else -> {
                hookshotButton.setImageResource(R.drawable.oot3d_hookshot_icon_bw)
                currentHookshot = 0
            }
        }
    }

    private fun scaleChange(scaleButton: ImageButton) {
        currentScale++
        when (currentScale) {
            1 -> {
                scaleButton.setImageResource(R.drawable.oot3d_silver_scale_icon)
            }
            2 -> {
                scaleButton.setImageResource(R.drawable.oot3d_golden_scale_icon)
            }
            else -> {
                scaleButton.setImageResource(R.drawable.oot3d_silver_scale_icon_bw)
                currentScale = 0
            }
        }
    }

    private fun goronTunicClick(zoraGoronTunicButton: ImageButton) {
        if (!zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_goron_tunic_icon)
            goronTunicClicked = true
        } else if (zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_zora_tunic_icon)
            goronTunicClicked = true
        } else if (!zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_zora_tunic_icon_bw)
            goronTunicClicked = false
        } else if (zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_zora_tunic_icon)
            goronTunicClicked = false
        }
    }

    private fun zoraTunicClick(zoraGoronTunicButton: ImageButton): Boolean {
        if (!zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_zora_tunic_icon)
            zoraTunicClicked = true
        } else if (!zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_zora_tunic_icon)
            zoraTunicClicked = true
        } else if (zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_zora_tunic_icon_bw)
            zoraTunicClicked = false
        } else if (zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_goron_tunic_icon)
            zoraTunicClicked = false
        }
        return true
    }

    private fun walletChange(walletButton: ImageButton) {
        currentWallet++
        when (currentWallet) {
            1 -> {
                walletButton.setImageResource(R.drawable.oot3d_adult_s_wallet_icon)
            }
            2 -> {
                walletButton.setImageResource(R.drawable.oot3d_giant_s_wallet_icon)
            }
            else -> {
                walletButton.setImageResource(R.drawable.oot3d_adult_s_wallet_icon_bw)
                currentWallet = 0
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

