class Basket(val items: List<Any> = emptyList()) {
    fun add(item: Item): Basket {
        return Basket(items + item)
    }

    fun totalItems(): Int {
        return items.count()
    }

}