package mohagheghi.mahdi.bomberjacket.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mohagheghi.mahdi.bomberjacket.data.local.entity.ColorEntity

@Dao
interface ColorDao {

    @Query("SELECT * FROM color WHERE id IN (:colorIds)")
    fun getColorsByIds(colorIds: List<Long>): Flow<List<ColorEntity>>
}