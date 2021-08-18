import eduTech.Facilitator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacilitatorTest {
    @Test
    void test_That_Facilitator_Can_Set_UserName() {
        Facilitator facilitator = new Facilitator();
        facilitator.setUserName();
        assertEquals("Vendor",facilitator.getUserName());
    }
    @Test
    void test_That_Facilitator_Can_Set_Password(){
        Facilitator facilitator = new Facilitator();
        facilitator.setpassword();
        assertEquals("4521", facilitator.getPassword());
    }
}
