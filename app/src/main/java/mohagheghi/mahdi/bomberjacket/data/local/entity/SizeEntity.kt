package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "size")
data class SizeEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val title: String
)
