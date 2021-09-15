package com.twenk11k.pokeapibasic.data.model

data class PokemonInfo(
    val name: String,
    val types: List<PokemonType>,
    val height: String,
    val weight: String,
    @Transient var imageUrl: String
)
