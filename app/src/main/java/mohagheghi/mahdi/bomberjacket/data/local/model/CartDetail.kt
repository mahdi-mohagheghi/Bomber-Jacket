package mohagheghi.mahdi.bomberjacket.data.local.model

data class CartDetail(
    val id: Long,
    val productId: Long,
    val productImageUrl: String,
    val productTitle: String,
    val productPrice: Double,
    val productColorId: Long,
    val productColorCode: String,
    val productSizeId: Int?,
    val productSizeTitle: String?,
    val count: Int
)
