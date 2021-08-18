package chapterTwoExercises;

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        System.out.print("Enter a number to compare:");
        numberOne = input.nextInt();

        System.out.print("Enter another number to compare:");
        numberTwo = input.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equals");
        }

        if (numberOne > numberTwo) {
            System.out.println("First number is larger");
        } else {
            System.out.println("First number is lower");
        }
    }
}
