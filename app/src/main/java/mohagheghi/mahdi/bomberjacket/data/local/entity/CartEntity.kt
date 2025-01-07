package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart")
data class CartEntity(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "productId") val productId: Long,
    @ColumnInfo(name = "colorId") val colorId: Long,
    @ColumnInfo(name = "sizeId") val sizeId: Int?
)
