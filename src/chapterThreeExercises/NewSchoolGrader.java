package chapterThreeExercises;

import java.util.Scanner;

public class NewSchoolGrader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Grade: ");
        int grade;
        grade = input.nextInt();
        if (grade > 89) {
            System.out.println("Excellent A");
        }else
        if (grade > 79 && grade < 90) {
            System.out.println("Great B");
        }else
        if (grade > 69 && grade < 80) {
            System.out.println("Good C");
        }else
        if (grade > 59 && grade < 70) {
            System.out.println("Pass D");
        }
        if (grade < 60) {
            System.out.println("Failed F");
        }
    }
}
