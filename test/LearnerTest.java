import eduTech.Learner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnerTest {
    private String userName;

    @Test
    void test_That_Learner_Can_Set_Username() {
        Learner learner = new Learner();
        learner.setUserName("Ehigie");
        assertEquals("Ehigie",learner.getUserName());
    }
    @Test
    void test_That_Learner_Can_Set_Email(){
        Learner learner = new Learner();
        learner.setEmail("i.ekpea@semicolon.africa");
        assertEquals("i.ekpea@semicolon.africa", learner.getEmail());
    }
    @Test
    void test_That_Learner_Set_Password(){
        Learner learner = new Learner();
        learner.setPassword("4215");
        assertEquals("4215", learner.getPassword());
    }
}
