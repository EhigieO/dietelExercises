package chapterTwoExercises;

import java.util.Scanner;

public class Variables
{
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);
        int b;
        int c;
        int a;

        System.out.print("Enter variable 'b': ");
        b = input.nextInt();

        System.out.print("Enter variable 'c': ");
        c = input.nextInt();

        a = b * c;
        System.out.printf("a=b*c is %d%n", a);

    }
}
