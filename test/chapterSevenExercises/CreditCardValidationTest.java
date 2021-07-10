//package chapterSevenExercises;
//
//import chapterSevenExercises.CreditCardValidation;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CreditCardValidationTest {
//    CreditCardValidation myCard;
// @BeforeEach
// void startEachWith(){
//   myCard = new CreditCardValidation();
// }
//  @Test
//  void testThatCardNumberIsValid(){
//     String number = "4388576018402626";
//      assertTrue(myCard.isValid(number));
//     number = "438857618402626";
//      assertTrue(myCard.isValid(number));
//      number = "375842156987452";
//      assertTrue(myCard.isValid(number));
//  }
//  @Test
//    void testThatCardNumberCanDoubleEvenAndOddPlaceNumbers(){
//     String number = "4388576018402626";
//     assertEquals(75,myCard.sumOfCardNumbers(number));
//  }
// // @Test
////    void testThatCardNumberCanGetNUmber(){
////      String number = "4388576018402626";
////      assertEquals(myCard.getNumberArray(number));
// // }
//    @Test
//    void testThatCardNumberCanGetDigit(){
//     assertEquals(1,myCard.getDigit(5));
//     assertEquals(8,myCard.getDigit(4));
//     assertEquals(7,myCard.getDigit(8));
//    }
//    @Test
//    void testThatCardNumberCanGetSize(){
//        int[] cardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
//        assertEquals(16,myCard.getSize( cardNumber));
//    }
//    @Test
//    void testThatCardNumberCanGetPrefixDigit(){
//        int[] number ={4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
//        int d = 4;
//        assertEquals(true,myCard.getPrefixMatched(number,d));
//        number = new int[]{4, 3, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};
//        d = 14;
//        assertEquals(false,myCard.getPrefixMatched(number,d));
//        number = new int[]{3, 7, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};
//        d = 37;
//        assertEquals(true,myCard.getPrefixMatched(number,d));
//        number = new int[]{7, 3, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};
//        d = 7;
//        assertEquals(true,myCard.getPrefixMatched(number,d));
//    }
//    @Test
//    void testThatCardNumberCanGetNumericSize(){
//        int d = 4;
//        assertEquals(0,myCard.getNumericSize(7));
//        assertEquals(0,myCard.getNumericSize(d));
//        d = 37;
//        assertEquals(1,myCard.getNumericSize(d));
//    }
//    @Test
//    void testThatCardNumberCanGetPrefix(){
//        int[] number = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
//        int k = 0;
//        assertEquals(4,myCard.getPrefix(number,k));
//        number = new int[]{3, 7, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};
//        assertEquals(37,myCard.getPrefix(number,1));
// }
//}