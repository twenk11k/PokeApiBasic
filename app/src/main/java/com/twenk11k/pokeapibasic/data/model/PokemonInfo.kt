package com.twenk11k.pokeapibasic.data.model

import com.google.gson.annotations.SerializedName

data class PokemonInfo(
    val name: String,
    @SerializedName("types") val types: List<PokemonType>,
    @Transient var imageUrl: String
)
