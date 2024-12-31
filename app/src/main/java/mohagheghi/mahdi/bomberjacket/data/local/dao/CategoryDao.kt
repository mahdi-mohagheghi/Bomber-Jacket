package mohagheghi.mahdi.bomberjacket.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mohagheghi.mahdi.bomberjacket.data.local.entity.Category

@Dao
interface CategoryDao {

    @Query("select * from category")
    fun getCategories(): Flow<List<Category>>
}