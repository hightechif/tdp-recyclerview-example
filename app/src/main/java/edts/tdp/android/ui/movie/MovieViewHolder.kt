package edts.tdp.android.ui.movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edts.tdp.android.R

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ivProfile: ImageView = itemView.findViewById(R.id.ivProfile)
    val tvName: TextView = itemView.findViewById(R.id.tvName)
}