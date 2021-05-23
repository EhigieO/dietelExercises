package chapterTwoExercises;

import java.util.Scanner;
public class OddEven
{
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();

        if (number % 2 == 0)
            System.out.printf("%d is an even number%n", number);

        if (number % 2 != 0)
            System.out.printf("%d is an odd number%n", number);
    }}
