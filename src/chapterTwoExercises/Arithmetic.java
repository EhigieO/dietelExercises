package chapterTwoExercises;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int sum;
        int difference;
        int quotient;
        int product;

        System.out.print("Enter a number: ");
        numberOne = input.nextInt();
        System.out.print("Enter another number: ");
        numberTwo = input.nextInt();

        sum = numberOne + numberTwo;
        System.out.printf("Sum is %d%n", sum);

        difference = numberOne - numberTwo;
        if (numberTwo > numberOne){
            difference = numberTwo - numberOne;
        }
        System.out.printf("Difference is %d%n", difference);

        quotient = numberOne / numberTwo;
        if (numberTwo > numberOne){
            quotient = numberTwo / numberOne;
        }
        System.out.printf("Quotient is %d%n", quotient);

        product =  numberOne * numberTwo;
        System.out.printf("Product is %d%n", product);
    }
}
