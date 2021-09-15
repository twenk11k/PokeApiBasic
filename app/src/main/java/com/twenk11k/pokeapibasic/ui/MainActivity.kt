package com.twenk11k.pokeapibasic.ui

import android.os.Bundle
import com.twenk11k.pokeapibasic.R
import com.twenk11k.pokeapibasic.binding.DataBindingActivity
import com.twenk11k.pokeapibasic.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : DataBindingActivity() {

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this@MainActivity
    }

}