package com.example.pokemon.pokemonList


import androidx.appcompat.app.AppCompatActivity
import com.example.pokemon.databinding.ActivityMainBinding
import org.json.JSONObject
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.concurrent.TimeUnit

class GetPokemonListRequest() : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding


    suspend fun execute(): GetPokemonListResponse? {
//        return getPokemonListRequest()?.getResponse()
        return null

    }

    private suspend fun getPokemonListRequest(): JSONObject? {
//        return HttpRequest().requestServer(dataJsonString())
        return null
    }

    private fun dataJsonString(): String {
        //val token =
        //PrefManager.getPreferencesString(MyApplication.appContext, PrefManager.KEY_TOKEN)
        return JSONObject().apply {
            put("api", "lst_chk_out")
            //put("token", token)
            put("skip", 0) // skipは固定値か？
            put("take", 50)
        }.toString()
    }
}