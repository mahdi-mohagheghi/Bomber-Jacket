package mohagheghi.mahdi.bomberjacket.domain.repo

import kotlinx.coroutines.flow.Flow
import mohagheghi.mahdi.bomberjacket.domain.model.Cart

interface OrderRepo {

    suspend fun addToCart(cart: Cart)

    suspend fun removeFromCart(cart: Cart)

    fun getCartItems(): Flow<List<Cart>>

    fun getProductCountInCart(cart: Cart): Flow<Int>

    suspend fun addOrder()
}