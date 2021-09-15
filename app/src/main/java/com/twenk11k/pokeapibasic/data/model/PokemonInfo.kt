package com.twenk11k.pokeapibasic.data.model

data class PokemonInfo(
    val name: String,
    val types: List<PokemonType>,
    val height: String,
    val weight: String,
    @Transient var imageUrl: String
) {

    fun getFormattedHeight() = String.format("%.1f M", height.toFloat() / 10)

    fun getFormattedWeight() = String.format("%.1f KG", weight.toFloat() / 10)

}
