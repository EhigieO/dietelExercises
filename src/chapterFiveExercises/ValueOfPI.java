package chapterFiveExercises;

import java.util.Scanner;

public class ValueOfPI {
    public static void main(String[] args) {
        boolean sign = true;
        int n = 1;
        int pi = 4;
        int userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of times to evaluate PI:");
        userInput = scanner.nextInt();
        for (int i = 1; i <= userInput;i ++) {
            n += 2;
            pi = pi - (4 / n);
            pi = pi + (4 / n);
        }
        System.out.println(pi);
    }
}
