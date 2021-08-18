package chapterTwoExercises;

import java.util.Scanner;
public class IntegerSeparation {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        int number, number1, number2, number3, number4, number5;
        System.out.println("Enter a five digits number: ");
        number = input.nextInt();

        if (number < 10000){
            System.out.println("Too less digits");}

        if (number > 99999){
            System.out.println("Too many digits");}

        else if (number >= 10000){
            number1 = (number / 10000);
            number2 = ((number % 10000)/1000);
            number3 = (((number % 10000) % 1000)/100);
            number4 = (((number % 10000) % 1000) % 100)/10;
            number5 = ((((number % 10000) % 1000) % 100) % 10)/1;
            System.out.printf("%d   %d   %d   %d   %d%n", number1, number2, number3, number4, number5);
        }
    }
}

