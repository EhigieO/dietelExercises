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
    void testThatBankCanCreateCustomer(){
        bank.createCustomer("Sonny","Duke","07039410420",2000);
        assertEquals(1,bank.getCustomerSize());
    }
    @Test
    void testThatBankCanIssueAccountNumber(){
        bank.createCustomer("Sonny","Duke","07039410420",2000);
        bank.issueAccountNumber();
        assertEquals(2,bank.getAccountNumber());
    }
    @Test
    void testThatBankCanDeleteCustomer(){
        bank.createCustomer("Sonny","Duke","07039410420",2000);
        bank.deleteCustomer(1);
        assertEquals(0,bank.getCustomerSize());
    }
    @Test
    void testThatBankCanGetAllCustomers(){
        bank.createCustomer("Sonny","Duke","07039410420",2000);
        bank.getAllCustomers();
    }
}