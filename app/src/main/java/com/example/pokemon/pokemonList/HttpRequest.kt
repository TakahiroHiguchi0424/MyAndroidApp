package com.example.pokemon.pokemonList

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import java.lang.Exception
import java.util.concurrent.TimeUnit

class HttpRequest {
    suspend fun requestServer(url: String): String? {
        return withContext(Dispatchers.IO) {
            try {
                val client = OkHttpClient.Builder()
                    .connectTimeout(100000, TimeUnit.MILLISECONDS)
                    .readTimeout(100000.toLong(), TimeUnit.MILLISECONDS)
                    .build()
                
//                val url = URL("https://pokeapi.co/api/v2/pokemon/1")

                val request: okhttp3.Request = okhttp3.Request.Builder()
                    .url(url)
                    .build()

                client.newCall(request).execute().use { response ->
                    val responseBody = response.body?.string() ?: ""
                    return@withContext responseBody
                }

            } catch (ignored: Exception) {
                Log.d("log_test", "requestServer: ${ignored.stackTraceToString()}")
            }
            return@withContext null
        }
    }
}