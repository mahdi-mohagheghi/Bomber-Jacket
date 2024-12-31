package mohagheghi.mahdi.bomberjacket.data.di

import mohagheghi.mahdi.bomberjacket.data.local.dao.CartDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.CategoryDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ColorDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.FavoriteDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ImageDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ProductDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.SizeDao
import mohagheghi.mahdi.bomberjacket.data.local.db.AppDatabase
import mohagheghi.mahdi.bomberjacket.data.local.db.DatabaseHelper
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val localModule = module {

    single<AppDatabase> { DatabaseHelper.initDb(androidApplication()) }

    single<CartDao> { get<AppDatabase>().cartDao() }

    single<CategoryDao> { get<AppDatabase>().categoryDao() }

    single<ColorDao> { get<AppDatabase>().colorDao() }

    single<FavoriteDao> { get<AppDatabase>().favoriteDao() }

    single<ImageDao> { get<AppDatabase>().imageDao() }

    single<ProductDao> { get<AppDatabase>().productDao() }

    single<SizeDao> { get<AppDatabase>().sizeDao() }
}