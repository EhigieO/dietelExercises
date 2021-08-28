package chapterFourteen;

import java.util.Scanner;

public class TokenAndCompare {
       public static String compareFirstLetter (String token) {
           String tent = "";
           if (token.startsWith("b") || token.startsWith("B")) tent = token;
           return tent;
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
            String[] tokens = sentence.split(" ");
            StringBuilder bWords = new StringBuilder();
            System.out.println("Words starting with letter b");
            for (String token : tokens) {
                System.out.println(compareFirstLetter(token));
            }
            System.out.println("\nWords ending with letter ED");
            System.out.println(compareLastLetters(sentence));
        }
}
