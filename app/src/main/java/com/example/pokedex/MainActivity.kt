package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokedex.adapter.PokemonAdapter
import com.example.pokedex.constants.*
import com.example.pokedex.databinding.ActivityMainBinding
import com.example.pokedex.model.PokemonModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var pokemonAdapter: PokemonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
    }

    private fun initAdapter() {
        val list = arrayListOf<PokemonModel>()
        list.add(PokemonModel("#004", charmander))
        list.add(PokemonModel("#025", pikachu))
        list.add(PokemonModel("#004", mew))
        list.add(PokemonModel("#001", bulbasaur))
        list.add(PokemonModel("#012", butterfree))
        list.add(PokemonModel("#007", squirtle))
        list.add(PokemonModel("#004", aron))
        list.add(PokemonModel("#132", ditto))
        list.add(PokemonModel("#092", gastly))

        pokemonAdapter = PokemonAdapter(list)
        binding.recyclerView.adapter = pokemonAdapter
    }
}