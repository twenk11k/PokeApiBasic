package com.twenk11k.pokeapibasic.repository

import androidx.annotation.WorkerThread
import com.twenk11k.pokeapibasic.network.PokeService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject
import kotlin.random.Random

class MainRepository @Inject constructor(
    private val pokeService: PokeService
) {

    @WorkerThread
    fun getPokemonInfo(
        onStart: () -> Unit,
        onComplete: () -> Unit, onError: (String?) -> Unit
    ) = flow {
        val pokemonResponse = pokeService.fetchPokemonResponse()
        if (pokemonResponse.isSuccessful) {
            pokemonResponse.body()?.results?.let {
                val randomPokemon = it[Random.nextInt(it.size)]
                val pokemonInfo = pokeService.fetchPokemonInfo(randomPokemon.name).body()
                emit(pokemonInfo?.apply { imageUrl = randomPokemon.getImageUrl() })
            }
        } else {
            onError(pokemonResponse.message())
        }
    }.onStart { onStart() }.onCompletion { onComplete() }.flowOn(Dispatchers.IO)

}