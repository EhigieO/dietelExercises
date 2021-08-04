package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    //Account account;
    @BeforeEach
    void setUp() {
       // account = new Account();
        customer = new Customer("Sunny","Duke");
    }
    @Test
    void testThatCustomerCanDeposit(){
        customer.getAccount().deposit(1000);
        assertEquals(1000,customer.getAccount().getBalance());
    }
    @Test
    void testThatCustomerCanWithdraw(){
        customer.getAccount().deposit(1000);
        customer.getAccount().withdraw(500);
        assertEquals(500,customer.getAccount().getBalance());
    }
    @Test
    void testThatCustomerHasAccountNumber(){
        assertEquals(700455500,customer.getAccount().getAccountNo());
    }
}