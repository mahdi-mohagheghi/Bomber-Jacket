package mohagheghi.mahdi.bomberjacket.data.di

import mohagheghi.mahdi.bomberjacket.data.mapper.CategoryEntityMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.ProductDetailMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.ProductSimpleMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.SizeEntityMapper
import mohagheghi.mahdi.bomberjacket.data.repoimpl.ProductRepoImpl
import mohagheghi.mahdi.bomberjacket.domain.repo.ProductRepo
import org.koin.dsl.module

val repoModule = module {

    factory { CategoryEntityMapper() }

    factory { ProductSimpleMapper() }

    factory { ProductDetailMapper() }

    factory { CategoryEntityMapper() }

    factory { SizeEntityMapper() }

    single<ProductRepo> {
        ProductRepoImpl(
            categoryDao = get(),
            categoryEntityMapper = get(),
            productDao = get(),
            productSimpleMapper = get(),
            colorDao = get(),
            sizeDao = get(),
            productDetailMapper = get(),
            colorEntityMapper = get(),
            sizeEntityMapper = get(),
            favoriteDao = get()
        )
    }
}