package mohagheghi.mahdi.bomberjacket.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "product",
    foreignKeys = [
        ForeignKey(
            entity = ImageEntity::class,
            parentColumns = ["id"],
            childColumns = ["mainImage"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class ProductEntity(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "desc") val desc: String?,
    @ColumnInfo(name = "price") val price: Double,
    @ColumnInfo(name = "mainImage") val mainImageId: Long,
    @ColumnInfo(name = "images") val imagesId: List<Long>?,
    @ColumnInfo(name = "colors") val colorsId: List<Long>,
    @ColumnInfo(name = "sizes") val sizesId: List<Long>?,
    @ColumnInfo(name = "categoryId") val categoryId: Long
)
