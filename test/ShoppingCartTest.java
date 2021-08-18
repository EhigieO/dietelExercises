import ecommerce.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    @Test
    void test_That_Shopping_Cart_Can_Set_Quantity() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setQuantity("9");
        assertEquals("9",shoppingCart.getQuantity());
    }
    @Test
    void test_That_Shopping_Cart_Can_Set_TotalPrice(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setTotalPrice("NGN9000");
        assertEquals("NGN9000",shoppingCart.getTotalPrice());
    }
    @Test
    void test_That_Shopping_Cart_Can_Set_UpdateCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.updateCart("Items added");
        assertEquals("Items added", shoppingCart.getUpdateCart());
    }
}
