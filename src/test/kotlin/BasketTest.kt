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
}
