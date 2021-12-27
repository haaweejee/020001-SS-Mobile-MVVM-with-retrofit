package id.himtif.android.movieapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import id.himtif.android.movieapp.databinding.FragmentDetailMovieBinding
import id.himtif.android.movieapp.view.HomeFragment


class DetailMovieFragment : Fragment() {

    private lateinit var binding : FragmentDetailMovieBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailMovieBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString(HomeFragment.EXTRA_NAME)
        val status = arguments?.getString(HomeFragment.EXTRA_STATUS)
        val date = arguments?.getString(HomeFragment.EXTRA_DATE)
        val genre = arguments?.getString(HomeFragment.EXTRA_GENRE)
        val duration = arguments?.getString(HomeFragment.EXTRA_DURATION)
        val director = arguments?.getString(HomeFragment.EXTRA_DIRECTOR)
        val overview = arguments?.getString(HomeFragment.EXTRA_OVERVIEW)
        val poster = arguments?.getString(HomeFragment.EXTRA_POSTER)
        val backdrop = arguments?.getString(HomeFragment.EXTRA_BACKDROP)
        val rating = arguments?.getDouble(HomeFragment.EXTRA_RATING)

        binding.apply {
            movieName.text = name
            statusMovie.text = status
            releaseMovie.text = date
            genreMovie.text = genre
            durationMovie.text = duration
            directorMovie.text = director
            overviewMovie.text = overview
            movieRating.text = rating.toString()

            Glide.with(this@DetailMovieFragment)
                .load(poster)
                .into(posterMovie)

            Glide.with(this@DetailMovieFragment)
                .load(backdrop)
                .into(backdropMovie)
        }
    }

}