package com.twenk11k.pokeapibasic.model

data class PokemonResponse(
    val results: List<Pokemon>
) {
    data class Pokemon(
        val name: String,
        val url: String
    )
}
