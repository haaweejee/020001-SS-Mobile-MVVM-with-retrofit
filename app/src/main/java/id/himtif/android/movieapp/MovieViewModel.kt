package id.himtif.android.movieapp

import androidx.lifecycle.ViewModel
import id.himtif.android.movieapp.data.DataMovie

class MovieViewModel : ViewModel() {

    /***
     * Fungsi ini akan mengambil Data dari fungsi getTopMovie
     */
    fun getTrendingMovie() = DataMovie.getTopMovie()
}