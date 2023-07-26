import kotlin.math.roundToInt

data class Item(val name: String, val pricing: Pricing) {
    fun pricing(): Pricing {
        return pricing
    }
}

fun Pricing.priceOf(count: Int): Int {
    return ((count * netCost * (100 + vat.rate)) / 100.toDouble())
        .roundToInt()
}
/**
 * @param netCost is basic price, in Decimal -> 1 GBP == 100
 * @param vat is the appropriate VAT Type for this item
 */

data class Pricing(val netCost:Int, val vat:VATType) {
    fun price(): Int {
        return this.priceOf(1)
    }
}

enum class VATType(val rate: Int) {
    Standard(20), Reduced(5), Zero(0)
}