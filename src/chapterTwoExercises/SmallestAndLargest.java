package chapterTwoExercises;

import java.awt.*;
import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();

        System.out.println("Sum of numbers is " + (firstNumber + secondNumber + thirdNumber));
        System.out.println("Product of numbers is " + (firstNumber * secondNumber * thirdNumber));
        System.out.println("Average of the numbers " + (firstNumber + secondNumber + thirdNumber)/3);

        if (firstNumber < secondNumber && firstNumber < thirdNumber)
            System.out.println("Smallest of the numbers is the first number");

        if (secondNumber < firstNumber && secondNumber < thirdNumber)
            System.out.println("Smallest of the numbers is the second number");

        if ( thirdNumber < firstNumber && thirdNumber < secondNumber)
            System.out.println("smallest of the numbers is the third number");
    }
}
