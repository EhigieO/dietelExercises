package chapterFourteen;

import java.util.Scanner;

public class TokenAndCompare {
       public static String compareFirstLetter (String sentence){
           String[] tokens = sentence.split(" ");
           StringBuilder bWords = new StringBuilder();

           for (String token : tokens) {
               if (token.startsWith("b") || token.startsWith("B")) {
                   bWords.append(token).append(" ");
               }
           }
           return bWords.toString();
       }
       public static String compareLastLetters(String sentence){
           String[] tokens = sentence.split(" ");
           StringBuilder bWords = new StringBuilder();

           for (String token : tokens) {
               if (token.endsWith("ED") || token.endsWith("ed")) {
                   bWords.append(token).append(" ");
               }
           }
           return bWords.toString();
       }
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence and press Enter");
            String sentence = scanner.nextLine();
            System.out.println("Words starting with letter b");
            System.out.println(compareFirstLetter(sentence));
            System.out.println("\nWords ending with letter ED");
            System.out.println(compareLastLetters(sentence));
        }
}
