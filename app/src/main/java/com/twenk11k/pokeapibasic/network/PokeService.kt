package com.twenk11k.pokeapibasic.network

import com.twenk11k.pokeapibasic.model.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokeService {

    @GET("pokemon/")
    suspend fun fetchPokemonResponse(): Response<PokemonResponse>

}