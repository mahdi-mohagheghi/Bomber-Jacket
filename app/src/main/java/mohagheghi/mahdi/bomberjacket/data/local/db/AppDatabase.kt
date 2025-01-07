package mohagheghi.mahdi.bomberjacket.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import mohagheghi.mahdi.bomberjacket.data.local.dao.CartDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.CategoryDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ColorDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.FavoriteDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ImageDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ProductDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.SizeDao
import mohagheghi.mahdi.bomberjacket.data.local.entity.CartEntity
import mohagheghi.mahdi.bomberjacket.data.local.entity.CategoryEntity
import mohagheghi.mahdi.bomberjacket.data.local.entity.ColorEntity
import mohagheghi.mahdi.bomberjacket.data.local.entity.FavoriteEntity
import mohagheghi.mahdi.bomberjacket.data.local.entity.ImageEntity
import mohagheghi.mahdi.bomberjacket.data.local.entity.ProductEntity
import mohagheghi.mahdi.bomberjacket.data.local.entity.SizeEntity

@Database(
    entities = [
        CartEntity::class,
        CategoryEntity::class,
        ColorEntity::class,
        FavoriteEntity::class,
        ImageEntity::class,
        ProductEntity::class,
        SizeEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun cartDao(): CartDao

    abstract fun categoryDao(): CategoryDao

    abstract fun colorDao(): ColorDao

    abstract fun favoriteDao(): FavoriteDao

    abstract fun imageDao(): ImageDao

    abstract fun productDao(): ProductDao

    abstract fun sizeDao(): SizeDao
}