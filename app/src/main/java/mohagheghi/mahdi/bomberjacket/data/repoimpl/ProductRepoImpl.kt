package mohagheghi.mahdi.bomberjacket.data.repoimpl

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import mohagheghi.mahdi.bomberjacket.data.local.dao.CategoryDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ColorDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.FavoriteDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.ProductDao
import mohagheghi.mahdi.bomberjacket.data.local.dao.SizeDao
import mohagheghi.mahdi.bomberjacket.data.local.entity.FavoriteEntity
import mohagheghi.mahdi.bomberjacket.data.mapper.CategoryEntityMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.ColorEntityMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.ProductDetailMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.ProductSimpleMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.SizeEntityMapper
import mohagheghi.mahdi.bomberjacket.domain.model.Category
import mohagheghi.mahdi.bomberjacket.domain.model.Product
import mohagheghi.mahdi.bomberjacket.domain.repo.ProductRepo

class ProductRepoImpl(
    private val categoryDao: CategoryDao,
    private val categoryEntityMapper: CategoryEntityMapper,
    private val productDao: ProductDao,
    private val productSimpleMapper: ProductSimpleMapper,
    private val colorDao: ColorDao,
    private val sizeDao: SizeDao,
    private val productDetailMapper: ProductDetailMapper,
    private val colorEntityMapper: ColorEntityMapper,
    private val sizeEntityMapper: SizeEntityMapper,
    private val favoriteDao: FavoriteDao
) : ProductRepo {

    override fun getProductCategories(): Flow<List<Category>> {
        return categoryDao.getCategories()
            .map { it.map { categoryEntity -> categoryEntityMapper.map(categoryEntity) } }
    }

    override fun getProductsByCategory(categoryId: Long): Flow<List<Product>> {
        return productDao.getProductsByCategory(categoryId)
            .map { it.map { productSimple -> productSimpleMapper.map(productSimple) } }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun getProductDetail(productId: Long): Flow<Product.Detail> {
        return productDao.getProductById(productId).flatMapLatest { productDetail ->
            combine(
                colorDao.getColorsByIds(productDetail.colors ?: emptyList()),
                sizeDao.getSizesByIds(productDetail.sizes ?: emptyList())
            ) { colors, sizes ->
                productDetailMapper.map(
                    from = productDetail,
                    colors = colors.map { colorEntityMapper.map(it) },
                    sizes = sizes.map { sizeEntityMapper.map(it) }
                )
            }
        }
    }

    override suspend fun addProductToFavorite(productId: Long) {
        favoriteDao.addToFavorite(FavoriteEntity(productId, true))
    }
}