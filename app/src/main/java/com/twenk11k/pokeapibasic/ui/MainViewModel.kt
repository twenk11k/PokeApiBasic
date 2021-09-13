package com.twenk11k.pokeapibasic.ui

import androidx.lifecycle.*
import com.twenk11k.pokeapibasic.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel()