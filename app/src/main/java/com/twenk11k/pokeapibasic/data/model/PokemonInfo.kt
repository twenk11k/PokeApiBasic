package com.twenk11k.pokeapibasic.data.model

import com.google.gson.annotations.SerializedName

data class PokemonInfo(
    val name: String,
    @SerializedName("types") val types: List<PokemonType>,
    @Transient var imageUrl: String
) {

    data class PokemonType(
        val slot: Int,
        val type: Type
    )

    data class Type(
        val name: String
    )

}
