package com.example.pokemon.pokemonList

sealed interface LoadResult<out T> {
    data class SUCCESS<out T>(val content: T): LoadResult<T>
    data class FAILED<out T>(val type: ResultFailedType): LoadResult<T>
}