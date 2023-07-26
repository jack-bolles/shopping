data class Basket(val items: List<Item> = emptyList()) {
    fun add(item: Item): Basket {
        return Basket(items + item)
    }

    fun totalItems(): Int {
        return items.count()
    }

    fun remove(item: Item): Basket {
        return Basket(items - item)
    }

    fun totalPrice(): Int {
        return items.fold(0){acc, it -> acc + it.pricing.price()}
    }
}