package chapterFourExercises;

import java.util.Scanner;

public class Cata {
    public static void main(String[] args) {
        // Number();
        // evenNumber();
         factor();
        //whileLoop();
    }
    public static void Number(String... args) {
        int number = 0;
        while (number < 20) {
            number = number + 2;
            System.out.printf("%d%n", number);
        }
    }
    public static void evenNumber(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Even number: ");
        int num = input.nextInt();
        int number = 1;
        while (number <= num) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            number = number + 1;
        }
        System.out.print("Enter Number to find it's factors:");
    }

    public static void factor(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to find it's factor:");
        int number = input.nextInt();
        int factor = 2;
        int count = 0;
        while (count < number) {
            if (number % factor == 0) {
                factor++;
            }
            count++;
        }
        System.out.printf("Factors of %d are %d%n", number, (factor + 2));
    }


//   collect 15 grade values from user,
//   add the grades and display the sum
//   add the grades and divide by 15 to get the average

    public static void whileLoop (String...args){
        Scanner input = new Scanner(System.in);

        double number = 0;
        double grade;
        double sum = 0;
        System.out.print("Enter number of students in class");
        double students = input.nextInt();

        while (number < students) {
            System.out.print("Enter the grades of each student:");
            grade = input.nextInt();
            sum = grade + sum;
            number++;
        }
        double average = sum / students;
        System.out.printf("Sum of Cohort7 grades is %.2f%n", sum);
        System.out.printf("Average of Cohort7 grades is %.2f%n", average);
    }
}
