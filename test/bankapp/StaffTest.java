package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
        Staff staff = new Staff("Dame","Segun");
    @BeforeEach
    void setUp() {
    }
    @Test
    void testThatStaffHasPin(){
        staff.setPassword("0000");
        assertEquals("0000", staff.getPassword());
    }
}