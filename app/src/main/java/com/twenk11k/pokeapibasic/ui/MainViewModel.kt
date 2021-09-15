package com.twenk11k.pokeapibasic.ui

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import com.twenk11k.pokeapibasic.model.PokemonInfo
import com.twenk11k.pokeapibasic.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    private var pokemonInfoLiveData: LiveData<PokemonInfo?>

    private val isLoading = ObservableBoolean(false)
    private val toastMessage = ObservableField<String>()

    private val loadTrigger = MutableLiveData(Unit)

    init {
        pokemonInfoLiveData = loadTrigger.switchMap {
            mainRepository.getPokemonInfo(
                onStart = { isLoading.set(true) },
                onComplete = { isLoading.set(false) },
                onError = { toastMessage.set(it) }
            ).asLiveData(viewModelScope.coroutineContext + Dispatchers.IO)
        }
    }

    fun getPokemonInfoLiveData() = pokemonInfoLiveData

    fun refresh() {
        loadTrigger.value = Unit
    }

}