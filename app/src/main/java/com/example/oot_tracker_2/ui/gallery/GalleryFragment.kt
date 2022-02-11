package com.example.oot_tracker_2.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.oot_tracker_2.R
import com.example.oot_tracker_2.databinding.FragmentGalleryBinding
import com.example.oot_tracker_2.model.SharedViewModel

class GalleryFragment : Fragment() {

    //private lateinit var galleryViewModel: GalleryViewModel
    private lateinit var sharedViewModel: SharedViewModel
    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var currentStrength: Int = 0
    private var currentHookshot: Int = 0
    private var currentMagic: Int = 0
    private var currentScale: Int = 0
    private var currentWallet: Int = 0
    private var currentEgg: Int = 0
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
    private var kokiriClicked: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
//        homeViewModel =
//            ViewModelProvider(this)[HomeViewModel::class.java]
        //sharedViewModel = ViewModelProvider(this)[SharedViewModel::class.java]
        sharedViewModel = ViewModelProviders.of(requireActivity())[SharedViewModel::class.java]

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        useSharedModelValues()

        val slingShotButton: ImageButton = binding.slingshotButton
        sharedViewModel.slingShotClicked.observe(viewLifecycleOwner) {
            slingShotUpdate(slingShotButton)
            slingShotButton.setOnClickListener {
                slingShotClick(slingShotButton)
            }
        }

        val bombButton: ImageButton = binding.bombButton
        sharedViewModel.bombClicked.observe(viewLifecycleOwner) {
            bombUpdate(bombButton)
            bombButton.setOnClickListener {
                bombClick(bombButton)
            }
        }

        val bombchuButton: ImageButton = binding.bombchuButton
        sharedViewModel.bombchuClicked.observe(viewLifecycleOwner) {
            bombchuUpdate(bombchuButton)
            bombchuButton.setOnClickListener {
                bombchuClick(bombchuButton)
            }
        }

        val strengthButton: ImageButton = binding.strengthButton
        sharedViewModel.currentStrength.observe(viewLifecycleOwner) {
            strengthUpdate(strengthButton)
            strengthButton.setOnClickListener {
                strengthClick(strengthButton)
            }
        }

        val lensButton: ImageButton = binding.lensButton
        sharedViewModel.lensClicked.observe(viewLifecycleOwner) {
            lensUpdate(lensButton)
            lensButton.setOnClickListener {
                lensClick(lensButton)
            }
        }

        val rutosButton: ImageButton = binding.rutosButton
        sharedViewModel.rutosClicked.observe(viewLifecycleOwner) {
            rutosUpdate(rutosButton)
            rutosButton.setOnClickListener {
                rutosClick(rutosButton)
            }
        }

        val kokiriButton: ImageButton = binding.kokiriButton
        sharedViewModel.kokiriClicked.observe(viewLifecycleOwner) {
            kokiriUpdate(kokiriButton)
            kokiriButton.setOnClickListener {
                kokiriClick(kokiriButton)
            }
        }

        val boomerangButton: ImageButton = binding.boomerangButton
        sharedViewModel.boomerangClicked.observe(viewLifecycleOwner) {
            boomerangUpdate(boomerangButton)
            boomerangButton.setOnClickListener {
                boomerangClick(boomerangButton)
            }
        }

        val scaleButton: ImageButton = binding.scaleButton
        sharedViewModel.currentScale.observe(viewLifecycleOwner) {
            scaleUpdate(scaleButton)
            scaleButton.setOnClickListener {
                scaleClick(scaleButton)
            }
        }

        val hookshotButton: ImageButton = binding.hookshotButton
        sharedViewModel.currentHookshot.observe(viewLifecycleOwner) {
            hookshotUpdate(hookshotButton)
            hookshotButton.setOnClickListener {
                hookshotClick(hookshotButton)
            }
        }

        val bowButton: ImageButton = binding.bowButton
        sharedViewModel.bowClicked.observe(viewLifecycleOwner) {
            bowUpdate(bowButton)
            bowButton.setOnClickListener {
                bowClick(bowButton)
            }
        }

        val fireLightArrowButton: ImageButton = binding.fireLightArrowButton
        sharedViewModel.lightArrowClicked.observe(viewLifecycleOwner) {
            fireLightArrowUpdate(fireLightArrowButton)
            fireLightArrowButton.setOnClickListener {
                lightArrowClick(fireLightArrowButton)
            }
        }
        sharedViewModel.fireArrowClicked.observe(viewLifecycleOwner) {
            fireLightArrowUpdate(fireLightArrowButton)
            fireLightArrowButton.setOnLongClickListener {
                fireArrowClick(fireLightArrowButton)
                true
            }
        }

