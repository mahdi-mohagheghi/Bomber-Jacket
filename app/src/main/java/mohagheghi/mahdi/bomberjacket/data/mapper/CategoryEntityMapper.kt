package mohagheghi.mahdi.bomberjacket.data.mapper

import mohagheghi.mahdi.bomberjacket.base.BaseMapper
import mohagheghi.mahdi.bomberjacket.data.local.entity.CategoryEntity
import mohagheghi.mahdi.bomberjacket.domain.model.Category

class CategoryEntityMapper : BaseMapper<CategoryEntity, Category> {
    override fun map(from: CategoryEntity): Category {
        return Category(id = from.id, title = from.title)
    }
}