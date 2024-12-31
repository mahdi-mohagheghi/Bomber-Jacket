package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val title: String
)
