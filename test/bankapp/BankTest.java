package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.security.auth.login.CredentialException;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;
    @BeforeEach
    void setUp() {
        bank = new Bank();
    }
    @Test
    void testToTransfer() throws CredentialException {
        Customer ade = new Customer("Ade","Makanaki");
        Customer sherry = new Customer("Sherry", "Mukaila");
        bank.register(ade);
        bank.register(sherry);
        ade.getAccount().deposit(2000);
        bank.transfer(700455501,700455502,1000,"0000");
        assertEquals(700455502,bank.getCustomerAccountNumber(700455502).getAccount().getAccountNo());
        assertEquals(1000,bank.getCustomerAccountNumber(700455501).getAccount().getBalance());
        assertEquals(1000,bank.getCustomerAccountNumber(700455502).getAccount().getBalance());
        bank.transfer(700455501,700455502,999,"0000");
        assertEquals(1999,sherry.getAccount().getBalance());

    }
    @Test
    void testToReturnAccountNumber(){
        Customer ade = new Customer("Ade","Makanaki");
        bank.register(ade);
        assertEquals(700455501,bank.getCustomerAccountNumber(700455501).getAccount().getAccountNo());
    }
}