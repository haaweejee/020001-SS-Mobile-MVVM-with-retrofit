package id.himtif.android.movieapp.data

object DataMovie {
    fun getTopMovie() : List<MovieData> {
        val movieList = ArrayList<MovieData>()
        movieList.add(
            MovieData(
                1,
            "Spider-Man: No Way Home",
            "Released",
                "15 Desember, 2021",
            "Action",
            "2 Jam 30 Menit",
            "John Watts",
            "Dengan identitas Spider-Man sekarang terungkap, web-slinger lingkungan kami yang ramah dibuka kedoknya dan tidak lagi dapat memisahkan kehidupan normalnya sebagai Peter Parker dari taruhan tinggi menjadi pahlawan super. Ketika Peter meminta bantuan dari Doctor Strange, taruhannya menjadi lebih berbahaya, memaksanya untuk menemukan apa artinya menjadi Spider-Man.",
            "https://m.media-amazon.com/images/M/MV5BZWMyYzFjYTYtNTRjYi00OGExLWE2YzgtOGRmYjAxZTU3NzBiXkEyXkFqcGdeQXVyMzQ0MzA0NTM@._V1_QL75_UX380_CR0,0,380,562_.jpg",
                "https://www.themoviedb.org/t/p/original/1Rr5SrvHxMXHu5RjKpaMba8VTzi.jpg",
            9.0,
            listOf(
                MovieCast(
                    "Tom Holland",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2qhIDp44cAqP2clOgt2afQI07X8.jpg",
                    "Peter Parker / Spiderman"
                ),
                MovieCast(
                    "Zendaya",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jHWlWOasiqKS8JI40g9GDH5X6AL.jpg",
                    "Michelle 'MJ' Jones"
                ),
                MovieCast(
                    "Benedict Cumberbatch",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fBEucxECxGLKVHBznO0qHtCGiMO.jpg",
                    "Stephen Strange / Doctor Strange"
                ),
                MovieCast(
                    "Jacob Batalon",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/53YhaL4xw4Sb1ssoHkeSSBaO29c.jpg",
                    "Ned Leeds"
                ),
                MovieCast(
                    "Jamie Foxx",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hPwCMEq6jLAidsXAX5BfoYgIfg2.jpg",
                    "Max Dillon / Electro"
                ),
                MovieCast(
                    "Willem Dafoe",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ui8e4sgZAwMPi3hzEO53jyBJF9B.jpg",
                    "Norman Osborn / Green Goblin"
                    ),
                )
            ),
        )
        movieList.add(
            MovieData(
                2,
                "The Matrix Resurrections",
                "Released",
                "22 Desember, 2021",
                "Action, Science Fiction",
                "2 Jam 28 Menit",
                "Lana Wachowski",
                "Diganggu oleh kenangan aneh, kehidupan Neo berubah secara tak terduga ketika dia menemukan dirinya kembali ke dalam Matrix.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8c4a8kE7PizaGQQnditMmI1xbRp.jpg",
                "https://www.themoviedb.org/t/p/original/dB0CxRwLXJoOrRPUvsJjb2hnPtq.jpg",
                8.0,
                listOf(
                    MovieCast(
                        "Keanu Reeves",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rRdru6REr9i3WIHv2mntpcgxnoY.jpg",
                        "Thomas A. Anderson / Neo"
                    ),
                    MovieCast(
                        "Carrie-Anne Moss",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xD4jTA3KmVp5Rq3aHcymL9DUGjD.jpg",
                        "Tiffany / Trinity"
                    ),
                    MovieCast(
                        "Yahya Abdul-Mateen II",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aBDebGZs2pAucyaK4EhHVJGm0Xu.jpg",
                        "Morpheus / Agent Smith"
                    ),
                    MovieCast(
                        "Jonathan Groff",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3kmnYKAzSc3Lp7iK5pcj97Hx9Cm.jpg",
                        "Smith"
                    ),
                )
            )
        )
        movieList.add(
            MovieData(
                3,
                "The King's Man",
                "Released",
                "22 Desember, 2021",
                "Adventure",
                "2 Jam 11 Menit",
                "Matthew Vaughn",
                "Saat kumpulan tiran dan dalang kriminal terburuk dalam sejarah berkumpul untuk merencanakan perang untuk memusnahkan jutaan orang, satu orang harus berpacu dengan waktu untuk menghentikan mereka.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/nj5HmHRZsrYQEYYXyAusFv35erP.jpg",
                "https://www.themoviedb.org/t/p/original/4OTYefcAlaShn6TGVK33UxLW9R7.jpg",
                8.2,
                listOf(
                    MovieCast(
                        "Ralph Fiennes",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/i8CQIAEAjkieDIA88b4gh122h8s.jpg",
                        "Orlando Oxford"
                    ),
                    MovieCast(
                        "Gemma Arterton",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/Alfm28oyHNiYweNCUaMmrVjVMAT.jpg",
                        "Polly"
                    ),
                    MovieCast(
                        "Rhys Ifans",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/g8EUs8r1ECh9plKtrxBparsxlZ1.jpg",
                        "Grigori Rasputin"
                    ),
                )
            )
        )
        movieList.add(
            MovieData(
                4,
                "Teka-Teki Tika",
                "Released",
                "23 Desember, 2021",
                "Misteri",
                "1 Jam 23 Menit",
                "Ernest Prakasa",
                "Seorang pengusaha saat merayakan hari jadi pernikahannya, dikejutkan dengan kemunculan seorang wanita yang mengaku sebagai anak kandungnya, Tika. Perpecahan dalam keluarga pun tak terhindarkan dan di balik itu, ada rahasia tentang identitas Tika.",
                "https://m.media-amazon.com/images/M/MV5BZWMyYzFjYTYtNTRjYi00OGExLWE2YzgtOGRmYjAxZTU3NzBiXkEyXkFqcGdeQXVyMzQ0MzA0NTM@._V1_QL75_UX380_CR0,0,380,562_.jpg",
                "https://cdn0-production-images-kly.akamaized.net/9p-32Xh4xwKnvJg0Yv0XzrPdtQg=/640x853/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3792901/original/096730100_1640221543-244971030_905002907060947_9217915062618630281_n.jpg",
                5.8,
                listOf(
                    MovieCast(
                        "Sheila Dara Aisha",
                        "https://haho.co.id/uploads/34/talent/416/profile/profile-1.png",
                        "Tika"
                    ),
                    MovieCast(
                        "Morgan Oey",
                        "https://m.media-amazon.com/images/M/MV5BYmJiOGZkM2QtNzI0Yy00NjYyLTgzMTMtN2NkMjJjZDBhM2RlXkEyXkFqcGdeQXVyMTQ0Mjk3MTI5._V1_UY317_CR51,0,214,317_AL_.jpg",
                        "Andre Limanto"
                    ),
                    MovieCast(
                        "Dion Wiyoko",
                        "https://img.beritasatu.com/cache/beritasatu/910x580-2/1547187879.jpg",
                        "Arnold Limanto"
                    ),
                    MovieCast(
                        "Jenny Chang",
                        "https://cdn-2.tstatic.net/tribunnews/foto/images/preview/20140127_182116_jenny-chang.jpg",
                        "Sherly"
                    ),
                )
            ),
        )
        movieList.add(
            MovieData(
                4,
                "Teka-Teki Tika",
                "Released",
                "23 Desember, 2021",
                "Misteri",
                "1 Jam 23 Menit",
                "Ernest Prakasa",
                "Seorang pengusaha saat merayakan hari jadi pernikahannya, dikejutkan dengan kemunculan seorang wanita yang mengaku sebagai anak kandungnya, Tika. Perpecahan dalam keluarga pun tak terhindarkan dan di balik itu, ada rahasia tentang identitas Tika.",
                "https://m.media-amazon.com/images/M/MV5BZWMyYzFjYTYtNTRjYi00OGExLWE2YzgtOGRmYjAxZTU3NzBiXkEyXkFqcGdeQXVyMzQ0MzA0NTM@._V1_QL75_UX380_CR0,0,380,562_.jpg",
                "https://cdn0-production-images-kly.akamaized.net/9p-32Xh4xwKnvJg0Yv0XzrPdtQg=/640x853/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3792901/original/096730100_1640221543-244971030_905002907060947_9217915062618630281_n.jpg",
                5.8,
                listOf(
                    MovieCast(
                        "Sheila Dara Aisha",
                        "https://haho.co.id/uploads/34/talent/416/profile/profile-1.png",
                        "Tika"
                    ),
                    MovieCast(
                        "Morgan Oey",
                        "https://m.media-amazon.com/images/M/MV5BYmJiOGZkM2QtNzI0Yy00NjYyLTgzMTMtN2NkMjJjZDBhM2RlXkEyXkFqcGdeQXVyMTQ0Mjk3MTI5._V1_UY317_CR51,0,214,317_AL_.jpg",
                        "Andre Limanto"
                    ),
                    MovieCast(
                        "Dion Wiyoko",
                        "https://img.beritasatu.com/cache/beritasatu/910x580-2/1547187879.jpg",
                        "Arnold Limanto"
                    ),
                    MovieCast(
                        "Jenny Chang",
                        "https://cdn-2.tstatic.net/tribunnews/foto/images/preview/20140127_182116_jenny-chang.jpg",
                        "Sherly"
                    ),
                )
            ),
        )
        movieList.add(
            MovieData(
                5,
                "Yowis Ben Finale",
                "Released",
                "25 November, 2021",
                "Comedy, Drama",
                "1 Jam 53 Menit",
                "Fajar Nugroho, Bayu Skak",
                "Di tengah ketenarannya sebagai grup musik, Yowis Ben mengancam akan kehilangan salah satu personelnya dan juga manajer yang selama ini mendampingi mereka.",
                "https://popcornsg.s3.amazonaws.com/movies/650/8534-34802-Yowisbenjpg",
                "https://i.ytimg.com/vi/PbkyO3s4rq8/maxresdefault.jpg",
                8.4,
                listOf(
                    MovieCast(
                        "Bayu Skak",
                        "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1569599602/cquhuqi65mexgkhhvk0h.jpg",
                        "Bayu"
                    ),
                    MovieCast(
                        "Joshua Suherman",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Joshua_Suherman%2C_Netmediatama%2C_00.18.jpg/240px-Joshua_Suherman%2C_Netmediatama%2C_00.18.jpg",
                        "Doni"
                    ),
                    MovieCast(
                        "Brandon Salim",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Brandon_Salim_Gogirl%21_TV.png/220px-Brandon_Salim_Gogirl%21_TV.png",
                        "Nando"
                    ),
                    MovieCast(
                        "Anya Geraldine",
                        "https://cdn1-production-images-kly.akamaized.net/SMUXOy5X_uQ7UP8cZW8KpKu0LaE=/640x853/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3376741/original/017025200_1613355753-Anya_Geraldine_0.jpg",
                        "Asih"
                    ),
                    MovieCast(
                        "Devina Aureel",
                        "https://cdn.idntimes.com/content-images/community/2019/12/30890645-213747469390617-5202418654997643264-n-7807f91ae6648fa2c09860c7b739ed5b_600x400.jpg",
                        "Stevia"
                    ),
                    MovieCast(
                        "Arief Didu",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Arief_Didu_-_Rewrite_%282019%29.png/220px-Arief_Didu_-_Rewrite_%282019%29.png",
                        "Cak Jon"
                    ),
                )
            ),
        )
        return movieList
    }


}