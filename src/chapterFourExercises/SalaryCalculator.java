package chapterFourExercises;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double grossPay;
        int newHour;
        double overTime;
        int hours;
        int hourlyRate;
        int numberOfEmployees;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of employees in company:");
        numberOfEmployees = input.nextInt();

        System.out.println("Enter hourly rate:");
        hourlyRate = input.nextInt();

        for (int i = 0;i <= numberOfEmployees;i++){
            System.out.println("Enter name of Employee");
            name = input.next();
            System.out.println("Enter number of number of hours worked:");
            hours = input.nextInt();

            if (hours <= 40) grossPay = hours * hourlyRate;
            else {
                newHour = hours - 40;
                overTime = (newHour + (newHour *0.5)) * hourlyRate;
                grossPay = overTime + (hourlyRate * 40);
            }
            System.out.println(name+"'s Grosspay is $"+grossPay);
        }
    }
}
