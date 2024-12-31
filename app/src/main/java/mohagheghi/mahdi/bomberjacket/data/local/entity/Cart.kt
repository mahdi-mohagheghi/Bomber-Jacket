package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cart(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "productId") val productId: Long,
    @ColumnInfo(name = "colorId") val colorId: Long,
    @ColumnInfo(name = "sizeId") val sizeId: Int?
)
