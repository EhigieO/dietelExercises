package Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class UsersTest {
    Users user;
    @BeforeEach
    void startEachWith(){
        user = new Users();
    }
    @Test
    void userHaveAge(){
        int month = 7, day = 26, year = 1992;
        user.setDateOfBirth(month,day,year);
        assertEquals(29,user.getAge());
    }
    @Test
    void testThatUsersHaveEmailAddress(){
        user.setEmailAddress("eshioke@gmail.com");
        assertSame("eshioke@gmail.com",user.getEmailAddress());
    }
    @Test
    void usersHaveHomeAddress(){
        user.setHomeAddress("No 312, Herbert Macaulay way,Yaba Lagos");
        assertSame("No 312, Herbert Macaulay way,Yaba Lagos",user.getHomeAddress());
    }
}