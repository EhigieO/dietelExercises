package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankStaffTest {
    BankStaff bankStaff;
    @BeforeEach
    void setUp() {
        BankStaff bankStaff = new BankStaff();
    }
    @Test
    void StaffCanSetFirstName(){
        bankStaff.setFirstName();
    }
}