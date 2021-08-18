import chapterThreeExercises.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
ClassName: Bike
Requirements:
1. The Bike can be turned On and Off.
2. The Bike can accelerate or decelerate only when its on
3. The Bike is automatic, that is, the gear changes as it accelerates or decelerates
    a. Gear is 0, when the Bike is Off
    b. Gear changes to 1, when the Bike is On.
    c. Gear Changes to 2, when Speed is 20.
    d. Gear Changes to 3, when Speed is 50.
    e. Gear Changes to 4, when Speed is 80.
    f. Max Gear Number is 4 and max speed is 120.
4. The Bike Speed increases based on the gear Number. that is,
    a. When Gear Number is 1, the Speed increases by 1
    b. when Gear Number is 2, the Speed increases by 2.
5. The Bike is allowed to set Speed Only for testing to simulate acceleration/deceleration.
 */
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
     Bike okada = new Bike();

    @BeforeEach
    void startEachTestWithThis() {
        okada = new Bike();
    }

    @Test
    void test_That_Bike_Can_Set_On() {
        okada.setOn(true);
        assertTrue(okada.isOn());
    }

    @Test
    void test_That_Bike_Can_Set_Speed() {
        okada.setOn(true);
        okada.setSpeedInKmPerHour(10);
        assertEquals(10, okada.getSpeedInKmPerHour());
    }

    @Test
    void test_That_Bike_Can_Set_From_Off_To_On() {
        assertFalse(okada.isOn());
        okada.setOn(true);
        assertTrue(okada.isOn());
    }

    @Test
    void test_That_Bike_Cannot_Set_Speed_When_Bike_Is_Off() {
        okada.setOn(false);
        assertFalse(okada.isOn());
        okada.setSpeedInKmPerHour(30);
        assertEquals(0, okada.getSpeedInKmPerHour());
    }

    @Test
    void test_That_Bike_Can_Set_Gear_To_One() {
        assertEquals(0, okada.getCurrentGearNumber());
        okada.setOn(true);
        assertEquals(1, okada.getCurrentGearNumber());
    }

    @Test
    void test_That_Bike_Can_Accelerate_On_Gear_One() {
        okada.setOn(true);
        okada.speedUp();
        assertEquals(1, okada.getSpeedInKmPerHour());
        okada.speedUp();
        assertEquals(2, okada.getSpeedInKmPerHour());
        okada.setSpeedInKmPerHour(11);
        okada.speedUp();
        assertEquals(12, okada.getSpeedInKmPerHour());
        System.out.print(okada.getCurrentGearNumber());
    }

    @Test
    void test_That_Bike_Can_Accelerate_And_Change_Gears_Appropriately() {
        okada.setOn(true);
        okada.setSpeedInKmPerHour(22);
        okada.speedUp();
        assertEquals(24, okada.getSpeedInKmPerHour());
        assertEquals(2, okada.getCurrentGearNumber());

        okada.setSpeedInKmPerHour(90);
        okada.speedUp();
        assertEquals(94, okada.getSpeedInKmPerHour());
        assertEquals(4, okada.getCurrentGearNumber());

        okada.setSpeedInKmPerHour(50);
        okada.speedUp();
        assertEquals(3, okada.getCurrentGearNumber());
        assertEquals(53, okada.getSpeedInKmPerHour());
    }

    @Test
    void test_That_Bike_Can_Decelerate() {
        okada.setOn(true);
        okada.setSpeedInKmPerHour(79);
        okada.speedUp();
        assertEquals(82, okada.getSpeedInKmPerHour());
        assertEquals(3, okada.getCurrentGearNumber());

        okada.slowDown();
        assertEquals(78, okada.getSpeedInKmPerHour());
        assertEquals(4, okada.getCurrentGearNumber());
    }

    @Test
    public void test_That_Bike_Can_Change_Gear_And_Speed_Up_And_Down() {
        okada.setOn(true);
        okada.setSpeedInKmPerHour(80);
        okada.speedUp();
        okada.slowDown();
        assertEquals(4, okada.getCurrentGearNumber());
        assertEquals(80, okada.getSpeedInKmPerHour());
    }
}