package chapterEight;

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
    assertTrue(true,myCard.isValid(number));
  }
  @Test
    void testThatCardNumberCanDoubleEvenPlaceNumbers(){
     String number = "4388576018402626";
     assertEquals(7,myCard.sumOfDoubleEvenPlace(number));
  }
 // @Test
//    void testThatCardNumberCanGetNUmber(){
//      String number = "4388576018402626";
//      assertEquals(myCard.getNumberArray(number));
 // }
    @Test
    void testThatCardNumberCanGetDigit(){
     assertEquals(2,myCard.getDigit(11));
     assertEquals(4,myCard.getDigit(13));
    }
    @Test
    void testThatCardNumberCanAddEvenNumbers(){
     assertEquals(37,myCard.sumOfDoubleEvenPlace("4388576018402626"));
    }
    @Test
    void testThatCardNumberCanGetSize(){
        int[] cardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        assertEquals(16,myCard.getSize( cardNumber));
    }
    @Test
    void testThatCardNumberCanGetPrefixDigit(){
        int[] cardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        assertEquals(4,myCard.getPrefix(cardNumber));
    }

}