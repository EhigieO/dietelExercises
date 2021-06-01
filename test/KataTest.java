import chapterFourExercises.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
