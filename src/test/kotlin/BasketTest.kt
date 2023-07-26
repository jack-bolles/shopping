import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BasketTest {
    @Test fun `can add items to a basket`(){
        val basket = Basket().add(Item("Apple"))
        assertEquals(1, basket.totalItems())
    }
}
