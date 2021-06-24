package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank bank;
    @BeforeEach
    void setUp() {
        bank = new Bank();
    }
    @Test
    void testThatCustomerCanCreateCustomer(){
        bank.createCustomer(2000);
        assertEquals(1,bank.getCustomerList());
    }
}