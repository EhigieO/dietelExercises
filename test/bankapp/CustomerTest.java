package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    Account account;
    @BeforeEach
    void setUp() {
        account = new Account();
        customer = new Customer("Sunny","Duke",account);
    }
    @Test
    void testThatCustomerHasAccountNumber(){
        customer.setAccountNumber();
        assertEquals(1001,customer.getAccountNumber());
    }
    @Test
    void testThatCustomerCanDeposit(){
        customer.deposit(1000);
        assertEquals(1000,customer.getAccount().getBalance());
    }
    @Test
    void testThatCustomerCanWithdraw(){
        customer.deposit(1000);
        customer.withdraw(500);
        assertEquals(500,customer.getAccount().getBalance());
    }
}