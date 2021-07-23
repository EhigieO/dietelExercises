package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
        User user = new User("Dame","Segun");
    @BeforeEach
    void setUp() {
    }
    @Test
    void testThatUserHasPin(){
        user.setPassword("0000");
        assertEquals("0000", user.getPassword());
    }
}