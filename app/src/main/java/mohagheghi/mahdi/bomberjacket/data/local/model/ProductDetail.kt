package mohagheghi.mahdi.bomberjacket.data.local.model

data class ProductDetail(
    val id: Long,
    val title: String,
    val desc: String?,
    val price: Double,
    val mainImageUrl: String,
    val imagesUrls: List<String>?,
    val colors: List<Long>?,
    val sizes: List<Int>?
)
