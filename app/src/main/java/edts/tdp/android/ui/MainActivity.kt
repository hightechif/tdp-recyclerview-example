package edts.tdp.android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import edts.tdp.android.data.Movies
import edts.tdp.android.databinding.ActivityMainBinding
import edts.tdp.android.ui.movie.MovieAdapter
import edts.tdp.android.ui.movie.MovieDelegate

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MovieAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MovieAdapter()
        binding.rvMovies.adapter = adapter

        val linearLayoutManager = LinearLayoutManager(this, VERTICAL, false)
        binding.rvMovies.layoutManager = linearLayoutManager

        adapter.delegate = object : MovieDelegate {
            override fun onItemClicked(name: String) {
                val toast = Toast.makeText(this@MainActivity, "$name dipilih", Toast.LENGTH_SHORT)
                toast.show()
            }

        }

        adapter.setAdapter(Movies.getList())
        binding.rvMovies.isVisible = Movies.getList().isNotEmpty()
    }
}