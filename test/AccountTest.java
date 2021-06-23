import chapterThreeExercises.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;
    @BeforeEach
    void startEachWith(){
        account = new Account("Ehigie", 0.00);
    }
    @Test
    void test_That_Account_Can_get_Name() {

        assertEquals("Ehigie",account.getName());
    }
    @Test
    void test_Get_Account_Balance(){

        assertEquals(0.00,account.getBalance());
    }
    @Test
    void test_That_Account_Deposit(){

        account.deposit(20000.00);
        assertEquals(20000,account.getBalance());
    }
    @Test
    void test_That_Negative_Amount_Cannot_Deposit(){

        account.deposit(-85.35);
        assertEquals(0.00, account.getBalance());
    }
    @Test
    void test_That_account_can_Withdraw(){

        account.deposit(500000);
        account.withdraw(80000);
        assertEquals(420000.00,account.getBalance());
    }
    @Test
    void test_That_Account_Cannot_Withdraw_Below_One_Or_Above_Balance(){

        account.deposit(100000);
        account.withdraw(110000);
        assertEquals(100000,account.getBalance());
        account.withdraw(-8000);
        assertEquals(100000,account.getBalance());
    }
    @Test
    void testThatAccountCanTransfer() {
        Account dummyAccount = new Account();
        account.deposit(2000);
        account.transfer(1000, dummyAccount);
        assertEquals(1000,account.getBalance());
        assertEquals(1000,dummyAccount.getBalance());
    }
    @Test
    void testThatAccountCanChangePin(){


    }
}
