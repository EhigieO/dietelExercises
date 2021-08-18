package chapterTwoExercises;

import java.util.Scanner;
public class Bmi
{
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in metres: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI VALUES");

        if (bmi < 18.5){
            System.out.printf("Underweight: %.2f%n", bmi);}
        else
        if (bmi >= 18.5 && bmi <=24.9){
            System.out.printf("Normal: %.2f%n", bmi);}
        else
        if (bmi >= 25 && bmi <= 29.9){
            System.out.printf("Overweight: %.2f%n", bmi);}
        else
        if (bmi >= 30 && bmi <= 35){
            System.out.printf("Obese: %.2f%n", bmi);}
        else
        {System.out.printf("With your BMI at %.2f you are GRAVELY overweight",bmi);}
    }
}