package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Image(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "url") val url: String
)
