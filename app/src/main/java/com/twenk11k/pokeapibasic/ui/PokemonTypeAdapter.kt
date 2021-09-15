package com.twenk11k.pokeapibasic.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.twenk11k.pokeapibasic.R
import com.twenk11k.pokeapibasic.data.model.PokemonType
import com.twenk11k.pokeapibasic.databinding.ItemPokemonTypeBinding

class PokemonTypeAdapter : RecyclerView.Adapter<PokemonTypeAdapter.ViewHolder>() {

    private val items = ArrayList<PokemonType>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemPokemonTypeBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_pokemon_type,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            data = items[position]
        }
    }

    fun updateAdapter(list: List<PokemonType>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: ItemPokemonTypeBinding) :
        RecyclerView.ViewHolder(binding.root)

}