package chapterTwoExercises;

import java.util.Scanner;
public class Mystery1
{
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        int mysterynumber = 1759;

        System.out.println("Enter Guessed Number: ");
        number = input.nextInt();

        if (number == mysterynumber) {
            System.out.printf("number is correct %d%n",number);}

        if (number != mysterynumber){

            if (number > mysterynumber) {
                System.out.printf("entered number is too high %d%n",number);}

            if (number < mysterynumber) {
                System.out.printf("entered number is too low %d%n",number);}

            System.out.println("Enter Number another: ");
            number = input.nextInt();
        }

    }
}
