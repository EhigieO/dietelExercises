package chapterEight;

import chapterSevenExercises.CreditCardValidation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation myCard;
 @BeforeEach
 void startEachWith(){
   myCard = new CreditCardValidation();
 }
  @Test
  void testThatCardNumberIsValid(){
    String number = "4388576018402626";
    assertTrue(myCard.isValid(number));
  }
  @Test
    void testThatCardNumberCanDoubleEvenAndOddPlaceNumbers(){
     String number = "4388576018402626";
     assertEquals(75,myCard.sumOfCardNumbers(number));
  }
 // @Test
//    void testThatCardNumberCanGetNUmber(){
//      String number = "4388576018402626";
//      assertEquals(myCard.getNumberArray(number));
 // }
    @Test
    void testThatCardNumberCanGetDigit(){
     assertEquals(1,myCard.getDigit(5));
     assertEquals(8,myCard.getDigit(4));
     assertEquals(7,myCard.getDigit(8));
    }
    @Test
    void testThatCardNumberCanGetSize(){
        int[] cardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        assertEquals(16,myCard.getSize( cardNumber));
    }
    @Test
    void testThatCardNumberCanGetPrefixDigit(){
        int number = 37;
        assertEquals(37,myCard.getPrefixMatched(number));
        number = 6;
        assertEquals(6,myCard.getPrefixMatched(number));
        number = 5;
        assertEquals(5,myCard.getPrefixMatched(number));
        number = 4;
        assertEquals(4,myCard.getPrefixMatched(number));
    }
}