import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PricingTest {
    @Test
    fun `calculate cost of an item`(){
        val item = Item("Apple", Pricing(12, VATType.Standard))
        val pricing = item.pricing()

        assertEquals(14, pricing.price())
    }
}