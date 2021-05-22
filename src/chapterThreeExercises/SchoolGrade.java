package bike;
/*collect student grades
note the grades
if any grade is above 90 show A
if the grade is between 80 and 89 show B
if the grade is between 70 and 79 show C
if the grade is between 60 and 69 show D
if the grade is lower than 60 show F*/

import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Grade: ");
        int grade;
        grade = input.nextInt();
        if (grade > 89) {
            System.out.println("Excellent A");
        }
        if (grade > 79 && grade < 90) {
            System.out.println("Great B");
        }
        if (grade > 69 && grade < 80) {
            System.out.println("Good C");
        }
        if (grade > 59 && grade < 70) {
            System.out.println("Pass D");
        }
        if (grade < 60) {
            System.out.println("Failed F");
        }
    }
}
