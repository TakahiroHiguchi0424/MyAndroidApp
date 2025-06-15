package com.example.pokemon.pokemonList

import android.util.Log
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.util.concurrent.CompletableFuture
import java.util.function.Function
import java.util.stream.Collectors


data class Sprite(
    @SerializedName("front_default")
    val frontDefault: String,
)
data class PokemonJson(
    val id: Int,
    val name: String,
    val sprites: Sprite,
)

data class Pokemon(
    val id: Int = 0,
    val name: String = "",
    val imageUrl: String = "",
) {

    fun jsonToInstance(jsonString: String): Pokemon? {
        return try {
            //ジェイソンストリングをJSONする
            val pokemonJson = Gson().fromJson(jsonString, PokemonJson::class.java)
            Pokemon(
                id = pokemonJson.id,
                name = pokemonJson.name,
                imageUrl = pokemonJson.sprites.frontDefault
            )
        } catch (ignored: Exception) {
            Log.d("log_test", "ignored:${ignored} ")
            null
        }
    }

}

private fun Any.add(element: CompletableFuture<List<Pokemon>>?) {

}


//fun getPokemon(i: Int): CompletableFuture<List<Pokemon>> {
//    val FIRST_GENERATION_NUMBER = 151
//    val futures = (1..FIRST_GENERATION_NUMBER).map { getPokemon(it) }
//    return CompletableFuture.allOf(*futures.toTypedArray())
//        .thenApply { _ ->
//            futures.map { it.get() }
//        }
//}


//enum class PokemonStatusType {
//    ALL_CALL,VIDEO_CALL_ONLY,VOICE_CALL_ONLY,CHAT_ONLY
//}
//
//data class FootPrintActionInfo(
//    //val callDialogInfo: CallDialogInfo,
//    val actionType: PokemonStatusType,
//)