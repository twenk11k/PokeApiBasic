package com.twenk11k.pokeapibasic.di

import com.twenk11k.pokeapibasic.data.network.PokeService
import com.twenk11k.pokeapibasic.data.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providesMainRepository(
        pokeService: PokeService
    ) = MainRepository(pokeService)

}