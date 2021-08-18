package chapterThreeExercises;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number above or below 60: ");
        int number;
        number = input.nextInt();
        if (number > 60){
            System.out.println("Passed");
        }else
        {System.out.println("Failed");
    }}}
