package edts.tdp.android.data

import edts.tdp.android.R
import edts.tdp.android.model.Movie

object Movies {

    fun getList(): List<Movie> {
        return listOf(
            Movie(
                image = R.drawable.naruto,
                name = "Naruto"
            ),
            Movie(
                image = R.drawable.sasuke,
                name = "Sasuke"
            ),
            Movie(
                image = R.drawable.sakura,
                name = "Sakura"
            )
        )
    }

}