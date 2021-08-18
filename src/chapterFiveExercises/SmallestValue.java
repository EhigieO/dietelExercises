package chapterFiveExercises;

import java.util.Scanner;
//(Find the Smallest Value) Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.
public class SmallestValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int minValue = Integer.MAX_VALUE;
        System.out.println("Enter number of integers to process:");
        int numOfTimes = input.nextInt();

        for (int i = 1; i <= numOfTimes; i++){
            System.out.println("Enter integer number:");
            number = input.nextInt();
            minValue = Math.min(number,minValue);

        }
        System.out.println(minValue);
    }
}
