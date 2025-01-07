package mohagheghi.mahdi.bomberjacket.data.mapper

import mohagheghi.mahdi.bomberjacket.base.BaseMapper
import mohagheghi.mahdi.bomberjacket.data.local.entity.ColorEntity
import mohagheghi.mahdi.bomberjacket.domain.model.Product

class ColorEntityMapper : BaseMapper<ColorEntity, Product.Color> {
    override fun map(from: ColorEntity): Product.Color {
        return Product.Color(id = from.id, code = from.code)
    }
}