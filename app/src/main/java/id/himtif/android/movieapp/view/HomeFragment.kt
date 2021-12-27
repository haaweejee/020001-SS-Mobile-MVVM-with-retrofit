package id.himtif.android.movieapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import id.himtif.android.movieapp.*
import id.himtif.android.movieapp.data.MovieData
import id.himtif.android.movieapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var verticalAdapter : MovieVerticalAdapter
    private lateinit var viewModel : MovieViewModel

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_STATUS = "extra_status"
        const val EXTRA_DATE = "extra_date"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_DURATION = "extra_duration"
        const val EXTRA_DIRECTOR = "extra_director"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_POSTER = "extra_poster"
        const val EXTRA_BACKDROP = "extra_backdrop"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_CAST = "extra_cast"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeVerticalAdapter()
        getTrendingMovie()
    }

    /***
     * Fungsi untuk memanggil Adapter
     */
    private fun initializeVerticalAdapter(){
        verticalAdapter = MovieVerticalAdapter()
        binding.apply {
            rvPremierList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            rvPremierList.adapter = verticalAdapter
            rvPremierList.setHasFixedSize(true)

            rvOnComing.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            rvOnComing.adapter = verticalAdapter
            rvOnComing.setHasFixedSize(true)
        }

        verticalAdapter.setOnItemClick(object :OnItemClickCallback{
            override fun onItemClicked(data: MovieData) {
                val bundle = Bundle()
                bundle.putString(EXTRA_NAME, data.movieName)
                bundle.putString(EXTRA_POSTER, data.moviePoster)
                bundle.putString(EXTRA_BACKDROP, data.movieBackdrop)
                bundle.putString(EXTRA_DATE, data.movieReleaseDate)
                bundle.putString(EXTRA_STATUS, data.movieStatus)
                bundle.putString(EXTRA_DURATION, data.movieDuration)
                bundle.putString(EXTRA_GENRE, data.movieGenre)
                bundle.putString(EXTRA_DIRECTOR, data.movieDirector)
                bundle.putString(EXTRA_OVERVIEW, data.movieOverview)
                bundle.putDouble(EXTRA_RATING, data.movieRating)
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_detailMovieFragment, bundle)
            }
        })
    }

    /***
     * Fungsi untuk memanggil List Film
     */
    private fun getTrendingMovie(){
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        viewModel.getTrendingMovie()
        verticalAdapter.setMovieList(viewModel.getTrendingMovie())
    }
}