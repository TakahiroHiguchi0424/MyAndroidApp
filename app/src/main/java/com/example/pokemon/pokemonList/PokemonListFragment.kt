package com.example.pokemon.pokemonList

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.MainActivity
import com.example.pokemon.R
import com.example.pokemon.pokemonList.PokemonListAdapter.OnClickListItemListener


class PokemonListFragment : Fragment() {

    private lateinit var viewModel: PokemonListViewModel
    private lateinit var recyclerView: RecyclerView

//    private var viewModel: PokemonListViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.pokemonlistfragment, container, false)

        recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)

//        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        viewModel = ViewModelProvider(this).get(PokemonListViewModel::class.java)
        viewModel.pokemonList.observe(viewLifecycleOwner) { pokemonList ->
            recyclerView.adapter =
                PokemonListAdapter(pokemonList, createPokemonListItemClickListener())
        }
        Log.d("log_test", "onCreateView: ")
        return view
    }


    companion object {
        @JvmStatic
        fun newInstance() = PokemonListFragment()
    }

    private fun createPokemonListItemClickListener(): OnClickListItemListener {
        return object : OnClickListItemListener {
            override fun click(pokemon: Pokemon?) {

                Log.d("log_test", "bind: ${pokemon?.name} です")
                pokemon?.let {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.main_fragment, PokemonDataFragment(pokemon))
                        .addToBackStack(null)
                        .commit()
                }

            }

            override fun requireActivity(): Any {
                return this@PokemonListFragment.requireActivity()

            }
        }
    }
}




