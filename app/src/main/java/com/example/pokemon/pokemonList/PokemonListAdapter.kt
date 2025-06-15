package com.example.pokemon.pokemonList

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemon.R


class PokemonListAdapter(
    private val items: List<Pokemon>,
    private val pokemonClickListItemListener: OnClickListItemListener
    ) : RecyclerView.Adapter<PokemonListAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item, pokemonClickListItemListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textNumberView: TextView = itemView.findViewById(R.id.text_no)
        private val textNameView: TextView = itemView.findViewById(R.id.text_name)
        private val imageView: ImageView = itemView.findViewById(R.id.image)
        private val pokemonImageView: ImageView = itemView.findViewById(R.id.pokemon_image_view)

        fun bind(pokemon: Pokemon, clickListItemListener: OnClickListItemListener) {
            // Bind item data to view
            textNumberView.text = "No. ${pokemon.id.toString()}"
            textNameView.text = pokemon.name
            Glide.with(itemView.context)   // Contextを指定
                .load(pokemon.imageUrl)  // 画像のURLをロード
                .into(imageView)

            pokemonImageView.setOnClickListener {
                clickListItemListener.click(pokemon)
            }
        }
    }

    interface OnClickListItemListener {
        fun click(pokemon: Pokemon?)
        fun requireActivity(): Any
    }

}