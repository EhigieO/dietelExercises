package chapterTwoExercises;

import java.util.Scanner;
public class Multiples
{
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter First number: ");
        num1 = input.nextInt();

        System.out.print("Enter Second number: ");
        num2 = input.nextInt();

        if (num2 % num1 == 0)
            System.out.printf("%d is a multiple of %d%n", num1, num2);

        if (num2 % num1 != 0)
            System.out.printf("%d is  not a multiple of %d%n", num1, num2);
    }
}
