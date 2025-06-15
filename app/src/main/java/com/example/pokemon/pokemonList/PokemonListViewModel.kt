package com.example.pokemon.pokemonList

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class PokemonListViewModel : ViewModel() {

    private val _pokemonList = MutableLiveData<List<Pokemon>>()
    val pokemonList: LiveData<List<Pokemon>> = _pokemonList

    init {
        loadPokemonList()
    }

    private fun loadPokemonList() {
        viewModelScope.launch {
            val pokemonList = mutableListOf<Pokemon>()
            for (i in 1..151) {
                val response = HttpRequest().requestServer("https://pokeapi.co/api/v2/pokemon/$i")

                val pokemon = response?.let { Pokemon().jsonToInstance(it) }

                if (pokemon != null) {
                    pokemonList.add(pokemon)
                }
            }
            _pokemonList.postValue(pokemonList)
            Log.d("log_test", "getPokemonList: $pokemonList")
        }
    }
}