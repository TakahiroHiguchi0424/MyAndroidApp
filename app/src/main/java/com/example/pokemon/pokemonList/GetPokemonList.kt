package com.example.pokemon.pokemonList

interface GetPokemonList: OneShotWithCommand<GetPokemonListInfo,GetPokemonListResult>

data class GetPokemonListInfo(
    val skip: Int
)

data class GetPokemonListResult(
    val list: List<Pokemon>
)