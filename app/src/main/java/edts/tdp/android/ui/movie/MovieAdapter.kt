package edts.tdp.android.ui.movie

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edts.tdp.android.R
import edts.tdp.android.model.Movie

class MovieAdapter: RecyclerView.Adapter<MovieViewHolder>() {

    private val list: MutableList<Movie> = mutableListOf()
    var delegate: MovieDelegate? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.ivProfile.setImageResource(list[position].image)
        holder.tvName.text = list[position].name
        holder.itemView.setOnClickListener {
            delegate?.onItemClicked(list[position].name)
        }
    }

    override fun getItemCount() = list.size

    @SuppressLint("NotifyDataSetChanged")
    fun setAdapter(movies: List<Movie>) {
        list.clear()
        list.addAll(movies)
        notifyDataSetChanged()
    }

}