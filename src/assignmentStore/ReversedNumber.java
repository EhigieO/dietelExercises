package assignmentStore;
import java.util.Scanner;
public class ReversedNumber {
    public static void main(String[] args) {
        //        String reversed;
//        String phone = "68573565 432+";
//        for (int i = phone.length() - 1; i >= 0; i--) {
//            reversed = phone.charAt(i) + "";
//            System.out.print(reversed);
//                if (reversed.length() > 4) {
//                    if ((reversed.length() - 4) % 3 == 0){
//                        System.out.print(" ");
            stew();



                //}
           // }
      //  }
    }


        public static void stew ()
        {
            Scanner scanner = new Scanner(System.in); // create scanner
             System.out.println("Enter a character and press Enter");
             String input = scanner.next();
             char c = input.charAt(0);

             // display character info
             System.out.printf("is defined: %b%n", Character.isDefined(c));
             System.out.printf("is digit: %b%n",Character.isDigit(c) );
             System.out.printf("is first character in a Java identifier: %b%n",
                     Character.isJavaIdentifierStart(c));
            System.out.printf("is part of a Java identifier: %b%n",
                    Character.isJavaIdentifierPart(c));
            System.out.printf("is letter: %b%n", Character.isLetter(c));
            System.out.printf(
                    "is letter or digit: %b%n", Character.isLetterOrDigit(c));
            System.out.printf(
                    "is lower case: %b%n", Character.isLowerCase(c));
            System.out.printf(
                    "is upper case: %b%n", Character.isUpperCase(c));
            System.out.printf(
                    "to upper case: %s%n", Character.toUpperCase(c));
            System.out.printf(
                    "to lower case: %s%n", Character.toLowerCase(c));
        }
        }
