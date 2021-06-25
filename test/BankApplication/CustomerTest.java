package BankApplication;

import chapterThreeExercises.Account;
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
        customer.setPin("7039");
        assertEquals("7039",customer.getPin());
    }
    @Test
    void testThatCustomerCanDeposit(){
        assertEquals(1000,customer.getBalance());
        System.out.println(customer.getBalance());

    }
    @Test
    void testThatCustomerCanWithdraw(){
        customer.deposit(1000);
        customer.withdraw(500);
        assertEquals(500,customer.getBalance());
    }
    @Test
    void testThatCustomerCanTransfer(){
        Account latestAccount = new Account();
        customer.deposit(1000);
       // customer.transfer(500,latestAccount);
        assertEquals(500.0,customer.getBalance());
        System.out.println(latestAccount.getBalance());
    }
    @Test
    void testThatCustomerCanGetAccountNumber(){
        customer.getAccountNumber();
    }
}