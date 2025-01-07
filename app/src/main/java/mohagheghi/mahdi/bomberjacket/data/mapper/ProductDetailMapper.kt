package mohagheghi.mahdi.bomberjacket.data.mapper

import mohagheghi.mahdi.bomberjacket.base.BaseMapper
import mohagheghi.mahdi.bomberjacket.data.local.model.ProductDetail
import mohagheghi.mahdi.bomberjacket.domain.model.Product

class ProductDetailMapper : BaseMapper<ProductDetail, Product.Detail> {
    override fun map(from: ProductDetail): Product.Detail {
        return Product.Detail(
            title = from.title,
            desc = from.desc,
            price = from.price,
            imagesUrls = from.imagesUrls,
            colors = null,
            sizes = null
        )
    }

    fun map(
        from: ProductDetail,
        colors: List<Product.Color>,
        sizes: List<Product.Size>
    ): Product.Detail {
        return map(from).copy(colors = colors, sizes = sizes)
    }
}