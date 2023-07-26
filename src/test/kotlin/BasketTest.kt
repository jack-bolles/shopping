import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

val APPLE = Item("Apple", Pricing(24, VATType.Zero))
val MANGO = Item("Mango", Pricing(36, VATType.Zero))

class BasketTest {
    @Test fun `can add items to a basket`(){
        val basket = Basket().add(APPLE)
        assertEquals(1, basket.totalItems())
    }

    @Test fun `basket can have different types of items`(){
        val basket = Basket()
            .add(APPLE)
            .add(MANGO)
        assertEquals(2, basket.totalItems())
    }

    @Test fun `basket can have multiples of the same item`(){
        val basket = Basket()
            .add(APPLE)
            .add(APPLE)
            .add(MANGO)
            .add(MANGO)
        assertEquals(4, basket.totalItems())
    }

    @Test fun `remove an item from the basket`() {
        var basket = Basket()
            .add(APPLE)
            .add(APPLE)
        assertEquals(2, basket.totalItems())
        basket = basket.remove(APPLE)
        assertEquals(1, basket.totalItems())
    }

    @Test fun `removing an item that is not in the basket returns the same basket`(){
        val basket = Basket()
            .add(APPLE)
            .add(APPLE)
        assertEquals(2, basket.totalItems())
        val newBasket = basket.remove(MANGO)
        assertEquals(basket, newBasket)
    }
}
