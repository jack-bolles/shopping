data class Item(val name: String, val pricing: Pricing) {
    fun pricing(): Pricing {
        return pricing
    }
}

/**
 * @param netCost is basic price, in Decimal -> 1 GBP == 100
 * @param vat is the appropriate VAT Type for this item
 */

data class Pricing(val netCost:Int, val vat:VATType) {
    fun price(): Int {
        return netCost * (100+vat.rate) / 100
    }
}

enum class VATType(val rate: Int) {
    Standard(20), Reduced(5), Zero(0)
}
//Apples
//Oranges
//Cola Can (Standard Rate VAT: 20%)
//Ice Cream (Standard Rate VAT:20%)
//Bread (Reduced Rate VAT: 5%)
//Fruit Cake (Reduced Rate VAT: 5%)