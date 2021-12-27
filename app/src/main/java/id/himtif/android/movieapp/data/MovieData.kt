package id.himtif.android.movieapp.data

data class MovieData(
    val id : Int = 0,
    val movieName: String = "",
    val movieStatus : String = "",
    val movieReleaseDate : String = "",
    val movieGenre : String = "",
    val movieDuration : String = "",
    val movieDirector : String = "",
    val movieOverview : String = "",
    val moviePoster : String = "",
    val movieBackdrop : String = "",
    val movieRating : Double = 0.0,
    val movieCast : List<MovieCast>? = null
)
