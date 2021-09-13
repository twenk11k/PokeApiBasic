package com.twenk11k.pokeapibasic.network

import com.twenk11k.pokeapibasic.model.PokemonInfo
import com.twenk11k.pokeapibasic.model.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeService {

    @GET("pokemon/")
    suspend fun fetchPokemonResponse(): Response<PokemonResponse>

    @GET("pokemon/{name}")
    suspend fun fetchPokemonInfo(@Path("name") name: String): Response<PokemonInfo>

}