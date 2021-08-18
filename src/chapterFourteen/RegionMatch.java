package chapterFourteen;

import java.util.Scanner;

public class RegionMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Strings to compare");
        String userInput = scanner.nextLine();
        String userInput2 = scanner.nextLine();
        System.out.println("Specify number of characters to compare");
        int numberOfCharacters = scanner.nextInt();
        System.out.println("Enter the starting index for first String");
        int startingIndex = scanner.nextInt();
        System.out.println("Enter the starting index for the second String");
        int startingIndex2 = scanner.nextInt();

        if ( userInput.regionMatches(true, startingIndex, userInput2, startingIndex2, numberOfCharacters)){
            System.out.println("The string characters are equal");
        } else
            System.out.println("The strings are unequal");

    }
}
