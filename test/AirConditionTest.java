import chapterThreeExercises.AirCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        airCondition.setOn(true);
        airCondition.decreaseTemperature();
        assertEquals(16,airCondition.getTemperature());
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.decreaseTemperature();
        assertEquals(17,airCondition.getTemperature());
    }
    @Test
    void test_That_Air_Conditioner_Set_off(){
        airCondition.setOn(false);
        assertFalse(airCondition.isOn());
        airCondition.increaseTemperature();
        assertEquals(0, airCondition.getTemperature());}
    @Test
    void test_That_AirConditioner_Cannot_Exceed_Thirty(){
        airCondition.setOn(true);
        airCondition.setTemperature(29);
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        assertEquals(30,airCondition.getTemperature());
    }
    @Test
    void test_That_AirCondition_Cannot_Set_Temperature_When_Off(){
        airCondition.setOn(false);
        airCondition.setTemperature(20);
        airCondition.increaseTemperature();
        assertEquals(0,airCondition.getTemperature());
    }
    @Test
    void test_That_AirCondition_Come_on_At_16(){
        airCondition.setOn(true);
        assertEquals(16,airCondition.getTemperature());
    }

}