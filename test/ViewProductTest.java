import ecommerce.ViewProducts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewProductTest {
    @Test
    void test_That_ViewProducts_Can_Set_Name() {
        ViewProducts viewProducts = new ViewProducts();
        viewProducts.setName("omo");
        assertEquals("omo", viewProducts.getName());
    }
    @Test
    void test_That_ViewProducts_Can_Set_Price(){
        ViewProducts viewProducts = new ViewProducts();
        viewProducts.setPrice("NGN500");
        assertEquals("NGN500",viewProducts.getPrice());

    }
}
