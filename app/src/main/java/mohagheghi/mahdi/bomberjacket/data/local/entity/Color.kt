package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Color(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "code") val code: String
)
