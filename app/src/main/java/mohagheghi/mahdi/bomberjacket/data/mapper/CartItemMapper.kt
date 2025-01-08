package mohagheghi.mahdi.bomberjacket.data.mapper

import mohagheghi.mahdi.bomberjacket.base.BaseMapper
import mohagheghi.mahdi.bomberjacket.data.local.model.CartItem
import mohagheghi.mahdi.bomberjacket.domain.model.Cart
import mohagheghi.mahdi.bomberjacket.domain.model.Product

class CartItemMapper : BaseMapper<CartItem, Cart> {
    override fun map(from: CartItem): Cart {
        return Cart(
            id = from.id,
            productId = from.productId,
            productImageUrl = from.productImageUrl,
            productTitle = from.productTitle,
            productPrice = from.productPrice,
            productColor = Product.Color(id = from.productColorId, code = from.productColorCode),
            productSize = from.productSizeId?.let {
                Product.Size(
                    id = it,
                    label = from.productSizeTitle ?: ""
                )
            },
            count = from.count
        )
    }
}