import chapterThreeExercises.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;
    @Test
    void test_That_Account_Can_get_Name() {
        Account ehigieAccount = new Account("Ehigie", 0.00);
        assertEquals("Ehigie",ehigieAccount.getName());
    }
    @Test
    void test_Get_Account_Balance(){
        Account ehigieAccount = new Account("Ehigie", 0.00);
        assertEquals(0.00,ehigieAccount.getBalance());
    }
    @Test
    void test_That_Account_Deposit(){
        Account ehigieAccount = new Account("Ehigie", 0.00);
        ehigieAccount.deposit(20000.00);
        assertEquals(20000,ehigieAccount.getBalance());
    }
    @Test
    void test_That_Negative_Amount_Cannot_Deposit(){
        Account ehigieAccount = new Account("Ehigie", 0.00);
        ehigieAccount.deposit(-85.35);
        assertEquals(0.00, ehigieAccount.getBalance());
    }
    @Test
    void test_That_account_can_Withdraw(){
        Account ehigieAccount = new Account("Ehigie", 0.00);
        ehigieAccount.deposit(500000);
        ehigieAccount.withdraw(80000);
        assertEquals(420000.00,ehigieAccount.getBalance());
    }
    @Test
    void test_That_Account_Cannot_Withdraw_Below_One_Or_Above_Balance(){
        Account ehigieAccount = new Account("Ehigie", 0.00);
        ehigieAccount.deposit(100000);
        ehigieAccount.withdraw(110000);
        assertEquals(100000,ehigieAccount.getBalance());
        ehigieAccount.withdraw(-8000);
        assertEquals(100000,ehigieAccount.getBalance());
    }

}
