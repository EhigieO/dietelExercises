package chapterSevenExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {
    Progression progression;

    @Test
    void testThatAPCanFindDifference(){
        progression = new Progression();
        int numberOne = 5, numberTwo = 2;
        assertEquals(3,progression.difference(numberOne, numberTwo));
    }
    @Test
    void testThatApCanFindRatio(){
        progression = new Progression();
        int numberOne = 2, numberTwo  = 4;
        assertEquals(2,progression.ratio(numberOne,numberTwo));
    }
    @Test
    void testThatApCanValidate(){
        progression = new Progression();
        int numberOne = 4, numberTwo  = 4;
        assertTrue(progression.isSame(numberOne,numberTwo));
    }
    @Test
    void testThatApCanSolveAp(){
        progression = new Progression();
        int numberOne = 2, numberTwo  = 4, numberThree = 6;
        assertEquals(8,progression.arithmetic(numberOne,numberTwo,numberThree));
        assertEquals(2,progression.arithmetic(8,6,4));
    }
    @Test
    void testThatApCanSolveGp(){
        progression = new Progression();
        int numberOne = 2,numberTwo = 4,numberThree = 8;
        assertEquals(16,progression.geometric(numberOne,numberTwo,numberThree));
        assertEquals(2,progression.geometric(16,8,4));
    }


}