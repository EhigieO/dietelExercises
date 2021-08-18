package chapterFourteen;

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings to compare");
        String userInput = scanner.nextLine();
        String userInput2 = scanner.nextLine();
        if (userInput.compareTo(userInput2) > 0){
            System.out.println("The first word is greater than the second");
        } else
            if ( userInput.compareTo(userInput2) == 0){
                System.out.println("Both words are equal");
            }
            else System.out.println(" The second word is greater than  the first");
    }
}
