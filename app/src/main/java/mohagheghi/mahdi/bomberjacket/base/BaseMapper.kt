package mohagheghi.mahdi.bomberjacket.base

interface BaseMapper<From, To> {
    fun map(from: From): To
}