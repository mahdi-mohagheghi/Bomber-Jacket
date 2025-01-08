package mohagheghi.mahdi.bomberjacket.domain.model

data class Cart(
    val id: Long,
    val productId: Long,
    val productImageUrl: String,
    val productTitle: String,
    val productPrice: Double,
    val productColor: Product.Color,
    val productSize: Product.Size?,
    val count: Int
)
