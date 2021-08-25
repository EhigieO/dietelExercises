package chapterFourteen;

import java.util.Scanner;

public class StringReversedWords {
    public static String reversedWord(String string){
        String[] words = string.split("\\s");
        StringBuilder reversedWord = new StringBuilder();
        for(String w:words){
            StringBuilder build = new StringBuilder(w);
            build.reverse();
            reversedWord.append(build).append(" ");
        }
        return reversedWord.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = scanner.nextLine();
        System.out.println(reversedWord(input));
    }
}
