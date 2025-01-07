package mohagheghi.mahdi.bomberjacket.data.mapper

import mohagheghi.mahdi.bomberjacket.base.BaseMapper
import mohagheghi.mahdi.bomberjacket.data.local.model.ProductSimple
import mohagheghi.mahdi.bomberjacket.domain.model.Product

class ProductSimpleMapper : BaseMapper<ProductSimple, Product> {
    override fun map(from: ProductSimple): Product {
        return Product(
            id = from.id,
            categoryId = from.categoryId,
            imageUrl = from.mainImageUrl,
            isFav = from.isFav
        )
    }
}