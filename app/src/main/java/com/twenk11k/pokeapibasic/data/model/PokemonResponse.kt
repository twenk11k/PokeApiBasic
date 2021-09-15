package com.twenk11k.pokeapibasic.data.model

data class PokemonResponse(
    val results: List<Pokemon>
) {
    data class Pokemon(
        val name: String,
        val url: String
    ) {
        fun getImageUrl(): String {
            val index = url.split("/".toRegex()).dropLast(1).last()
            return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$index.png"
        }
    }

}
