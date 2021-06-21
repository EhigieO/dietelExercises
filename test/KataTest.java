import chapterFourExercises.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {
    private Kata kata;
    @Test
    void test_That_Kata_Can_select_Five_Digits() {
       Kata kata = new Kata();
       assertEquals("54321",kata.reversedNumber(12345));
    }
    @Test
    void test_That_Kata_Can_Find_Factorial(){
        Kata kata = new Kata();
        assertEquals(6,kata.findFactorial(3));
    }
    @Test
    void testThatStoreDaysCanBeCalculated(){
        Kata kata = new Kata();
        assertTrue(true,kata.checkStoreDay());
    }

    @Test
    void testThatKataCanConvertToBinary(){
        Kata kata = new Kata();
       // kata.findBinaryNumber(8);
        assertEquals("1000", kata.decimalToBinary(8));
    }
//    @Test
//    void testThatKataCanConvertToBinaryFromAnyBaseBetweenOneAndNine(){
//        Kata kata = new Kata();
//        assertEquals(10011,kata.convertAnyBaseToBinary(164,9));
//    }

}
