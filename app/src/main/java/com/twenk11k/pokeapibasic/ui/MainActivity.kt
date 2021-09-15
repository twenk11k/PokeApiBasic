package com.twenk11k.pokeapibasic.ui

import android.os.Bundle
import androidx.activity.viewModels
import com.twenk11k.pokeapibasic.R
import com.twenk11k.pokeapibasic.binding.DataBindingActivity
import com.twenk11k.pokeapibasic.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : DataBindingActivity() {

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()
    }

    private fun setBindings() {
        binding.apply {
            vm = mainViewModel
            lifecycleOwner = this@MainActivity
        }
    }

}