package mohagheghi.mahdi.bomberjacket.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import mohagheghi.mahdi.bomberjacket.data.local.model.ProductDetail
import mohagheghi.mahdi.bomberjacket.data.local.model.ProductSimple

@Dao
interface ProductDao {

    @Transaction
    @Query(
        """SELECT p.id, p.mainImage, i.url AS mainImageUrl, IFNULL(f.isFav, 0) AS isFav
        FROM product p
        LEFT JOIN image i ON p.mainImage = i.id
        LEFT JOIN favorite f ON p.id = f.productId
        WHERE p.categoryId = :categoryId
        """
    )
    fun getProductsByCategory(categoryId: Long): Flow<List<ProductSimple>>

    @Transaction
    @Query(
        """SELECT p.*, i.url AS mainImageUrl, IFNULL(f.isFav, 0) AS isFav
        FROM product p
        LEFT JOIN image i ON p.mainImage = i.id
        LEFT JOIN favorite f ON p.id = f.productId
        WHERE p.id = :productId
        """
    )
    fun getProductById(productId: Long): Flow<List<ProductDetail>>
}