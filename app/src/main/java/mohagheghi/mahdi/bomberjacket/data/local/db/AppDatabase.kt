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
import mohagheghi.mahdi.bomberjacket.data.local.entity.Cart
import mohagheghi.mahdi.bomberjacket.data.local.entity.Category
import mohagheghi.mahdi.bomberjacket.data.local.entity.Color
import mohagheghi.mahdi.bomberjacket.data.local.entity.Favorite
import mohagheghi.mahdi.bomberjacket.data.local.entity.Image
import mohagheghi.mahdi.bomberjacket.data.local.entity.Product
import mohagheghi.mahdi.bomberjacket.data.local.entity.Size

@Database(
    entities = [
        Cart::class,
        Category::class,
        Color::class,
        Favorite::class,
        Image::class,
        Product::class,
        Size::class
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