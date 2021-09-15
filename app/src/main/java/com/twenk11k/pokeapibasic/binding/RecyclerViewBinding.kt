package com.twenk11k.pokeapibasic.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.twenk11k.pokeapibasic.data.model.PokemonType
import com.twenk11k.pokeapibasic.ui.PokemonTypeAdapter

object RecyclerViewBinding {

    @JvmStatic
    @BindingAdapter("adapterPokemonTypeList")
    fun bindAdapterPokemonTypeList(
        view: RecyclerView,
        list: List<PokemonType>?
    ) {
        list?.let {
            (view.adapter as PokemonTypeAdapter).updateAdapter(it)
        }
    }

}