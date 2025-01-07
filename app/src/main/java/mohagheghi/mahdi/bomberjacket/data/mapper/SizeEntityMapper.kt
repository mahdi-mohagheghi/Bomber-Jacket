package mohagheghi.mahdi.bomberjacket.data.mapper

import mohagheghi.mahdi.bomberjacket.base.BaseMapper
import mohagheghi.mahdi.bomberjacket.data.local.entity.SizeEntity
import mohagheghi.mahdi.bomberjacket.domain.model.Product

class SizeEntityMapper : BaseMapper<SizeEntity, Product.Size> {
    override fun map(from: SizeEntity): Product.Size {
        return Product.Size(id = from.id, label = from.title)
    }
}