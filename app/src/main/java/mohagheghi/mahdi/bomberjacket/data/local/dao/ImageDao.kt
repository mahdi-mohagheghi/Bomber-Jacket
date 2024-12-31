package mohagheghi.mahdi.bomberjacket.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ImageDao {

    @Query("SELECT url FROM image WHERE id = :productId")
    fun getUrlsByProductId(productId: Long): Flow<List<String>?>
}