package chapterTwoExercises;

import java.util.Scanner;
public class WorldPopulation
{
    public static void main(String... args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current world population (without commas): ");
        double population = input.nextDouble();

        System.out.print("Enter current population growth rate in %: ");
        float growthRate = input.nextFloat();
        growthRate = growthRate / 100;

        double year1 = population * (population * growthRate);
        System.out.printf("Estimted population next year is %.0f%n", year1);

        double year2 = year1 * (year1 * growthRate);
        System.out.printf("Estimsted population in two years is %.0f%n", year2);

        double year3 = year2 * (year2 * growthRate);
        System.out.printf("Estimated population in three years is %.0f%n", year3);

        double year4 = year3 * (year3 * growthRate);
        System.out.printf("Estimated populaton in four years is %.0f%n", year4);

        double year5 = year4 * (year4 * growthRate);
        System.out.printf("Estimted population in five years is %.0f%n", year5);
    }
}
