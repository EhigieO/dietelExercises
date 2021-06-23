package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }
    @Test
    void testThatCustomerCanSetFirstName(){
        customer.setFirstName("Ehigie");
        assertEquals("Ehigie",customer.getFirstName());
    }
    @Test
    void testThatCustomerCanSetLastName(){
        customer.setLastName("Ikpea");
        assertEquals("Ikpea",customer.getLastName());
    }
    @Test
    void testThatCustomerCanSetPhoneNumber(){
        customer.setPhoneNumber("07039410420");
        assertEquals("07039410420", customer.getPhoneNumber());
    }
    @Test
    void testThatCustomerCanSetPin(){
        customer.setPin(7039);
    }
}