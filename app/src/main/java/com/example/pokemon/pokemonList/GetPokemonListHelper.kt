package com.example.pokemon.pokemonList

import org.json.JSONObject

class GetPokemonListHelper: GetPokemonList {
    override suspend fun getResult(command: GetPokemonListInfo): LoadResult<GetPokemonListResult> {
        try {
            val response = GetPokemonListRequest().execute() ?: return LoadResult.FAILED(ResultFailedType.CANNOT_CONNECT)

            if (response.responseCode != 0)
                return LoadResult.FAILED(ResultFailedType.SERVER_ERROR)

            return LoadResult.SUCCESS(GetPokemonListResult(response.pokemonList))
        } catch (e: Exception) {
            return LoadResult.FAILED(ResultFailedType.CRASH)
        }
    }
}