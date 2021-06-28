package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;
    @BeforeEach
    void setUp() {
        bank = new Bank();
    }
    @Test
    void testToTransfer(){
        bank.transfer(9854,1458,1000,"0000");

    }
    @Test
    void testToReturnAccountNumber(){
        bank.getCustomerAccountNumber(4512);
    }
}