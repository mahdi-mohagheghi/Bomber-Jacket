package mohagheghi.mahdi.bomberjacket.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import mohagheghi.mahdi.bomberjacket.data.local.entity.Favorite

@Dao
interface FavoriteDao {

    @Insert
    suspend fun addToFavorite(favorite: Favorite)
}