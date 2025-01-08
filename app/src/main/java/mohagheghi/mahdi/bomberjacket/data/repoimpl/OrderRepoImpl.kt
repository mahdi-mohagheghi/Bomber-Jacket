package mohagheghi.mahdi.bomberjacket.data.repoimpl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import mohagheghi.mahdi.bomberjacket.data.local.dao.CartDao
import mohagheghi.mahdi.bomberjacket.data.mapper.CartItemMapper
import mohagheghi.mahdi.bomberjacket.data.mapper.CartMapper
import mohagheghi.mahdi.bomberjacket.domain.model.Cart
import mohagheghi.mahdi.bomberjacket.domain.repo.OrderRepo

class OrderRepoImpl(
    private val cartDao: CartDao,
    private val cartMapper: CartMapper,
    private val cartItemMapper: CartItemMapper
) : OrderRepo {

    override suspend fun addToCart(cart: Cart) {
        cartDao.addToCart(cartMapper.map(cart))
    }

    override suspend fun removeFromCart(cart: Cart) {
        cartDao.removeFromCart(cartMapper.map(cart))
    }

    override fun getCartItems(): Flow<List<Cart>> {
        return cartDao.getCartItems().map { it.map { cartItem -> cartItemMapper.map(cartItem) } }
    }

    override fun getProductCountInCart(cart: Cart): Flow<Int> {
        return cartDao.getProductCountInCart(
            productId = cart.productId,
            colorId = cart.productColor.id,
            sizeId = cart.productSize?.id ?: 0
        )
    }

    override suspend fun addOrder() {
        //Add Order To DB
    }
}