        val faroreDinButton: ImageButton = binding.faroreDinButton
        sharedViewModel.faroreClicked.observe(viewLifecycleOwner) {
            faroreDinUpdate(faroreDinButton)
            faroreDinButton.setOnClickListener {
                faroreClick(faroreDinButton)
            }
        }
        sharedViewModel.dinClicked.observe(viewLifecycleOwner) {
            faroreDinUpdate(faroreDinButton)
            faroreDinButton.setOnLongClickListener {
                dinClick(faroreDinButton)
                true
            }
        }

        val magicButton: ImageButton = binding.magicButton
        sharedViewModel.currentMagic.observe(viewLifecycleOwner) {
            magicUpdate(magicButton)
            magicButton.setOnClickListener {
                magicClick(magicButton)
            }
        }

        val hammerButton: ImageButton = binding.hammerButton
        sharedViewModel.hammerClicked.observe(viewLifecycleOwner) {
            hammerUpdate(hammerButton)
            hammerButton.setOnClickListener {
                hammerClick(hammerButton)
            }
        }

        val zoraGoronTunicButton: ImageButton = binding.zoraGoronTunicButton
        sharedViewModel.goronTunicClicked.observe(viewLifecycleOwner) {
            zoraGoronTunicUpdate(zoraGoronTunicButton)
            zoraGoronTunicButton.setOnClickListener {
                goronTunicClick(zoraGoronTunicButton)
            }
        }
        sharedViewModel.zoraTunicClicked.observe(viewLifecycleOwner) {
            zoraGoronTunicUpdate(zoraGoronTunicButton)
            zoraGoronTunicButton.setOnLongClickListener {
                zoraTunicClick(zoraGoronTunicButton)
                true
            }
        }

        val walletButton: ImageButton = binding.walletButton
        sharedViewModel.currentWallet.observe(viewLifecycleOwner) {
            walletUpdate(walletButton)
            walletButton.setOnClickListener {
                walletClick(walletButton)
            }
        }

        val mirrorButton: ImageButton = binding.mirrorButton
        sharedViewModel.mirrorClicked.observe(viewLifecycleOwner) {
            mirrorUpdate(mirrorButton)
            mirrorButton.setOnClickListener {
                mirrorClick(mirrorButton)
            }
        }

        val hoverIronBootsButton: ImageButton = binding.hoverIronBootsButton
        sharedViewModel.ironClicked.observe(viewLifecycleOwner) {
            hoverIronUpdate(hoverIronBootsButton)
            hoverIronBootsButton.setOnClickListener {
                ironBootsClick(hoverIronBootsButton)
            }
        }
        sharedViewModel.hoverClicked.observe(viewLifecycleOwner) {
            hoverIronUpdate(hoverIronBootsButton)
            hoverIronBootsButton.setOnLongClickListener {
                hoverBootsClick(hoverIronBootsButton)
                true
            }
        }

        val eggButton: ImageButton = binding.eggButton
        sharedViewModel.currentEgg.observe(viewLifecycleOwner) {
            updateEgg(eggButton)
            eggButton.setOnClickListener {
                eggClick(eggButton)
            }
        }

