package com.twenk11k.pokeapibasic.repository

import com.twenk11k.pokeapibasic.network.PokeService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val pokeService: PokeService
)