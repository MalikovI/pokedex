package com.example.pokedex.adapter

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.pokedex.R
import com.example.pokedex.constants.*
import com.example.pokedex.databinding.ItemPokemonBinding
import com.example.pokedex.model.PokemonModel
class PokemonAdapter(val list : ArrayList<PokemonModel>) :
    RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PokemonViewHolder(val binding : ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonModel) {
            binding.pokemonName.text = model.name
            binding.pokemonNumber.text = model.number
            when (model.name) {
                pikachu -> {
                    val color = itemView.context.getColor(R.color.picachu_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.pikachu)

                }
                charmander -> {
                    val color  = itemView.context.getColor(R.color.charmander_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.charmander)
                }
                mew -> {
                    val color = itemView.context.getColor(R.color.mew_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.mew)
                }
                squirtle -> {
                    val color = itemView.context.getColor(R.color.squirtle_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.squirtle)

                }
                bulbasaur -> {
                    val color =itemView.context.getColor(R.color.bulb_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.bulbasaur)


                }
                aron -> {
                    val color = itemView.context.getColor(R.color.aron_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.aron)


                }
                ditto -> {
                    val color = itemView.context.getColor(R.color.ditto_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.ditto)

                }
                butterfree -> {
                    val color = itemView.context.getColor(R.color.butter_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.butterfree)

                }
                gastly -> {
                    val color = itemView.context.getColor(R.color.gastly_clr)
                    updateColor(color)
                    binding.pokemonImg.load(R.drawable.gastly)

                }
            }
        }

        private fun updateColor(@ColorInt color: Int) {
            val drawable = itemView.background as GradientDrawable
            drawable.mutate()
            drawable.setStroke(2, color)

            val textDrawable = binding.pokemonName.background as GradientDrawable
            textDrawable.mutate()
            textDrawable.setTint(color)

            val textNumber = binding.pokemonNumber
            textNumber.setTextColor(color)
        }
    }
}
