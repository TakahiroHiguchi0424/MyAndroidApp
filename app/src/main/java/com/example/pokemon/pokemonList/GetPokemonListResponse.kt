@file:Suppress("UNREACHABLE_CODE")

package com.example.pokemon.pokemonList

import android.os.Looper
import org.json.JSONObject
import java.util.logging.Handler

data class GetPokemonListResponse(
    val responseCode: Int,
    val pokemonList: List<Pokemon>
)

//internal fun JSONObject.getResponse(): GetPokemonListResponse {
//    return GetPokemonListResponse(
//        this.getInt("code"),
//        Pokemon().jsonToInstance(this)
//    )
//}

//    var pokemonNumber = binding.editTextNumber.text
//
//    var requestUrl = "https://pokeapi.co/api/v2/pokemon/" + pokemonNumber
//
//    Thread {
//
//        val handler: Handler = Handler(Looper.getMainLooper())
//
//        var responseBody = GetPokemonListRequest(requestUrl)
//
//        if(responseBody != null){
//
//            var pokemon = Json.decodeFromString<Pokemon>(responseBody)
//
//            var pokemonName = pokemon.name
//
//            var pokemonImage = pokemon.sprites?.frontDefault
//        }
//
//    }
//}