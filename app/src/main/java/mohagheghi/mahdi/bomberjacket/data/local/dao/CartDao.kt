package mohagheghi.mahdi.bomberjacket.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mohagheghi.mahdi.bomberjacket.data.local.entity.CartEntity
import mohagheghi.mahdi.bomberjacket.data.local.model.CartDetail

@Dao
interface CartDao {

    @Query(
        """SELECT
        c.id AS id,
        c.productId AS prodcutId,
        i.url AS productImageUrl,
        p.title AS productTitle,
        p.price AS productPrice,
        co.id AS productColorId,
        co.code AS productColorCode,
        s.id AS productSizeId,
        s.title AS productSizeTitle,
        COUNT(*) AS count
        FROM cart c
        LEFT JOIN product p ON c.productId = p.id
        LEFT JOIN image i ON p.mainImage = i.id
        LEFT JOIN color co ON c.colorId = co.id
        LEFT JOIN size s ON c.sizeId = s.id
        GROUP BY c.productId, c.colorId, c.sizeId
        """
    )
    fun getCartItems(): Flow<List<CartDetail>>

    @Query("SELECT COUNT(*) AS count FROM cart GROUP BY :productId, :colorId, :sizeId")
    fun getProductCountInCart(productId: Long, colorId: Long, sizeId: Int): Int

    @Insert
    suspend fun addToCart(cart: CartEntity)

    @Delete
    suspend fun removeFromCart(cart: CartEntity)
}