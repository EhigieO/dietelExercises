import ecommerce.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    void test_That_Customer_Can_Set_Id() {
        Customer customer = new Customer();
        customer.setId(78452);
        assertEquals(78452, customer.getId());
    }
    @Test
    void test_That_Customer_Can_Set_Address(){
        Customer customer = new Customer();
        customer.setAddress("semicolon");
        assertEquals("semicolon", customer.getAddress());
    }
    @Test
    void test_That_Customer_Can_Set_Email(){
        Customer customer = new Customer();
        customer.setEmail("eshioke@gmail.com");
        assertEquals("eshioke@gmail.com", customer.getEmail());
    }
}
