package id.himtif.android.movieapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.himtif.android.movieapp.data.MovieData
import id.himtif.android.movieapp.databinding.CardItemBinding

class MovieVerticalAdapter : RecyclerView.Adapter<MovieVerticalAdapter.VerticalViewHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClick(onItemClickListener: OnItemClickCallback){
        this.onItemClickCallback = onItemClickListener
    }

    private val listMovie = ArrayList<MovieData>()
    fun setMovieList(movie: List<MovieData>){
        listMovie.clear()
        listMovie.addAll(movie)
    }

    inner class VerticalViewHolder(private val binding: CardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        internal fun bind(movie: MovieData){
            binding.root.setOnClickListener {
             onItemClickCallback.onItemClicked(movie)
            }

            Glide.with(itemView.context)
                .load(movie.moviePoster)
                .into(binding.posterMovie)

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VerticalViewHolder {
        val view = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size
}

interface OnItemClickCallback {
    fun onItemClicked(data: MovieData)
}
