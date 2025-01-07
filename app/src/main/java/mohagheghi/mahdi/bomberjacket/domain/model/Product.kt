package mohagheghi.mahdi.bomberjacket.domain.model

data class Product(
    val id: Long,
    val categoryId: Long,
    val imageUrl: String,
    val isFav: Boolean,
    val detail: Detail? = null
) {
    data class Detail(
        val title: String,
        val desc: String?,
        val price: Double,
        val imagesUrls: List<String>?,
        val colors: List<Color>?,
        val sizes: List<Size>?
    )

    data class Color(
        val id: Long,
        val code: String
    )

    data class Size(
        val id: Int,
        val label: String
    )
}
