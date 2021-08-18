import chapterThreeExercises.ComputerizedBMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerizedBMITest {
    private ComputerizedBMI computerizedBMI;
    @BeforeEach
    void startEachWith(){
        computerizedBMI = new ComputerizedBMI("Ehigie","Ikpea","Male",26,07,1960,187,86);
    }

    @Test
    void testThatBMICanSetFirstName() {
        computerizedBMI.setFirstName("Ehigie");
        assertEquals("Ehigie",computerizedBMI.getFirstName());
    }
    @Test
    void testThatBMICanSetLastName(){
        computerizedBMI.setLastName("Ikpea");
        assertEquals("Ikpea",computerizedBMI.getLastName());
    }
    @Test
    void testThatBMICanSetSex(){
        computerizedBMI.setSex("Male");
            assertEquals("Male",computerizedBMI.getGender());
    }
    @Test
    void testToSetDateOfBirth(){
        computerizedBMI.setDay(26);
        assertEquals(26,computerizedBMI.getDay());
        computerizedBMI.setMonth(7);
        assertEquals(7,computerizedBMI.getMonth());
        computerizedBMI.setYear(1960);
        assertEquals(1960,computerizedBMI.getYear());
    }
    @Test
    void testToSetHeight(){
        computerizedBMI.setHeight(186);
        assertEquals(186,computerizedBMI.getHeight());
    }
    @Test
    void testForWeight(){
        computerizedBMI.setWeight(86);
        assertEquals(86,computerizedBMI.getWeight());
    }
    @Test
    void testToGetAge(){
        assertEquals(61,computerizedBMI.getAge());
    }
    @Test
    void testToGetBMIByCallingTheMethod(){
       computerizedBMI.getBMI();
    }
}
