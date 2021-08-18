package chapterTwoExercises;

import java.util.Scanner;

public class DiameterAndAreaOfCircle
{
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);

        int r;
        int diameter;
        double circumference;
        double area;


        System.out.print("Enter radius 'r': ");
        r = input.nextInt();

        diameter = 2 * r;
        System.out.printf("Diameter is %d%n", diameter);


        circumference = 2 * Math.PI * r;
        System.out.printf("Circumference is %f%n", circumference);

        area = Math.PI * (r * r);
        System.out.printf("Area is %f%n", area);
    }
}