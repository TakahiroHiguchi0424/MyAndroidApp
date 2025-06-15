package com.example.pokemon.pokemonList

sealed interface OneShot<out V> {
    suspend fun getResult(): LoadResult<V>
}

sealed interface OneShotWithCommand<in T,out V> {
    suspend fun getResult(command: T): LoadResult<V>
}