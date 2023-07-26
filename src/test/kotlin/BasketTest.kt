import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BasketTest {
    @Test fun `can add items to a basket`(){
        val basket = Basket().add(Item("Apple"))
        assertEquals(1, basket.totalItems())
    }

    @Test fun `basket can have different types of items`(){
        val basket = Basket()
            .add(Item("Apple"))
            .add(Item("Mangoes"))
        assertEquals(2, basket.totalItems())
    }

    @Test fun `basket can have multiples of the same item`(){
        val basket = Basket()
            .add(Item("Apple"))
            .add(Item("Apple"))
            .add(Item("Mangoes"))
            .add(Item("Mangoes"))
        assertEquals(4, basket.totalItems())
    }

    @Test fun `remove an item from the basket`() {
        val item = Item("Apple")
        var basket = Basket()
            .add(item)
            .add(item)
        assertEquals(2, basket.totalItems())
        basket = basket.remove(item)
        assertEquals(1, basket.totalItems())
    }

    @Test fun `removing an item that is not in the basket returns the same basket`(){
        val item = Item("Apple")
        val basket = Basket()
            .add(item)
            .add(item)
        assertEquals(2, basket.totalItems())
        val newBasket = basket.remove(Item("Mango"))
        assertEquals(basket, newBasket)
    }
}
