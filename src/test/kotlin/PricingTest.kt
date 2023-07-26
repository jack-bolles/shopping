import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PricingTest {
    @Test
    fun `calculate cost of an item`(){
        val item = Item("Apple", Pricing(12, VATType.Standard))
        val pricing = item.pricing()
        assertEquals(14, pricing.price())
    }


    //12 * 1 * .2 -> 2.4 ==> 2 cents
    //12 * 2 * .2 -> 4.8 ==> 5 cents
//    @Test fun `vat calculation rounds appropriately when more than one of the same item is in the basket`() {
      @Test fun `can price a basket`(){
        val item = Item("Apple", Pricing(12, VATType.Standard))
        val basket = Basket().add(item)
        assertEquals(14, basket.totalPrice())
    }
}