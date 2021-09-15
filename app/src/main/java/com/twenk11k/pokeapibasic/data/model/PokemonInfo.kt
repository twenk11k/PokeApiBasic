package com.twenk11k.pokeapibasic.data.model

data class PokemonInfo(
    val name: String,
    val types: List<PokemonType>,
    @Transient var imageUrl: String
)
