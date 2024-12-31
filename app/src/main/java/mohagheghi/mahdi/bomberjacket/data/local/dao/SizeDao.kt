package mohagheghi.mahdi.bomberjacket.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mohagheghi.mahdi.bomberjacket.data.local.entity.Size

@Dao
interface SizeDao {

    @Query("SELECT * FROM size WHERE id IN (:sizeIds)")
    fun getSizesByIds(sizeIds: List<Int>): Flow<List<Size>>
}