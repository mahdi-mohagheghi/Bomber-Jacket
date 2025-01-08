package mohagheghi.mahdi.bomberjacket.data.mapper

import mohagheghi.mahdi.bomberjacket.base.BaseMapper
import mohagheghi.mahdi.bomberjacket.data.local.entity.CartEntity
import mohagheghi.mahdi.bomberjacket.domain.model.Cart

class CartMapper : BaseMapper<Cart, CartEntity> {
    override fun map(from: Cart): CartEntity {
        return CartEntity(
            id = from.id,
            productId = from.productId,
            colorId = from.productColor.id,
            sizeId = from.productSize?.id
        )
    }
}