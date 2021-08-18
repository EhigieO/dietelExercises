package bankapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;
    Account account2;

    @BeforeEach
    void setUp() {
        account = new Account();
        account2 = new Account();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void makeDeposit(){
        double amount = 1000.00;
        account.deposit(amount);
        assertEquals(1000.00, account.getBalance());
    }

    @Test
    void makeWithdrawal(){
        double amount = 700.00;
        account.deposit(1000.0);
        account.withdraw(amount);
        assertEquals(300.00, account.getBalance());
    }
    @Test
    void accountCanSetName(){
        String firstName = "Sunny";
        String lastName = "Duke";
        account.setName(firstName,lastName);
        assertEquals("Sunny Duke",account.getName());
    }
    @Test
    void accountCanSetPin(){
        account.setPin("4523");
        assertEquals("4523",account.getPin());
    }
    @Test
    void testThatAccountHasNumber(){
        assertEquals(700455501,account.getAccountNo());
        assertEquals(700455502,account2.getAccountNo());
        Account account3 = new Account();
        assertEquals(700455503,account3.getAccountNo());
    }
}