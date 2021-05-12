import ecommerce.Admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdminTest {
    @Test
    void test_That_Admin_Can_Set_Name(){
        Admin admin = new Admin();
        admin.setName("Oshioke");
        assertEquals("Oshioke" ,admin.getName());
    }
    @Test
    void test_That_Admin_Can_Set_email(){
        Admin admin = new Admin();
        admin.setEmail("eshioke@gmail.com");
        assertEquals("eshioke@gmail.com", admin.getEmail());
    }
}
