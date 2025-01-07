package mohagheghi.mahdi.bomberjacket.domain.repo

import kotlinx.coroutines.flow.Flow
import mohagheghi.mahdi.bomberjacket.domain.model.Category
import mohagheghi.mahdi.bomberjacket.domain.model.Product

interface ProductRepo {

    fun getProductCategories(): Flow<List<Category>>

    fun getProductsByCategory(categoryId: Long): Flow<List<Product>>

    fun getProductDetail(productId: Long): Flow<Product.Detail>

    suspend fun addProductToFavorite(productId: Long)
}