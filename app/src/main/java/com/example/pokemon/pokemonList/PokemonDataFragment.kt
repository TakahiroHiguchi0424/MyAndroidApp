package com.example.pokemon.pokemonList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.pokemon.R
import java.io.Serializable


class PokemonDataFragment(private val pokemon: Pokemon) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_pokemon_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textNumberView: TextView = view.findViewById(R.id.text_no)
        val textNameView: TextView = view.findViewById(R.id.text_name)
        val imageView: ImageView = view.findViewById(R.id.image)

        textNumberView.text = "No. ${pokemon.id.toString()}"
        textNameView.text = pokemon.name
        Glide.with(view.context)   // Contextを指定
            .load(pokemon.imageUrl)  // 画像のURLをロード
            .into(imageView)


    }
}





