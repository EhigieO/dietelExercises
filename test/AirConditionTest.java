import bike.AirCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {
    private AirCondition airCondition;

    @BeforeEach
    void each_Test_Should_Start_With() {
        airCondition = new AirCondition();
    }

    @Test
    void test_That_Air_Condition_Can_Set_On() {
        airCondition.setOn(true);
        assertTrue(airCondition.isOn());
    }

    @Test
    void test_That_AirCondition_Can_Set_Temperature() {
        airCondition.setOn(true);
        airCondition.setTemperature(20);
        assertEquals(20, airCondition.getTemperature());
    }

    @Test
    void test_That_Air_Condition_can_Increase_Temperature() {
        airCondition.setOn(true);
        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());
        airCondition.increaseTemperature();
        assertEquals(18, airCondition.getTemperature());
    }

    @Test
    void test_That_Air_Condition_Name_Set_On_Creation() {
        assertEquals("Samsung", airCondition.getProductName());
    }
    @Test
    void test_That_AirCondition_Can_Decrease_Temperature(){
        airCondition.decreaseTemperature();
    }

}
