import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PricingTest {
    @Test
    fun `calculate cost of an item`() {
        val item = APPLE
        val pricing = item.pricing()
        assertEquals(14, pricing.price())
    }

    @Test
    fun `can price a basket`() {
        val basket = Basket().add(APPLE)
        assertEquals(14, basket.totalPrice())
    }

    //12 * 1 * .2 -> 2.4 ==> 2 cents
    //12 * 2 * .2 -> 4.8 ==> 5 cents
    @Test
    fun `vat calculation rounds appropriately when more than one of the same item is in the basket`() {
        val basket = Basket()
            .add(APPLE)
            .add(APPLE)
        assertEquals(29, basket.totalPrice())
    }
}