        return root
    }

    private fun useSharedModelValues() {
        currentStrength = sharedViewModel.currentStrength.value!!
        currentHookshot = sharedViewModel.currentHookshot.value!!
        currentMagic = sharedViewModel.currentMagic.value!!
        currentScale = sharedViewModel.currentScale.value!!
        currentWallet = sharedViewModel.currentWallet.value!!
        currentEgg = sharedViewModel.currentEgg.value!!
        slingShotClicked = sharedViewModel.slingShotClicked.value!!
        bombClicked = sharedViewModel.bombClicked.value!!
        bombchuClicked = sharedViewModel.bombchuClicked.value!!
        bowClicked = sharedViewModel.bowClicked.value!!
        boomerangClicked = sharedViewModel.boomerangClicked.value!!
        lensClicked = sharedViewModel.lensClicked.value!!
        hammerClicked = sharedViewModel.hammerClicked.value!!
        goronTunicClicked = sharedViewModel.goronTunicClicked.value!!
        zoraTunicClicked = sharedViewModel.zoraTunicClicked.value!!
        rutosClicked = sharedViewModel.rutosClicked.value!!
        mirrorClicked = sharedViewModel.mirrorClicked.value!!
        fireArrowClicked = sharedViewModel.fireArrowClicked.value!!
        lightArrowClicked = sharedViewModel.lightArrowClicked.value!!
        faroreClicked = sharedViewModel.faroreClicked.value!!
        dinClicked = sharedViewModel.dinClicked.value!!
        ironClicked = sharedViewModel.ironClicked.value!!
        hoverClicked = sharedViewModel.hoverClicked.value!!
        kokiriClicked = sharedViewModel.kokiriClicked.value!!
    }

    private fun slingShotClick(slingShotButton: ImageButton) {
        if (!slingShotClicked) {
            slingShotButton.setImageResource(R.drawable.oot3d_fairy_slingshot_icon)
            slingShotClicked = true
        } else {
            slingShotButton.setImageResource(R.drawable.oot3d_fairy_slingshot_icon_bw)
            slingShotClicked = false
        }
        sharedViewModel.setSlingshot(slingShotClicked)
    }

    private fun slingShotUpdate(slingShotButton: ImageButton) {
        if (slingShotClicked) {
            slingShotButton.setImageResource(R.drawable.oot3d_fairy_slingshot_icon)
        } else {
            slingShotButton.setImageResource(R.drawable.oot3d_fairy_slingshot_icon_bw)
        }
    }

    private fun bombClick(bombButton: ImageButton) {
        if (!bombClicked) {
            bombButton.setImageResource(R.drawable.oot3d_bomb_icon)
            bombClicked = true
        } else {
            bombButton.setImageResource(R.drawable.oot3d_bomb_icon_bw)
            bombClicked = false
        }
        sharedViewModel.setBomb(bombClicked)
    }

    private fun bombUpdate(bombButton: ImageButton) {
        if (bombClicked) {
            bombButton.setImageResource(R.drawable.oot3d_bomb_icon)
        } else {
            bombButton.setImageResource(R.drawable.oot3d_bomb_icon_bw)
        }
    }

    private fun bombchuClick(bombchuButton: ImageButton) {
        if (!bombchuClicked) {
            bombchuButton.setImageResource(R.drawable.oot3d_bombchu_icon)
            bombchuClicked = true
        } else {
            bombchuButton.setImageResource(R.drawable.oot3d_bombchu_icon_bw)
            bombchuClicked = false
        }
        sharedViewModel.setBombchu(bombchuClicked)
    }

    private fun bombchuUpdate(bombchuButton: ImageButton) {
        if (bombchuClicked) {
            bombchuButton.setImageResource(R.drawable.oot3d_bombchu_icon)
        } else {
            bombchuButton.setImageResource(R.drawable.oot3d_bombchu_icon_bw)
        }
    }

    private fun strengthClick(strengthButton: ImageButton) {
        currentStrength++
        strengthUpdate(strengthButton)
        sharedViewModel.setStrength(currentStrength)
//        sharedViewModel.currentStrength.value = currentStrength
    }

    private fun strengthUpdate(strengthButton: ImageButton) {
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

    private fun lensClick(lensButton: ImageButton) {
        if (!lensClicked) {
            lensButton.setImageResource(R.drawable.oot3d_lens_of_truth_icon)
            lensClicked = true
        } else {
            lensButton.setImageResource(R.drawable.oot3d_lens_of_truth_icon_bw)
            lensClicked = false
        }
        sharedViewModel.setLens(lensClicked)
    }

    private fun lensUpdate(lensButton: ImageButton) {
        if (lensClicked) {
            lensButton.setImageResource(R.drawable.oot3d_lens_of_truth_icon)
        } else {
            lensButton.setImageResource(R.drawable.oot3d_lens_of_truth_icon_bw)
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
        sharedViewModel.setRutos(rutosClicked)
    }

    private fun rutosUpdate(rutosButton: ImageButton) {
        if (rutosClicked) {
            rutosButton.setImageResource(R.drawable.oot3d_ruto_s_letter_icon)
        } else {
            rutosButton.setImageResource(R.drawable.oot3d_ruto_s_letter_icon_bw)
        }
    }

    private fun kokiriClick(kokiriButton: ImageButton) {
        if (!kokiriClicked) {
            kokiriButton.setImageResource(R.drawable.oot3d_kokiri_sword_icon)
            kokiriClicked = true
        } else {
            kokiriButton.setImageResource(R.drawable.oot3d_kokiri_sword_icon_bw)
            kokiriClicked = false
        }
        sharedViewModel.setKokiri(kokiriClicked)
    }

    private fun kokiriUpdate(kokiriButton: ImageButton) {
        if (kokiriClicked) {
            kokiriButton.setImageResource(R.drawable.oot3d_kokiri_sword_icon)
        } else {
            kokiriButton.setImageResource(R.drawable.oot3d_kokiri_sword_icon_bw)
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
        sharedViewModel.setBoomerang(boomerangClicked)
    }

    private fun boomerangUpdate(boomerangButton: ImageButton) {
        if (boomerangClicked) {
            boomerangButton.setImageResource(R.drawable.oot3d_boomerang_icon)
        } else {
            boomerangButton.setImageResource(R.drawable.oot3d_boomerang_icon_bw)
        }
    }

    private fun scaleClick(scaleButton: ImageButton) {
        currentScale++
        scaleUpdate(scaleButton)
        sharedViewModel.setScale(currentScale)
    }

    private fun scaleUpdate(scaleButton: ImageButton) {
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

    private fun hookshotClick(hookshotButton: ImageButton) {
        currentHookshot++
        hookshotUpdate(hookshotButton)
        sharedViewModel.setHookshot(currentHookshot)
    }

    private fun hookshotUpdate(hookshotButton: ImageButton) {
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

    private fun bowClick(bowButton: ImageButton) {
        if (!bowClicked) {
            bowButton.setImageResource(R.drawable.oot3d_fairy_bow_icon)
            bowClicked = true
        } else {
            bowButton.setImageResource(R.drawable.oot3d_fairy_bow_icon_bw)
            bowClicked = false
        }
        sharedViewModel.setBow(bowClicked)
    }

    private fun bowUpdate(bowButton: ImageButton) {
        if (bowClicked) {
            bowButton.setImageResource(R.drawable.oot3d_fairy_bow_icon)
        } else {
            bowButton.setImageResource(R.drawable.oot3d_fairy_bow_icon_bw)
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
        sharedViewModel.setLightArrow(lightArrowClicked)
    }

    private fun fireArrowClick(fireLightArrowButton: ImageButton) {
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
        sharedViewModel.setFireArrow(fireArrowClicked)
    }

    private fun fireLightArrowUpdate(fireLightArrowButton: ImageButton) {
        if (!fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_light_arrow)
        } else if (fireArrowClicked && lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_light_arrow)
        } else if (!fireArrowClicked && !lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_fire_light_arrow_bw)
        } else if (fireArrowClicked && !lightArrowClicked) {
            fireLightArrowButton.setImageResource(R.drawable.oot3d_half_fire_arrow)
        }
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
        sharedViewModel.setFarores(faroreClicked)
    }

    private fun dinClick(faroreDinButton: ImageButton) {
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
        sharedViewModel.setDins(dinClicked)
    }

    private fun faroreDinUpdate(faroreDinButton: ImageButton) {
        if (!dinClicked && faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_half_farore_s_wind_icon)
        } else if (dinClicked && faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_farore_s_din_s_fire_icon)
        } else if (!dinClicked && !faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_farore_s_wind_icon_bw)
        } else if (dinClicked && !faroreClicked) {
            faroreDinButton.setImageResource(R.drawable.oot3d_half_din_s_fire_icon)
        }
    }

    private fun magicClick(magicButton: ImageButton) {
        currentMagic++
        magicUpdate(magicButton)
        sharedViewModel.setMagic(currentMagic)
    }

    private fun magicUpdate(magicButton: ImageButton) {
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

    private fun hammerClick(hammerButton: ImageButton) {
        if (!hammerClicked) {
            hammerButton.setImageResource(R.drawable.oot3d_megaton_hammer_icon)
            hammerClicked = true
        } else {
            hammerButton.setImageResource(R.drawable.oot3d_megaton_hammer_icon_bw)
            hammerClicked = false
        }
        sharedViewModel.setHammer(hammerClicked)
    }

    private fun hammerUpdate(hammerButton: ImageButton) {
        if (hammerClicked) {
            hammerButton.setImageResource(R.drawable.oot3d_megaton_hammer_icon)
        } else {
            hammerButton.setImageResource(R.drawable.oot3d_megaton_hammer_icon_bw)
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
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_tunic_icon_bw)
            goronTunicClicked = false
        } else if (zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_zora_tunic_icon)
            goronTunicClicked = false
        }
        sharedViewModel.setGoronTunic(goronTunicClicked)
    }

    private fun zoraTunicClick(zoraGoronTunicButton: ImageButton) {
        if (!zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_zora_tunic_icon)
            zoraTunicClicked = true
        } else if (!zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_zora_tunic_icon)
            zoraTunicClicked = true
        } else if (zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_tunic_icon_bw)
            zoraTunicClicked = false
        } else if (zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_goron_tunic_icon)
            zoraTunicClicked = false
        }
        sharedViewModel.setZoraTunic(zoraTunicClicked)
    }

    private fun zoraGoronTunicUpdate(zoraGoronTunicButton: ImageButton) {
        if (zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_zora_tunic_icon)
        } else if (zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_zora_tunic_icon)
        } else if (!zoraTunicClicked && !goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_goron_tunic_icon_bw)
        } else if (!zoraTunicClicked && goronTunicClicked) {
            zoraGoronTunicButton.setImageResource(R.drawable.oot3d_half_goron_tunic_icon)
        }
    }

    private fun walletClick(walletButton: ImageButton) {
        currentWallet++
        walletUpdate(walletButton)
        sharedViewModel.setWallet(currentWallet)
    }

    private fun walletUpdate(walletButton: ImageButton) {
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

    private fun mirrorClick(mirrorButton: ImageButton) {
        if (!mirrorClicked) {
            mirrorButton.setImageResource(R.drawable.oot3d_mirror_shield_icon)
            mirrorClicked = true
        } else {
            mirrorButton.setImageResource(R.drawable.oot3d_mirror_shield_icon_bw)
            mirrorClicked = false
        }
        sharedViewModel.setMirror(mirrorClicked)
    }

    private fun mirrorUpdate(mirrorButton: ImageButton) {
        if (mirrorClicked) {
            mirrorButton.setImageResource(R.drawable.oot3d_mirror_shield_icon)
        } else {
            mirrorButton.setImageResource(R.drawable.oot3d_mirror_shield_icon_bw)
        }
    }

    private fun ironBootsClick(hoverIronButton: ImageButton) {
        if (!hoverClicked && !ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_half_iron_boots_icon)
            ironClicked = true
        } else if (hoverClicked && !ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon)
            ironClicked = true
        } else if (!hoverClicked && ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon_bw)
            ironClicked = false
        } else if (hoverClicked && ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_half_hover_boots_icon)
            ironClicked = false
        }
        sharedViewModel.setIron(ironClicked)
    }

    private fun hoverBootsClick(hoverIronButton: ImageButton) {
        if (!hoverClicked && !ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_half_hover_boots_icon)
            hoverClicked = true
        } else if (!hoverClicked && ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon)
            hoverClicked = true
        } else if (hoverClicked && !ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon_bw)
            hoverClicked = false
        } else if (hoverClicked && ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_half_iron_boots_icon)
            hoverClicked = false
        }
        sharedViewModel.setHover(hoverClicked)
    }

    private fun hoverIronUpdate(hoverIronButton: ImageButton) {
        if (hoverClicked && !ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_half_hover_boots_icon)
        } else if (hoverClicked && ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon)
        } else if (!hoverClicked && !ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_hover_iron_boots_icon_bw)
        } else if (!hoverClicked && ironClicked) {
            hoverIronButton.setImageResource(R.drawable.oot3d_half_iron_boots_icon)
        }
    }

    private fun eggClick(eggButton: ImageButton) {
        currentEgg++
        updateEgg(eggButton)
        sharedViewModel.setEgg(currentEgg)
    }

    private fun updateEgg(eggButton: ImageButton) {
        when (currentEgg) {
            1 -> {
                eggButton.setImageResource(R.drawable.oot3d_weird_egg_icon)
            }
            2 -> {
                eggButton.setImageResource(R.drawable.oot3d_pocket_cucco_icon)
            }
            3 -> {
                eggButton.setImageResource(R.drawable.oot3d_cojiro_icon)
            }
            4 -> {
                eggButton.setImageResource(R.drawable.oot3d_odd_mushroom_icon)
            }
            5 -> {
                eggButton.setImageResource(R.drawable.oot3d_odd_poultice_icon)
            }
            6 -> {
                eggButton.setImageResource(R.drawable.oot3d_poacher_s_saw_icon)
            }
            7 -> {
                eggButton.setImageResource(R.drawable.oot3d_broken_goron_s_sword_icon)
            }
            8 -> {
                eggButton.setImageResource(R.drawable.oot3d_prescription_icon)
            }
            9 -> {
                eggButton.setImageResource(R.drawable.oot3d_eyeball_frog_icon)
            }
            10 -> {
                eggButton.setImageResource(R.drawable.oot3d_world_s_finest_eyedrops_icon)
            }
            11 -> {
                eggButton.setImageResource(R.drawable.oot3d_claim_check_icon)
            }
            12 -> {
                eggButton.setImageResource(R.drawable.oot3d_biggoron_s_sword_icon)
            }
            else -> {
                eggButton.setImageResource(R.drawable.oot3d_weird_egg_icon_bw)
                currentEgg = 0
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}