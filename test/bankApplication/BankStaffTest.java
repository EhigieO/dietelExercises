package bankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankStaffTest {
    BankStaff bankStaff;
    @BeforeEach
    void setUp() {
        bankStaff = new BankStaff();
    }
    @Test
    void testThatStaffCanSetFirstName(){
        bankStaff.setFirstName("Kelvin");
        assertEquals("Kelvin", bankStaff.getFirstName());
    }
    @Test
    void testThatStaffCanSetLastName(){
        bankStaff.setLastName("Okoro");
        assertEquals("Okoro", bankStaff.getLastName());
    }
    @Test
    void testThatStaffCanSetPin(){
        bankStaff.setPin("5623");
        assertEquals("5623", bankStaff.getPin());
    }
    @Test
    void testThatStaffCanSetUserName(){
        bankStaff.setUserName("Manager");
        assertEquals("Manager", bankStaff.getUserName());
    }
//    @Test
//    void testThatBankStaffCanCheckAccountNumber(){
//        bankStaff.getAccountNumber();
//    }

}