package chapterThreeExercises;

import java.util.Scanner;

public class Grader {
//Collect a number from a user
//note the number
//check if the number is above 60 and say passed.
//check if the number is below 60 say failed.
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number above or below 60: ");
            int number;
            number = input.nextInt();
            if (number > 59){
                System.out.println("Passed");
            }
            if (number < 60){
                System.out.println("Failed");
            }
        }
    }


