package chapterFourExercises;

import java.util.Scanner;

public class Loopping {

    public static void main(String[] args) {
        //whileSentinelLoop();
        newLoop();
    }

    public static void whileSentinelLoop() {
    //-1 here is the signal value,sentinel value,end value
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 0;
        int grade = 0;
        int sum = 0;
        while (grade != -1) {
            System.out.print("Enter the grade of the student or -1 to end loop:");
            grade = input.nextInt();
            if (grade != -1) {
                sum = grade + sum;
                numberOfStudents++;
            }
        }
        double average = (sum / (1.0 * numberOfStudents));
        System.out.println("Number of students are" + numberOfStudents);
        System.out.printf("Sum of Cohort7 grades is %d%n", sum);
        System.out.printf("Average of Cohort7 grades is %.2f%n", average);
    }


    public static void newLoop(){
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 0;
        int grade = 0;
        int sum = 0;
        while (grade != -1) {
            sum = grade + sum;
            System.out.print("Enter the grade of the student or -1 to end loop: ");
            grade = input.nextInt();
                numberOfStudents++;
        }

        double average = (sum / (1.0 * numberOfStudents));
        System.out.println("Number of students are " + numberOfStudents);
        System.out.printf("Sum of Cohort7 grades is %d%n", sum);
        System.out.printf("Average of Cohort7 grades is %.2f%n", average);
    }
}