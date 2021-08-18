package chapterFourteen;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        String[] tokens = sentence.split(" ");
        for (String token: tokens){
            printPigTin(token);
        }
    }

    private static void printPigTin(String token){
        System.out.print(token.substring(1) + token.charAt(0) + "ay ");
    }
}
