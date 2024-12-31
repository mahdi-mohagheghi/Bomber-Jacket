package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Favorite(
    @PrimaryKey val productId: Long,
    @ColumnInfo(name = "isFav") val isFav: Boolean
)