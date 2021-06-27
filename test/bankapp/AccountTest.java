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
    void makeTransfer(){
        double amount = 700.00;
        account.deposit(1000.00);
        account.transfer(account2, amount);
        assertEquals(300.00, account.getBalance());
        assertEquals(700.00, account2.getBalance());
    }
}