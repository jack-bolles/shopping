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
        val groupBy: Map<Item, List<Item>> = items.groupBy { it }
        val map: Map<Item, Int> = groupBy.mapValues { it.key.pricing.priceOf(it.value.size) }
        return map.values.fold(0){acc, it -> acc + it}
    }
}